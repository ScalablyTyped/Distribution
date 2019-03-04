package typings
package reactDashSlickLib.reactDashSlickMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveObject extends js.Object {
  var breakpoint: scala.Double
  var settings: reactDashSlickLib.reactDashSlickLibStrings.unslick | Settings
}

object ResponsiveObject {
  @scala.inline
  def apply(breakpoint: scala.Double, settings: reactDashSlickLib.reactDashSlickLibStrings.unslick | Settings): ResponsiveObject = {
    val __obj = js.Dynamic.literal(breakpoint = breakpoint, settings = settings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResponsiveObject]
  }
}

