package typings.reactMdForm.formMessageMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormMessageCounterProps extends js.Object {
  /**
    * An optional className to apply to the counter wrapper element.
    */
  var counterClassName: js.UndefOr[String] = js.native
  /**
    * An optional style to apply to the counter wrapper element.
    */
  var counterStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * The current length of the value in the related text field.
    */
  var length: Double = js.native
  /**
    * The max length allowed for the value in the related text field.
    */
  var maxLength: Double = js.native
}

object FormMessageCounterProps {
  @scala.inline
  def apply(length: Double, maxLength: Double): FormMessageCounterProps = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormMessageCounterProps]
  }
  @scala.inline
  implicit class FormMessageCounterPropsOps[Self <: FormMessageCounterProps] (val x: Self) extends AnyVal {
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setCounterClassName(value: String): Self = this.set("counterClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCounterClassName: Self = this.set("counterClassName", js.undefined)
    @scala.inline
    def setCounterStyle(value: CSSProperties): Self = this.set("counterStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCounterStyle: Self = this.set("counterStyle", js.undefined)
  }
  
}

