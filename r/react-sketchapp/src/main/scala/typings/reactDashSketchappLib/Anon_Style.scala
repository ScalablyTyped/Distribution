package typings
package reactDashSketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Style extends js.Object {
  var style: reactDashSketchappLib.reactDashSketchappMod.Style | reactDashSketchappLib.reactDashSketchappMod.TextStyle
}

object Anon_Style {
  @scala.inline
  def apply(
    style: reactDashSketchappLib.reactDashSketchappMod.Style | reactDashSketchappLib.reactDashSketchappMod.TextStyle
  ): Anon_Style = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Style]
  }
}

