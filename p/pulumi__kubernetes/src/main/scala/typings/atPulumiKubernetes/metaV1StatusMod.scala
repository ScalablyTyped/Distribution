package typings.atPulumiKubernetes

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1
import typings.atPulumiKubernetes.metaV1StatusMod.Status
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.StatusDetails
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/meta/v1/Status", JSImport.Namespace)
@js.native
object metaV1StatusMod extends js.Object {
  @js.native
  class Status protected () extends CustomResource {
    /**
      * Create a meta.v1.Status resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.meta.v1.Status) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.meta.v1.Status,
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
      * Suggested HTTP return code for this status, 0 if not set.
      */
    val code: Output[Double] = js.native
    /**
      * Extended data associated with the reason.  Each reason may define its own extended details.
      * This field is optional and the data returned is not guaranteed to conform to any schema
      * except that defined by the reason type.
      */
    val details: Output[StatusDetails] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Status] = js.native
    /**
      * A human-readable description of the status of this operation.
      */
    val message: Output[String] = js.native
    /**
      * Standard list metadata. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val metadata: Output[ListMeta] = js.native
    /**
      * A machine-readable description of why this operation is in the "Failure" status. If this
      * value is empty there is no information available. A Reason clarifies an HTTP status code
      * but does not override it.
      */
    val reason: Output[String] = js.native
    /**
      * Status of the operation. One of: "Success" or "Failure". More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    val status: Output[String] = js.native
  }
  
  /* static members */
  @js.native
  object Status extends js.Object {
    /**
      * Get the state of an existing `Status` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): Status = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): Status = js.native
    /**
      * Returns true if the given object is an instance of Status.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/meta/v1/Status.Status */ Boolean = js.native
  }
  
}

