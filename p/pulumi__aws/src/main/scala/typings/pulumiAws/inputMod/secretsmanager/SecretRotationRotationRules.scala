package typings.pulumiAws.inputMod.secretsmanager

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecretRotationRotationRules extends js.Object {
  
  /**
    * Specifies the number of days between automatic scheduled rotations of the secret.
    */
  var automaticallyAfterDays: Input[Double] = js.native
}
object SecretRotationRotationRules {
  
  @scala.inline
  def apply(automaticallyAfterDays: Input[Double]): SecretRotationRotationRules = {
    val __obj = js.Dynamic.literal(automaticallyAfterDays = automaticallyAfterDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretRotationRotationRules]
  }
  
  @scala.inline
  implicit class SecretRotationRotationRulesOps[Self <: SecretRotationRotationRules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutomaticallyAfterDays(value: Input[Double]): Self = this.set("automaticallyAfterDays", value.asInstanceOf[js.Any])
  }
}
