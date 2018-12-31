package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITime extends INumeric {
  /** [Config Option] (Boolean) */
  var calculateByLabelSize: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String/Boolean) */
  var dateFormat: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Date) */
  var fromDate: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of calculateByLabelSize
  		* @returns Boolean
  		*/
  var getCalculateByLabelSize: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Mapping data value into coordinate
  		* @param value Object
  		* @returns Number
  		*/
  @JSName("getCoordFor")
  var getCoordFor_ITime: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Double]] = js.undefined
  /** [Method] Returns the value of dateFormat
  		* @returns String/Boolean
  		*/
  var getDateFormat: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of fromDate
  		* @returns Date
  		*/
  var getFromDate: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of step
  		* @returns Array
  		*/
  var getStep: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of toDate
  		* @returns Date
  		*/
  var getToDate: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of calculateByLabelSize
  		* @param calculateByLabelSize Boolean The new value.
  		*/
  var setCalculateByLabelSize: js.UndefOr[js.Function1[/* calculateByLabelSize */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of dateFormat
  		* @param dateFormat String/Boolean The new value.
  		*/
  var setDateFormat: js.UndefOr[js.Function1[/* dateFormat */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of fromDate
  		* @param fromDate Date The new value.
  		*/
  var setFromDate: js.UndefOr[js.Function1[/* fromDate */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of step
  		* @param step Array The new value.
  		*/
  var setStep: js.UndefOr[
    js.Function1[/* step */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of toDate
  		* @param toDate Date The new value.
  		*/
  var setToDate: js.UndefOr[js.Function1[/* toDate */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Array) */
  var step: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Date) */
  var toDate: js.UndefOr[js.Any] = js.undefined
}

