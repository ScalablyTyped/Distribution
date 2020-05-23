package typings.senchaTouch.Ext.form

import typings.senchaTouch.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldSet extends IContainer {
  /** [Method] A convenient method to disable all fields in this FieldSet
    * @param newDisabled Object
    * @returns Ext.form.FieldSet This FieldSet
    */
  var doSetDisabled: js.UndefOr[js.Function1[/* newDisabled */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (String) */
  var instructions: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of instructions
    * @param instructions String The new value.
    */
  var setInstructions: js.UndefOr[js.Function1[/* instructions */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of title
    * @param title String The new value.
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.undefined
}

object IFieldSet {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    doSetDisabled: /* newDisabled */ js.UndefOr[js.Any] => IFieldSet = null,
    instructions: String = null,
    setInstructions: /* instructions */ js.UndefOr[String] => Unit = null,
    setTitle: /* title */ js.UndefOr[String] => Unit = null,
    title: String = null
  ): IFieldSet = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (doSetDisabled != null) __obj.updateDynamic("doSetDisabled")(js.Any.fromFunction1(doSetDisabled))
    if (instructions != null) __obj.updateDynamic("instructions")(instructions.asInstanceOf[js.Any])
    if (setInstructions != null) __obj.updateDynamic("setInstructions")(js.Any.fromFunction1(setInstructions))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldSet]
  }
}

