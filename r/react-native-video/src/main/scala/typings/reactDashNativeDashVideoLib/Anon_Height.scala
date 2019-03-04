package typings
package reactDashNativeDashVideoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: scala.Double
  var orientation: reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.horizontal | reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.landscape
  var width: scala.Double
}

object Anon_Height {
  @scala.inline
  def apply(
    height: scala.Double,
    orientation: reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.horizontal | reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.landscape,
    width: scala.Double
  ): Anon_Height = {
    val __obj = js.Dynamic.literal(height = height, orientation = orientation.asInstanceOf[js.Any], width = width)
  
    __obj.asInstanceOf[Anon_Height]
  }
}

