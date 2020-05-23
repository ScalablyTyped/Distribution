package typings.rollup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Define extends js.Object {
  var define: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
}

object Define {
  @scala.inline
  def apply(define: String = null, id: String = null): Define = {
    val __obj = js.Dynamic.literal()
    if (define != null) __obj.updateDynamic("define")(define.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Define]
  }
}

