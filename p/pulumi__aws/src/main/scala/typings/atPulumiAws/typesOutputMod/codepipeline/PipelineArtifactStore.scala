package typings.atPulumiAws.typesOutputMod.codepipeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineArtifactStore extends js.Object {
  var encryptionKey: js.UndefOr[PipelineArtifactStoreEncryptionKey] = js.undefined
  var location: String
  var `type`: String
}

object PipelineArtifactStore {
  @scala.inline
  def apply(location: String, `type`: String, encryptionKey: PipelineArtifactStoreEncryptionKey = null): PipelineArtifactStore = {
    val __obj = js.Dynamic.literal(location = location)
    __obj.updateDynamic("type")(`type`)
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey)
    __obj.asInstanceOf[PipelineArtifactStore]
  }
}

