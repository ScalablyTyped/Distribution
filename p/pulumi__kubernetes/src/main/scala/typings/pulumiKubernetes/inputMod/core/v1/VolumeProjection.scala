package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Projection that may be projected along with other supported volume types
  */
trait VolumeProjection extends StObject {
  
  /**
    * information about the configMap data to project
    */
  var configMap: js.UndefOr[Input[ConfigMapProjection]] = js.undefined
  
  /**
    * information about the downwardAPI data to project
    */
  var downwardAPI: js.UndefOr[Input[DownwardAPIProjection]] = js.undefined
  
  /**
    * information about the secret data to project
    */
  var secret: js.UndefOr[Input[SecretProjection]] = js.undefined
  
  /**
    * information about the serviceAccountToken data to project
    */
  var serviceAccountToken: js.UndefOr[Input[ServiceAccountTokenProjection]] = js.undefined
}
object VolumeProjection {
  
  inline def apply(): VolumeProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeProjection]
  }
  
  extension [Self <: VolumeProjection](x: Self) {
    
    inline def setConfigMap(value: Input[ConfigMapProjection]): Self = StObject.set(x, "configMap", value.asInstanceOf[js.Any])
    
    inline def setConfigMapUndefined: Self = StObject.set(x, "configMap", js.undefined)
    
    inline def setDownwardAPI(value: Input[DownwardAPIProjection]): Self = StObject.set(x, "downwardAPI", value.asInstanceOf[js.Any])
    
    inline def setDownwardAPIUndefined: Self = StObject.set(x, "downwardAPI", js.undefined)
    
    inline def setSecret(value: Input[SecretProjection]): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setServiceAccountToken(value: Input[ServiceAccountTokenProjection]): Self = StObject.set(x, "serviceAccountToken", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountTokenUndefined: Self = StObject.set(x, "serviceAccountToken", js.undefined)
  }
}
