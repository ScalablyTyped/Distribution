package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object secretsmanager {
  
  @js.native
  trait SecretRotationRotationRules extends StObject {
    
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
    implicit class SecretRotationRotationRulesMutableBuilder[Self <: SecretRotationRotationRules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutomaticallyAfterDays(value: Input[Double]): Self = StObject.set(x, "automaticallyAfterDays", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SecretRotationRules extends StObject {
    
    /**
      * Specifies the number of days between automatic scheduled rotations of the secret.
      */
    var automaticallyAfterDays: Input[Double] = js.native
  }
  object SecretRotationRules {
    
    @scala.inline
    def apply(automaticallyAfterDays: Input[Double]): SecretRotationRules = {
      val __obj = js.Dynamic.literal(automaticallyAfterDays = automaticallyAfterDays.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecretRotationRules]
    }
    
    @scala.inline
    implicit class SecretRotationRulesMutableBuilder[Self <: SecretRotationRules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutomaticallyAfterDays(value: Input[Double]): Self = StObject.set(x, "automaticallyAfterDays", value.asInstanceOf[js.Any])
    }
  }
}
