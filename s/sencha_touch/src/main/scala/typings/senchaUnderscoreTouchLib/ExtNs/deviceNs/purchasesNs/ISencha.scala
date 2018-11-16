package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.purchasesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISencha
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Checks if the current user is able to make payments
  		* @param config Object
  		*/
  var canMakePayments: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns a Ext data Store instance of all purchases delivered to the current user
  		* @param config Object
  		*/
  var getCompletedPurchases: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns a Ext data Store instance of all products available to purchase
  		* @param config Object
  		*/
  var getProducts: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns a Ext data Store instance of all purchases the current user has been charged
  		* @param config Object
  		*/
  var getPurchases: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

