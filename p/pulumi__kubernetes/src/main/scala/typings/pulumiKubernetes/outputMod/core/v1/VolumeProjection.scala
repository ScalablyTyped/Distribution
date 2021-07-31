package typings.pulumiKubernetes.outputMod.core.v1

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
  var configMap: ConfigMapProjection
  
  /**
    * information about the downwardAPI data to project
    */
  var downwardAPI: DownwardAPIProjection
  
  /**
    * information about the secret data to project
    */
  var secret: SecretProjection
  
  /**
    * information about the serviceAccountToken data to project
    */
  var serviceAccountToken: ServiceAccountTokenProjection
}
object VolumeProjection {
  
  @scala.inline
  def apply(
    configMap: ConfigMapProjection,
    downwardAPI: DownwardAPIProjection,
    secret: SecretProjection,
    serviceAccountToken: ServiceAccountTokenProjection
  ): VolumeProjection = {
    val __obj = js.Dynamic.literal(configMap = configMap.asInstanceOf[js.Any], downwardAPI = downwardAPI.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], serviceAccountToken = serviceAccountToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeProjection]
  }
  
  @scala.inline
  implicit class VolumeProjectionMutableBuilder[Self <: VolumeProjection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigMap(value: ConfigMapProjection): Self = StObject.set(x, "configMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownwardAPI(value: DownwardAPIProjection): Self = StObject.set(x, "downwardAPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecret(value: SecretProjection): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountToken(value: ServiceAccountTokenProjection): Self = StObject.set(x, "serviceAccountToken", value.asInstanceOf[js.Any])
  }
}
