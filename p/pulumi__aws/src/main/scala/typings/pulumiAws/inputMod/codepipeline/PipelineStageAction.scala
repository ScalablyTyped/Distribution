package typings.pulumiAws.inputMod.codepipeline

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineStageAction extends js.Object {
  /**
    * A category defines what kind of action can be taken in the stage, and constrains the provider type for the action. Possible values are `Approval`, `Build`, `Deploy`, `Invoke`, `Source` and `Test`.
    */
  var category: Input[String] = js.native
  /**
    * A Map of the action declaration's configuration. Find out more about configuring action configurations in the [Reference Pipeline Structure documentation](http://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements).
    */
  var configuration: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * A list of artifact names to be worked on.
    */
  var inputArtifacts: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The action declaration's name.
    */
  var name: Input[String] = js.native
  /**
    * A list of artifact names to output. Output artifact names must be unique within a pipeline.
    */
  var outputArtifacts: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The creator of the action being called. Possible values are `AWS`, `Custom` and `ThirdParty`.
    */
  var owner: Input[String] = js.native
  /**
    * The provider of the service being called by the action. Valid providers are determined by the action category. For example, an action in the Deploy category type might have a provider of AWS CodeDeploy, which would be specified as CodeDeploy.
    */
  var provider: Input[String] = js.native
  /**
    * The region in which to run the action.
    */
  var region: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the IAM service role that will perform the declared action. This is assumed through the roleArn for the pipeline.
    */
  var roleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The order in which actions are run.
    */
  var runOrder: js.UndefOr[Input[Double]] = js.native
  /**
    * A string that identifies the action type.
    */
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
    configuration: Input[StringDictionary[Input[String]]] = null,
    inputArtifacts: Input[js.Array[Input[String]]] = null,
    outputArtifacts: Input[js.Array[Input[String]]] = null,
    region: Input[String] = null,
    roleArn: Input[String] = null,
    runOrder: Input[Double] = null
  ): PipelineStageAction = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (inputArtifacts != null) __obj.updateDynamic("inputArtifacts")(inputArtifacts.asInstanceOf[js.Any])
    if (outputArtifacts != null) __obj.updateDynamic("outputArtifacts")(outputArtifacts.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (runOrder != null) __obj.updateDynamic("runOrder")(runOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineStageAction]
  }
}

