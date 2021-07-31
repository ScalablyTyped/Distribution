package typings.pulumiAws.mod

import typings.pulumiAws.getEndpointMod.GetEndpointArgs
import typings.pulumiAws.getEndpointMod.GetEndpointResult
import typings.pulumiAws.iotCertificateMod.CertificateArgs
import typings.pulumiAws.iotCertificateMod.CertificateState
import typings.pulumiAws.iotPolicyAttachmentMod.PolicyAttachmentArgs
import typings.pulumiAws.iotPolicyAttachmentMod.PolicyAttachmentState
import typings.pulumiAws.iotPolicyMod.PolicyArgs
import typings.pulumiAws.iotPolicyMod.PolicyState
import typings.pulumiAws.roleAliasMod.RoleAliasArgs
import typings.pulumiAws.roleAliasMod.RoleAliasState
import typings.pulumiAws.thingMod.ThingArgs
import typings.pulumiAws.thingMod.ThingState
import typings.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachmentArgs
import typings.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachmentState
import typings.pulumiAws.thingTypeMod.ThingTypeArgs
import typings.pulumiAws.thingTypeMod.ThingTypeState
import typings.pulumiAws.topicRuleMod.TopicRuleArgs
import typings.pulumiAws.topicRuleMod.TopicRuleState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iot {
  
  @JSImport("@pulumi/aws", "iot")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws", "iot.Certificate")
  @js.native
  class Certificate protected ()
    extends typings.pulumiAws.iotMod.Certificate {
    /**
      * Create a Certificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CertificateArgs) = this()
    def this(name: String, args: CertificateArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Certificate {
    
    @JSImport("@pulumi/aws", "iot.Certificate")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Certificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.iotCertificateMod.Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.iotCertificateMod.Certificate]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.iotCertificateMod.Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.iotCertificateMod.Certificate]
    @scala.inline
    def get(name: String, id: Input[ID], state: CertificateState): typings.pulumiAws.iotCertificateMod.Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.iotCertificateMod.Certificate]
    @scala.inline
    def get(name: String, id: Input[ID], state: CertificateState, opts: CustomResourceOptions): typings.pulumiAws.iotCertificateMod.Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.iotCertificateMod.Certificate]
    
    /**
      * Returns true if the given object is an instance of Certificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/certificate.Certificate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iot/certificate.Certificate */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "iot.Policy")
  @js.native
  class Policy protected ()
    extends typings.pulumiAws.iotMod.Policy {
    /**
      * Create a Policy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PolicyArgs) = this()
    def this(name: String, args: PolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Policy {
    
    @JSImport("@pulumi/aws", "iot.Policy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Policy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.iotPolicyMod.Policy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.iotPolicyMod.Policy]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.iotPolicyMod.Policy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.iotPolicyMod.Policy]
    @scala.inline
    def get(name: String, id: Input[ID], state: PolicyState): typings.pulumiAws.iotPolicyMod.Policy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.iotPolicyMod.Policy]
    @scala.inline
    def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typings.pulumiAws.iotPolicyMod.Policy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.iotPolicyMod.Policy]
    
    /**
      * Returns true if the given object is an instance of Policy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/policy.Policy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iot/policy.Policy */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "iot.PolicyAttachment")
  @js.native
  class PolicyAttachment protected ()
    extends typings.pulumiAws.iotMod.PolicyAttachment {
    /**
      * Create a PolicyAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PolicyAttachmentArgs) = this()
    def this(name: String, args: PolicyAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PolicyAttachment {
    
    @JSImport("@pulumi/aws", "iot.PolicyAttachment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PolicyAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.iotPolicyAttachmentMod.PolicyAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.iotPolicyAttachmentMod.PolicyAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.iotPolicyAttachmentMod.PolicyAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.iotPolicyAttachmentMod.PolicyAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: PolicyAttachmentState): typings.pulumiAws.iotPolicyAttachmentMod.PolicyAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.iotPolicyAttachmentMod.PolicyAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: PolicyAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.iotPolicyAttachmentMod.PolicyAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.iotPolicyAttachmentMod.PolicyAttachment]
    
    /**
      * Returns true if the given object is an instance of PolicyAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/policyAttachment.PolicyAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iot/policyAttachment.PolicyAttachment */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "iot.RoleAlias")
  @js.native
  class RoleAlias protected ()
    extends typings.pulumiAws.iotMod.RoleAlias {
    /**
      * Create a RoleAlias resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RoleAliasArgs) = this()
    def this(name: String, args: RoleAliasArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RoleAlias {
    
    @JSImport("@pulumi/aws", "iot.RoleAlias")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RoleAlias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.roleAliasMod.RoleAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.roleAliasMod.RoleAlias]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.roleAliasMod.RoleAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.roleAliasMod.RoleAlias]
    @scala.inline
    def get(name: String, id: Input[ID], state: RoleAliasState): typings.pulumiAws.roleAliasMod.RoleAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.roleAliasMod.RoleAlias]
    @scala.inline
    def get(name: String, id: Input[ID], state: RoleAliasState, opts: CustomResourceOptions): typings.pulumiAws.roleAliasMod.RoleAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.roleAliasMod.RoleAlias]
    
    /**
      * Returns true if the given object is an instance of RoleAlias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/roleAlias.RoleAlias */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iot/roleAlias.RoleAlias */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "iot.Thing")
  @js.native
  class Thing protected ()
    extends typings.pulumiAws.iotMod.Thing {
    /**
      * Create a Thing resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ThingArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ThingArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Thing {
    
    @JSImport("@pulumi/aws", "iot.Thing")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Thing resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.thingMod.Thing = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.thingMod.Thing]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.thingMod.Thing = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.thingMod.Thing]
    @scala.inline
    def get(name: String, id: Input[ID], state: ThingState): typings.pulumiAws.thingMod.Thing = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.thingMod.Thing]
    @scala.inline
    def get(name: String, id: Input[ID], state: ThingState, opts: CustomResourceOptions): typings.pulumiAws.thingMod.Thing = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.thingMod.Thing]
    
    /**
      * Returns true if the given object is an instance of Thing.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thing.Thing */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iot/thing.Thing */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "iot.ThingPrincipalAttachment")
  @js.native
  class ThingPrincipalAttachment protected ()
    extends typings.pulumiAws.iotMod.ThingPrincipalAttachment {
    /**
      * Create a ThingPrincipalAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ThingPrincipalAttachmentArgs) = this()
    def this(name: String, args: ThingPrincipalAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ThingPrincipalAttachment {
    
    @JSImport("@pulumi/aws", "iot.ThingPrincipalAttachment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ThingPrincipalAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: ThingPrincipalAttachmentState): typings.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: ThingPrincipalAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachment]
    
    /**
      * Returns true if the given object is an instance of ThingPrincipalAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thingPrincipalAttachment.ThingPrincipalAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iot/thingPrincipalAttachment.ThingPrincipalAttachment */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "iot.ThingType")
  @js.native
  class ThingType protected ()
    extends typings.pulumiAws.iotMod.ThingType {
    /**
      * Create a ThingType resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ThingTypeArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ThingTypeArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ThingType {
    
    @JSImport("@pulumi/aws", "iot.ThingType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ThingType resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.thingTypeMod.ThingType = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.thingTypeMod.ThingType]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.thingTypeMod.ThingType = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.thingTypeMod.ThingType]
    @scala.inline
    def get(name: String, id: Input[ID], state: ThingTypeState): typings.pulumiAws.thingTypeMod.ThingType = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.thingTypeMod.ThingType]
    @scala.inline
    def get(name: String, id: Input[ID], state: ThingTypeState, opts: CustomResourceOptions): typings.pulumiAws.thingTypeMod.ThingType = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.thingTypeMod.ThingType]
    
    /**
      * Returns true if the given object is an instance of ThingType.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thingType.ThingType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iot/thingType.ThingType */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "iot.TopicRule")
  @js.native
  class TopicRule protected ()
    extends typings.pulumiAws.iotMod.TopicRule {
    /**
      * Create a TopicRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TopicRuleArgs) = this()
    def this(name: String, args: TopicRuleArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object TopicRule {
    
    @JSImport("@pulumi/aws", "iot.TopicRule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing TopicRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.topicRuleMod.TopicRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.topicRuleMod.TopicRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.topicRuleMod.TopicRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.topicRuleMod.TopicRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: TopicRuleState): typings.pulumiAws.topicRuleMod.TopicRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.topicRuleMod.TopicRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: TopicRuleState, opts: CustomResourceOptions): typings.pulumiAws.topicRuleMod.TopicRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.topicRuleMod.TopicRule]
    
    /**
      * Returns true if the given object is an instance of TopicRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/topicRule.TopicRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iot/topicRule.TopicRule */ Boolean]
  }
  
  @scala.inline
  def getEndpoint(): js.Promise[GetEndpointResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpoint")().asInstanceOf[js.Promise[GetEndpointResult]]
  @scala.inline
  def getEndpoint(args: Unit, opts: InvokeOptions): js.Promise[GetEndpointResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpoint")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetEndpointResult]]
  @scala.inline
  def getEndpoint(args: GetEndpointArgs): js.Promise[GetEndpointResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpoint")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetEndpointResult]]
  @scala.inline
  def getEndpoint(args: GetEndpointArgs, opts: InvokeOptions): js.Promise[GetEndpointResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpoint")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetEndpointResult]]
}
