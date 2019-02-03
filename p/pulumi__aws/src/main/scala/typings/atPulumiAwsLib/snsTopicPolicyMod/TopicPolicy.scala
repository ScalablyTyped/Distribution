package typings
package atPulumiAwsLib.snsTopicPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sns/topicPolicy", "TopicPolicy")
@js.native
class TopicPolicy protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a TopicPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: TopicPolicyArgs) = this()
  def this(name: java.lang.String, args: TopicPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the SNS topic
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The fully-formed AWS policy as JSON. For more information about building AWS IAM policy documents with Terraform, see the [AWS IAM Policy Document Guide](https://www.terraform.io/docs/providers/aws/guides/iam-policy-documents.html).
    */
  val policy: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/sns/topicPolicy", "TopicPolicy")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.snsTopicPolicyMod.TopicPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.snsTopicPolicyMod.TopicPolicyState
  ): atPulumiAwsLib.snsTopicPolicyMod.TopicPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.snsTopicPolicyMod.TopicPolicyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.snsTopicPolicyMod.TopicPolicy = js.native
}

