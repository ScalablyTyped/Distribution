package typings.pulumiAws.outputMod.codepipeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    location: String,
    region: String,
    `type`: String,
    encryptionKey: PipelineArtifactStoreEncryptionKey = null
  ): PipelineArtifactStore = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineArtifactStore]
  }
}

