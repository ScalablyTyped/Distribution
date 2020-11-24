package typings.pulumiAws.webAclLoggingConfigurationMod

import typings.pulumiAws.outputMod.wafv2.WebAclLoggingConfigurationRedactedField
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/wafv2/webAclLoggingConfiguration", "WebAclLoggingConfiguration")
@js.native
class WebAclLoggingConfiguration protected () extends CustomResource {
  /**
    * Create a WebAclLoggingConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: WebAclLoggingConfigurationArgs) = this()
  def this(name: String, args: WebAclLoggingConfigurationArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The Amazon Kinesis Data Firehose Amazon Resource Name (ARNs) that you want to associate with the web ACL. Currently, only 1 ARN is supported.
    */
  val logDestinationConfigs: Output_[js.Array[String]] = js.native
  
  /**
    * The parts of the request that you want to keep out of the logs. Up to 100 `redactedFields` blocks are supported.
    */
  val redactedFields: Output_[js.UndefOr[js.Array[WebAclLoggingConfigurationRedactedField]]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the web ACL that you want to associate with `logDestinationConfigs`.
    */
  val resourceArn: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/wafv2/webAclLoggingConfiguration", "WebAclLoggingConfiguration")
@js.native
object WebAclLoggingConfiguration extends js.Object {
  
  /**
    * Get an existing WebAclLoggingConfiguration resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): WebAclLoggingConfiguration = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): WebAclLoggingConfiguration = js.native
  def get(name: String, id: Input[ID], state: WebAclLoggingConfigurationState): WebAclLoggingConfiguration = js.native
  def get(name: String, id: Input[ID], state: WebAclLoggingConfigurationState, opts: CustomResourceOptions): WebAclLoggingConfiguration = js.native
  
  /**
    * Returns true if the given object is an instance of WebAclLoggingConfiguration.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/webAclLoggingConfiguration.WebAclLoggingConfiguration */ Boolean = js.native
}
