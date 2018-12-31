package typings
package atPulumiAwsLib.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sns", "Topic")
@js.native
class Topic protected ()
  extends atPulumiAwsLib.snsSnsMixinsMod.snsTopicMod.Topic {
  /**
    * Create a Topic resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.snsTopicMod.TopicArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.snsTopicMod.TopicArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

@JSImport("@pulumi/aws/sns", "Topic")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.snsSnsMixinsMod.snsTopicMod.Topic = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.snsTopicMod.TopicState
  ): atPulumiAwsLib.snsSnsMixinsMod.snsTopicMod.Topic = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.snsTopicMod.TopicState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.snsSnsMixinsMod.snsTopicMod.Topic = js.native
}

