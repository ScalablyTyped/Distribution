package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IJsonReader
  extends senchaUnderscoreTouchLib.ExtNs.dataNs.readerNs.IReader {
  /** [Method] Returns the value of record
  		* @returns String
  		*/
  var getRecord: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of useSimpleAccessors
  		* @returns Boolean
  		*/
  var getUseSimpleAccessors: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (String) */
  var record: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of record
  		* @param record String The new value.
  		*/
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of useSimpleAccessors
  		* @param useSimpleAccessors Boolean The new value.
  		*/
  var setUseSimpleAccessors: js.UndefOr[js.Function1[/* useSimpleAccessors */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var useSimpleAccessors: js.UndefOr[scala.Boolean] = js.undefined
}

