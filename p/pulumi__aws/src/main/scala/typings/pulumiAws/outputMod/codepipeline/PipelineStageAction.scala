package typings.pulumiAws.outputMod.codepipeline

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineStageAction extends js.Object {
  /**
    * A category defines what kind of action can be taken in the stage, and constrains the provider type for the action. Possible values are `Approval`, `Build`, `Deploy`, `Invoke`, `Source` and `Test`.
    */
  var category: String = js.native
  /**
    * A Map of the action declaration's configuration. Find out more about configuring action configurations in the [Reference Pipeline Structure documentation](http://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements).
    */
  var configuration: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * A list of artifact names to be worked on.
    */
  var inputArtifacts: js.UndefOr[js.Array[String]] = js.native
  /**
    * The action declaration's name.
    */
  var name: String = js.native
  /**
    * A list of artifact names to output. Output artifact names must be unique within a pipeline.
    */
  var outputArtifacts: js.UndefOr[js.Array[String]] = js.native
  /**
    * The creator of the action being called. Possible values are `AWS`, `Custom` and `ThirdParty`.
    */
  var owner: String = js.native
  /**
    * The provider of the service being called by the action. Valid providers are determined by the action category. For example, an action in the Deploy category type might have a provider of AWS CodeDeploy, which would be specified as CodeDeploy.
    */
  var provider: String = js.native
  /**
    * The region in which to run the action.
    */
  var region: String = js.native
  /**
    * The ARN of the IAM service role that will perform the declared action. This is assumed through the roleArn for the pipeline.
    */
  var roleArn: js.UndefOr[String] = js.native
  /**
    * The order in which actions are run.
    */
  var runOrder: Double = js.native
  /**
    * A string that identifies the action type.
    */
  var version: String = js.native
}

object PipelineStageAction {
  @scala.inline
  def apply(
    category: String,
    name: String,
    owner: String,
    provider: String,
    region: String,
    runOrder: Double,
    version: String,
    configuration: StringDictionary[String] = null,
    inputArtifacts: js.Array[String] = null,
    outputArtifacts: js.Array[String] = null,
    roleArn: String = null
  ): PipelineStageAction = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], runOrder = runOrder.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (inputArtifacts != null) __obj.updateDynamic("inputArtifacts")(inputArtifacts.asInstanceOf[js.Any])
    if (outputArtifacts != null) __obj.updateDynamic("outputArtifacts")(outputArtifacts.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineStageAction]
  }
}

