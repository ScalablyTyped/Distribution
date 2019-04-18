package typings
package reactDashHooksDashHelperLib.reactDashHooksDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseStepResponse extends js.Object {
  var autoAdvanceDuration: scala.Double
  var index: scala.Double
  var isPaused: scala.Boolean
  var navigation: NavigationProps
  var step: scala.Double
}

object UseStepResponse {
  @scala.inline
  def apply(
    autoAdvanceDuration: scala.Double,
    index: scala.Double,
    isPaused: scala.Boolean,
    navigation: NavigationProps,
    step: scala.Double
  ): UseStepResponse = {
    val __obj = js.Dynamic.literal(autoAdvanceDuration = autoAdvanceDuration, index = index, isPaused = isPaused, navigation = navigation, step = step)
  
    __obj.asInstanceOf[UseStepResponse]
  }
}

