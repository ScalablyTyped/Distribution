package typings
package reactDashMdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_X extends js.Object {
  var x: js.UndefOr[js.Object] = js.undefined
  var y: js.UndefOr[js.Object] = js.undefined
}

object Anon_X {
  @scala.inline
  def apply(x: js.Object = null, y: js.Object = null): Anon_X = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_X]
  }
}

