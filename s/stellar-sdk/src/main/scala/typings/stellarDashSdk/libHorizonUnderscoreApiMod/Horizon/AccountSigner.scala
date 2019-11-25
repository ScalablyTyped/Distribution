package typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountSigner extends js.Object {
  var key: String
  var `type`: String
  var weight: Double
}

object AccountSigner {
  @scala.inline
  def apply(key: String, `type`: String, weight: Double): AccountSigner = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountSigner]
  }
}

