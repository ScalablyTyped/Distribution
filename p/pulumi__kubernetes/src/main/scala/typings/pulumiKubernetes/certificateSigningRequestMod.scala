package typings.pulumiKubernetes

import typings.pulumiKubernetes.outputMod.certificates.v1beta1.CertificateSigningRequestSpec
import typings.pulumiKubernetes.outputMod.certificates.v1beta1.CertificateSigningRequestStatus
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.certificatesDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certificateSigningRequestMod {
  
  @JSImport("@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequest", "CertificateSigningRequest")
  @js.native
  class CertificateSigningRequest protected () extends CustomResource {
    /**
      * Create a CertificateSigningRequest resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CertificateSigningRequestArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: CertificateSigningRequestArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[certificatesDotk8sDotioSlashv1beta1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest] = js.native
    
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * The certificate request itself and any additional information.
      */
    val spec: Output_[CertificateSigningRequestSpec] = js.native
    
    /**
      * Derived information about the request.
      */
    val status: Output_[CertificateSigningRequestStatus] = js.native
  }
  /* static members */
  object CertificateSigningRequest {
    
    @JSImport("@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequest", "CertificateSigningRequest")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing CertificateSigningRequest resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): CertificateSigningRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[CertificateSigningRequest]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): CertificateSigningRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[CertificateSigningRequest]
    
    /**
      * Returns true if the given object is an instance of CertificateSigningRequest.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequest.CertificateSigningRequest */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequest.CertificateSigningRequest */ Boolean]
  }
  
  trait CertificateSigningRequestArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[certificatesDotk8sDotioSlashv1beta1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[
        Input[typings.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest]
      ] = js.undefined
    
    val metadata: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]] = js.undefined
    
    /**
      * The certificate request itself and any additional information.
      */
    val spec: js.UndefOr[
        Input[
          typings.pulumiKubernetes.inputMod.certificates.v1beta1.CertificateSigningRequestSpec
        ]
      ] = js.undefined
  }
  object CertificateSigningRequestArgs {
    
    inline def apply(): CertificateSigningRequestArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateSigningRequestArgs]
    }
    
    extension [Self <: CertificateSigningRequestArgs](x: Self) {
      
      inline def setApiVersion(value: Input[certificatesDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setSpec(
        value: Input[
              typings.pulumiKubernetes.inputMod.certificates.v1beta1.CertificateSigningRequestSpec
            ]
      ): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    }
  }
}
