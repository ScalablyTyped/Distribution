package typings
package senchaUnderscoreTouchLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldSet
  extends senchaUnderscoreTouchLib.ExtNs.IContainer {
  /** [Method] A convenient method to disable all fields in this FieldSet
  		* @param newDisabled Object
  		* @returns Ext.form.FieldSet This FieldSet
  		*/
  var doSetDisabled: js.UndefOr[js.Function1[/* newDisabled */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (String) */
  var instructions: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of instructions
  		* @param instructions String The new value.
  		*/
  var setInstructions: js.UndefOr[js.Function1[/* instructions */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object IFieldSet {
  @scala.inline
  def apply(
    IContainer: senchaUnderscoreTouchLib.ExtNs.IContainer = null,
    baseCls: java.lang.String = null,
    doSetDisabled: js.Function1[/* newDisabled */ js.UndefOr[js.Any], IFieldSet] = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    instructions: java.lang.String = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setInstructions: js.Function1[/* instructions */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setTitle: js.Function1[/* title */ js.UndefOr[java.lang.String], scala.Unit] = null,
    title: java.lang.String = null
  ): IFieldSet = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (doSetDisabled != null) __obj.updateDynamic("doSetDisabled")(doSetDisabled)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (instructions != null) __obj.updateDynamic("instructions")(instructions)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setInstructions != null) __obj.updateDynamic("setInstructions")(setInstructions)
    if (setTitle != null) __obj.updateDynamic("setTitle")(setTitle)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IFieldSet]
  }
}

