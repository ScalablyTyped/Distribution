package typings.pulumiAws.inputMod.codepipeline

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineArtifactStoreEncryptionKey extends js.Object {
  /**
    * The KMS key ARN or ID
    */
  var id: Input[String] = js.native
  /**
    * The type of key; currently only `KMS` is supported
    */
  var `type`: Input[String] = js.native
}

object PipelineArtifactStoreEncryptionKey {
  @scala.inline
  def apply(id: Input[String], `type`: Input[String]): PipelineArtifactStoreEncryptionKey = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineArtifactStoreEncryptionKey]
  }
}

