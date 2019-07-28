package typings.reactDashSlick.reactDashSlickMod

import typings.reactDashSlick.reactDashSlickStrings.unslick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveObject extends js.Object {
  var breakpoint: Double
  var settings: unslick | Settings
}

object ResponsiveObject {
  @scala.inline
  def apply(breakpoint: Double, settings: unslick | Settings): ResponsiveObject = {
    val __obj = js.Dynamic.literal(breakpoint = breakpoint, settings = settings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResponsiveObject]
  }
}

