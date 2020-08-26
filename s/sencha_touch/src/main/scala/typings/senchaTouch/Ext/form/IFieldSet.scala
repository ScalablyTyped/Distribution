package typings.senchaTouch.Ext.form

import typings.senchaTouch.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFieldSet extends IContainer {
  /** [Method] A convenient method to disable all fields in this FieldSet
    * @param newDisabled Object
    * @returns Ext.form.FieldSet This FieldSet
    */
  var doSetDisabled: js.UndefOr[js.Function1[/* newDisabled */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Config Option] (String) */
  var instructions: js.UndefOr[String] = js.native
  /** [Method] Sets the value of instructions
    * @param instructions String The new value.
    */
  var setInstructions: js.UndefOr[js.Function1[/* instructions */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of title
    * @param title String The new value.
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.native
}

object IFieldSet {
  @scala.inline
  def apply(): IFieldSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldSet]
  }
  @scala.inline
  implicit class IFieldSetOps[Self <: IFieldSet] (val x: Self) extends AnyVal {
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
    def setDoSetDisabled(value: /* newDisabled */ js.UndefOr[js.Any] => IFieldSet): Self = this.set("doSetDisabled", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDoSetDisabled: Self = this.set("doSetDisabled", js.undefined)
    @scala.inline
    def setInstructions(value: String): Self = this.set("instructions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstructions: Self = this.set("instructions", js.undefined)
    @scala.inline
    def setSetInstructions(value: /* instructions */ js.UndefOr[String] => Unit): Self = this.set("setInstructions", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetInstructions: Self = this.set("setInstructions", js.undefined)
    @scala.inline
    def setSetTitle(value: /* title */ js.UndefOr[String] => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTitle: Self = this.set("setTitle", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

