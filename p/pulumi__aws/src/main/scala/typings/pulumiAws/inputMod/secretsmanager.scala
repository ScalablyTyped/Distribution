package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object secretsmanager {
  
  trait SecretRotationRotationRules extends StObject {
    
    /**
      * Specifies the number of days between automatic scheduled rotations of the secret.
      */
    var automaticallyAfterDays: Input[Double]
  }
  object SecretRotationRotationRules {
    
    inline def apply(automaticallyAfterDays: Input[Double]): SecretRotationRotationRules = {
      val __obj = js.Dynamic.literal(automaticallyAfterDays = automaticallyAfterDays.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecretRotationRotationRules]
    }
    
    extension [Self <: SecretRotationRotationRules](x: Self) {
      
      inline def setAutomaticallyAfterDays(value: Input[Double]): Self = StObject.set(x, "automaticallyAfterDays", value.asInstanceOf[js.Any])
    }
  }
  
  trait SecretRotationRules extends StObject {
    
    /**
      * Specifies the number of days between automatic scheduled rotations of the secret.
      */
    var automaticallyAfterDays: Input[Double]
  }
  object SecretRotationRules {
    
    inline def apply(automaticallyAfterDays: Input[Double]): SecretRotationRules = {
      val __obj = js.Dynamic.literal(automaticallyAfterDays = automaticallyAfterDays.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecretRotationRules]
    }
    
    extension [Self <: SecretRotationRules](x: Self) {
      
      inline def setAutomaticallyAfterDays(value: Input[Double]): Self = StObject.set(x, "automaticallyAfterDays", value.asInstanceOf[js.Any])
    }
  }
}
