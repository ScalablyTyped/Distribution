package typings.senchaTouch.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRadio
  extends typings.senchaTouch.Ext.field.ICheckbox {
  /** [Method] Returns the selected value if this radio is part of a group other radio fields with the same name in the same FormP
    * @returns String
    */
  var getGroupValue: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Set the matched radio field s status that has the same value as the given string to checked
    * @param value String The value of the radio field to check.
    * @returns Ext.field.Radio The field that is checked.
    */
  var setGroupValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], this.type]] = js.native
  /** [Method] Sets the value of value
    * @param value Object
    * @returns Ext.field.Radio this
    */
  @JSName("setValue")
  var setValue_IRadio: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], this.type]] = js.native
}

object IRadio {
  @scala.inline
  def apply(): IRadio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRadio]
  }
  @scala.inline
  implicit class IRadioOps[Self <: IRadio] (val x: Self) extends AnyVal {
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
    def setGetGroupValue(value: () => String): Self = this.set("getGroupValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetGroupValue: Self = this.set("getGroupValue", js.undefined)
    @scala.inline
    def setSetGroupValue(value: /* value */ js.UndefOr[String] => IRadio): Self = this.set("setGroupValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetGroupValue: Self = this.set("setGroupValue", js.undefined)
    @scala.inline
    def setSetValue(value: /* value */ js.UndefOr[js.Any] => IRadio): Self = this.set("setValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
  }
  
}

