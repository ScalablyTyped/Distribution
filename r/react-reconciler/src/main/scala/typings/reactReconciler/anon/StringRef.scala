package typings.reactReconciler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringRef extends js.Object {
  var _stringRef: js.UndefOr[String | Null] = js.native
}

object StringRef {
  @scala.inline
  def apply(): StringRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringRef]
  }
  @scala.inline
  implicit class StringRefOps[Self <: StringRef] (val x: Self) extends AnyVal {
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
    def set_stringRef(value: String): Self = this.set("_stringRef", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_stringRef: Self = this.set("_stringRef", js.undefined)
    @scala.inline
    def set_stringRefNull: Self = this.set("_stringRef", null)
  }
  
}

