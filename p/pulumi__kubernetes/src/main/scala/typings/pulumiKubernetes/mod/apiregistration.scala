package typings.pulumiKubernetes.mod

import typings.pulumiKubernetes.v1ApiserviceListMod.APIServiceListArgs
import typings.pulumiKubernetes.v1ApiserviceMod.APIServiceArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "apiregistration")
@js.native
object apiregistration extends js.Object {
  @js.native
  object v1 extends js.Object {
    @js.native
    class APIService protected ()
      extends typings.pulumiKubernetes.apiregistrationMod.v1.APIService {
      /**
        * Create a APIService resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: APIServiceArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: APIServiceArgs, opts: CustomResourceOptions) = this()
    }
    
    @js.native
    class APIServiceList protected ()
      extends typings.pulumiKubernetes.apiregistrationMod.v1.APIServiceList {
      /**
        * Create a APIServiceList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: APIServiceListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: APIServiceListArgs, opts: CustomResourceOptions) = this()
    }
    
    /* static members */
    @js.native
    object APIService extends js.Object {
      /**
        * Get an existing APIService resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1ApiserviceMod.APIService = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1ApiserviceMod.APIService = js.native
      /**
        * Returns true if the given object is an instance of APIService.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1/apiservice.APIService */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object APIServiceList extends js.Object {
      /**
        * Get an existing APIServiceList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1ApiserviceListMod.APIServiceList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1ApiserviceListMod.APIServiceList = js.native
      /**
        * Returns true if the given object is an instance of APIServiceList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1/apiserviceList.APIServiceList */ Boolean = js.native
    }
    
  }
  
  @js.native
  object v1beta1 extends js.Object {
    @js.native
    class APIService protected ()
      extends typings.pulumiKubernetes.apiregistrationMod.v1beta1.APIService {
      /**
        * Create a APIService resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.apiserviceMod.APIServiceArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.apiserviceMod.APIServiceArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class APIServiceList protected ()
      extends typings.pulumiKubernetes.apiregistrationMod.v1beta1.APIServiceList {
      /**
        * Create a APIServiceList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.apiserviceListMod.APIServiceListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.apiserviceListMod.APIServiceListArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object APIService extends js.Object {
      /**
        * Get an existing APIService resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.apiserviceMod.APIService = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.apiserviceMod.APIService = js.native
      /**
        * Returns true if the given object is an instance of APIService.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1beta1/apiservice.APIService */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object APIServiceList extends js.Object {
      /**
        * Get an existing APIServiceList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.apiserviceListMod.APIServiceList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.apiserviceListMod.APIServiceList = js.native
      /**
        * Returns true if the given object is an instance of APIServiceList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1beta1/apiserviceList.APIServiceList */ Boolean = js.native
    }
    
  }
  
}

