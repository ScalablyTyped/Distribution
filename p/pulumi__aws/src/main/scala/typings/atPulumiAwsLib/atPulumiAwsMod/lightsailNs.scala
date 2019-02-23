package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "lightsail")
@js.native
object lightsailNs extends js.Object {
  @js.native
  class Domain protected ()
    extends atPulumiAwsLib.lightsailMod.Domain {
    /**
      * Create a Domain resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.lightsailDomainMod.DomainArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.lightsailDomainMod.DomainArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Instance protected ()
    extends atPulumiAwsLib.lightsailMod.Instance {
    /**
      * Create a Instance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.lightsailInstanceMod.InstanceArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.lightsailInstanceMod.InstanceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class KeyPair protected ()
    extends atPulumiAwsLib.lightsailMod.KeyPair {
    /**
      * Create a KeyPair resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.lightsailKeyPairMod.KeyPairArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.lightsailKeyPairMod.KeyPairArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class StaticIp protected ()
    extends atPulumiAwsLib.lightsailMod.StaticIp {
    /**
      * Create a StaticIp resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.lightsailStaticIpMod.StaticIpArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.lightsailStaticIpMod.StaticIpArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class StaticIpAttachment protected ()
    extends atPulumiAwsLib.lightsailMod.StaticIpAttachment {
    /**
      * Create a StaticIpAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.lightsailStaticIpAttachmentMod.StaticIpAttachmentArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.lightsailStaticIpAttachmentMod.StaticIpAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Domain extends js.Object {
    /**
      * Get an existing Domain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.lightsailDomainMod.Domain = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.lightsailDomainMod.DomainState
    ): atPulumiAwsLib.lightsailDomainMod.Domain = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.lightsailDomainMod.DomainState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.lightsailDomainMod.Domain = js.native
  }
  
  /* static members */
  @js.native
  object Instance extends js.Object {
    /**
      * Get an existing Instance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.lightsailInstanceMod.Instance = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.lightsailInstanceMod.InstanceState
    ): atPulumiAwsLib.lightsailInstanceMod.Instance = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.lightsailInstanceMod.InstanceState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.lightsailInstanceMod.Instance = js.native
  }
  
  /* static members */
  @js.native
  object KeyPair extends js.Object {
    /**
      * Get an existing KeyPair resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.lightsailKeyPairMod.KeyPair = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.lightsailKeyPairMod.KeyPairState
    ): atPulumiAwsLib.lightsailKeyPairMod.KeyPair = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.lightsailKeyPairMod.KeyPairState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.lightsailKeyPairMod.KeyPair = js.native
  }
  
  /* static members */
  @js.native
  object StaticIp extends js.Object {
    /**
      * Get an existing StaticIp resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.lightsailStaticIpMod.StaticIp = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.lightsailStaticIpMod.StaticIpState
    ): atPulumiAwsLib.lightsailStaticIpMod.StaticIp = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.lightsailStaticIpMod.StaticIpState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.lightsailStaticIpMod.StaticIp = js.native
  }
  
  /* static members */
  @js.native
  object StaticIpAttachment extends js.Object {
    /**
      * Get an existing StaticIpAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.lightsailStaticIpAttachmentMod.StaticIpAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.lightsailStaticIpAttachmentMod.StaticIpAttachmentState
    ): atPulumiAwsLib.lightsailStaticIpAttachmentMod.StaticIpAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.lightsailStaticIpAttachmentMod.StaticIpAttachmentState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.lightsailStaticIpAttachmentMod.StaticIpAttachment = js.native
  }
  
}

