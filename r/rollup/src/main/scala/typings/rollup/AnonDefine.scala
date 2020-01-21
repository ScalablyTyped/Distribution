package typings.rollup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefine extends js.Object {
  var define: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
}

object AnonDefine {
  @scala.inline
  def apply(define: String = null, id: String = null): AnonDefine = {
    val __obj = js.Dynamic.literal()
    if (define != null) __obj.updateDynamic("define")(define.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefine]
  }
}

