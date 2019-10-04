package typings.atPulumiAws.typesOutputMod.secretsmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecretRotationRule extends js.Object {
  var automaticallyAfterDays: Double
}

object GetSecretRotationRule {
  @scala.inline
  def apply(automaticallyAfterDays: Double): GetSecretRotationRule = {
    val __obj = js.Dynamic.literal(automaticallyAfterDays = automaticallyAfterDays)
  
    __obj.asInstanceOf[GetSecretRotationRule]
  }
}

