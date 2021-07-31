package typings.pulumiAws.mod

import typings.pulumiAws.httpNamespaceMod.HttpNamespaceArgs
import typings.pulumiAws.httpNamespaceMod.HttpNamespaceState
import typings.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespaceArgs
import typings.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespaceState
import typings.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespaceArgs
import typings.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespaceState
import typings.pulumiAws.servicediscoveryServiceMod.ServiceArgs
import typings.pulumiAws.servicediscoveryServiceMod.ServiceState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicediscovery {
  
  @JSImport("@pulumi/aws", "servicediscovery.HttpNamespace")
  @js.native
  class HttpNamespace protected ()
    extends typings.pulumiAws.servicediscoveryMod.HttpNamespace {
    /**
      * Create a HttpNamespace resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: HttpNamespaceArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: HttpNamespaceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object HttpNamespace {
    
    @JSImport("@pulumi/aws", "servicediscovery.HttpNamespace")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing HttpNamespace resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.httpNamespaceMod.HttpNamespace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.httpNamespaceMod.HttpNamespace]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.httpNamespaceMod.HttpNamespace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.httpNamespaceMod.HttpNamespace]
    @scala.inline
    def get(name: String, id: Input[ID], state: HttpNamespaceState): typings.pulumiAws.httpNamespaceMod.HttpNamespace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.httpNamespaceMod.HttpNamespace]
    @scala.inline
    def get(name: String, id: Input[ID], state: HttpNamespaceState, opts: CustomResourceOptions): typings.pulumiAws.httpNamespaceMod.HttpNamespace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.httpNamespaceMod.HttpNamespace]
    
    /**
      * Returns true if the given object is an instance of HttpNamespace.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicediscovery/httpNamespace.HttpNamespace */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/servicediscovery/httpNamespace.HttpNamespace */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "servicediscovery.PrivateDnsNamespace")
  @js.native
  class PrivateDnsNamespace protected ()
    extends typings.pulumiAws.servicediscoveryMod.PrivateDnsNamespace {
    /**
      * Create a PrivateDnsNamespace resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PrivateDnsNamespaceArgs) = this()
    def this(name: String, args: PrivateDnsNamespaceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PrivateDnsNamespace {
    
    @JSImport("@pulumi/aws", "servicediscovery.PrivateDnsNamespace")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PrivateDnsNamespace resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespace]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespace]
    @scala.inline
    def get(name: String, id: Input[ID], state: PrivateDnsNamespaceState): typings.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespace]
    @scala.inline
    def get(name: String, id: Input[ID], state: PrivateDnsNamespaceState, opts: CustomResourceOptions): typings.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.privateDnsNamespaceMod.PrivateDnsNamespace]
    
    /**
      * Returns true if the given object is an instance of PrivateDnsNamespace.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicediscovery/privateDnsNamespace.PrivateDnsNamespace */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/servicediscovery/privateDnsNamespace.PrivateDnsNamespace */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "servicediscovery.PublicDnsNamespace")
  @js.native
  class PublicDnsNamespace protected ()
    extends typings.pulumiAws.servicediscoveryMod.PublicDnsNamespace {
    /**
      * Create a PublicDnsNamespace resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PublicDnsNamespaceArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: PublicDnsNamespaceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PublicDnsNamespace {
    
    @JSImport("@pulumi/aws", "servicediscovery.PublicDnsNamespace")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PublicDnsNamespace resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespace]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespace]
    @scala.inline
    def get(name: String, id: Input[ID], state: PublicDnsNamespaceState): typings.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespace]
    @scala.inline
    def get(name: String, id: Input[ID], state: PublicDnsNamespaceState, opts: CustomResourceOptions): typings.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.publicDnsNamespaceMod.PublicDnsNamespace]
    
    /**
      * Returns true if the given object is an instance of PublicDnsNamespace.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicediscovery/publicDnsNamespace.PublicDnsNamespace */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/servicediscovery/publicDnsNamespace.PublicDnsNamespace */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "servicediscovery.Service")
  @js.native
  class Service protected ()
    extends typings.pulumiAws.servicediscoveryMod.Service {
    /**
      * Create a Service resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ServiceArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ServiceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Service {
    
    @JSImport("@pulumi/aws", "servicediscovery.Service")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Service resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.servicediscoveryServiceMod.Service = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.servicediscoveryServiceMod.Service]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.servicediscoveryServiceMod.Service = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.servicediscoveryServiceMod.Service]
    @scala.inline
    def get(name: String, id: Input[ID], state: ServiceState): typings.pulumiAws.servicediscoveryServiceMod.Service = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.servicediscoveryServiceMod.Service]
    @scala.inline
    def get(name: String, id: Input[ID], state: ServiceState, opts: CustomResourceOptions): typings.pulumiAws.servicediscoveryServiceMod.Service = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.servicediscoveryServiceMod.Service]
    
    /**
      * Returns true if the given object is an instance of Service.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicediscovery/service.Service */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/servicediscovery/service.Service */ Boolean]
  }
}
