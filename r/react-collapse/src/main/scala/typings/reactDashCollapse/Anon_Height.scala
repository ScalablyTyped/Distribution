package typings.reactDashCollapse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: js.UndefOr[String | Double] = js.undefined
  var overflow: js.UndefOr[String] = js.undefined
}

object Anon_Height {
  @scala.inline
  def apply(height: String | Double = null, overflow: String = null): Anon_Height = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Height]
  }
}

