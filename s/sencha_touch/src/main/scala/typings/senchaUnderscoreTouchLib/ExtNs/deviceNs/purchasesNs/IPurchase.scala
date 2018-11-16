package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.purchasesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPurchase
  extends senchaUnderscoreTouchLib.ExtNs.dataNs.IModel {
  /** [Method] Attempts to mark this purchase as complete
  		* @param config Object
  		*/
  var complete: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns the value of fields
  		* @returns Array
  		*/
  @JSName("getFields")
  var getFields_IPurchase: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Sets the value of fields
  		* @param fields Array The new value.
  		*/
  @JSName("setFields")
  var setFields_IPurchase: js.UndefOr[
    js.Function1[/* fields */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
}

