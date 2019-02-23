package typings
package atPulumiKubernetesLib.typesInputMod

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
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[
              atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1`
            ]
          ] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CertificateSigningRequest]
          ] = js.undefined
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
        * The certificate request itself and any additional information.
        */
      var spec: js.UndefOr[atPulumiPulumiLib.outputMod.Input[CertificateSigningRequestSpec]] = js.undefined
      /**
        * Derived information about the request.
        */
      var status: js.UndefOr[atPulumiPulumiLib.outputMod.Input[CertificateSigningRequestStatus]] = js.undefined
    }
    
    trait CertificateSigningRequestCondition extends js.Object {
      /**
        * timestamp for the last update to this condition
        */
      var lastUpdateTime: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
      /**
        * human readable message with details about the request state
        */
      var message: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
      /**
        * brief reason for the request state
        */
      var reason: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
      /**
        * request approval state, currently Approved or Denied.
        */
      var `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
    }
    
    trait CertificateSigningRequestList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[
              atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`certificatesDOTk8sDOTio/v1beta1`
            ]
          ] = js.undefined
      var items: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[CertificateSigningRequest]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CertificateSigningRequestList]
          ] = js.undefined
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
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
      var extra: js.UndefOr[atPulumiPulumiLib.outputMod.Input[js.Object]] = js.undefined
      /**
        * Group information about the requesting user. See user.Info interface for details.
        */
      var groups: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
          ] = js.undefined
      /**
        * Base64-encoded PKCS#10 CSR data
        */
      var request: atPulumiPulumiLib.outputMod.Input[java.lang.String]
      /**
        * UID information about the requesting user. See user.Info interface for details.
        */
      var uid: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
      /**
        * allowedUsages specifies a set of usage contexts the key will be valid for. See:
        * https://tools.ietf.org/html/rfc5280#section-4.2.1.3
        *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
        */
      var usages: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
          ] = js.undefined
      /**
        * Information about the requesting user. See user.Info interface for details.
        */
      var username: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
    }
    
    trait CertificateSigningRequestStatus extends js.Object {
      /**
        * If request was approved, the controller will place the issued certificate here.
        */
      var certificate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
      /**
        * Conditions applied to the request, such as approval or denial.
        */
      var conditions: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[CertificateSigningRequestCondition]]]
          ] = js.undefined
    }
    
    def isCertificateSigningRequest(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.certificates.v1beta1.CertificateSigningRequest */ scala.Boolean = js.native
    def isCertificateSigningRequestList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.certificates.v1beta1.CertificateSigningRequestList */ scala.Boolean = js.native
  }
  
}

