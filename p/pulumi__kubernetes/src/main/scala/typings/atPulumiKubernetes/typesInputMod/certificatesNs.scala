package typings.atPulumiKubernetes.typesInputMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`certificatesDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesInputMod.certificatesNs.v1beta1Ns.CertificateSigningRequest
import typings.atPulumiKubernetes.typesInputMod.certificatesNs.v1beta1Ns.CertificateSigningRequestCondition
import typings.atPulumiKubernetes.typesInputMod.certificatesNs.v1beta1Ns.CertificateSigningRequestSpec
import typings.atPulumiKubernetes.typesInputMod.certificatesNs.v1beta1Ns.CertificateSigningRequestStatus
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ListMeta
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "certificates")
@js.native
object certificatesNs extends js.Object {
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * Describes a certificate signing request
      */
    trait CertificateSigningRequest extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`certificatesDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.CertificateSigningRequest]
          ] = js.undefined
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * The certificate request itself and any additional information.
        */
      var spec: js.UndefOr[Input[CertificateSigningRequestSpec]] = js.undefined
      /**
        * Derived information about the request.
        */
      var status: js.UndefOr[Input[CertificateSigningRequestStatus]] = js.undefined
    }
    
    trait CertificateSigningRequestCondition extends js.Object {
      /**
        * timestamp for the last update to this condition
        */
      var lastUpdateTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * human readable message with details about the request state
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      /**
        * brief reason for the request state
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      /**
        * request approval state, currently Approved or Denied.
        */
      var `type`: Input[String]
    }
    
    trait CertificateSigningRequestList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`certificatesDOTk8sDOTio/v1beta1`]] = js.undefined
      var items: Input[js.Array[Input[CertificateSigningRequest]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.atPulumiKubernetesStrings.CertificateSigningRequestList
            ]
          ] = js.undefined
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * This information is immutable after the request is created. Only the Request and Usages
      * fields can be set on creation, other fields are derived by Kubernetes and cannot be modified
      * by users.
      */
    trait CertificateSigningRequestSpec extends js.Object {
      /**
        * Extra information about the requesting user. See user.Info interface for details.
        */
      var extra: js.UndefOr[Input[js.Object]] = js.undefined
      /**
        * Group information about the requesting user. See user.Info interface for details.
        */
      var groups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Base64-encoded PKCS#10 CSR data
        */
      var request: Input[String]
      /**
        * UID information about the requesting user. See user.Info interface for details.
        */
      var uid: js.UndefOr[Input[String]] = js.undefined
      /**
        * allowedUsages specifies a set of usage contexts the key will be valid for. See:
        * https://tools.ietf.org/html/rfc5280#section-4.2.1.3
        *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
        */
      var usages: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Information about the requesting user. See user.Info interface for details.
        */
      var username: js.UndefOr[Input[String]] = js.undefined
    }
    
    trait CertificateSigningRequestStatus extends js.Object {
      /**
        * If request was approved, the controller will place the issued certificate here.
        */
      var certificate: js.UndefOr[Input[String]] = js.undefined
      /**
        * Conditions applied to the request, such as approval or denial.
        */
      var conditions: js.UndefOr[Input[js.Array[Input[CertificateSigningRequestCondition]]]] = js.undefined
    }
    
    def isCertificateSigningRequest(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.certificates.v1beta1.CertificateSigningRequest */ Boolean = js.native
    def isCertificateSigningRequestList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.certificates.v1beta1.CertificateSigningRequestList */ Boolean = js.native
  }
  
}

