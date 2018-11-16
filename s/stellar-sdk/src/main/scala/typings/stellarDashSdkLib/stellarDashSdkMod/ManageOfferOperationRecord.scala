package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManageOfferOperationRecord extends BaseOperationRecord {
  var amount: java.lang.String = js.native
  var buying_asset_code: js.UndefOr[java.lang.String] = js.native
  var buying_asset_issuer: js.UndefOr[java.lang.String] = js.native
  var buying_asset_type: java.lang.String = js.native
  var offer_id: scala.Double = js.native
  var price: java.lang.String = js.native
  var price_r: stellarDashSdkLib.Anon_Numerator = js.native
  var selling_asset_code: js.UndefOr[java.lang.String] = js.native
  var selling_asset_issuer: js.UndefOr[java.lang.String] = js.native
  var selling_asset_type: java.lang.String = js.native
  @JSName("type")
  var type_ManageOfferOperationRecord: stellarDashSdkLib.stellarDashSdkLibStrings.manage_offer = js.native
}

