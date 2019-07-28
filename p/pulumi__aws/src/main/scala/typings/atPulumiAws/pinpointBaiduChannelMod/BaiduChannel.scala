package typings.atPulumiAws.pinpointBaiduChannelMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/pinpoint/baiduChannel", "BaiduChannel")
@js.native
class BaiduChannel protected () extends CustomResource {
  /**
    * Create a BaiduChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BaiduChannelArgs) = this()
  def this(name: String, args: BaiduChannelArgs, opts: CustomResourceOptions) = this()
  /**
    * Platform credential API key from Baidu.
    */
  val apiKey: Output[String] = js.native
  /**
    * The application ID.
    */
  val applicationId: Output[String] = js.native
  /**
    * Specifies whether to enable the channel. Defaults to `true`.
    */
  val enabled: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Platform credential Secret key from Baidu.
    */
  val secretKey: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/pinpoint/baiduChannel", "BaiduChannel")
@js.native
object BaiduChannel extends js.Object {
  /**
    * Get an existing BaiduChannel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): BaiduChannel = js.native
  def get(name: String, id: Input[ID], state: BaiduChannelState): BaiduChannel = js.native
  def get(name: String, id: Input[ID], state: BaiduChannelState, opts: CustomResourceOptions): BaiduChannel = js.native
  /**
    * Returns true if the given object is an instance of BaiduChannel.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/baiduChannel.BaiduChannel */ Boolean = js.native
}

