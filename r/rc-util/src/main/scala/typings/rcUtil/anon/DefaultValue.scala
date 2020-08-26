package typings.rcUtil.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultValue[T] extends js.Object {
  var defaultValue: js.UndefOr[T | js.Function0[T]] = js.native
  var onChange: js.UndefOr[js.Function2[/* value */ T, /* prevValue */ T, Unit]] = js.native
  var postState: js.UndefOr[js.Function1[/* value */ T, T]] = js.native
  var value: js.UndefOr[T] = js.native
}

object DefaultValue {
  @scala.inline
  def apply[T](): DefaultValue[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultValue[T]]
  }
  @scala.inline
  implicit class DefaultValueOps[Self <: DefaultValue[_], T] (val x: Self with DefaultValue[T]) extends AnyVal {
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
    def setDefaultValueFunction0(value: () => T): Self = this.set("defaultValue", js.Any.fromFunction0(value))
    @scala.inline
    def setDefaultValue(value: T | js.Function0[T]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setOnChange(value: (/* value */ T, /* prevValue */ T) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setPostState(value: /* value */ T => T): Self = this.set("postState", js.Any.fromFunction1(value))
    @scala.inline
    def deletePostState: Self = this.set("postState", js.undefined)
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

