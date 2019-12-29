package typings.atPulumiKubernetes

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1
import typings.atPulumiKubernetes.typesOutputMod.core.v1.NamespaceSpec
import typings.atPulumiKubernetes.typesOutputMod.core.v1.NamespaceStatus
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/core/v1/Namespace", JSImport.Namespace)
@js.native
object coreV1NamespaceMod extends js.Object {
  @js.native
  class Namespace protected () extends CustomResource {
    /**
      * Create a core.v1.Namespace resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.core.v1.Namespace) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.core.v1.Namespace,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output[v1] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Namespace] = js.native
    /**
      * Standard object's metadata. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output[ObjectMeta] = js.native
    /**
      * Spec defines the behavior of the Namespace. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    val spec: Output[NamespaceSpec] = js.native
    /**
      * Status describes the current status of a Namespace. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    val status: Output[NamespaceStatus] = js.native
  }
  
  /* static members */
  @js.native
  object Namespace extends js.Object {
    /**
      * Get the state of an existing `Namespace` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): Namespace = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): Namespace = js.native
    /**
      * Returns true if the given object is an instance of Namespace.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/Namespace.Namespace */ Boolean = js.native
  }
  
}

