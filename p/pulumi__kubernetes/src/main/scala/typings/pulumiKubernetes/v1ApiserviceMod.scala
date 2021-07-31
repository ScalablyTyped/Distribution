package typings.pulumiKubernetes

import typings.pulumiKubernetes.outputMod.apiregistration.v1.APIServiceSpec
import typings.pulumiKubernetes.outputMod.apiregistration.v1.APIServiceStatus
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.apiregistrationDotk8sDotioSlashv1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1ApiserviceMod {
  
  @JSImport("@pulumi/kubernetes/apiregistration/v1/apiservice", "APIService")
  @js.native
  class APIService protected () extends CustomResource {
    /**
      * Create a APIService resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: APIServiceArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: APIServiceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[apiregistrationDotk8sDotioSlashv1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.APIService] = js.native
    
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * Spec contains information for locating and communicating with a server
      */
    val spec: Output_[APIServiceSpec] = js.native
    
    /**
      * Status contains derived information about an API server
      */
    val status: Output_[APIServiceStatus] = js.native
  }
  /* static members */
  object APIService {
    
    @JSImport("@pulumi/kubernetes/apiregistration/v1/apiservice", "APIService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing APIService resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): APIService = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[APIService]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): APIService = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[APIService]
    
    /**
      * Returns true if the given object is an instance of APIService.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1/apiservice.APIService */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1/apiservice.APIService */ Boolean]
  }
  
  trait APIServiceArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[apiregistrationDotk8sDotioSlashv1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.APIService]] = js.undefined
    
    val metadata: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]] = js.undefined
    
    /**
      * Spec contains information for locating and communicating with a server
      */
    val spec: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.apiregistration.v1.APIServiceSpec]] = js.undefined
  }
  object APIServiceArgs {
    
    @scala.inline
    def apply(): APIServiceArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[APIServiceArgs]
    }
    
    @scala.inline
    implicit class APIServiceArgsMutableBuilder[Self <: APIServiceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[apiregistrationDotk8sDotioSlashv1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.APIService]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setSpec(value: Input[typings.pulumiKubernetes.inputMod.apiregistration.v1.APIServiceSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    }
  }
}
