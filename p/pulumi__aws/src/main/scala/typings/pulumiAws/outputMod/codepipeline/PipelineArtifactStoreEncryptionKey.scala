package typings.pulumiAws.outputMod.codepipeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineArtifactStoreEncryptionKey extends js.Object {
  /**
    * The KMS key ARN or ID
    */
  var id: String = js.native
  /**
    * The type of key; currently only `KMS` is supported
    */
  var `type`: String = js.native
}

object PipelineArtifactStoreEncryptionKey {
  @scala.inline
  def apply(id: String, `type`: String): PipelineArtifactStoreEncryptionKey = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineArtifactStoreEncryptionKey]
  }
}

