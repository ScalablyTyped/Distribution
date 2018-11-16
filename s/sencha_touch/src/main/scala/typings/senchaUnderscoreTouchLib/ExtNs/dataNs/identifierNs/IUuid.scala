package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs.identifierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IUuid extends ISimple {
  /** [Method] Returns the value of id
  		* @returns Object
  		*/
  var getId: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of version
  		* @returns Number
  		*/
  var getVersion: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (Object) */
  var id: js.UndefOr[js.Any] = js.undefined
  /** [Method] Reconfigures this generator given new config properties
  		* @param config Object
  		*/
  var reconfigure: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Property] (Number/Object) */
  var salt: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of id
  		* @param id Object The new value.
  		*/
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of version
  		* @param version Number The new value.
  		*/
  var setVersion: js.UndefOr[js.Function1[/* version */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Property] (Number/Object) */
  var timestamp: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var version: js.UndefOr[scala.Double] = js.undefined
}

