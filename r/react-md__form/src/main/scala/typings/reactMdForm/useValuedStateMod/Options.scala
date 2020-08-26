package typings.reactMdForm.useValuedStateMod

import typings.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[T /* <: TextElement */] extends js.Object {
  var defaultValue: js.UndefOr[Value] = js.native
  var onChange: js.UndefOr[ChangeEventHandler[T]] = js.native
  var value: js.UndefOr[Value] = js.native
}

object Options {
  @scala.inline
  def apply[/* <: typings.reactMdForm.useValuedStateMod.TextElement */ T](): Options[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[T]]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], /* <: typings.reactMdForm.useValuedStateMod.TextElement */ T] (val x: Self with Options[T]) extends AnyVal {
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
    def setDefaultValueVarargs(value: (String | Double)*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: Value): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setOnChange(value: ChangeEvent[T] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setValueVarargs(value: (String | Double)*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: Value): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

