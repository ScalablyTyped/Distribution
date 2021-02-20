package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object secretsmanager {
  
  @js.native
  trait GetSecretRotationRotationRule extends StObject {
    
    var automaticallyAfterDays: Double = js.native
  }
  object GetSecretRotationRotationRule {
    
    @scala.inline
    def apply(automaticallyAfterDays: Double): GetSecretRotationRotationRule = {
      val __obj = js.Dynamic.literal(automaticallyAfterDays = automaticallyAfterDays.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSecretRotationRotationRule]
    }
    
    @scala.inline
    implicit class GetSecretRotationRotationRuleMutableBuilder[Self <: GetSecretRotationRotationRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutomaticallyAfterDays(value: Double): Self = StObject.set(x, "automaticallyAfterDays", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetSecretRotationRule extends StObject {
    
    var automaticallyAfterDays: Double = js.native
  }
  object GetSecretRotationRule {
    
    @scala.inline
    def apply(automaticallyAfterDays: Double): GetSecretRotationRule = {
      val __obj = js.Dynamic.literal(automaticallyAfterDays = automaticallyAfterDays.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSecretRotationRule]
    }
    
    @scala.inline
    implicit class GetSecretRotationRuleMutableBuilder[Self <: GetSecretRotationRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutomaticallyAfterDays(value: Double): Self = StObject.set(x, "automaticallyAfterDays", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SecretRotationRotationRules extends StObject {
    
    /**
      * Specifies the number of days between automatic scheduled rotations of the secret.
      */
    var automaticallyAfterDays: Double = js.native
  }
  object SecretRotationRotationRules {
    
    @scala.inline
    def apply(automaticallyAfterDays: Double): SecretRotationRotationRules = {
      val __obj = js.Dynamic.literal(automaticallyAfterDays = automaticallyAfterDays.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecretRotationRotationRules]
    }
    
    @scala.inline
    implicit class SecretRotationRotationRulesMutableBuilder[Self <: SecretRotationRotationRules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutomaticallyAfterDays(value: Double): Self = StObject.set(x, "automaticallyAfterDays", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SecretRotationRules extends StObject {
    
    /**
      * Specifies the number of days between automatic scheduled rotations of the secret.
      */
    var automaticallyAfterDays: Double = js.native
  }
  object SecretRotationRules {
    
    @scala.inline
    def apply(automaticallyAfterDays: Double): SecretRotationRules = {
      val __obj = js.Dynamic.literal(automaticallyAfterDays = automaticallyAfterDays.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecretRotationRules]
    }
    
    @scala.inline
    implicit class SecretRotationRulesMutableBuilder[Self <: SecretRotationRules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutomaticallyAfterDays(value: Double): Self = StObject.set(x, "automaticallyAfterDays", value.asInstanceOf[js.Any])
    }
  }
}
