package typings.atPulumiAws.typesOutputMod.codepipeline

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineStageAction extends js.Object {
  var category: String
  var configuration: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var inputArtifacts: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The name of the pipeline.
    */
  var name: String
  var outputArtifacts: js.UndefOr[js.Array[String]] = js.undefined
  var owner: String
  var provider: String
  /**
    * A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
    */
  var roleArn: js.UndefOr[String] = js.undefined
  var runOrder: Double
  var version: String
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
    val __obj = js.Dynamic.literal(category = category, name = name, owner = owner, provider = provider, runOrder = runOrder, version = version)
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (inputArtifacts != null) __obj.updateDynamic("inputArtifacts")(inputArtifacts)
    if (outputArtifacts != null) __obj.updateDynamic("outputArtifacts")(outputArtifacts)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[PipelineStageAction]
  }
}

