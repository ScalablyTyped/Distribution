package typings
package reactDashSketchappLib.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchPage extends js.Object {
  def name(): js.Any
}

object SketchPage {
  @scala.inline
  def apply(name: js.Function0[js.Any]): SketchPage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SketchPage]
  }
}

