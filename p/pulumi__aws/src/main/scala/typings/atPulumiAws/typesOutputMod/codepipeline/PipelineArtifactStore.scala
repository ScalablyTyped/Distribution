package typings.atPulumiAws.typesOutputMod.codepipeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineArtifactStore extends js.Object {
  var encryptionKey: js.UndefOr[PipelineArtifactStoreEncryptionKey] = js.native
  var location: String = js.native
  var `type`: String = js.native
}

object PipelineArtifactStore {
  @scala.inline
  def apply(location: String, `type`: String, encryptionKey: PipelineArtifactStoreEncryptionKey = null): PipelineArtifactStore = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineArtifactStore]
  }
}

