package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILimitedCache
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Clear all the objects  */
  var clear: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Function) */
  var feeder: js.UndefOr[js.Any] = js.undefined
  /** [Method] Get a cached object
  		* @param id String
  		* @param args Mixed... Arguments appended to feeder.
  		* @returns Object
  		*/
  var get: js.UndefOr[js.Function2[/* id */ java.lang.String, /* repeated */ js.Any, _]] = js.undefined
  /** [Method] Returns the value of feeder
  		* @returns Function
  		*/
  var getFeeder: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of limit
  		* @returns Number
  		*/
  var getLimit: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of feeder
  		* @param feeder Function The new value.
  		* @returns Number
  		*/
  var setFeeder: js.UndefOr[js.Function1[/* feeder */ js.UndefOr[js.Any], scala.Double]] = js.undefined
  /** [Method] Sets the value of limit
  		* @param limit Number The new value.
  		*/
  var setLimit: js.UndefOr[js.Function1[/* limit */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

