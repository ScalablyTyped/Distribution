package typings
package senchaUnderscoreTouchLib.ExtNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IRadio extends ICheckbox {
  /** [Method] Returns the selected value if this radio is part of a group other radio fields with the same name in the same FormP
  		* @returns String
  		*/
  var getGroupValue: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Set the matched radio field s status that has the same value as the given string to checked
  		* @param value String The value of the radio field to check.
  		* @returns Ext.field.Radio The field that is checked.
  		*/
  var setGroupValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  /** [Method] Sets the value of value
  		* @param value Object
  		* @returns Ext.field.Radio this
  		*/
  @JSName("setValue")
  var setValue_IRadio: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], this.type]] = js.undefined
}

