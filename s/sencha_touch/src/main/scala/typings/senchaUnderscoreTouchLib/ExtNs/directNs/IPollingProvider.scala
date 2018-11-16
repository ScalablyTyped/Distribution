package typings
package senchaUnderscoreTouchLib.ExtNs.directNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPollingProvider extends IJsonProvider {
  /** [Config Option] (Object) */
  var baseParams: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of baseParams
  		* @returns Object
  		*/
  var getBaseParams: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of interval
  		* @returns Number
  		*/
  var getInterval: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of url
  		* @returns String/Function
  		*/
  var getUrl: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Sets the value of baseParams
  		* @param baseParams Object The new value.
  		*/
  var setBaseParams: js.UndefOr[js.Function1[/* baseParams */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of interval
  		* @param interval Number The new value.
  		*/
  var setInterval: js.UndefOr[js.Function1[/* interval */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url String/Function The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String/Function) */
  var url: js.UndefOr[js.Any] = js.undefined
}

