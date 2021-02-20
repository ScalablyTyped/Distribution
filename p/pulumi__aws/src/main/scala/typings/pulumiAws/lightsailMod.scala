package typings.pulumiAws

import typings.pulumiAws.lightsailDomainMod.DomainArgs
import typings.pulumiAws.lightsailDomainMod.DomainState
import typings.pulumiAws.lightsailInstanceMod.InstanceArgs
import typings.pulumiAws.lightsailInstanceMod.InstanceState
import typings.pulumiAws.lightsailKeyPairMod.KeyPairArgs
import typings.pulumiAws.lightsailKeyPairMod.KeyPairState
import typings.pulumiAws.staticIpAttachmentMod.StaticIpAttachmentArgs
import typings.pulumiAws.staticIpAttachmentMod.StaticIpAttachmentState
import typings.pulumiAws.staticIpMod.StaticIpArgs
import typings.pulumiAws.staticIpMod.StaticIpState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightsailMod {
  
  @JSImport("@pulumi/aws/lightsail", "Domain")
  @js.native
  class Domain protected ()
    extends typings.pulumiAws.lightsailDomainMod.Domain {
    /**
      * Create a Domain resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainArgs) = this()
    def this(name: String, args: DomainArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Domain {
    
    /**
      * Get an existing Domain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/lightsail", "Domain.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.lightsailDomainMod.Domain = js.native
    @JSImport("@pulumi/aws/lightsail", "Domain.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.lightsailDomainMod.Domain = js.native
    @JSImport("@pulumi/aws/lightsail", "Domain.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainState): typings.pulumiAws.lightsailDomainMod.Domain = js.native
    @JSImport("@pulumi/aws/lightsail", "Domain.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): typings.pulumiAws.lightsailDomainMod.Domain = js.native
    
    /**
      * Returns true if the given object is an instance of Domain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/lightsail", "Domain.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/domain.Domain */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/lightsail", "Instance")
  @js.native
  class Instance protected ()
    extends typings.pulumiAws.lightsailInstanceMod.Instance {
    /**
      * Create a Instance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InstanceArgs) = this()
    def this(name: String, args: InstanceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Instance {
    
    /**
      * Get an existing Instance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/lightsail", "Instance.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.lightsailInstanceMod.Instance = js.native
    @JSImport("@pulumi/aws/lightsail", "Instance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.lightsailInstanceMod.Instance = js.native
    @JSImport("@pulumi/aws/lightsail", "Instance.get")
    @js.native
    def get(name: String, id: Input[ID], state: InstanceState): typings.pulumiAws.lightsailInstanceMod.Instance = js.native
    @JSImport("@pulumi/aws/lightsail", "Instance.get")
    @js.native
    def get(name: String, id: Input[ID], state: InstanceState, opts: CustomResourceOptions): typings.pulumiAws.lightsailInstanceMod.Instance = js.native
    
    /**
      * Returns true if the given object is an instance of Instance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/lightsail", "Instance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/instance.Instance */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/lightsail", "KeyPair")
  @js.native
  class KeyPair protected ()
    extends typings.pulumiAws.lightsailKeyPairMod.KeyPair {
    /**
      * Create a KeyPair resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: KeyPairArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: KeyPairArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object KeyPair {
    
    /**
      * Get an existing KeyPair resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/lightsail", "KeyPair.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.lightsailKeyPairMod.KeyPair = js.native
    @JSImport("@pulumi/aws/lightsail", "KeyPair.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.lightsailKeyPairMod.KeyPair = js.native
    @JSImport("@pulumi/aws/lightsail", "KeyPair.get")
    @js.native
    def get(name: String, id: Input[ID], state: KeyPairState): typings.pulumiAws.lightsailKeyPairMod.KeyPair = js.native
    @JSImport("@pulumi/aws/lightsail", "KeyPair.get")
    @js.native
    def get(name: String, id: Input[ID], state: KeyPairState, opts: CustomResourceOptions): typings.pulumiAws.lightsailKeyPairMod.KeyPair = js.native
    
    /**
      * Returns true if the given object is an instance of KeyPair.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/lightsail", "KeyPair.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/keyPair.KeyPair */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/lightsail", "StaticIp")
  @js.native
  class StaticIp protected ()
    extends typings.pulumiAws.staticIpMod.StaticIp {
    /**
      * Create a StaticIp resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StaticIpArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: StaticIpArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object StaticIp {
    
    /**
      * Get an existing StaticIp resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/lightsail", "StaticIp.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.staticIpMod.StaticIp = js.native
    @JSImport("@pulumi/aws/lightsail", "StaticIp.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.staticIpMod.StaticIp = js.native
    @JSImport("@pulumi/aws/lightsail", "StaticIp.get")
    @js.native
    def get(name: String, id: Input[ID], state: StaticIpState): typings.pulumiAws.staticIpMod.StaticIp = js.native
    @JSImport("@pulumi/aws/lightsail", "StaticIp.get")
    @js.native
    def get(name: String, id: Input[ID], state: StaticIpState, opts: CustomResourceOptions): typings.pulumiAws.staticIpMod.StaticIp = js.native
    
    /**
      * Returns true if the given object is an instance of StaticIp.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/lightsail", "StaticIp.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/staticIp.StaticIp */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/lightsail", "StaticIpAttachment")
  @js.native
  class StaticIpAttachment protected ()
    extends typings.pulumiAws.staticIpAttachmentMod.StaticIpAttachment {
    /**
      * Create a StaticIpAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StaticIpAttachmentArgs) = this()
    def this(name: String, args: StaticIpAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object StaticIpAttachment {
    
    /**
      * Get an existing StaticIpAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/lightsail", "StaticIpAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.staticIpAttachmentMod.StaticIpAttachment = js.native
    @JSImport("@pulumi/aws/lightsail", "StaticIpAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.staticIpAttachmentMod.StaticIpAttachment = js.native
    @JSImport("@pulumi/aws/lightsail", "StaticIpAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: StaticIpAttachmentState): typings.pulumiAws.staticIpAttachmentMod.StaticIpAttachment = js.native
    @JSImport("@pulumi/aws/lightsail", "StaticIpAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: StaticIpAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.staticIpAttachmentMod.StaticIpAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of StaticIpAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/lightsail", "StaticIpAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/staticIpAttachment.StaticIpAttachment */ Boolean = js.native
  }
}
