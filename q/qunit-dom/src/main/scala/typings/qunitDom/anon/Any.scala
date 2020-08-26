package typings.qunitDom.anon

import typings.qunitDom.qunitDomBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Any extends js.Object {
  var any: `true` = js.native
}

object Any {
  @scala.inline
  def apply(any: `true`): Any = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any])
    __obj.asInstanceOf[Any]
  }
  @scala.inline
  implicit class AnyOps[Self <: Any] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAny(value: `true`): Self = this.set("any", value.asInstanceOf[js.Any])
  }
  
}

