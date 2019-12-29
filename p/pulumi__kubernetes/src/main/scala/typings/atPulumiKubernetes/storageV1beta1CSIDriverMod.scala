package typings.atPulumiKubernetes

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.storageDotk8sDotioSlashv1beta1
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import typings.atPulumiKubernetes.typesOutputMod.storage.v1beta1.CSIDriverSpec
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/storage/v1beta1/CSIDriver", JSImport.Namespace)
@js.native
object storageV1beta1CSIDriverMod extends js.Object {
  @js.native
  class CSIDriver protected () extends CustomResource {
    /**
      * Create a storage.v1beta1.CSIDriver resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.storage.v1beta1.CSIDriver) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.storage.v1beta1.CSIDriver,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output[storageDotk8sDotioSlashv1beta1] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.CSIDriver] = js.native
    /**
      * Standard object metadata. metadata.Name indicates the name of the CSI driver that this
      * object refers to; it MUST be the same name returned by the CSI GetPluginName() call for
      * that driver. The driver name must be 63 characters or less, beginning and ending with an
      * alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and alphanumerics between.
      * More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output[ObjectMeta] = js.native
    /**
      * Specification of the CSI Driver.
      */
    val spec: Output[CSIDriverSpec] = js.native
  }
  
  /* static members */
  @js.native
  object CSIDriver extends js.Object {
    /**
      * Get the state of an existing `CSIDriver` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): CSIDriver = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): CSIDriver = js.native
    /**
      * Returns true if the given object is an instance of CSIDriver.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/CSIDriver.CSIDriver */ Boolean = js.native
  }
  
}

