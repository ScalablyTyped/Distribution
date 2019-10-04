package typings.atPulumiAws.typesOutputMod.secretsmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecretRotationRules extends js.Object {
  /**
    * Specifies the number of days between automatic scheduled rotations of the secret.
    */
  var automaticallyAfterDays: Double
}

object SecretRotationRules {
  @scala.inline
  def apply(automaticallyAfterDays: Double): SecretRotationRules = {
    val __obj = js.Dynamic.literal(automaticallyAfterDays = automaticallyAfterDays)
  
    __obj.asInstanceOf[SecretRotationRules]
  }
}

