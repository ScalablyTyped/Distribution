package typings.atPulumiAws.typesOutputMod.codepipelineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineArtifactStoreEncryptionKey extends js.Object {
  /**
    * The codepipeline ID.
    */
  var id: String
  var `type`: String
}

object PipelineArtifactStoreEncryptionKey {
  @scala.inline
  def apply(id: String, `type`: String): PipelineArtifactStoreEncryptionKey = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PipelineArtifactStoreEncryptionKey]
  }
}

