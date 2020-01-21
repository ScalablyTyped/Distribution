package typings.pulumiAws.inputMod.codepipeline

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineArtifactStore extends js.Object {
  var encryptionKey: js.UndefOr[Input[PipelineArtifactStoreEncryptionKey]] = js.native
  var location: Input[String] = js.native
  var `type`: Input[String] = js.native
}

object PipelineArtifactStore {
  @scala.inline
  def apply(
    location: Input[String],
    `type`: Input[String],
    encryptionKey: Input[PipelineArtifactStoreEncryptionKey] = null
  ): PipelineArtifactStore = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineArtifactStore]
  }
}

