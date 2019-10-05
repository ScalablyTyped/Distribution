package typings.atPulumiAws.typesInputMod.codepipeline

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineArtifactStoreEncryptionKey extends js.Object {
  /**
    * The codepipeline ID.
    */
  var id: Input[String]
  var `type`: Input[String]
}

object PipelineArtifactStoreEncryptionKey {
  @scala.inline
  def apply(id: Input[String], `type`: Input[String]): PipelineArtifactStoreEncryptionKey = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineArtifactStoreEncryptionKey]
  }
}

