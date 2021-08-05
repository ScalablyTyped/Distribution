package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object secretsmanager {
  
  trait GetSecretRotationRotationRule extends StObject {
    
    var automaticallyAfterDays: Double
  }
  object GetSecretRotationRotationRule {
    
    inline def apply(automaticallyAfterDays: Double): GetSecretRotationRotationRule = {
      val __obj = js.Dynamic.literal(automaticallyAfterDays = automaticallyAfterDays.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSecretRotationRotationRule]
    }
    
    extension [Self <: GetSecretRotationRotationRule](x: Self) {
      
      inline def setAutomaticallyAfterDays(value: Double): Self = StObject.set(x, "automaticallyAfterDays", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetSecretRotationRule extends StObject {
    
    var automaticallyAfterDays: Double
  }
  object GetSecretRotationRule {
    
    inline def apply(automaticallyAfterDays: Double): GetSecretRotationRule = {
      val __obj = js.Dynamic.literal(automaticallyAfterDays = automaticallyAfterDays.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSecretRotationRule]
    }
    
    extension [Self <: GetSecretRotationRule](x: Self) {
      
      inline def setAutomaticallyAfterDays(value: Double): Self = StObject.set(x, "automaticallyAfterDays", value.asInstanceOf[js.Any])
    }
  }
  
  trait SecretRotationRotationRules extends StObject {
    
    /**
      * Specifies the number of days between automatic scheduled rotations of the secret.
      */
    var automaticallyAfterDays: Double
  }
  object SecretRotationRotationRules {
    
    inline def apply(automaticallyAfterDays: Double): SecretRotationRotationRules = {
      val __obj = js.Dynamic.literal(automaticallyAfterDays = automaticallyAfterDays.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecretRotationRotationRules]
    }
    
    extension [Self <: SecretRotationRotationRules](x: Self) {
      
      inline def setAutomaticallyAfterDays(value: Double): Self = StObject.set(x, "automaticallyAfterDays", value.asInstanceOf[js.Any])
    }
  }
  
  trait SecretRotationRules extends StObject {
    
    /**
      * Specifies the number of days between automatic scheduled rotations of the secret.
      */
    var automaticallyAfterDays: Double
  }
  object SecretRotationRules {
    
    inline def apply(automaticallyAfterDays: Double): SecretRotationRules = {
      val __obj = js.Dynamic.literal(automaticallyAfterDays = automaticallyAfterDays.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecretRotationRules]
    }
    
    extension [Self <: SecretRotationRules](x: Self) {
      
      inline def setAutomaticallyAfterDays(value: Double): Self = StObject.set(x, "automaticallyAfterDays", value.asInstanceOf[js.Any])
    }
  }
}
