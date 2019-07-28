package typings.rollup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Define extends js.Object {
  var define: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
}

object Anon_Define {
  @scala.inline
  def apply(define: String = null, id: String = null): Anon_Define = {
    val __obj = js.Dynamic.literal()
    if (define != null) __obj.updateDynamic("define")(define)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Anon_Define]
  }
}

