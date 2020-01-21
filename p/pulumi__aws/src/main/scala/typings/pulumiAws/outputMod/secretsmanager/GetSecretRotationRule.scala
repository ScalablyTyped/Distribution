package typings.pulumiAws.outputMod.secretsmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretRotationRule extends js.Object {
  var automaticallyAfterDays: Double = js.native
}

object GetSecretRotationRule {
  @scala.inline
  def apply(automaticallyAfterDays: Double): GetSecretRotationRule = {
    val __obj = js.Dynamic.literal(automaticallyAfterDays = automaticallyAfterDays.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSecretRotationRule]
  }
}

