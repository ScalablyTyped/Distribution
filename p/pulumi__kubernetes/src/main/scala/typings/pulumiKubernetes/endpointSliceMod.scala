package typings.pulumiKubernetes

import typings.pulumiKubernetes.outputMod.discovery.v1beta1.Endpoint
import typings.pulumiKubernetes.outputMod.discovery.v1beta1.EndpointPort
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.discoveryDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endpointSliceMod {
  
  @JSImport("@pulumi/kubernetes/discovery/v1beta1/endpointSlice", "EndpointSlice")
  @js.native
  class EndpointSlice protected () extends CustomResource {
    /**
      * Create a EndpointSlice resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: EndpointSliceArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: EndpointSliceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
      */
    val addressType: Output_[String] = js.native
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[discoveryDotk8sDotioSlashv1beta1] = js.native
    
    /**
      * endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
      */
    val endpoints: Output_[js.Array[Endpoint]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.EndpointSlice] = js.native
    
    /**
      * Standard object's metadata.
      */
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates "all ports". Each slice may include a maximum of 100 ports.
      */
    val ports: Output_[js.Array[EndpointPort]] = js.native
  }
  /* static members */
  object EndpointSlice {
    
    @JSImport("@pulumi/kubernetes/discovery/v1beta1/endpointSlice", "EndpointSlice")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EndpointSlice resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): EndpointSlice = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[EndpointSlice]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): EndpointSlice = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EndpointSlice]
    
    /**
      * Returns true if the given object is an instance of EndpointSlice.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/discovery/v1beta1/endpointSlice.EndpointSlice */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/discovery/v1beta1/endpointSlice.EndpointSlice */ Boolean]
  }
  
  trait EndpointSliceArgs extends StObject {
    
    /**
      * addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
      */
    val addressType: Input[String]
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[discoveryDotk8sDotioSlashv1beta1]] = js.undefined
    
    /**
      * endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
      */
    val endpoints: Input[js.Array[Input[typings.pulumiKubernetes.inputMod.discovery.v1beta1.Endpoint]]]
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.EndpointSlice]] = js.undefined
    
    /**
      * Standard object's metadata.
      */
    val metadata: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]] = js.undefined
    
    /**
      * ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates "all ports". Each slice may include a maximum of 100 ports.
      */
    val ports: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiKubernetes.inputMod.discovery.v1beta1.EndpointPort]]
        ]
      ] = js.undefined
  }
  object EndpointSliceArgs {
    
    @scala.inline
    def apply(
      addressType: Input[String],
      endpoints: Input[js.Array[Input[typings.pulumiKubernetes.inputMod.discovery.v1beta1.Endpoint]]]
    ): EndpointSliceArgs = {
      val __obj = js.Dynamic.literal(addressType = addressType.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointSliceArgs]
    }
    
    @scala.inline
    implicit class EndpointSliceArgsMutableBuilder[Self <: EndpointSliceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddressType(value: Input[String]): Self = StObject.set(x, "addressType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersion(value: Input[discoveryDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setEndpoints(value: Input[js.Array[Input[typings.pulumiKubernetes.inputMod.discovery.v1beta1.Endpoint]]]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointsVarargs(value: Input[typings.pulumiKubernetes.inputMod.discovery.v1beta1.Endpoint]*): Self = StObject.set(x, "endpoints", js.Array(value :_*))
      
      @scala.inline
      def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.EndpointSlice]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setPorts(
        value: Input[
              js.Array[Input[typings.pulumiKubernetes.inputMod.discovery.v1beta1.EndpointPort]]
            ]
      ): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
      
      @scala.inline
      def setPortsVarargs(value: Input[typings.pulumiKubernetes.inputMod.discovery.v1beta1.EndpointPort]*): Self = StObject.set(x, "ports", js.Array(value :_*))
    }
  }
}
