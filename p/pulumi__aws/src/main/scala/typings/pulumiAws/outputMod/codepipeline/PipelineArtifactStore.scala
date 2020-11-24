package typings.pulumiAws.outputMod.codepipeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipelineArtifactStore extends js.Object {
  
  /**
    * The encryption key block AWS CodePipeline uses to encrypt the data in the artifact store, such as an AWS Key Management Service (AWS KMS) key. If you don't specify a key, AWS CodePipeline uses the default key for Amazon Simple Storage Service (Amazon S3). An `encryptionKey` block is documented below.
    */
  var encryptionKey: js.UndefOr[PipelineArtifactStoreEncryptionKey] = js.native
  
  /**
    * The location where AWS CodePipeline stores artifacts for a pipeline; currently only `S3` is supported.
    */
  var location: String = js.native
  
  /**
    * The region where the artifact store is located. Required for a cross-region CodePipeline, do not provide for a single-region CodePipeline.
    */
  var region: String = js.native
  
  /**
    * The type of the artifact store, such as Amazon S3
    */
  var `type`: String = js.native
}
object PipelineArtifactStore {
  
  @scala.inline
  def apply(location: String, region: String, `type`: String): PipelineArtifactStore = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineArtifactStore]
  }
  
  @scala.inline
  implicit class PipelineArtifactStoreOps[Self <: PipelineArtifactStore] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKey(value: PipelineArtifactStoreEncryptionKey): Self = this.set("encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionKey: Self = this.set("encryptionKey", js.undefined)
  }
}
