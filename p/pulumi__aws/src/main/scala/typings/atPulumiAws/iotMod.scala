package typings.atPulumiAws

import typings.atPulumiAws.iotCertificateMod.CertificateArgs
import typings.atPulumiAws.iotCertificateMod.CertificateState
import typings.atPulumiAws.iotGetEndpointMod.GetEndpointArgs
import typings.atPulumiAws.iotGetEndpointMod.GetEndpointResult
import typings.atPulumiAws.iotPolicyAttachmentMod.PolicyAttachmentArgs
import typings.atPulumiAws.iotPolicyAttachmentMod.PolicyAttachmentState
import typings.atPulumiAws.iotPolicyMod.PolicyArgs
import typings.atPulumiAws.iotPolicyMod.PolicyState
import typings.atPulumiAws.iotRoleAliasMod.RoleAliasArgs
import typings.atPulumiAws.iotRoleAliasMod.RoleAliasState
import typings.atPulumiAws.iotThingMod.ThingArgs
import typings.atPulumiAws.iotThingMod.ThingState
import typings.atPulumiAws.iotThingPrincipalAttachmentMod.ThingPrincipalAttachmentArgs
import typings.atPulumiAws.iotThingPrincipalAttachmentMod.ThingPrincipalAttachmentState
import typings.atPulumiAws.iotThingTypeMod.ThingTypeArgs
import typings.atPulumiAws.iotThingTypeMod.ThingTypeState
import typings.atPulumiAws.iotTopicRuleMod.TopicRuleArgs
import typings.atPulumiAws.iotTopicRuleMod.TopicRuleState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iot", JSImport.Namespace)
@js.native
object iotMod extends js.Object {
  @js.native
  class Certificate protected ()
    extends typings.atPulumiAws.iotCertificateMod.Certificate {
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
    extends typings.atPulumiAws.iotPolicyMod.Policy {
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
    extends typings.atPulumiAws.iotPolicyAttachmentMod.PolicyAttachment {
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
    extends typings.atPulumiAws.iotRoleAliasMod.RoleAlias {
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
    extends typings.atPulumiAws.iotThingMod.Thing {
    /**
      * Create a Thing resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ThingArgs) = this()
    def this(name: String, args: ThingArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ThingPrincipalAttachment protected ()
    extends typings.atPulumiAws.iotThingPrincipalAttachmentMod.ThingPrincipalAttachment {
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
    extends typings.atPulumiAws.iotThingTypeMod.ThingType {
    /**
      * Create a ThingType resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ThingTypeArgs) = this()
    def this(name: String, args: ThingTypeArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class TopicRule protected ()
    extends typings.atPulumiAws.iotTopicRuleMod.TopicRule {
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
  
  def getEndpoint(): js.Promise[GetEndpointResult] with GetEndpointResult = js.native
  def getEndpoint(args: GetEndpointArgs): js.Promise[GetEndpointResult] with GetEndpointResult = js.native
  def getEndpoint(args: GetEndpointArgs, opts: InvokeOptions): js.Promise[GetEndpointResult] with GetEndpointResult = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iotCertificateMod.Certificate = js.native
    def get(name: String, id: Input[ID], state: CertificateState): typings.atPulumiAws.iotCertificateMod.Certificate = js.native
    def get(name: String, id: Input[ID], state: CertificateState, opts: CustomResourceOptions): typings.atPulumiAws.iotCertificateMod.Certificate = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iotPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState): typings.atPulumiAws.iotPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typings.atPulumiAws.iotPolicyMod.Policy = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iotPolicyAttachmentMod.PolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState): typings.atPulumiAws.iotPolicyAttachmentMod.PolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState, opts: CustomResourceOptions): typings.atPulumiAws.iotPolicyAttachmentMod.PolicyAttachment = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iotRoleAliasMod.RoleAlias = js.native
    def get(name: String, id: Input[ID], state: RoleAliasState): typings.atPulumiAws.iotRoleAliasMod.RoleAlias = js.native
    def get(name: String, id: Input[ID], state: RoleAliasState, opts: CustomResourceOptions): typings.atPulumiAws.iotRoleAliasMod.RoleAlias = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iotThingMod.Thing = js.native
    def get(name: String, id: Input[ID], state: ThingState): typings.atPulumiAws.iotThingMod.Thing = js.native
    def get(name: String, id: Input[ID], state: ThingState, opts: CustomResourceOptions): typings.atPulumiAws.iotThingMod.Thing = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iotThingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
    def get(name: String, id: Input[ID], state: ThingPrincipalAttachmentState): typings.atPulumiAws.iotThingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
    def get(name: String, id: Input[ID], state: ThingPrincipalAttachmentState, opts: CustomResourceOptions): typings.atPulumiAws.iotThingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iotThingTypeMod.ThingType = js.native
    def get(name: String, id: Input[ID], state: ThingTypeState): typings.atPulumiAws.iotThingTypeMod.ThingType = js.native
    def get(name: String, id: Input[ID], state: ThingTypeState, opts: CustomResourceOptions): typings.atPulumiAws.iotThingTypeMod.ThingType = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.iotTopicRuleMod.TopicRule = js.native
    def get(name: String, id: Input[ID], state: TopicRuleState): typings.atPulumiAws.iotTopicRuleMod.TopicRule = js.native
    def get(name: String, id: Input[ID], state: TopicRuleState, opts: CustomResourceOptions): typings.atPulumiAws.iotTopicRuleMod.TopicRule = js.native
    /**
      * Returns true if the given object is an instance of TopicRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/topicRule.TopicRule */ Boolean = js.native
  }
  
}

