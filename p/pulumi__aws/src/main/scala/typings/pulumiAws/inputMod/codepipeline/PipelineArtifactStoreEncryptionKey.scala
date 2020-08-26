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
  @scala.inline
  implicit class PipelineArtifactStoreEncryptionKeyOps[Self <: PipelineArtifactStoreEncryptionKey] (val x: Self) extends AnyVal {
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
    def setId(value: Input[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

