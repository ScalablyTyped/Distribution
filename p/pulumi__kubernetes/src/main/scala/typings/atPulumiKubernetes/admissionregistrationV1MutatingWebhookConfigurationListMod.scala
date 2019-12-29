package typings.atPulumiKubernetes

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.admissionregistrationDotk8sDotioSlashv1
import typings.atPulumiKubernetes.typesOutputMod.admissionregistration.v1.MutatingWebhookConfiguration
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/admissionregistration/v1/MutatingWebhookConfigurationList", JSImport.Namespace)
@js.native
object admissionregistrationV1MutatingWebhookConfigurationListMod extends js.Object {
  @js.native
  class MutatingWebhookConfigurationList protected () extends CustomResource {
    /**
      * Create a admissionregistration.v1.MutatingWebhookConfigurationList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.admissionregistration.v1.MutatingWebhookConfigurationList
    ) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.admissionregistration.v1.MutatingWebhookConfigurationList,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output[admissionregistrationDotk8sDotioSlashv1] = js.native
    /**
      * List of MutatingWebhookConfiguration.
      */
    val items: Output[js.Array[MutatingWebhookConfiguration]] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output[
        typings.atPulumiKubernetes.atPulumiKubernetesStrings.MutatingWebhookConfigurationList
      ] = js.native
    /**
      * Standard list metadata. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val metadata: Output[ListMeta] = js.native
  }
  
  /* static members */
  @js.native
  object MutatingWebhookConfigurationList extends js.Object {
    /**
      * Get the state of an existing `MutatingWebhookConfigurationList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): MutatingWebhookConfigurationList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): MutatingWebhookConfigurationList = js.native
    /**
      * Returns true if the given object is an instance of MutatingWebhookConfigurationList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/MutatingWebhookConfigurationList.MutatingWebhookConfigurationList */ Boolean = js.native
  }
  
}

