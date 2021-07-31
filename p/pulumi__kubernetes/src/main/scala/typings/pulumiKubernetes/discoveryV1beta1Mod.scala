package typings.pulumiKubernetes

import typings.pulumiKubernetes.endpointSliceListMod.EndpointSliceListArgs
import typings.pulumiKubernetes.endpointSliceMod.EndpointSliceArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object discoveryV1beta1Mod {
  
  @JSImport("@pulumi/kubernetes/discovery/v1beta1", "EndpointSlice")
  @js.native
  class EndpointSlice protected ()
    extends typings.pulumiKubernetes.endpointSliceMod.EndpointSlice {
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
  }
  /* static members */
  object EndpointSlice {
    
    @JSImport("@pulumi/kubernetes/discovery/v1beta1", "EndpointSlice")
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
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.endpointSliceMod.EndpointSlice = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.endpointSliceMod.EndpointSlice]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.endpointSliceMod.EndpointSlice = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.endpointSliceMod.EndpointSlice]
    
    /**
      * Returns true if the given object is an instance of EndpointSlice.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/discovery/v1beta1/endpointSlice.EndpointSlice */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/discovery/v1beta1/endpointSlice.EndpointSlice */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/discovery/v1beta1", "EndpointSliceList")
  @js.native
  class EndpointSliceList protected ()
    extends typings.pulumiKubernetes.endpointSliceListMod.EndpointSliceList {
    /**
      * Create a EndpointSliceList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: EndpointSliceListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: EndpointSliceListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EndpointSliceList {
    
    @JSImport("@pulumi/kubernetes/discovery/v1beta1", "EndpointSliceList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EndpointSliceList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.endpointSliceListMod.EndpointSliceList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.endpointSliceListMod.EndpointSliceList]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.endpointSliceListMod.EndpointSliceList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.endpointSliceListMod.EndpointSliceList]
    
    /**
      * Returns true if the given object is an instance of EndpointSliceList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/discovery/v1beta1/endpointSliceList.EndpointSliceList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/discovery/v1beta1/endpointSliceList.EndpointSliceList */ Boolean]
  }
}
