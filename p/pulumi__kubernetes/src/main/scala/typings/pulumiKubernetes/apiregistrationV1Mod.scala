package typings.pulumiKubernetes

import typings.pulumiKubernetes.v1ApiserviceListMod.APIServiceListArgs
import typings.pulumiKubernetes.v1ApiserviceMod.APIServiceArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiregistrationV1Mod {
  
  @JSImport("@pulumi/kubernetes/apiregistration/v1", "APIService")
  @js.native
  class APIService protected ()
    extends typings.pulumiKubernetes.v1ApiserviceMod.APIService {
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
  }
  /* static members */
  object APIService {
    
    @JSImport("@pulumi/kubernetes/apiregistration/v1", "APIService")
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
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1ApiserviceMod.APIService = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1ApiserviceMod.APIService]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1ApiserviceMod.APIService = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1ApiserviceMod.APIService]
    
    /**
      * Returns true if the given object is an instance of APIService.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1/apiservice.APIService */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1/apiservice.APIService */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/apiregistration/v1", "APIServiceList")
  @js.native
  class APIServiceList protected ()
    extends typings.pulumiKubernetes.v1ApiserviceListMod.APIServiceList {
    /**
      * Create a APIServiceList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: APIServiceListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: APIServiceListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object APIServiceList {
    
    @JSImport("@pulumi/kubernetes/apiregistration/v1", "APIServiceList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing APIServiceList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1ApiserviceListMod.APIServiceList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1ApiserviceListMod.APIServiceList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1ApiserviceListMod.APIServiceList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1ApiserviceListMod.APIServiceList]
    
    /**
      * Returns true if the given object is an instance of APIServiceList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1/apiserviceList.APIServiceList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1/apiserviceList.APIServiceList */ Boolean]
  }
}
