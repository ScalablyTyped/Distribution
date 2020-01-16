package typings.atPulumiAws.ecsClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ecs.ClusterDefaultCapacityProviderStrategy
import typings.atPulumiAws.typesOutputMod.ecs.ClusterSetting
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ecs/cluster", "Cluster")
@js.native
class Cluster protected () extends CustomResource {
  /**
    * Create a Cluster resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ClusterArgs) = this()
  def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) that identifies the cluster
    */
  val arn: Output[String] = js.native
  /**
    * List of short names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
    */
  val capacityProviders: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The capacity provider strategy to use by default for the cluster. Can be one or more.  Defined below.
    */
  val defaultCapacityProviderStrategies: Output[js.UndefOr[js.Array[ClusterDefaultCapacityProviderStrategy]]] = js.native
  /**
    * The name of the cluster (up to 255 letters, numbers, hyphens, and underscores)
    */
  val name: Output[String] = js.native
  /**
    * Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. Defined below.
    */
  val settings: Output[js.Array[ClusterSetting]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ecs/cluster", "Cluster")
@js.native
object Cluster extends js.Object {
  /**
    * Get an existing Cluster resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Cluster = js.native
  def get(name: String, id: Input[ID], state: ClusterState): Cluster = js.native
  def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): Cluster = js.native
  /**
    * Returns true if the given object is an instance of Cluster.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/cluster.Cluster */ Boolean = js.native
}

