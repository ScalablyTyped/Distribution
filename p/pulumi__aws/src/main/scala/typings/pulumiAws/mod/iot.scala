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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iot {
  
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
    
    /**
      * Get an existing Certificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "iot.Certificate.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.iotCertificateMod.Certificate = js.native
    @JSImport("@pulumi/aws", "iot.Certificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.iotCertificateMod.Certificate = js.native
    @JSImport("@pulumi/aws", "iot.Certificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: CertificateState): typings.pulumiAws.iotCertificateMod.Certificate = js.native
    @JSImport("@pulumi/aws", "iot.Certificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: CertificateState, opts: CustomResourceOptions): typings.pulumiAws.iotCertificateMod.Certificate = js.native
    
    /**
      * Returns true if the given object is an instance of Certificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "iot.Certificate.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/certificate.Certificate */ Boolean = js.native
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
    
    /**
      * Get an existing Policy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "iot.Policy.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.iotPolicyMod.Policy = js.native
    @JSImport("@pulumi/aws", "iot.Policy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.iotPolicyMod.Policy = js.native
    @JSImport("@pulumi/aws", "iot.Policy.get")
    @js.native
    def get(name: String, id: Input[ID], state: PolicyState): typings.pulumiAws.iotPolicyMod.Policy = js.native
    @JSImport("@pulumi/aws", "iot.Policy.get")
    @js.native
    def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typings.pulumiAws.iotPolicyMod.Policy = js.native
    
    /**
      * Returns true if the given object is an instance of Policy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "iot.Policy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/policy.Policy */ Boolean = js.native
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
    
    /**
      * Get an existing PolicyAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "iot.PolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.iotPolicyAttachmentMod.PolicyAttachment = js.native
    @JSImport("@pulumi/aws", "iot.PolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.iotPolicyAttachmentMod.PolicyAttachment = js.native
    @JSImport("@pulumi/aws", "iot.PolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState): typings.pulumiAws.iotPolicyAttachmentMod.PolicyAttachment = js.native
    @JSImport("@pulumi/aws", "iot.PolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.iotPolicyAttachmentMod.PolicyAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of PolicyAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "iot.PolicyAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/policyAttachment.PolicyAttachment */ Boolean = js.native
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
    
    /**
      * Get an existing RoleAlias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "iot.RoleAlias.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.roleAliasMod.RoleAlias = js.native
    @JSImport("@pulumi/aws", "iot.RoleAlias.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.roleAliasMod.RoleAlias = js.native
    @JSImport("@pulumi/aws", "iot.RoleAlias.get")
    @js.native
    def get(name: String, id: Input[ID], state: RoleAliasState): typings.pulumiAws.roleAliasMod.RoleAlias = js.native
    @JSImport("@pulumi/aws", "iot.RoleAlias.get")
    @js.native
    def get(name: String, id: Input[ID], state: RoleAliasState, opts: CustomResourceOptions): typings.pulumiAws.roleAliasMod.RoleAlias = js.native
    
    /**
      * Returns true if the given object is an instance of RoleAlias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "iot.RoleAlias.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/roleAlias.RoleAlias */ Boolean = js.native
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
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ThingArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Thing {
    
    /**
      * Get an existing Thing resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "iot.Thing.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.thingMod.Thing = js.native
    @JSImport("@pulumi/aws", "iot.Thing.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.thingMod.Thing = js.native
    @JSImport("@pulumi/aws", "iot.Thing.get")
    @js.native
    def get(name: String, id: Input[ID], state: ThingState): typings.pulumiAws.thingMod.Thing = js.native
    @JSImport("@pulumi/aws", "iot.Thing.get")
    @js.native
    def get(name: String, id: Input[ID], state: ThingState, opts: CustomResourceOptions): typings.pulumiAws.thingMod.Thing = js.native
    
    /**
      * Returns true if the given object is an instance of Thing.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "iot.Thing.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thing.Thing */ Boolean = js.native
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
    
    /**
      * Get an existing ThingPrincipalAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "iot.ThingPrincipalAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
    @JSImport("@pulumi/aws", "iot.ThingPrincipalAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
    @JSImport("@pulumi/aws", "iot.ThingPrincipalAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: ThingPrincipalAttachmentState): typings.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
    @JSImport("@pulumi/aws", "iot.ThingPrincipalAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: ThingPrincipalAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of ThingPrincipalAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "iot.ThingPrincipalAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thingPrincipalAttachment.ThingPrincipalAttachment */ Boolean = js.native
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
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ThingTypeArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ThingType {
    
    /**
      * Get an existing ThingType resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "iot.ThingType.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.thingTypeMod.ThingType = js.native
    @JSImport("@pulumi/aws", "iot.ThingType.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.thingTypeMod.ThingType = js.native
    @JSImport("@pulumi/aws", "iot.ThingType.get")
    @js.native
    def get(name: String, id: Input[ID], state: ThingTypeState): typings.pulumiAws.thingTypeMod.ThingType = js.native
    @JSImport("@pulumi/aws", "iot.ThingType.get")
    @js.native
    def get(name: String, id: Input[ID], state: ThingTypeState, opts: CustomResourceOptions): typings.pulumiAws.thingTypeMod.ThingType = js.native
    
    /**
      * Returns true if the given object is an instance of ThingType.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "iot.ThingType.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thingType.ThingType */ Boolean = js.native
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
    
    /**
      * Get an existing TopicRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "iot.TopicRule.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.topicRuleMod.TopicRule = js.native
    @JSImport("@pulumi/aws", "iot.TopicRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.topicRuleMod.TopicRule = js.native
    @JSImport("@pulumi/aws", "iot.TopicRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: TopicRuleState): typings.pulumiAws.topicRuleMod.TopicRule = js.native
    @JSImport("@pulumi/aws", "iot.TopicRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: TopicRuleState, opts: CustomResourceOptions): typings.pulumiAws.topicRuleMod.TopicRule = js.native
    
    /**
      * Returns true if the given object is an instance of TopicRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "iot.TopicRule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/topicRule.TopicRule */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "iot.getEndpoint")
  @js.native
  def getEndpoint(): js.Promise[GetEndpointResult] = js.native
  @JSImport("@pulumi/aws", "iot.getEndpoint")
  @js.native
  def getEndpoint(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetEndpointResult] = js.native
  @JSImport("@pulumi/aws", "iot.getEndpoint")
  @js.native
  def getEndpoint(args: GetEndpointArgs): js.Promise[GetEndpointResult] = js.native
  @JSImport("@pulumi/aws", "iot.getEndpoint")
  @js.native
  def getEndpoint(args: GetEndpointArgs, opts: InvokeOptions): js.Promise[GetEndpointResult] = js.native
}
