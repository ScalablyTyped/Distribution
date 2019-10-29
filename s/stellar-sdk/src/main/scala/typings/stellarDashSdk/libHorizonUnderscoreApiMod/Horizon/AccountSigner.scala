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
    val __obj = js.Dynamic.literal(key = key, weight = weight)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AccountSigner]
  }
}

