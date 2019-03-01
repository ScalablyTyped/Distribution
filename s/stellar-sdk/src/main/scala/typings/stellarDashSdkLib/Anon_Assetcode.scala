package typings
package stellarDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Assetcode extends js.Object {
  var asset_code: java.lang.String
  var asset_issuer: java.lang.String
  var asset_type: java.lang.String
}

object Anon_Assetcode {
  @scala.inline
  def apply(asset_code: java.lang.String, asset_issuer: java.lang.String, asset_type: java.lang.String): Anon_Assetcode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asset_code")(asset_code)
    __obj.updateDynamic("asset_issuer")(asset_issuer)
    __obj.updateDynamic("asset_type")(asset_type)
    __obj.asInstanceOf[Anon_Assetcode]
  }
}

