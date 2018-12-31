package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs.readerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXml extends IReader {
  /** [Method] Normalizes the data object
  		* @param data Object The raw data object.
  		* @returns Object Returns the documentElement property of the data object if present, or the same object if not.
  		*/
  var getData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the value of record
  		* @returns String
  		*/
  var getRecord: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var record: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of record
  		* @param record String The new value.
  		*/
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
}

