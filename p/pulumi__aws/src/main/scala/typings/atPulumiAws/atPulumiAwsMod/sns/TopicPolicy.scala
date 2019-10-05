package typings.atPulumiAws.atPulumiAwsMod.sns

import typings.atPulumiAws.snsTopicPolicyMod.TopicPolicyArgs
import typings.atPulumiAws.snsTopicPolicyMod.TopicPolicyState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "sns.TopicPolicy")
@js.native
class TopicPolicy protected ()
  extends typings.atPulumiAws.snsMod.TopicPolicy {
  /**
    * Create a TopicPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TopicPolicyArgs) = this()
  def this(name: String, args: TopicPolicyArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "sns.TopicPolicy")
@js.native
object TopicPolicy extends js.Object {
  /**
    * Get an existing TopicPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.snsTopicPolicyMod.TopicPolicy = js.native
  def get(name: String, id: Input[ID], state: TopicPolicyState): typings.atPulumiAws.snsTopicPolicyMod.TopicPolicy = js.native
  def get(name: String, id: Input[ID], state: TopicPolicyState, opts: CustomResourceOptions): typings.atPulumiAws.snsTopicPolicyMod.TopicPolicy = js.native
  /**
    * Returns true if the given object is an instance of TopicPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/topicPolicy.TopicPolicy */ Boolean = js.native
}

