package typings.pulumiKubernetes

import typings.pulumiKubernetes.outputMod.authorization.v1beta1.SubjectAccessReviewSpec
import typings.pulumiKubernetes.outputMod.authorization.v1beta1.SubjectAccessReviewStatus
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.authorizationDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localSubjectAccessReviewMod {
  
  @JSImport("@pulumi/kubernetes/authorization/v1beta1/localSubjectAccessReview", "LocalSubjectAccessReview")
  @js.native
  class LocalSubjectAccessReview protected () extends CustomResource {
    /**
      * Create a LocalSubjectAccessReview resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: LocalSubjectAccessReviewArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: LocalSubjectAccessReviewArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[authorizationDotk8sDotioSlashv1beta1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.LocalSubjectAccessReview] = js.native
    
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * Spec holds information about the request being evaluated.  spec.namespace must be equal to the namespace you made the request against.  If empty, it is defaulted.
      */
    val spec: Output_[SubjectAccessReviewSpec] = js.native
    
    /**
      * Status is filled in by the server and indicates whether the request is allowed or not
      */
    val status: Output_[SubjectAccessReviewStatus] = js.native
  }
  /* static members */
  object LocalSubjectAccessReview {
    
    @JSImport("@pulumi/kubernetes/authorization/v1beta1/localSubjectAccessReview", "LocalSubjectAccessReview")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LocalSubjectAccessReview resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): LocalSubjectAccessReview = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[LocalSubjectAccessReview]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): LocalSubjectAccessReview = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LocalSubjectAccessReview]
    
    /**
      * Returns true if the given object is an instance of LocalSubjectAccessReview.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/localSubjectAccessReview.LocalSubjectAccessReview */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/localSubjectAccessReview.LocalSubjectAccessReview */ Boolean]
  }
  
  trait LocalSubjectAccessReviewArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[authorizationDotk8sDotioSlashv1beta1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.LocalSubjectAccessReview]] = js.undefined
    
    val metadata: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]] = js.undefined
    
    /**
      * Spec holds information about the request being evaluated.  spec.namespace must be equal to the namespace you made the request against.  If empty, it is defaulted.
      */
    val spec: Input[typings.pulumiKubernetes.inputMod.authorization.v1beta1.SubjectAccessReviewSpec]
  }
  object LocalSubjectAccessReviewArgs {
    
    inline def apply(spec: Input[typings.pulumiKubernetes.inputMod.authorization.v1beta1.SubjectAccessReviewSpec]): LocalSubjectAccessReviewArgs = {
      val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalSubjectAccessReviewArgs]
    }
    
    extension [Self <: LocalSubjectAccessReviewArgs](x: Self) {
      
      inline def setApiVersion(value: Input[authorizationDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.LocalSubjectAccessReview]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setSpec(value: Input[typings.pulumiKubernetes.inputMod.authorization.v1beta1.SubjectAccessReviewSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
}
