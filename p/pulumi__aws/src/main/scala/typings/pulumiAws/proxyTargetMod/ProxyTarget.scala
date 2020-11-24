package typings.pulumiAws.proxyTargetMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/rds/proxyTarget", "ProxyTarget")
@js.native
class ProxyTarget protected () extends CustomResource {
  /**
    * Create a ProxyTarget resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ProxyTargetArgs) = this()
  def this(name: String, args: ProxyTargetArgs, opts: CustomResourceOptions) = this()
  
  /**
    * DB cluster identifier.
    */
  val dbClusterIdentifier: Output_[js.UndefOr[String]] = js.native
  
  /**
    * DB instance identifier.
    */
  val dbInstanceIdentifier: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The name of the DB proxy.
    */
  val dbProxyName: Output_[String] = js.native
  
  /**
    * Hostname for the target RDS DB Instance. Only returned for `RDS_INSTANCE` type.
    */
  val endpoint: Output_[String] = js.native
  
  /**
    * Port for the target RDS DB Instance or Aurora DB Cluster.
    */
  val port: Output_[Double] = js.native
  
  /**
    * Identifier representing the DB Instance or DB Cluster target.
    */
  val rdsResourceId: Output_[String] = js.native
  
  /**
    * Amazon Resource Name (ARN) for the DB instance or DB cluster. Currently not returned by the RDS API.
    */
  val targetArn: Output_[String] = js.native
  
  /**
    * The name of the target group.
    */
  val targetGroupName: Output_[String] = js.native
  
  /**
    * DB Cluster identifier for the DB Instance target. Not returned unless manually importing an `RDS_INSTANCE` target that is part of a DB Cluster.
    */
  val trackedClusterId: Output_[String] = js.native
  
  /**
    * Type of target. e.g. `RDS_INSTANCE` or `TRACKED_CLUSTER`
    */
  val `type`: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/rds/proxyTarget", "ProxyTarget")
@js.native
object ProxyTarget extends js.Object {
  
  /**
    * Get an existing ProxyTarget resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ProxyTarget = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ProxyTarget = js.native
  def get(name: String, id: Input[ID], state: ProxyTargetState): ProxyTarget = js.native
  def get(name: String, id: Input[ID], state: ProxyTargetState, opts: CustomResourceOptions): ProxyTarget = js.native
  
  /**
    * Returns true if the given object is an instance of ProxyTarget.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/proxyTarget.ProxyTarget */ Boolean = js.native
}
