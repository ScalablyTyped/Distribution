package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EnvFromSource represents the source of a set of ConfigMaps
  */
trait EnvFromSource extends StObject {
  
  /**
    * The ConfigMap to select from
    */
  var configMapRef: ConfigMapEnvSource
  
  /**
    * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
    */
  var prefix: String
  
  /**
    * The Secret to select from
    */
  var secretRef: SecretEnvSource
}
object EnvFromSource {
  
  @scala.inline
  def apply(configMapRef: ConfigMapEnvSource, prefix: String, secretRef: SecretEnvSource): EnvFromSource = {
    val __obj = js.Dynamic.literal(configMapRef = configMapRef.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvFromSource]
  }
  
  @scala.inline
  implicit class EnvFromSourceMutableBuilder[Self <: EnvFromSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigMapRef(value: ConfigMapEnvSource): Self = StObject.set(x, "configMapRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretRef(value: SecretEnvSource): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
  }
}
