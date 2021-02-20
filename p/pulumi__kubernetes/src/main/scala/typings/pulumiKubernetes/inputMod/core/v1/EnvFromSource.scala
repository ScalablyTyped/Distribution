package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EnvFromSource represents the source of a set of ConfigMaps
  */
@js.native
trait EnvFromSource extends StObject {
  
  /**
    * The ConfigMap to select from
    */
  var configMapRef: js.UndefOr[Input[ConfigMapEnvSource]] = js.native
  
  /**
    * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
    */
  var prefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Secret to select from
    */
  var secretRef: js.UndefOr[Input[SecretEnvSource]] = js.native
}
object EnvFromSource {
  
  @scala.inline
  def apply(): EnvFromSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvFromSource]
  }
  
  @scala.inline
  implicit class EnvFromSourceMutableBuilder[Self <: EnvFromSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigMapRef(value: Input[ConfigMapEnvSource]): Self = StObject.set(x, "configMapRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigMapRefUndefined: Self = StObject.set(x, "configMapRef", js.undefined)
    
    @scala.inline
    def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setSecretRef(value: Input[SecretEnvSource]): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretRefUndefined: Self = StObject.set(x, "secretRef", js.undefined)
  }
}
