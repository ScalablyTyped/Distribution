package typings.pulumiAws.channelMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.mediapackage.ChannelHlsIngest
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/mediapackage/channel", "Channel")
@js.native
class Channel protected () extends CustomResource {
  /**
    * Create a Channel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ChannelArgs) = this()
  def this(name: String, args: ChannelArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the channel
    */
  val arn: Output_[String] = js.native
  /**
    * A unique identifier describing the channel
    */
  val channelId: Output_[String] = js.native
  /**
    * A description of the channel
    */
  val description: Output_[String] = js.native
  /**
    * A single item list of HLS ingest information
    */
  val hlsIngests: Output_[js.Array[ChannelHlsIngest]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/mediapackage/channel", "Channel")
@js.native
object Channel extends js.Object {
  /**
    * Get an existing Channel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Channel = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Channel = js.native
  def get(name: String, id: Input[ID], state: ChannelState): Channel = js.native
  def get(name: String, id: Input[ID], state: ChannelState, opts: CustomResourceOptions): Channel = js.native
  /**
    * Returns true if the given object is an instance of Channel.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mediapackage/channel.Channel */ Boolean = js.native
}

