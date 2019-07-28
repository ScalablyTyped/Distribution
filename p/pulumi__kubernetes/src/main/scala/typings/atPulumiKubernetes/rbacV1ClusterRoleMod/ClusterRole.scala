package typings.atPulumiKubernetes.rbacV1ClusterRoleMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiKubernetes.typesOutputMod.rbacNs.v1Ns.AggregationRule
import typings.atPulumiKubernetes.typesOutputMod.rbacNs.v1Ns.PolicyRule
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/rbac/v1/ClusterRole", "ClusterRole")
@js.native
class ClusterRole protected () extends CustomResource {
  /**
    * Create a rbac.v1.ClusterRole resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.rbacNs.v1Ns.ClusterRole) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.rbacNs.v1Ns.ClusterRole,
    opts: CustomResourceOptions
  ) = this()
  /**
    * AggregationRule is an optional field that describes how to build the Rules for this
    * ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct
    * changes to Rules will be stomped by the controller.
    */
  val aggregationRule: Output[AggregationRule] = js.native
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: Output[`rbacDOTauthorizationDOTk8sDOTio/v1`] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRole] = js.native
  /**
    * Standard object's metadata.
    */
  val metadata: Output[ObjectMeta] = js.native
  /**
    * Rules holds all the PolicyRules for this ClusterRole
    */
  val rules: Output[js.Array[PolicyRule]] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/rbac/v1/ClusterRole", "ClusterRole")
@js.native
object ClusterRole extends js.Object {
  /**
    * Get the state of an existing `ClusterRole` resource, as identified by `id`.
    * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
    * Kubernetes convention) the ID becomes default/<name>.
    *
    * Pulumi will keep track of this resource using `name` as the Pulumi ID.
    *
    * @param name _Unique_ name used to register this resource with Pulumi.
    * @param id An ID for the Kubernetes resource to retrieve. Takes the form
    *  <namespace>/<name> or <name>.
    * @param opts Uniquely specifies a CustomResource to select.
    */
  def get(name: String, id: Input[ID]): ClusterRole = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): ClusterRole = js.native
  /**
    * Returns true if the given object is an instance of ClusterRole.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1/ClusterRole.ClusterRole */ Boolean = js.native
}

