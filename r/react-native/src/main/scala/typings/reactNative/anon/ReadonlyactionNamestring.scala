package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  actionName :string}> */
@js.native
trait ReadonlyactionNamestring extends js.Object {
  val actionName: String = js.native
}

object ReadonlyactionNamestring {
  @scala.inline
  def apply(actionName: String): ReadonlyactionNamestring = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyactionNamestring]
  }
  @scala.inline
  implicit class ReadonlyactionNamestringOps[Self <: ReadonlyactionNamestring] (val x: Self) extends AnyVal {
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
    def setActionName(value: String): Self = this.set("actionName", value.asInstanceOf[js.Any])
  }
  
}

