package typings.atPulumiKubernetes.certificatesMod

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/certificates", "v1beta1")
@js.native
object v1beta1Ns extends js.Object {
  @js.native
  class CertificateSigningRequest protected ()
    extends typings.atPulumiKubernetes.certificatesV1beta1Mod.CertificateSigningRequest {
    /**
      * Create a certificates.v1beta1.CertificateSigningRequest resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.certificatesNs.v1beta1Ns.CertificateSigningRequest
    ) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.certificatesNs.v1beta1Ns.CertificateSigningRequest,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class CertificateSigningRequestList protected ()
    extends typings.atPulumiKubernetes.certificatesV1beta1Mod.CertificateSigningRequestList {
    /**
      * Create a certificates.v1beta1.CertificateSigningRequestList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.certificatesNs.v1beta1Ns.CertificateSigningRequestList
    ) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.certificatesNs.v1beta1Ns.CertificateSigningRequestList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  /* static members */
  @js.native
  object CertificateSigningRequest extends js.Object {
    /**
      * Get the state of an existing `CertificateSigningRequest` resource, as identified by `id`.
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
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.certificatesV1beta1CertificateSigningRequestMod.CertificateSigningRequest = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.certificatesV1beta1CertificateSigningRequestMod.CertificateSigningRequest = js.native
    /**
      * Returns true if the given object is an instance of CertificateSigningRequest.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/CertificateSigningRequest.CertificateSigningRequest */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object CertificateSigningRequestList extends js.Object {
    /**
      * Get the state of an existing `CertificateSigningRequestList` resource, as identified by `id`.
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
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.certificatesV1beta1CertificateSigningRequestListMod.CertificateSigningRequestList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.certificatesV1beta1CertificateSigningRequestListMod.CertificateSigningRequestList = js.native
    /**
      * Returns true if the given object is an instance of CertificateSigningRequestList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/CertificateSigningRequestList.CertificateSigningRequestList */ Boolean = js.native
  }
  
}

