package typings.stellarDashSdk.stellarDashSdkMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountSigner extends js.Object {
  var public_key: String
  var weight: Double
}

object AccountSigner {
  @scala.inline
  def apply(public_key: String, weight: Double): AccountSigner = {
    val __obj = js.Dynamic.literal(public_key = public_key, weight = weight)
  
    __obj.asInstanceOf[AccountSigner]
  }
}

