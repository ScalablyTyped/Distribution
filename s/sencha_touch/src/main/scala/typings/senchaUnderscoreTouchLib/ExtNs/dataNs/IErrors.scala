package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IErrors
  extends senchaUnderscoreTouchLib.ExtNs.utilNs.ICollection {
  /** [Method] Adds an item to the collection
  		* @returns Object The item added.
  		*/
  @JSName("add")
  var add_IErrors: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns all of the errors for the given field
  		* @param fieldName String The field to get errors for.
  		* @returns Object[] All errors for the given field.
  		*/
  var getByField: js.UndefOr[
    js.Function1[/* fieldName */ js.UndefOr[java.lang.String], senchaUnderscoreTouchLib.ExtNs.Array]
  ] = js.undefined
  /** [Method] Returns true if there are no errors in the collection
  		* @returns Boolean
  		*/
  var isValid: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
}

