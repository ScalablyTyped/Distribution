package typings.atPulumiAws.atPulumiAwsMod.kinesis

import typings.atPulumiAws.kinesisStreamMod.StreamArgs
import typings.atPulumiAws.kinesisStreamMod.StreamState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "kinesis.Stream")
@js.native
class Stream protected ()
  extends typings.atPulumiAws.kinesisMod.Stream {
  /**
    * Create a Stream resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: StreamArgs) = this()
  def this(name: String, args: StreamArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "kinesis.Stream")
@js.native
object Stream extends js.Object {
  /**
    * Get an existing Stream resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.kinesisStreamMod.Stream = js.native
  def get(name: String, id: Input[ID], state: StreamState): typings.atPulumiAws.kinesisStreamMod.Stream = js.native
  def get(name: String, id: Input[ID], state: StreamState, opts: CustomResourceOptions): typings.atPulumiAws.kinesisStreamMod.Stream = js.native
  /**
    * Returns true if the given object is an instance of Stream.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/stream.Stream */ Boolean = js.native
}

