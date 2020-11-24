package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Projection that may be projected along with other supported volume types
  */
@js.native
trait VolumeProjection extends js.Object {
  
  /**
    * information about the configMap data to project
    */
  var configMap: js.UndefOr[Input[ConfigMapProjection]] = js.native
  
  /**
    * information about the downwardAPI data to project
    */
  var downwardAPI: js.UndefOr[Input[DownwardAPIProjection]] = js.native
  
  /**
    * information about the secret data to project
    */
  var secret: js.UndefOr[Input[SecretProjection]] = js.native
  
  /**
    * information about the serviceAccountToken data to project
    */
  var serviceAccountToken: js.UndefOr[Input[ServiceAccountTokenProjection]] = js.native
}
object VolumeProjection {
  
  @scala.inline
  def apply(): VolumeProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeProjection]
  }
  
  @scala.inline
  implicit class VolumeProjectionOps[Self <: VolumeProjection] (val x: Self) extends AnyVal {
    
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
    def setConfigMap(value: Input[ConfigMapProjection]): Self = this.set("configMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigMap: Self = this.set("configMap", js.undefined)
    
    @scala.inline
    def setDownwardAPI(value: Input[DownwardAPIProjection]): Self = this.set("downwardAPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownwardAPI: Self = this.set("downwardAPI", js.undefined)
    
    @scala.inline
    def setSecret(value: Input[SecretProjection]): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
    
    @scala.inline
    def setServiceAccountToken(value: Input[ServiceAccountTokenProjection]): Self = this.set("serviceAccountToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccountToken: Self = this.set("serviceAccountToken", js.undefined)
  }
}
