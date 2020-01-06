package typings.atPulumiAws.typesOutputMod.codepipeline

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineStageAction extends js.Object {
  var category: String = js.native
  var configuration: js.UndefOr[StringDictionary[js.Any]] = js.native
  var inputArtifacts: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of the pipeline.
    */
  var name: String = js.native
  var outputArtifacts: js.UndefOr[js.Array[String]] = js.native
  var owner: String = js.native
  var provider: String = js.native
  /**
    * A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
    */
  var roleArn: js.UndefOr[String] = js.native
  var runOrder: Double = js.native
  var version: String = js.native
}

object PipelineStageAction {
  @scala.inline
  def apply(
    category: String,
    name: String,
    owner: String,
    provider: String,
    runOrder: Double,
    version: String,
    configuration: StringDictionary[js.Any] = null,
    inputArtifacts: js.Array[String] = null,
    outputArtifacts: js.Array[String] = null,
    roleArn: String = null
  ): PipelineStageAction = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], runOrder = runOrder.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (inputArtifacts != null) __obj.updateDynamic("inputArtifacts")(inputArtifacts.asInstanceOf[js.Any])
    if (outputArtifacts != null) __obj.updateDynamic("outputArtifacts")(outputArtifacts.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineStageAction]
  }
}

