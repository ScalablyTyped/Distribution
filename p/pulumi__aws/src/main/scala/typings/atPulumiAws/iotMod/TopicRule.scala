package typings.atPulumiAws.iotMod

import typings.atPulumiAws.iotTopicRuleMod.TopicRuleArgs
import typings.atPulumiAws.iotTopicRuleMod.TopicRuleState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iot", "TopicRule")
@js.native
class TopicRule protected ()
  extends typings.atPulumiAws.iotTopicRuleMod.TopicRule {
  /**
    * Create a TopicRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TopicRuleArgs) = this()
  def this(name: String, args: TopicRuleArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/iot", "TopicRule")
@js.native
object TopicRule extends js.Object {
  /**
    * Get an existing TopicRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.iotTopicRuleMod.TopicRule = js.native
  def get(name: String, id: Input[ID], state: TopicRuleState): typings.atPulumiAws.iotTopicRuleMod.TopicRule = js.native
  def get(name: String, id: Input[ID], state: TopicRuleState, opts: CustomResourceOptions): typings.atPulumiAws.iotTopicRuleMod.TopicRule = js.native
  /**
    * Returns true if the given object is an instance of TopicRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/topicRule.TopicRule */ Boolean = js.native
}

