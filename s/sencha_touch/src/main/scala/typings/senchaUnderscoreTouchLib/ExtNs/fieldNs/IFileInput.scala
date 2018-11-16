package typings
package senchaUnderscoreTouchLib.ExtNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IFileInput extends IInput {
  /** [Method] Updated the capture attribute with the  ink capture configuration
  		* @param value Object
  		*/
  var applyCapture: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns the value of accept
  		* @returns Object
  		*/
  var getAccept: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of capture
  		* @returns Object
  		*/
  var getCapture: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the field files
  		* @returns FileList List of the files selected.
  		*/
  var getFiles: js.UndefOr[js.Function0[stdLib.FileList]] = js.undefined
  /** [Method] Returns the value of multiple
  		* @returns Boolean
  		*/
  var getMultiple: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the field data value
  		* @returns String value The field value.
  		*/
  @JSName("getValue")
  var getValue_IFileInput: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (Function) */
  var me: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Function) */
  var newValue: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of accept
  		* @param accept Object The new value.
  		*/
  var setAccept: js.UndefOr[js.Function1[/* accept */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of capture
  		* @param capture Object The new value.
  		*/
  var setCapture: js.UndefOr[js.Function1[/* capture */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of multiple
  		* @param multiple Boolean The new value.
  		*/
  var setMultiple: js.UndefOr[js.Function1[/* multiple */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name Object The new value.
  		*/
  @JSName("setName")
  var setName_IFileInput: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Called when the multiple property is updated  */
  var updateMultiple: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

