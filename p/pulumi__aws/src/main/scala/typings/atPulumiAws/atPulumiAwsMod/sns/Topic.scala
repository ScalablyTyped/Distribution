package typings.atPulumiAws.atPulumiAwsMod.sns

import typings.atPulumiAws.snsTopicMod.TopicArgs
import typings.atPulumiAws.snsTopicMod.TopicState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "sns.Topic")
@js.native
class Topic protected ()
  extends typings.atPulumiAws.snsMod.Topic {
  /**
    * Create a Topic resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: TopicArgs) = this()
  def this(name: String, args: TopicArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "sns.Topic")
@js.native
object Topic extends js.Object {
  /**
    * Get an existing Topic resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.snsSnsMixinsMod.snsTopicMod.Topic = js.native
  def get(name: String, id: Input[ID], state: TopicState): typings.atPulumiAws.snsSnsMixinsMod.snsTopicMod.Topic = js.native
  def get(name: String, id: Input[ID], state: TopicState, opts: CustomResourceOptions): typings.atPulumiAws.snsSnsMixinsMod.snsTopicMod.Topic = js.native
  /**
    * Returns true if the given object is an instance of Topic.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/snsMixins.@pulumi/aws/sns/topic.Topic */ Boolean = js.native
}

