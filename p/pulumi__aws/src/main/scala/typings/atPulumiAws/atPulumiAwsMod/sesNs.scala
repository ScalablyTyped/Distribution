package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.sesActiveReceiptRuleSetMod.ActiveReceiptRuleSetArgs
import typings.atPulumiAws.sesActiveReceiptRuleSetMod.ActiveReceiptRuleSetState
import typings.atPulumiAws.sesConfgurationSetMod.ConfgurationSetArgs
import typings.atPulumiAws.sesConfgurationSetMod.ConfgurationSetState
import typings.atPulumiAws.sesDomainDkimMod.DomainDkimArgs
import typings.atPulumiAws.sesDomainDkimMod.DomainDkimState
import typings.atPulumiAws.sesDomainIdentityMod.DomainIdentityArgs
import typings.atPulumiAws.sesDomainIdentityMod.DomainIdentityState
import typings.atPulumiAws.sesDomainIdentityVerificationMod.DomainIdentityVerificationArgs
import typings.atPulumiAws.sesDomainIdentityVerificationMod.DomainIdentityVerificationState
import typings.atPulumiAws.sesEmailIdentityMod.EmailIdentityArgs
import typings.atPulumiAws.sesEmailIdentityMod.EmailIdentityState
import typings.atPulumiAws.sesEventDestinationMod.EventDestinationArgs
import typings.atPulumiAws.sesEventDestinationMod.EventDestinationState
import typings.atPulumiAws.sesIdentityNotificationTopicMod.IdentityNotificationTopicArgs
import typings.atPulumiAws.sesIdentityNotificationTopicMod.IdentityNotificationTopicState
import typings.atPulumiAws.sesIdentityPolicyMod.IdentityPolicyArgs
import typings.atPulumiAws.sesIdentityPolicyMod.IdentityPolicyState
import typings.atPulumiAws.sesMailFromMod.MailFromArgs
import typings.atPulumiAws.sesMailFromMod.MailFromState
import typings.atPulumiAws.sesReceiptFilterMod.ReceiptFilterArgs
import typings.atPulumiAws.sesReceiptFilterMod.ReceiptFilterState
import typings.atPulumiAws.sesReceiptRuleMod.ReceiptRuleArgs
import typings.atPulumiAws.sesReceiptRuleMod.ReceiptRuleState
import typings.atPulumiAws.sesReceiptRuleSetMod.ReceiptRuleSetArgs
import typings.atPulumiAws.sesReceiptRuleSetMod.ReceiptRuleSetState
import typings.atPulumiAws.sesTemplateMod.TemplateArgs
import typings.atPulumiAws.sesTemplateMod.TemplateState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ses")
@js.native
object sesNs extends js.Object {
  @js.native
  class ActiveReceiptRuleSet protected ()
    extends typings.atPulumiAws.sesMod.ActiveReceiptRuleSet {
    /**
      * Create a ActiveReceiptRuleSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ActiveReceiptRuleSetArgs) = this()
    def this(name: String, args: ActiveReceiptRuleSetArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ConfgurationSet protected ()
    extends typings.atPulumiAws.sesMod.ConfgurationSet {
    /**
      * Create a ConfgurationSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ConfgurationSetArgs) = this()
    def this(name: String, args: ConfgurationSetArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class DomainDkim protected ()
    extends typings.atPulumiAws.sesMod.DomainDkim {
    /**
      * Create a DomainDkim resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainDkimArgs) = this()
    def this(name: String, args: DomainDkimArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class DomainIdentity protected ()
    extends typings.atPulumiAws.sesMod.DomainIdentity {
    /**
      * Create a DomainIdentity resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainIdentityArgs) = this()
    def this(name: String, args: DomainIdentityArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class DomainIdentityVerification protected ()
    extends typings.atPulumiAws.sesMod.DomainIdentityVerification {
    /**
      * Create a DomainIdentityVerification resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainIdentityVerificationArgs) = this()
    def this(name: String, args: DomainIdentityVerificationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class EmailIdentity protected ()
    extends typings.atPulumiAws.sesMod.EmailIdentity {
    /**
      * Create a EmailIdentity resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EmailIdentityArgs) = this()
    def this(name: String, args: EmailIdentityArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class EventDestination protected ()
    extends typings.atPulumiAws.sesMod.EventDestination {
    /**
      * Create a EventDestination resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventDestinationArgs) = this()
    def this(name: String, args: EventDestinationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class IdentityNotificationTopic protected ()
    extends typings.atPulumiAws.sesMod.IdentityNotificationTopic {
    /**
      * Create a IdentityNotificationTopic resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IdentityNotificationTopicArgs) = this()
    def this(name: String, args: IdentityNotificationTopicArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class IdentityPolicy protected ()
    extends typings.atPulumiAws.sesMod.IdentityPolicy {
    /**
      * Create a IdentityPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IdentityPolicyArgs) = this()
    def this(name: String, args: IdentityPolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class MailFrom protected ()
    extends typings.atPulumiAws.sesMod.MailFrom {
    /**
      * Create a MailFrom resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MailFromArgs) = this()
    def this(name: String, args: MailFromArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ReceiptFilter protected ()
    extends typings.atPulumiAws.sesMod.ReceiptFilter {
    /**
      * Create a ReceiptFilter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReceiptFilterArgs) = this()
    def this(name: String, args: ReceiptFilterArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ReceiptRule protected ()
    extends typings.atPulumiAws.sesMod.ReceiptRule {
    /**
      * Create a ReceiptRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReceiptRuleArgs) = this()
    def this(name: String, args: ReceiptRuleArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ReceiptRuleSet protected ()
    extends typings.atPulumiAws.sesMod.ReceiptRuleSet {
    /**
      * Create a ReceiptRuleSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReceiptRuleSetArgs) = this()
    def this(name: String, args: ReceiptRuleSetArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Template protected ()
    extends typings.atPulumiAws.sesMod.Template {
    /**
      * Create a Template resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TemplateArgs) = this()
    def this(name: String, args: TemplateArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object ActiveReceiptRuleSet extends js.Object {
    /**
      * Get an existing ActiveReceiptRuleSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.sesActiveReceiptRuleSetMod.ActiveReceiptRuleSet = js.native
    def get(name: String, id: Input[ID], state: ActiveReceiptRuleSetState): typings.atPulumiAws.sesActiveReceiptRuleSetMod.ActiveReceiptRuleSet = js.native
    def get(name: String, id: Input[ID], state: ActiveReceiptRuleSetState, opts: CustomResourceOptions): typings.atPulumiAws.sesActiveReceiptRuleSetMod.ActiveReceiptRuleSet = js.native
    /**
      * Returns true if the given object is an instance of ActiveReceiptRuleSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/activeReceiptRuleSet.ActiveReceiptRuleSet */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ConfgurationSet extends js.Object {
    /**
      * Get an existing ConfgurationSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.sesConfgurationSetMod.ConfgurationSet = js.native
    def get(name: String, id: Input[ID], state: ConfgurationSetState): typings.atPulumiAws.sesConfgurationSetMod.ConfgurationSet = js.native
    def get(name: String, id: Input[ID], state: ConfgurationSetState, opts: CustomResourceOptions): typings.atPulumiAws.sesConfgurationSetMod.ConfgurationSet = js.native
    /**
      * Returns true if the given object is an instance of ConfgurationSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/confgurationSet.ConfgurationSet */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object DomainDkim extends js.Object {
    /**
      * Get an existing DomainDkim resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.sesDomainDkimMod.DomainDkim = js.native
    def get(name: String, id: Input[ID], state: DomainDkimState): typings.atPulumiAws.sesDomainDkimMod.DomainDkim = js.native
    def get(name: String, id: Input[ID], state: DomainDkimState, opts: CustomResourceOptions): typings.atPulumiAws.sesDomainDkimMod.DomainDkim = js.native
    /**
      * Returns true if the given object is an instance of DomainDkim.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/domainDkim.DomainDkim */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object DomainIdentity extends js.Object {
    /**
      * Get an existing DomainIdentity resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.sesDomainIdentityMod.DomainIdentity = js.native
    def get(name: String, id: Input[ID], state: DomainIdentityState): typings.atPulumiAws.sesDomainIdentityMod.DomainIdentity = js.native
    def get(name: String, id: Input[ID], state: DomainIdentityState, opts: CustomResourceOptions): typings.atPulumiAws.sesDomainIdentityMod.DomainIdentity = js.native
    /**
      * Returns true if the given object is an instance of DomainIdentity.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/domainIdentity.DomainIdentity */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object DomainIdentityVerification extends js.Object {
    /**
      * Get an existing DomainIdentityVerification resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.sesDomainIdentityVerificationMod.DomainIdentityVerification = js.native
    def get(name: String, id: Input[ID], state: DomainIdentityVerificationState): typings.atPulumiAws.sesDomainIdentityVerificationMod.DomainIdentityVerification = js.native
    def get(name: String, id: Input[ID], state: DomainIdentityVerificationState, opts: CustomResourceOptions): typings.atPulumiAws.sesDomainIdentityVerificationMod.DomainIdentityVerification = js.native
    /**
      * Returns true if the given object is an instance of DomainIdentityVerification.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/domainIdentityVerification.DomainIdentityVerification */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EmailIdentity extends js.Object {
    /**
      * Get an existing EmailIdentity resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.sesEmailIdentityMod.EmailIdentity = js.native
    def get(name: String, id: Input[ID], state: EmailIdentityState): typings.atPulumiAws.sesEmailIdentityMod.EmailIdentity = js.native
    def get(name: String, id: Input[ID], state: EmailIdentityState, opts: CustomResourceOptions): typings.atPulumiAws.sesEmailIdentityMod.EmailIdentity = js.native
    /**
      * Returns true if the given object is an instance of EmailIdentity.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/emailIdentity.EmailIdentity */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EventDestination extends js.Object {
    /**
      * Get an existing EventDestination resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.sesEventDestinationMod.EventDestination = js.native
    def get(name: String, id: Input[ID], state: EventDestinationState): typings.atPulumiAws.sesEventDestinationMod.EventDestination = js.native
    def get(name: String, id: Input[ID], state: EventDestinationState, opts: CustomResourceOptions): typings.atPulumiAws.sesEventDestinationMod.EventDestination = js.native
    /**
      * Returns true if the given object is an instance of EventDestination.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/eventDestination.EventDestination */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object IdentityNotificationTopic extends js.Object {
    /**
      * Get an existing IdentityNotificationTopic resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.sesIdentityNotificationTopicMod.IdentityNotificationTopic = js.native
    def get(name: String, id: Input[ID], state: IdentityNotificationTopicState): typings.atPulumiAws.sesIdentityNotificationTopicMod.IdentityNotificationTopic = js.native
    def get(name: String, id: Input[ID], state: IdentityNotificationTopicState, opts: CustomResourceOptions): typings.atPulumiAws.sesIdentityNotificationTopicMod.IdentityNotificationTopic = js.native
    /**
      * Returns true if the given object is an instance of IdentityNotificationTopic.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/identityNotificationTopic.IdentityNotificationTopic */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object IdentityPolicy extends js.Object {
    /**
      * Get an existing IdentityPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.sesIdentityPolicyMod.IdentityPolicy = js.native
    def get(name: String, id: Input[ID], state: IdentityPolicyState): typings.atPulumiAws.sesIdentityPolicyMod.IdentityPolicy = js.native
    def get(name: String, id: Input[ID], state: IdentityPolicyState, opts: CustomResourceOptions): typings.atPulumiAws.sesIdentityPolicyMod.IdentityPolicy = js.native
    /**
      * Returns true if the given object is an instance of IdentityPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/identityPolicy.IdentityPolicy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MailFrom extends js.Object {
    /**
      * Get an existing MailFrom resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.sesMailFromMod.MailFrom = js.native
    def get(name: String, id: Input[ID], state: MailFromState): typings.atPulumiAws.sesMailFromMod.MailFrom = js.native
    def get(name: String, id: Input[ID], state: MailFromState, opts: CustomResourceOptions): typings.atPulumiAws.sesMailFromMod.MailFrom = js.native
    /**
      * Returns true if the given object is an instance of MailFrom.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/mailFrom.MailFrom */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ReceiptFilter extends js.Object {
    /**
      * Get an existing ReceiptFilter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.sesReceiptFilterMod.ReceiptFilter = js.native
    def get(name: String, id: Input[ID], state: ReceiptFilterState): typings.atPulumiAws.sesReceiptFilterMod.ReceiptFilter = js.native
    def get(name: String, id: Input[ID], state: ReceiptFilterState, opts: CustomResourceOptions): typings.atPulumiAws.sesReceiptFilterMod.ReceiptFilter = js.native
    /**
      * Returns true if the given object is an instance of ReceiptFilter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/receiptFilter.ReceiptFilter */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ReceiptRule extends js.Object {
    /**
      * Get an existing ReceiptRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.sesReceiptRuleMod.ReceiptRule = js.native
    def get(name: String, id: Input[ID], state: ReceiptRuleState): typings.atPulumiAws.sesReceiptRuleMod.ReceiptRule = js.native
    def get(name: String, id: Input[ID], state: ReceiptRuleState, opts: CustomResourceOptions): typings.atPulumiAws.sesReceiptRuleMod.ReceiptRule = js.native
    /**
      * Returns true if the given object is an instance of ReceiptRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/receiptRule.ReceiptRule */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ReceiptRuleSet extends js.Object {
    /**
      * Get an existing ReceiptRuleSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.sesReceiptRuleSetMod.ReceiptRuleSet = js.native
    def get(name: String, id: Input[ID], state: ReceiptRuleSetState): typings.atPulumiAws.sesReceiptRuleSetMod.ReceiptRuleSet = js.native
    def get(name: String, id: Input[ID], state: ReceiptRuleSetState, opts: CustomResourceOptions): typings.atPulumiAws.sesReceiptRuleSetMod.ReceiptRuleSet = js.native
    /**
      * Returns true if the given object is an instance of ReceiptRuleSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/receiptRuleSet.ReceiptRuleSet */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Template extends js.Object {
    /**
      * Get an existing Template resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.sesTemplateMod.Template = js.native
    def get(name: String, id: Input[ID], state: TemplateState): typings.atPulumiAws.sesTemplateMod.Template = js.native
    def get(name: String, id: Input[ID], state: TemplateState, opts: CustomResourceOptions): typings.atPulumiAws.sesTemplateMod.Template = js.native
    /**
      * Returns true if the given object is an instance of Template.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/template.Template */ Boolean = js.native
  }
  
}

