package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OfferRecord extends Record {
  var amount: java.lang.String
  var buying: Asset
  var id: java.lang.String
  var paging_token: java.lang.String
  var price: java.lang.String
  var price_r: stellarDashSdkLib.Anon_Numerator
  var seller: js.UndefOr[CallFunction[AccountRecord]] = js.undefined
  var seller_attr: java.lang.String
  var selling: Asset
}

