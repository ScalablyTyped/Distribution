package typings.stellarSdk.horizonApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flags extends js.Object {
  var auth_immutable: Boolean
  var auth_required: Boolean
  var auth_revocable: Boolean
}

object Flags {
  @scala.inline
  def apply(auth_immutable: Boolean, auth_required: Boolean, auth_revocable: Boolean): Flags = {
    val __obj = js.Dynamic.literal(auth_immutable = auth_immutable.asInstanceOf[js.Any], auth_required = auth_required.asInstanceOf[js.Any], auth_revocable = auth_revocable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Flags]
  }
}

