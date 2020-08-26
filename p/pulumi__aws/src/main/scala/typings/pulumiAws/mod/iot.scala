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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "iot")
@js.native
object iot extends js.Object {
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
  
  def getEndpoint(): js.Promise[GetEndpointResult] = js.native
  def getEndpoint(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetEndpointResult] = js.native
  def getEndpoint(args: GetEndpointArgs): js.Promise[GetEndpointResult] = js.native
  def getEndpoint(args: GetEndpointArgs, opts: InvokeOptions): js.Promise[GetEndpointResult] = js.native
  /* static members */
  @js.native
  object Certificate extends js.Object {
    /**
      * Get an existing Certificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.iotCertificateMod.Certificate = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.iotCertificateMod.Certificate = js.native
    def get(name: String, id: Input[ID], state: CertificateState): typings.pulumiAws.iotCertificateMod.Certificate = js.native
    def get(name: String, id: Input[ID], state: CertificateState, opts: CustomResourceOptions): typings.pulumiAws.iotCertificateMod.Certificate = js.native
    /**
      * Returns true if the given object is an instance of Certificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/certificate.Certificate */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Policy extends js.Object {
    /**
      * Get an existing Policy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.iotPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.iotPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState): typings.pulumiAws.iotPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typings.pulumiAws.iotPolicyMod.Policy = js.native
    /**
      * Returns true if the given object is an instance of Policy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/policy.Policy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PolicyAttachment extends js.Object {
    /**
      * Get an existing PolicyAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.iotPolicyAttachmentMod.PolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.iotPolicyAttachmentMod.PolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState): typings.pulumiAws.iotPolicyAttachmentMod.PolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.iotPolicyAttachmentMod.PolicyAttachment = js.native
    /**
      * Returns true if the given object is an instance of PolicyAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/policyAttachment.PolicyAttachment */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RoleAlias extends js.Object {
    /**
      * Get an existing RoleAlias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.roleAliasMod.RoleAlias = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.roleAliasMod.RoleAlias = js.native
    def get(name: String, id: Input[ID], state: RoleAliasState): typings.pulumiAws.roleAliasMod.RoleAlias = js.native
    def get(name: String, id: Input[ID], state: RoleAliasState, opts: CustomResourceOptions): typings.pulumiAws.roleAliasMod.RoleAlias = js.native
    /**
      * Returns true if the given object is an instance of RoleAlias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/roleAlias.RoleAlias */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Thing extends js.Object {
    /**
      * Get an existing Thing resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.thingMod.Thing = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.thingMod.Thing = js.native
    def get(name: String, id: Input[ID], state: ThingState): typings.pulumiAws.thingMod.Thing = js.native
    def get(name: String, id: Input[ID], state: ThingState, opts: CustomResourceOptions): typings.pulumiAws.thingMod.Thing = js.native
    /**
      * Returns true if the given object is an instance of Thing.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thing.Thing */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ThingPrincipalAttachment extends js.Object {
    /**
      * Get an existing ThingPrincipalAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
    def get(name: String, id: Input[ID], state: ThingPrincipalAttachmentState): typings.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
    def get(name: String, id: Input[ID], state: ThingPrincipalAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
    /**
      * Returns true if the given object is an instance of ThingPrincipalAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thingPrincipalAttachment.ThingPrincipalAttachment */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ThingType extends js.Object {
    /**
      * Get an existing ThingType resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.thingTypeMod.ThingType = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.thingTypeMod.ThingType = js.native
    def get(name: String, id: Input[ID], state: ThingTypeState): typings.pulumiAws.thingTypeMod.ThingType = js.native
    def get(name: String, id: Input[ID], state: ThingTypeState, opts: CustomResourceOptions): typings.pulumiAws.thingTypeMod.ThingType = js.native
    /**
      * Returns true if the given object is an instance of ThingType.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thingType.ThingType */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object TopicRule extends js.Object {
    /**
      * Get an existing TopicRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.topicRuleMod.TopicRule = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.topicRuleMod.TopicRule = js.native
    def get(name: String, id: Input[ID], state: TopicRuleState): typings.pulumiAws.topicRuleMod.TopicRule = js.native
    def get(name: String, id: Input[ID], state: TopicRuleState, opts: CustomResourceOptions): typings.pulumiAws.topicRuleMod.TopicRule = js.native
    /**
      * Returns true if the given object is an instance of TopicRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/topicRule.TopicRule */ Boolean = js.native
  }
  
}

