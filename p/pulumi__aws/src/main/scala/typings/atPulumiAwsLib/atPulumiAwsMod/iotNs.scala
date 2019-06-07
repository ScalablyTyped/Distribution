package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "iot")
@js.native
object iotNs extends js.Object {
  @js.native
  class Certificate protected ()
    extends atPulumiAwsLib.iotMod.Certificate {
    /**
      * Create a Certificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iotCertificateMod.CertificateArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iotCertificateMod.CertificateArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Policy protected ()
    extends atPulumiAwsLib.iotMod.Policy {
    /**
      * Create a Policy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iotPolicyMod.PolicyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iotPolicyMod.PolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class PolicyAttachment protected ()
    extends atPulumiAwsLib.iotMod.PolicyAttachment {
    /**
      * Create a PolicyAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iotPolicyAttachmentMod.PolicyAttachmentArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iotPolicyAttachmentMod.PolicyAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class RoleAlias protected ()
    extends atPulumiAwsLib.iotMod.RoleAlias {
    /**
      * Create a RoleAlias resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iotRoleAliasMod.RoleAliasArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iotRoleAliasMod.RoleAliasArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Thing protected ()
    extends atPulumiAwsLib.iotMod.Thing {
    /**
      * Create a Thing resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iotThingMod.ThingArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iotThingMod.ThingArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ThingPrincipalAttachment protected ()
    extends atPulumiAwsLib.iotMod.ThingPrincipalAttachment {
    /**
      * Create a ThingPrincipalAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iotThingPrincipalAttachmentMod.ThingPrincipalAttachmentArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iotThingPrincipalAttachmentMod.ThingPrincipalAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ThingType protected ()
    extends atPulumiAwsLib.iotMod.ThingType {
    /**
      * Create a ThingType resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iotThingTypeMod.ThingTypeArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iotThingTypeMod.ThingTypeArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class TopicRule protected ()
    extends atPulumiAwsLib.iotMod.TopicRule {
    /**
      * Create a TopicRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.iotTopicRuleMod.TopicRuleArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.iotTopicRuleMod.TopicRuleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getEndpoint(): js.Promise[atPulumiAwsLib.iotGetEndpointMod.GetEndpointResult] = js.native
  def getEndpoint(args: atPulumiAwsLib.iotGetEndpointMod.GetEndpointArgs): js.Promise[atPulumiAwsLib.iotGetEndpointMod.GetEndpointResult] = js.native
  def getEndpoint(
    args: atPulumiAwsLib.iotGetEndpointMod.GetEndpointArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.iotGetEndpointMod.GetEndpointResult] = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iotCertificateMod.Certificate = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iotCertificateMod.CertificateState
    ): atPulumiAwsLib.iotCertificateMod.Certificate = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iotCertificateMod.CertificateState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iotCertificateMod.Certificate = js.native
    /**
      * Returns true if the given object is an instance of Certificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/certificate.Certificate */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iotPolicyMod.Policy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iotPolicyMod.PolicyState
    ): atPulumiAwsLib.iotPolicyMod.Policy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iotPolicyMod.PolicyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iotPolicyMod.Policy = js.native
    /**
      * Returns true if the given object is an instance of Policy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/policy.Policy */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iotPolicyAttachmentMod.PolicyAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iotPolicyAttachmentMod.PolicyAttachmentState
    ): atPulumiAwsLib.iotPolicyAttachmentMod.PolicyAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iotPolicyAttachmentMod.PolicyAttachmentState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iotPolicyAttachmentMod.PolicyAttachment = js.native
    /**
      * Returns true if the given object is an instance of PolicyAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/policyAttachment.PolicyAttachment */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iotRoleAliasMod.RoleAlias = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iotRoleAliasMod.RoleAliasState
    ): atPulumiAwsLib.iotRoleAliasMod.RoleAlias = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iotRoleAliasMod.RoleAliasState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iotRoleAliasMod.RoleAlias = js.native
    /**
      * Returns true if the given object is an instance of RoleAlias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/roleAlias.RoleAlias */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iotThingMod.Thing = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iotThingMod.ThingState
    ): atPulumiAwsLib.iotThingMod.Thing = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iotThingMod.ThingState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iotThingMod.Thing = js.native
    /**
      * Returns true if the given object is an instance of Thing.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thing.Thing */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iotThingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iotThingPrincipalAttachmentMod.ThingPrincipalAttachmentState
    ): atPulumiAwsLib.iotThingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iotThingPrincipalAttachmentMod.ThingPrincipalAttachmentState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iotThingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
    /**
      * Returns true if the given object is an instance of ThingPrincipalAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thingPrincipalAttachment.ThingPrincipalAttachment */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iotThingTypeMod.ThingType = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iotThingTypeMod.ThingTypeState
    ): atPulumiAwsLib.iotThingTypeMod.ThingType = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iotThingTypeMod.ThingTypeState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iotThingTypeMod.ThingType = js.native
    /**
      * Returns true if the given object is an instance of ThingType.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thingType.ThingType */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iotTopicRuleMod.TopicRule = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iotTopicRuleMod.TopicRuleState
    ): atPulumiAwsLib.iotTopicRuleMod.TopicRule = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.iotTopicRuleMod.TopicRuleState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.iotTopicRuleMod.TopicRule = js.native
    /**
      * Returns true if the given object is an instance of TopicRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/topicRule.TopicRule */ scala.Boolean = js.native
  }
  
}

