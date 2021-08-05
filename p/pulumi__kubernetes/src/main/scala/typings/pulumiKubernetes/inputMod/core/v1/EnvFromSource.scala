package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var configMapRef: js.UndefOr[Input[ConfigMapEnvSource]] = js.undefined
  
  /**
    * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
    */
  var prefix: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The Secret to select from
    */
  var secretRef: js.UndefOr[Input[SecretEnvSource]] = js.undefined
}
object EnvFromSource {
  
  inline def apply(): EnvFromSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvFromSource]
  }
  
  extension [Self <: EnvFromSource](x: Self) {
    
    inline def setConfigMapRef(value: Input[ConfigMapEnvSource]): Self = StObject.set(x, "configMapRef", value.asInstanceOf[js.Any])
    
    inline def setConfigMapRefUndefined: Self = StObject.set(x, "configMapRef", js.undefined)
    
    inline def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSecretRef(value: Input[SecretEnvSource]): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    inline def setSecretRefUndefined: Self = StObject.set(x, "secretRef", js.undefined)
  }
}
