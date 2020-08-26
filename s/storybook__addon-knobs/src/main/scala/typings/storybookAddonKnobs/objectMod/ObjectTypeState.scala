package typings.storybookAddonKnobs.objectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypeState[T] extends js.Object {
  var failed: Boolean = js.native
  var json: js.UndefOr[T] = js.native
  var value: String = js.native
}

object ObjectTypeState {
  @scala.inline
  def apply[T](failed: Boolean, value: String): ObjectTypeState[T] = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeState[T]]
  }
  @scala.inline
  implicit class ObjectTypeStateOps[Self <: ObjectTypeState[_], T] (val x: Self with ObjectTypeState[T]) extends AnyVal {
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
    def setFailed(value: Boolean): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setJson(value: T): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
  }
  
}

