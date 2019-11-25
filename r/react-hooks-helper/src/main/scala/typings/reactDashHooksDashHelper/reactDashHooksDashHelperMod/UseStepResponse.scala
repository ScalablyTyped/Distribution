package typings.reactDashHooksDashHelper.reactDashHooksDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseStepResponse extends js.Object {
  var autoAdvanceDuration: Double
  var index: Double
  var isPaused: Boolean
  var navigation: NavigationProps
  var step: Double
}

object UseStepResponse {
  @scala.inline
  def apply(
    autoAdvanceDuration: Double,
    index: Double,
    isPaused: Boolean,
    navigation: NavigationProps,
    step: Double
  ): UseStepResponse = {
    val __obj = js.Dynamic.literal(autoAdvanceDuration = autoAdvanceDuration.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UseStepResponse]
  }
}

