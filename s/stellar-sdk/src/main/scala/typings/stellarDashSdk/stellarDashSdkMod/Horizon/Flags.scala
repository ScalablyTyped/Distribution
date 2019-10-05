package typings.stellarDashSdk.stellarDashSdkMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flags extends js.Object {
  var auth_required: Boolean
  var auth_revocable: Boolean
}

object Flags {
  @scala.inline
  def apply(auth_required: Boolean, auth_revocable: Boolean): Flags = {
    val __obj = js.Dynamic.literal(auth_required = auth_required, auth_revocable = auth_revocable)
  
    __obj.asInstanceOf[Flags]
  }
}

