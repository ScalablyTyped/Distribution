package typings.pulumiAws.wafv2IpSetMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/wafv2/ipSet", "IpSet")
@js.native
class IpSet protected () extends CustomResource {
  /**
    * Create a IpSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: IpSetArgs) = this()
  def this(name: String, args: IpSetArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
    */
  val addresses: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) that identifies the cluster.
    */
  val arn: Output_[String] = js.native
  
  /**
    * A friendly description of the IP set.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Specify IPV4 or IPV6. Valid values are `IPV4` or `IPV6`.
    */
  val ipAddressVersion: Output_[String] = js.native
  
  val lockToken: Output_[String] = js.native
  
  /**
    * A friendly name of the IP set.
    */
  val name: Output_[String] = js.native
  
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the Region US East (N. Virginia).
    */
  val scope: Output_[String] = js.native
  
  /**
    * An array of key:value pairs to associate with the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/wafv2/ipSet", "IpSet")
@js.native
object IpSet extends js.Object {
  
  /**
    * Get an existing IpSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): IpSet = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): IpSet = js.native
  def get(name: String, id: Input[ID], state: IpSetState): IpSet = js.native
  def get(name: String, id: Input[ID], state: IpSetState, opts: CustomResourceOptions): IpSet = js.native
  
  /**
    * Returns true if the given object is an instance of IpSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/ipSet.IpSet */ Boolean = js.native
}
