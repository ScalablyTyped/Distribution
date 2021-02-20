package typings.pulumiAws

import typings.pulumiAws.activeReceiptRuleSetMod.ActiveReceiptRuleSetArgs
import typings.pulumiAws.activeReceiptRuleSetMod.ActiveReceiptRuleSetState
import typings.pulumiAws.confgurationSetMod.ConfgurationSetArgs
import typings.pulumiAws.confgurationSetMod.ConfgurationSetState
import typings.pulumiAws.configurationSetMod.ConfigurationSetArgs
import typings.pulumiAws.configurationSetMod.ConfigurationSetState
import typings.pulumiAws.domainDkimMod.DomainDkimArgs
import typings.pulumiAws.domainDkimMod.DomainDkimState
import typings.pulumiAws.domainIdentityMod.DomainIdentityArgs
import typings.pulumiAws.domainIdentityMod.DomainIdentityState
import typings.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerificationArgs
import typings.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerificationState
import typings.pulumiAws.emailIdentityMod.EmailIdentityArgs
import typings.pulumiAws.emailIdentityMod.EmailIdentityState
import typings.pulumiAws.eventDestinationMod.EventDestinationArgs
import typings.pulumiAws.eventDestinationMod.EventDestinationState
import typings.pulumiAws.identityNotificationTopicMod.IdentityNotificationTopicArgs
import typings.pulumiAws.identityNotificationTopicMod.IdentityNotificationTopicState
import typings.pulumiAws.identityPolicyMod.IdentityPolicyArgs
import typings.pulumiAws.identityPolicyMod.IdentityPolicyState
import typings.pulumiAws.mailFromMod.MailFromArgs
import typings.pulumiAws.mailFromMod.MailFromState
import typings.pulumiAws.receiptFilterMod.ReceiptFilterArgs
import typings.pulumiAws.receiptFilterMod.ReceiptFilterState
import typings.pulumiAws.receiptRuleMod.ReceiptRuleArgs
import typings.pulumiAws.receiptRuleMod.ReceiptRuleState
import typings.pulumiAws.receiptRuleSetMod.ReceiptRuleSetArgs
import typings.pulumiAws.receiptRuleSetMod.ReceiptRuleSetState
import typings.pulumiAws.templateMod.TemplateArgs
import typings.pulumiAws.templateMod.TemplateState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sesMod {
  
  @JSImport("@pulumi/aws/ses", "ActiveReceiptRuleSet")
  @js.native
  class ActiveReceiptRuleSet protected ()
    extends typings.pulumiAws.activeReceiptRuleSetMod.ActiveReceiptRuleSet {
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
  /* static members */
  object ActiveReceiptRuleSet {
    
    /**
      * Get an existing ActiveReceiptRuleSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ses", "ActiveReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.activeReceiptRuleSetMod.ActiveReceiptRuleSet = js.native
    @JSImport("@pulumi/aws/ses", "ActiveReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.activeReceiptRuleSetMod.ActiveReceiptRuleSet = js.native
    @JSImport("@pulumi/aws/ses", "ActiveReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ActiveReceiptRuleSetState): typings.pulumiAws.activeReceiptRuleSetMod.ActiveReceiptRuleSet = js.native
    @JSImport("@pulumi/aws/ses", "ActiveReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ActiveReceiptRuleSetState, opts: CustomResourceOptions): typings.pulumiAws.activeReceiptRuleSetMod.ActiveReceiptRuleSet = js.native
    
    /**
      * Returns true if the given object is an instance of ActiveReceiptRuleSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses", "ActiveReceiptRuleSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/activeReceiptRuleSet.ActiveReceiptRuleSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ses", "ConfgurationSet")
  @js.native
  class ConfgurationSet protected ()
    extends typings.pulumiAws.confgurationSetMod.ConfgurationSet {
    /**
      * Create a ConfgurationSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.ses.ConfgurationSet has been deprecated in favor of aws.ses.ConfigurationSet */
    def this(name: String) = this()
    def this(name: String, args: ConfgurationSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ConfgurationSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ConfgurationSet {
    
    /**
      * Get an existing ConfgurationSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ses", "ConfgurationSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.confgurationSetMod.ConfgurationSet = js.native
    @JSImport("@pulumi/aws/ses", "ConfgurationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.confgurationSetMod.ConfgurationSet = js.native
    @JSImport("@pulumi/aws/ses", "ConfgurationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfgurationSetState): typings.pulumiAws.confgurationSetMod.ConfgurationSet = js.native
    @JSImport("@pulumi/aws/ses", "ConfgurationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfgurationSetState, opts: CustomResourceOptions): typings.pulumiAws.confgurationSetMod.ConfgurationSet = js.native
    
    /**
      * Returns true if the given object is an instance of ConfgurationSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses", "ConfgurationSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/confgurationSet.ConfgurationSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ses", "ConfigurationSet")
  @js.native
  class ConfigurationSet protected ()
    extends typings.pulumiAws.configurationSetMod.ConfigurationSet {
    /**
      * Create a ConfigurationSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ConfigurationSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ConfigurationSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ConfigurationSet {
    
    /**
      * Get an existing ConfigurationSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ses", "ConfigurationSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.configurationSetMod.ConfigurationSet = js.native
    @JSImport("@pulumi/aws/ses", "ConfigurationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.configurationSetMod.ConfigurationSet = js.native
    @JSImport("@pulumi/aws/ses", "ConfigurationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfigurationSetState): typings.pulumiAws.configurationSetMod.ConfigurationSet = js.native
    @JSImport("@pulumi/aws/ses", "ConfigurationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfigurationSetState, opts: CustomResourceOptions): typings.pulumiAws.configurationSetMod.ConfigurationSet = js.native
    
    /**
      * Returns true if the given object is an instance of ConfigurationSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses", "ConfigurationSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/configurationSet.ConfigurationSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ses", "DomainDkim")
  @js.native
  class DomainDkim protected ()
    extends typings.pulumiAws.domainDkimMod.DomainDkim {
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
  /* static members */
  object DomainDkim {
    
    /**
      * Get an existing DomainDkim resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ses", "DomainDkim.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.domainDkimMod.DomainDkim = js.native
    @JSImport("@pulumi/aws/ses", "DomainDkim.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.domainDkimMod.DomainDkim = js.native
    @JSImport("@pulumi/aws/ses", "DomainDkim.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainDkimState): typings.pulumiAws.domainDkimMod.DomainDkim = js.native
    @JSImport("@pulumi/aws/ses", "DomainDkim.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainDkimState, opts: CustomResourceOptions): typings.pulumiAws.domainDkimMod.DomainDkim = js.native
    
    /**
      * Returns true if the given object is an instance of DomainDkim.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses", "DomainDkim.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/domainDkim.DomainDkim */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ses", "DomainIdentity")
  @js.native
  class DomainIdentity protected ()
    extends typings.pulumiAws.domainIdentityMod.DomainIdentity {
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
  /* static members */
  object DomainIdentity {
    
    /**
      * Get an existing DomainIdentity resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ses", "DomainIdentity.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.domainIdentityMod.DomainIdentity = js.native
    @JSImport("@pulumi/aws/ses", "DomainIdentity.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.domainIdentityMod.DomainIdentity = js.native
    @JSImport("@pulumi/aws/ses", "DomainIdentity.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainIdentityState): typings.pulumiAws.domainIdentityMod.DomainIdentity = js.native
    @JSImport("@pulumi/aws/ses", "DomainIdentity.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainIdentityState, opts: CustomResourceOptions): typings.pulumiAws.domainIdentityMod.DomainIdentity = js.native
    
    /**
      * Returns true if the given object is an instance of DomainIdentity.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses", "DomainIdentity.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/domainIdentity.DomainIdentity */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ses", "DomainIdentityVerification")
  @js.native
  class DomainIdentityVerification protected ()
    extends typings.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerification {
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
  /* static members */
  object DomainIdentityVerification {
    
    /**
      * Get an existing DomainIdentityVerification resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ses", "DomainIdentityVerification.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerification = js.native
    @JSImport("@pulumi/aws/ses", "DomainIdentityVerification.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerification = js.native
    @JSImport("@pulumi/aws/ses", "DomainIdentityVerification.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainIdentityVerificationState): typings.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerification = js.native
    @JSImport("@pulumi/aws/ses", "DomainIdentityVerification.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainIdentityVerificationState, opts: CustomResourceOptions): typings.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerification = js.native
    
    /**
      * Returns true if the given object is an instance of DomainIdentityVerification.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses", "DomainIdentityVerification.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/domainIdentityVerification.DomainIdentityVerification */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ses", "EmailIdentity")
  @js.native
  class EmailIdentity protected ()
    extends typings.pulumiAws.emailIdentityMod.EmailIdentity {
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
  /* static members */
  object EmailIdentity {
    
    /**
      * Get an existing EmailIdentity resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ses", "EmailIdentity.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.emailIdentityMod.EmailIdentity = js.native
    @JSImport("@pulumi/aws/ses", "EmailIdentity.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.emailIdentityMod.EmailIdentity = js.native
    @JSImport("@pulumi/aws/ses", "EmailIdentity.get")
    @js.native
    def get(name: String, id: Input[ID], state: EmailIdentityState): typings.pulumiAws.emailIdentityMod.EmailIdentity = js.native
    @JSImport("@pulumi/aws/ses", "EmailIdentity.get")
    @js.native
    def get(name: String, id: Input[ID], state: EmailIdentityState, opts: CustomResourceOptions): typings.pulumiAws.emailIdentityMod.EmailIdentity = js.native
    
    /**
      * Returns true if the given object is an instance of EmailIdentity.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses", "EmailIdentity.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/emailIdentity.EmailIdentity */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ses", "EventDestination")
  @js.native
  class EventDestination protected ()
    extends typings.pulumiAws.eventDestinationMod.EventDestination {
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
  /* static members */
  object EventDestination {
    
    /**
      * Get an existing EventDestination resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ses", "EventDestination.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.eventDestinationMod.EventDestination = js.native
    @JSImport("@pulumi/aws/ses", "EventDestination.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.eventDestinationMod.EventDestination = js.native
    @JSImport("@pulumi/aws/ses", "EventDestination.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventDestinationState): typings.pulumiAws.eventDestinationMod.EventDestination = js.native
    @JSImport("@pulumi/aws/ses", "EventDestination.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventDestinationState, opts: CustomResourceOptions): typings.pulumiAws.eventDestinationMod.EventDestination = js.native
    
    /**
      * Returns true if the given object is an instance of EventDestination.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses", "EventDestination.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/eventDestination.EventDestination */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ses", "IdentityNotificationTopic")
  @js.native
  class IdentityNotificationTopic protected ()
    extends typings.pulumiAws.identityNotificationTopicMod.IdentityNotificationTopic {
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
  /* static members */
  object IdentityNotificationTopic {
    
    /**
      * Get an existing IdentityNotificationTopic resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ses", "IdentityNotificationTopic.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.identityNotificationTopicMod.IdentityNotificationTopic = js.native
    @JSImport("@pulumi/aws/ses", "IdentityNotificationTopic.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.identityNotificationTopicMod.IdentityNotificationTopic = js.native
    @JSImport("@pulumi/aws/ses", "IdentityNotificationTopic.get")
    @js.native
    def get(name: String, id: Input[ID], state: IdentityNotificationTopicState): typings.pulumiAws.identityNotificationTopicMod.IdentityNotificationTopic = js.native
    @JSImport("@pulumi/aws/ses", "IdentityNotificationTopic.get")
    @js.native
    def get(name: String, id: Input[ID], state: IdentityNotificationTopicState, opts: CustomResourceOptions): typings.pulumiAws.identityNotificationTopicMod.IdentityNotificationTopic = js.native
    
    /**
      * Returns true if the given object is an instance of IdentityNotificationTopic.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses", "IdentityNotificationTopic.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/identityNotificationTopic.IdentityNotificationTopic */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ses", "IdentityPolicy")
  @js.native
  class IdentityPolicy protected ()
    extends typings.pulumiAws.identityPolicyMod.IdentityPolicy {
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
  /* static members */
  object IdentityPolicy {
    
    /**
      * Get an existing IdentityPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ses", "IdentityPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.identityPolicyMod.IdentityPolicy = js.native
    @JSImport("@pulumi/aws/ses", "IdentityPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.identityPolicyMod.IdentityPolicy = js.native
    @JSImport("@pulumi/aws/ses", "IdentityPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: IdentityPolicyState): typings.pulumiAws.identityPolicyMod.IdentityPolicy = js.native
    @JSImport("@pulumi/aws/ses", "IdentityPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: IdentityPolicyState, opts: CustomResourceOptions): typings.pulumiAws.identityPolicyMod.IdentityPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of IdentityPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses", "IdentityPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/identityPolicy.IdentityPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ses", "MailFrom")
  @js.native
  class MailFrom protected ()
    extends typings.pulumiAws.mailFromMod.MailFrom {
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
  /* static members */
  object MailFrom {
    
    /**
      * Get an existing MailFrom resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ses", "MailFrom.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.mailFromMod.MailFrom = js.native
    @JSImport("@pulumi/aws/ses", "MailFrom.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.mailFromMod.MailFrom = js.native
    @JSImport("@pulumi/aws/ses", "MailFrom.get")
    @js.native
    def get(name: String, id: Input[ID], state: MailFromState): typings.pulumiAws.mailFromMod.MailFrom = js.native
    @JSImport("@pulumi/aws/ses", "MailFrom.get")
    @js.native
    def get(name: String, id: Input[ID], state: MailFromState, opts: CustomResourceOptions): typings.pulumiAws.mailFromMod.MailFrom = js.native
    
    /**
      * Returns true if the given object is an instance of MailFrom.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses", "MailFrom.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/mailFrom.MailFrom */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ses", "ReceiptFilter")
  @js.native
  class ReceiptFilter protected ()
    extends typings.pulumiAws.receiptFilterMod.ReceiptFilter {
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
  /* static members */
  object ReceiptFilter {
    
    /**
      * Get an existing ReceiptFilter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ses", "ReceiptFilter.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.receiptFilterMod.ReceiptFilter = js.native
    @JSImport("@pulumi/aws/ses", "ReceiptFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.receiptFilterMod.ReceiptFilter = js.native
    @JSImport("@pulumi/aws/ses", "ReceiptFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReceiptFilterState): typings.pulumiAws.receiptFilterMod.ReceiptFilter = js.native
    @JSImport("@pulumi/aws/ses", "ReceiptFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReceiptFilterState, opts: CustomResourceOptions): typings.pulumiAws.receiptFilterMod.ReceiptFilter = js.native
    
    /**
      * Returns true if the given object is an instance of ReceiptFilter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses", "ReceiptFilter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/receiptFilter.ReceiptFilter */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ses", "ReceiptRule")
  @js.native
  class ReceiptRule protected ()
    extends typings.pulumiAws.receiptRuleMod.ReceiptRule {
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
  /* static members */
  object ReceiptRule {
    
    /**
      * Get an existing ReceiptRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ses", "ReceiptRule.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.receiptRuleMod.ReceiptRule = js.native
    @JSImport("@pulumi/aws/ses", "ReceiptRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.receiptRuleMod.ReceiptRule = js.native
    @JSImport("@pulumi/aws/ses", "ReceiptRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReceiptRuleState): typings.pulumiAws.receiptRuleMod.ReceiptRule = js.native
    @JSImport("@pulumi/aws/ses", "ReceiptRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReceiptRuleState, opts: CustomResourceOptions): typings.pulumiAws.receiptRuleMod.ReceiptRule = js.native
    
    /**
      * Returns true if the given object is an instance of ReceiptRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses", "ReceiptRule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/receiptRule.ReceiptRule */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ses", "ReceiptRuleSet")
  @js.native
  class ReceiptRuleSet protected ()
    extends typings.pulumiAws.receiptRuleSetMod.ReceiptRuleSet {
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
  /* static members */
  object ReceiptRuleSet {
    
    /**
      * Get an existing ReceiptRuleSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ses", "ReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.receiptRuleSetMod.ReceiptRuleSet = js.native
    @JSImport("@pulumi/aws/ses", "ReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.receiptRuleSetMod.ReceiptRuleSet = js.native
    @JSImport("@pulumi/aws/ses", "ReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReceiptRuleSetState): typings.pulumiAws.receiptRuleSetMod.ReceiptRuleSet = js.native
    @JSImport("@pulumi/aws/ses", "ReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReceiptRuleSetState, opts: CustomResourceOptions): typings.pulumiAws.receiptRuleSetMod.ReceiptRuleSet = js.native
    
    /**
      * Returns true if the given object is an instance of ReceiptRuleSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses", "ReceiptRuleSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/receiptRuleSet.ReceiptRuleSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ses", "Template")
  @js.native
  class Template protected ()
    extends typings.pulumiAws.templateMod.Template {
    /**
      * Create a Template resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TemplateArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: TemplateArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Template {
    
    /**
      * Get an existing Template resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ses", "Template.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.templateMod.Template = js.native
    @JSImport("@pulumi/aws/ses", "Template.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.templateMod.Template = js.native
    @JSImport("@pulumi/aws/ses", "Template.get")
    @js.native
    def get(name: String, id: Input[ID], state: TemplateState): typings.pulumiAws.templateMod.Template = js.native
    @JSImport("@pulumi/aws/ses", "Template.get")
    @js.native
    def get(name: String, id: Input[ID], state: TemplateState, opts: CustomResourceOptions): typings.pulumiAws.templateMod.Template = js.native
    
    /**
      * Returns true if the given object is an instance of Template.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses", "Template.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/template.Template */ Boolean = js.native
  }
}
