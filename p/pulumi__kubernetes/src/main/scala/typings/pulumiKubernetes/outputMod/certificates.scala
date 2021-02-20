package typings.pulumiKubernetes.outputMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.certificatesDotk8sDotioSlashv1
import typings.pulumiKubernetes.pulumiKubernetesStrings.certificatesDotk8sDotioSlashv1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certificates {
  
  object v1 {
    
    /**
      * CertificateSigningRequest objects provide a mechanism to obtain x509 certificates by submitting a certificate signing request, and having it asynchronously approved and issued.
      *
      * Kubelets use this API to obtain:
      *  1. client certificates to authenticate to kube-apiserver (with the "kubernetes.io/kube-apiserver-client-kubelet" signerName).
      *  2. serving certificates for TLS endpoints kube-apiserver can connect to securely (with the "kubernetes.io/kubelet-serving" signerName).
      *
      * This API can be used to request client certificates to authenticate to kube-apiserver (with the "kubernetes.io/kube-apiserver-client" signerName), or to obtain certificates from custom non-Kubernetes signers.
      */
    @js.native
    trait CertificateSigningRequest extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: certificatesDotk8sDotioSlashv1 = js.native
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest = js.native
      
      var metadata: ObjectMeta = js.native
      
      /**
        * spec contains the certificate request, and is immutable after creation. Only the request, signerName, and usages fields can be set on creation. Other fields are derived by Kubernetes and cannot be modified by users.
        */
      var spec: CertificateSigningRequestSpec = js.native
      
      /**
        * status contains information about whether the request is approved or denied, and the certificate issued by the signer, or the failure condition indicating signer failure.
        */
      var status: CertificateSigningRequestStatus = js.native
    }
    object CertificateSigningRequest {
      
      @scala.inline
      def apply(
        apiVersion: certificatesDotk8sDotioSlashv1,
        kind: typings.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest,
        metadata: ObjectMeta,
        spec: CertificateSigningRequestSpec,
        status: CertificateSigningRequestStatus
      ): CertificateSigningRequest = {
        val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[CertificateSigningRequest]
      }
      
      @scala.inline
      implicit class CertificateSigningRequestMutableBuilder[Self <: CertificateSigningRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApiVersion(value: certificatesDotk8sDotioSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpec(value: CertificateSigningRequestSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: CertificateSigningRequestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * CertificateSigningRequestCondition describes a condition of a CertificateSigningRequest object
      */
    @js.native
    trait CertificateSigningRequestCondition extends StObject {
      
      /**
        * lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition's status is changed, the server defaults this to the current time.
        */
      var lastTransitionTime: String = js.native
      
      /**
        * lastUpdateTime is the time of the last update to this condition
        */
      var lastUpdateTime: String = js.native
      
      /**
        * message contains a human readable message with details about the request state
        */
      var message: String = js.native
      
      /**
        * reason indicates a brief reason for the request state
        */
      var reason: String = js.native
      
      /**
        * status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be "False" or "Unknown".
        */
      var status: String = js.native
      
      /**
        * type of the condition. Known conditions are "Approved", "Denied", and "Failed".
        *
        * An "Approved" condition is added via the /approval subresource, indicating the request was approved and should be issued by the signer.
        *
        * A "Denied" condition is added via the /approval subresource, indicating the request was denied and should not be issued by the signer.
        *
        * A "Failed" condition is added via the /status subresource, indicating the signer failed to issue the certificate.
        *
        * Approved and Denied conditions are mutually exclusive. Approved, Denied, and Failed conditions cannot be removed once added.
        *
        * Only one condition of a given type is allowed.
        */
      var `type`: String = js.native
    }
    object CertificateSigningRequestCondition {
      
      @scala.inline
      def apply(
        lastTransitionTime: String,
        lastUpdateTime: String,
        message: String,
        reason: String,
        status: String,
        `type`: String
      ): CertificateSigningRequestCondition = {
        val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], lastUpdateTime = lastUpdateTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[CertificateSigningRequestCondition]
      }
      
      @scala.inline
      implicit class CertificateSigningRequestConditionMutableBuilder[Self <: CertificateSigningRequestCondition] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLastTransitionTime(value: String): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * CertificateSigningRequestSpec contains the certificate request.
      */
    @js.native
    trait CertificateSigningRequestSpec extends StObject {
      
      /**
        * extra contains extra attributes of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
        */
      var extra: StringDictionary[js.Array[String]] = js.native
      
      /**
        * groups contains group membership of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
        */
      var groups: js.Array[String] = js.native
      
      /**
        * request contains an x509 certificate signing request encoded in a "CERTIFICATE REQUEST" PEM block. When serialized as JSON or YAML, the data is additionally base64-encoded.
        */
      var request: String = js.native
      
      /**
        * signerName indicates the requested signer, and is a qualified name.
        *
        * List/watch requests for CertificateSigningRequests can filter on this field using a "spec.signerName=NAME" fieldSelector.
        *
        * Well-known Kubernetes signers are:
        *  1. "kubernetes.io/kube-apiserver-client": issues client certificates that can be used to authenticate to kube-apiserver.
        *   Requests for this signer are never auto-approved by kube-controller-manager, can be issued by the "csrsigning" controller in kube-controller-manager.
        *  2. "kubernetes.io/kube-apiserver-client-kubelet": issues client certificates that kubelets use to authenticate to kube-apiserver.
        *   Requests for this signer can be auto-approved by the "csrapproving" controller in kube-controller-manager, and can be issued by the "csrsigning" controller in kube-controller-manager.
        *  3. "kubernetes.io/kubelet-serving" issues serving certificates that kubelets use to serve TLS endpoints, which kube-apiserver can connect to securely.
        *   Requests for this signer are never auto-approved by kube-controller-manager, and can be issued by the "csrsigning" controller in kube-controller-manager.
        *
        * More details are available at https://k8s.io/docs/reference/access-authn-authz/certificate-signing-requests/#kubernetes-signers
        *
        * Custom signerNames can also be specified. The signer defines:
        *  1. Trust distribution: how trust (CA bundles) are distributed.
        *  2. Permitted subjects: and behavior when a disallowed subject is requested.
        *  3. Required, permitted, or forbidden x509 extensions in the request (including whether subjectAltNames are allowed, which types, restrictions on allowed values) and behavior when a disallowed extension is requested.
        *  4. Required, permitted, or forbidden key usages / extended key usages.
        *  5. Expiration/certificate lifetime: whether it is fixed by the signer, configurable by the admin.
        *  6. Whether or not requests for CA certificates are allowed.
        */
      var signerName: String = js.native
      
      /**
        * uid contains the uid of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
        */
      var uid: String = js.native
      
      /**
        * usages specifies a set of key usages requested in the issued certificate.
        *
        * Requests for TLS client certificates typically request: "digital signature", "key encipherment", "client auth".
        *
        * Requests for TLS serving certificates typically request: "key encipherment", "digital signature", "server auth".
        *
        * Valid values are:
        *  "signing", "digital signature", "content commitment",
        *  "key encipherment", "key agreement", "data encipherment",
        *  "cert sign", "crl sign", "encipher only", "decipher only", "any",
        *  "server auth", "client auth",
        *  "code signing", "email protection", "s/mime",
        *  "ipsec end system", "ipsec tunnel", "ipsec user",
        *  "timestamping", "ocsp signing", "microsoft sgc", "netscape sgc"
        */
      var usages: js.Array[String] = js.native
      
      /**
        * username contains the name of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
        */
      var username: String = js.native
    }
    object CertificateSigningRequestSpec {
      
      @scala.inline
      def apply(
        extra: StringDictionary[js.Array[String]],
        groups: js.Array[String],
        request: String,
        signerName: String,
        uid: String,
        usages: js.Array[String],
        username: String
      ): CertificateSigningRequestSpec = {
        val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], signerName = signerName.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
        __obj.asInstanceOf[CertificateSigningRequestSpec]
      }
      
      @scala.inline
      implicit class CertificateSigningRequestSpecMutableBuilder[Self <: CertificateSigningRequestSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setExtra(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
        
        @scala.inline
        def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSignerName(value: String): Self = StObject.set(x, "signerName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsages(value: js.Array[String]): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsagesVarargs(value: String*): Self = StObject.set(x, "usages", js.Array(value :_*))
        
        @scala.inline
        def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * CertificateSigningRequestStatus contains conditions used to indicate approved/denied/failed status of the request, and the issued certificate.
      */
    @js.native
    trait CertificateSigningRequestStatus extends StObject {
      
      /**
        * certificate is populated with an issued certificate by the signer after an Approved condition is present. This field is set via the /status subresource. Once populated, this field is immutable.
        *
        * If the certificate signing request is denied, a condition of type "Denied" is added and this field remains empty. If the signer cannot issue the certificate, a condition of type "Failed" is added and this field remains empty.
        *
        * Validation requirements:
        *  1. certificate must contain one or more PEM blocks.
        *  2. All PEM blocks must have the "CERTIFICATE" label, contain no headers, and the encoded data
        *   must be a BER-encoded ASN.1 Certificate structure as described in section 4 of RFC5280.
        *  3. Non-PEM content may appear before or after the "CERTIFICATE" PEM blocks and is unvalidated,
        *   to allow for explanatory text as described in section 5.2 of RFC7468.
        *
        * If more than one PEM block is present, and the definition of the requested spec.signerName does not indicate otherwise, the first block is the issued certificate, and subsequent blocks should be treated as intermediate certificates and presented in TLS handshakes.
        *
        * The certificate is encoded in PEM format.
        *
        * When serialized as JSON or YAML, the data is additionally base64-encoded, so it consists of:
        *
        *     base64(
        *     -----BEGIN CERTIFICATE-----
        *     ...
        *     -----END CERTIFICATE-----
        *     )
        */
      var certificate: String = js.native
      
      /**
        * conditions applied to the request. Known conditions are "Approved", "Denied", and "Failed".
        */
      var conditions: js.Array[CertificateSigningRequestCondition] = js.native
    }
    object CertificateSigningRequestStatus {
      
      @scala.inline
      def apply(certificate: String, conditions: js.Array[CertificateSigningRequestCondition]): CertificateSigningRequestStatus = {
        val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any])
        __obj.asInstanceOf[CertificateSigningRequestStatus]
      }
      
      @scala.inline
      implicit class CertificateSigningRequestStatusMutableBuilder[Self <: CertificateSigningRequestStatus] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConditions(value: js.Array[CertificateSigningRequestCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConditionsVarargs(value: CertificateSigningRequestCondition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
      }
    }
  }
  
  object v1beta1 {
    
    /**
      * Describes a certificate signing request
      */
    @js.native
    trait CertificateSigningRequest extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: certificatesDotk8sDotioSlashv1beta1 = js.native
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest = js.native
      
      var metadata: ObjectMeta = js.native
      
      /**
        * The certificate request itself and any additional information.
        */
      var spec: CertificateSigningRequestSpec = js.native
      
      /**
        * Derived information about the request.
        */
      var status: CertificateSigningRequestStatus = js.native
    }
    object CertificateSigningRequest {
      
      @scala.inline
      def apply(
        apiVersion: certificatesDotk8sDotioSlashv1beta1,
        kind: typings.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest,
        metadata: ObjectMeta,
        spec: CertificateSigningRequestSpec,
        status: CertificateSigningRequestStatus
      ): CertificateSigningRequest = {
        val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[CertificateSigningRequest]
      }
      
      @scala.inline
      implicit class CertificateSigningRequestMutableBuilder[Self <: CertificateSigningRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApiVersion(value: certificatesDotk8sDotioSlashv1beta1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpec(value: CertificateSigningRequestSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: CertificateSigningRequestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait CertificateSigningRequestCondition extends StObject {
      
      /**
        * lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition's status is changed, the server defaults this to the current time.
        */
      var lastTransitionTime: String = js.native
      
      /**
        * timestamp for the last update to this condition
        */
      var lastUpdateTime: String = js.native
      
      /**
        * human readable message with details about the request state
        */
      var message: String = js.native
      
      /**
        * brief reason for the request state
        */
      var reason: String = js.native
      
      /**
        * Status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be "False" or "Unknown". Defaults to "True". If unset, should be treated as "True".
        */
      var status: String = js.native
      
      /**
        * type of the condition. Known conditions include "Approved", "Denied", and "Failed".
        */
      var `type`: String = js.native
    }
    object CertificateSigningRequestCondition {
      
      @scala.inline
      def apply(
        lastTransitionTime: String,
        lastUpdateTime: String,
        message: String,
        reason: String,
        status: String,
        `type`: String
      ): CertificateSigningRequestCondition = {
        val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], lastUpdateTime = lastUpdateTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[CertificateSigningRequestCondition]
      }
      
      @scala.inline
      implicit class CertificateSigningRequestConditionMutableBuilder[Self <: CertificateSigningRequestCondition] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLastTransitionTime(value: String): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * This information is immutable after the request is created. Only the Request and Usages fields can be set on creation, other fields are derived by Kubernetes and cannot be modified by users.
      */
    @js.native
    trait CertificateSigningRequestSpec extends StObject {
      
      /**
        * Extra information about the requesting user. See user.Info interface for details.
        */
      var extra: StringDictionary[js.Array[String]] = js.native
      
      /**
        * Group information about the requesting user. See user.Info interface for details.
        */
      var groups: js.Array[String] = js.native
      
      /**
        * Base64-encoded PKCS#10 CSR data
        */
      var request: String = js.native
      
      /**
        * Requested signer for the request. It is a qualified name in the form: `scope-hostname.io/name`. If empty, it will be defaulted:
        *  1. If it's a kubelet client certificate, it is assigned
        *     "kubernetes.io/kube-apiserver-client-kubelet".
        *  2. If it's a kubelet serving certificate, it is assigned
        *     "kubernetes.io/kubelet-serving".
        *  3. Otherwise, it is assigned "kubernetes.io/legacy-unknown".
        * Distribution of trust for signers happens out of band. You can select on this field using `spec.signerName`.
        */
      var signerName: String = js.native
      
      /**
        * UID information about the requesting user. See user.Info interface for details.
        */
      var uid: String = js.native
      
      /**
        * allowedUsages specifies a set of usage contexts the key will be valid for. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
        *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
        * Valid values are:
        *  "signing",
        *  "digital signature",
        *  "content commitment",
        *  "key encipherment",
        *  "key agreement",
        *  "data encipherment",
        *  "cert sign",
        *  "crl sign",
        *  "encipher only",
        *  "decipher only",
        *  "any",
        *  "server auth",
        *  "client auth",
        *  "code signing",
        *  "email protection",
        *  "s/mime",
        *  "ipsec end system",
        *  "ipsec tunnel",
        *  "ipsec user",
        *  "timestamping",
        *  "ocsp signing",
        *  "microsoft sgc",
        *  "netscape sgc"
        */
      var usages: js.Array[String] = js.native
      
      /**
        * Information about the requesting user. See user.Info interface for details.
        */
      var username: String = js.native
    }
    object CertificateSigningRequestSpec {
      
      @scala.inline
      def apply(
        extra: StringDictionary[js.Array[String]],
        groups: js.Array[String],
        request: String,
        signerName: String,
        uid: String,
        usages: js.Array[String],
        username: String
      ): CertificateSigningRequestSpec = {
        val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], signerName = signerName.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
        __obj.asInstanceOf[CertificateSigningRequestSpec]
      }
      
      @scala.inline
      implicit class CertificateSigningRequestSpecMutableBuilder[Self <: CertificateSigningRequestSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setExtra(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
        
        @scala.inline
        def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSignerName(value: String): Self = StObject.set(x, "signerName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsages(value: js.Array[String]): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsagesVarargs(value: String*): Self = StObject.set(x, "usages", js.Array(value :_*))
        
        @scala.inline
        def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait CertificateSigningRequestStatus extends StObject {
      
      /**
        * If request was approved, the controller will place the issued certificate here.
        */
      var certificate: String = js.native
      
      /**
        * Conditions applied to the request, such as approval or denial.
        */
      var conditions: js.Array[CertificateSigningRequestCondition] = js.native
    }
    object CertificateSigningRequestStatus {
      
      @scala.inline
      def apply(certificate: String, conditions: js.Array[CertificateSigningRequestCondition]): CertificateSigningRequestStatus = {
        val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any])
        __obj.asInstanceOf[CertificateSigningRequestStatus]
      }
      
      @scala.inline
      implicit class CertificateSigningRequestStatusMutableBuilder[Self <: CertificateSigningRequestStatus] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConditions(value: js.Array[CertificateSigningRequestCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConditionsVarargs(value: CertificateSigningRequestCondition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
      }
    }
  }
}
