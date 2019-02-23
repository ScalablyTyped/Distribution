package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "servicediscovery")
@js.native
object servicediscoveryNs extends js.Object {
  @js.native
  class HttpNamespace protected ()
    extends atPulumiAwsLib.servicediscoveryMod.HttpNamespace {
    /**
      * Create a HttpNamespace resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.servicediscoveryHttpNamespaceMod.HttpNamespaceArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.servicediscoveryHttpNamespaceMod.HttpNamespaceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class PrivateDnsNamespace protected ()
    extends atPulumiAwsLib.servicediscoveryMod.PrivateDnsNamespace {
    /**
      * Create a PrivateDnsNamespace resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.servicediscoveryPrivateDnsNamespaceMod.PrivateDnsNamespaceArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.servicediscoveryPrivateDnsNamespaceMod.PrivateDnsNamespaceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class PublicDnsNamespace protected ()
    extends atPulumiAwsLib.servicediscoveryMod.PublicDnsNamespace {
    /**
      * Create a PublicDnsNamespace resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.servicediscoveryPublicDnsNamespaceMod.PublicDnsNamespaceArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.servicediscoveryPublicDnsNamespaceMod.PublicDnsNamespaceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Service protected ()
    extends atPulumiAwsLib.servicediscoveryMod.Service {
    /**
      * Create a Service resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.servicediscoveryServiceMod.ServiceArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.servicediscoveryServiceMod.ServiceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object HttpNamespace extends js.Object {
    /**
      * Get an existing HttpNamespace resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.servicediscoveryHttpNamespaceMod.HttpNamespace = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.servicediscoveryHttpNamespaceMod.HttpNamespaceState
    ): atPulumiAwsLib.servicediscoveryHttpNamespaceMod.HttpNamespace = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.servicediscoveryHttpNamespaceMod.HttpNamespaceState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.servicediscoveryHttpNamespaceMod.HttpNamespace = js.native
  }
  
  /* static members */
  @js.native
  object PrivateDnsNamespace extends js.Object {
    /**
      * Get an existing PrivateDnsNamespace resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.servicediscoveryPrivateDnsNamespaceMod.PrivateDnsNamespace = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.servicediscoveryPrivateDnsNamespaceMod.PrivateDnsNamespaceState
    ): atPulumiAwsLib.servicediscoveryPrivateDnsNamespaceMod.PrivateDnsNamespace = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.servicediscoveryPrivateDnsNamespaceMod.PrivateDnsNamespaceState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.servicediscoveryPrivateDnsNamespaceMod.PrivateDnsNamespace = js.native
  }
  
  /* static members */
  @js.native
  object PublicDnsNamespace extends js.Object {
    /**
      * Get an existing PublicDnsNamespace resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.servicediscoveryPublicDnsNamespaceMod.PublicDnsNamespace = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.servicediscoveryPublicDnsNamespaceMod.PublicDnsNamespaceState
    ): atPulumiAwsLib.servicediscoveryPublicDnsNamespaceMod.PublicDnsNamespace = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.servicediscoveryPublicDnsNamespaceMod.PublicDnsNamespaceState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.servicediscoveryPublicDnsNamespaceMod.PublicDnsNamespace = js.native
  }
  
  /* static members */
  @js.native
  object Service extends js.Object {
    /**
      * Get an existing Service resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.servicediscoveryServiceMod.Service = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.servicediscoveryServiceMod.ServiceState
    ): atPulumiAwsLib.servicediscoveryServiceMod.Service = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.servicediscoveryServiceMod.ServiceState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.servicediscoveryServiceMod.Service = js.native
  }
  
}

