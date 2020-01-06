package typings.atPulumiAws.typesInputMod.codepipeline

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineStageAction extends js.Object {
  var category: Input[String] = js.native
  var configuration: js.UndefOr[Input[StringDictionary[_]]] = js.native
  var inputArtifacts: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The name of the pipeline.
    */
  var name: Input[String] = js.native
  var outputArtifacts: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  var owner: Input[String] = js.native
  var provider: Input[String] = js.native
  /**
    * A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
    */
  var roleArn: js.UndefOr[Input[String]] = js.native
  var runOrder: js.UndefOr[Input[Double]] = js.native
  var version: Input[String] = js.native
}

object PipelineStageAction {
  @scala.inline
  def apply(
    category: Input[String],
    name: Input[String],
    owner: Input[String],
    provider: Input[String],
    version: Input[String],
    configuration: Input[StringDictionary[_]] = null,
    inputArtifacts: Input[js.Array[Input[String]]] = null,
    outputArtifacts: Input[js.Array[Input[String]]] = null,
    roleArn: Input[String] = null,
    runOrder: Input[Double] = null
  ): PipelineStageAction = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (inputArtifacts != null) __obj.updateDynamic("inputArtifacts")(inputArtifacts.asInstanceOf[js.Any])
    if (outputArtifacts != null) __obj.updateDynamic("outputArtifacts")(outputArtifacts.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (runOrder != null) __obj.updateDynamic("runOrder")(runOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineStageAction]
  }
}

