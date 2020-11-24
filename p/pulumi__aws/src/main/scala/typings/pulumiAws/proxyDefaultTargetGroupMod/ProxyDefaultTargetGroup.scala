package typings.pulumiAws.proxyDefaultTargetGroupMod

import typings.pulumiAws.outputMod.rds.ProxyDefaultTargetGroupConnectionPoolConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/rds/proxyDefaultTargetGroup", "ProxyDefaultTargetGroup")
@js.native
class ProxyDefaultTargetGroup protected () extends CustomResource {
  /**
    * Create a ProxyDefaultTargetGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ProxyDefaultTargetGroupArgs) = this()
  def this(name: String, args: ProxyDefaultTargetGroupArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The Amazon Resource Name (ARN) representing the target group.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The settings that determine the size and behavior of the connection pool for the target group.
    */
  val connectionPoolConfig: Output_[ProxyDefaultTargetGroupConnectionPoolConfig] = js.native
  
  /**
    * Name of the RDS DB Proxy.
    */
  val dbProxyName: Output_[String] = js.native
  
  /**
    * The name of the default target group.
    */
  val name: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/rds/proxyDefaultTargetGroup", "ProxyDefaultTargetGroup")
@js.native
object ProxyDefaultTargetGroup extends js.Object {
  
  /**
    * Get an existing ProxyDefaultTargetGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ProxyDefaultTargetGroup = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ProxyDefaultTargetGroup = js.native
  def get(name: String, id: Input[ID], state: ProxyDefaultTargetGroupState): ProxyDefaultTargetGroup = js.native
  def get(name: String, id: Input[ID], state: ProxyDefaultTargetGroupState, opts: CustomResourceOptions): ProxyDefaultTargetGroup = js.native
  
  /**
    * Returns true if the given object is an instance of ProxyDefaultTargetGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/proxyDefaultTargetGroup.ProxyDefaultTargetGroup */ Boolean = js.native
}
