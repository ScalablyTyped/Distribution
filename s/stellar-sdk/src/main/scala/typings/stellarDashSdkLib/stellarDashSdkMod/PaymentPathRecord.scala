package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PaymentPathRecord extends Record {
  var destination_amount: java.lang.String
  var destination_asset_code: java.lang.String
  var destination_asset_issuer: java.lang.String
  var destination_asset_type: java.lang.String
  var path: js.Array[stellarDashSdkLib.Anon_Assetcode]
  var source_amount: java.lang.String
  var source_asset_code: java.lang.String
  var source_asset_issuer: java.lang.String
  var source_asset_type: java.lang.String
}

