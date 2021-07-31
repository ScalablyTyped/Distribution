package typings.pulumiAws.mod

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ses {
  
  @JSImport("@pulumi/aws", "ses.ActiveReceiptRuleSet")
  @js.native
  class ActiveReceiptRuleSet protected ()
    extends typings.pulumiAws.sesMod.ActiveReceiptRuleSet {
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
    
    @JSImport("@pulumi/aws", "ses.ActiveReceiptRuleSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ActiveReceiptRuleSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.activeReceiptRuleSetMod.ActiveReceiptRuleSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.activeReceiptRuleSetMod.ActiveReceiptRuleSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.activeReceiptRuleSetMod.ActiveReceiptRuleSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.activeReceiptRuleSetMod.ActiveReceiptRuleSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: ActiveReceiptRuleSetState): typings.pulumiAws.activeReceiptRuleSetMod.ActiveReceiptRuleSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.activeReceiptRuleSetMod.ActiveReceiptRuleSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: ActiveReceiptRuleSetState, opts: CustomResourceOptions): typings.pulumiAws.activeReceiptRuleSetMod.ActiveReceiptRuleSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.activeReceiptRuleSetMod.ActiveReceiptRuleSet]
    
    /**
      * Returns true if the given object is an instance of ActiveReceiptRuleSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/activeReceiptRuleSet.ActiveReceiptRuleSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/activeReceiptRuleSet.ActiveReceiptRuleSet */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ses.ConfgurationSet")
  @js.native
  class ConfgurationSet protected ()
    extends typings.pulumiAws.sesMod.ConfgurationSet {
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ConfgurationSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ConfgurationSet {
    
    @JSImport("@pulumi/aws", "ses.ConfgurationSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ConfgurationSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.confgurationSetMod.ConfgurationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.confgurationSetMod.ConfgurationSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.confgurationSetMod.ConfgurationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.confgurationSetMod.ConfgurationSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: ConfgurationSetState): typings.pulumiAws.confgurationSetMod.ConfgurationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.confgurationSetMod.ConfgurationSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: ConfgurationSetState, opts: CustomResourceOptions): typings.pulumiAws.confgurationSetMod.ConfgurationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.confgurationSetMod.ConfgurationSet]
    
    /**
      * Returns true if the given object is an instance of ConfgurationSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/confgurationSet.ConfgurationSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/confgurationSet.ConfgurationSet */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ses.ConfigurationSet")
  @js.native
  class ConfigurationSet protected ()
    extends typings.pulumiAws.sesMod.ConfigurationSet {
    /**
      * Create a ConfigurationSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ConfigurationSetArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ConfigurationSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ConfigurationSet {
    
    @JSImport("@pulumi/aws", "ses.ConfigurationSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ConfigurationSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.configurationSetMod.ConfigurationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.configurationSetMod.ConfigurationSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.configurationSetMod.ConfigurationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.configurationSetMod.ConfigurationSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: ConfigurationSetState): typings.pulumiAws.configurationSetMod.ConfigurationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.configurationSetMod.ConfigurationSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: ConfigurationSetState, opts: CustomResourceOptions): typings.pulumiAws.configurationSetMod.ConfigurationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.configurationSetMod.ConfigurationSet]
    
    /**
      * Returns true if the given object is an instance of ConfigurationSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/configurationSet.ConfigurationSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/configurationSet.ConfigurationSet */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ses.DomainDkim")
  @js.native
  class DomainDkim protected ()
    extends typings.pulumiAws.sesMod.DomainDkim {
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
    
    @JSImport("@pulumi/aws", "ses.DomainDkim")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DomainDkim resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.domainDkimMod.DomainDkim = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainDkimMod.DomainDkim]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.domainDkimMod.DomainDkim = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainDkimMod.DomainDkim]
    @scala.inline
    def get(name: String, id: Input[ID], state: DomainDkimState): typings.pulumiAws.domainDkimMod.DomainDkim = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainDkimMod.DomainDkim]
    @scala.inline
    def get(name: String, id: Input[ID], state: DomainDkimState, opts: CustomResourceOptions): typings.pulumiAws.domainDkimMod.DomainDkim = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainDkimMod.DomainDkim]
    
    /**
      * Returns true if the given object is an instance of DomainDkim.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/domainDkim.DomainDkim */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/domainDkim.DomainDkim */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ses.DomainIdentity")
  @js.native
  class DomainIdentity protected ()
    extends typings.pulumiAws.sesMod.DomainIdentity {
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
    
    @JSImport("@pulumi/aws", "ses.DomainIdentity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DomainIdentity resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.domainIdentityMod.DomainIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainIdentityMod.DomainIdentity]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.domainIdentityMod.DomainIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainIdentityMod.DomainIdentity]
    @scala.inline
    def get(name: String, id: Input[ID], state: DomainIdentityState): typings.pulumiAws.domainIdentityMod.DomainIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainIdentityMod.DomainIdentity]
    @scala.inline
    def get(name: String, id: Input[ID], state: DomainIdentityState, opts: CustomResourceOptions): typings.pulumiAws.domainIdentityMod.DomainIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainIdentityMod.DomainIdentity]
    
    /**
      * Returns true if the given object is an instance of DomainIdentity.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/domainIdentity.DomainIdentity */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/domainIdentity.DomainIdentity */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ses.DomainIdentityVerification")
  @js.native
  class DomainIdentityVerification protected ()
    extends typings.pulumiAws.sesMod.DomainIdentityVerification {
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
    
    @JSImport("@pulumi/aws", "ses.DomainIdentityVerification")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DomainIdentityVerification resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerification]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerification]
    @scala.inline
    def get(name: String, id: Input[ID], state: DomainIdentityVerificationState): typings.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerification]
    @scala.inline
    def get(name: String, id: Input[ID], state: DomainIdentityVerificationState, opts: CustomResourceOptions): typings.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerification]
    
    /**
      * Returns true if the given object is an instance of DomainIdentityVerification.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/domainIdentityVerification.DomainIdentityVerification */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/domainIdentityVerification.DomainIdentityVerification */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ses.EmailIdentity")
  @js.native
  class EmailIdentity protected ()
    extends typings.pulumiAws.sesMod.EmailIdentity {
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
    
    @JSImport("@pulumi/aws", "ses.EmailIdentity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EmailIdentity resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.emailIdentityMod.EmailIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.emailIdentityMod.EmailIdentity]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.emailIdentityMod.EmailIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.emailIdentityMod.EmailIdentity]
    @scala.inline
    def get(name: String, id: Input[ID], state: EmailIdentityState): typings.pulumiAws.emailIdentityMod.EmailIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.emailIdentityMod.EmailIdentity]
    @scala.inline
    def get(name: String, id: Input[ID], state: EmailIdentityState, opts: CustomResourceOptions): typings.pulumiAws.emailIdentityMod.EmailIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.emailIdentityMod.EmailIdentity]
    
    /**
      * Returns true if the given object is an instance of EmailIdentity.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/emailIdentity.EmailIdentity */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/emailIdentity.EmailIdentity */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ses.EventDestination")
  @js.native
  class EventDestination protected ()
    extends typings.pulumiAws.sesMod.EventDestination {
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
    
    @JSImport("@pulumi/aws", "ses.EventDestination")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EventDestination resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.eventDestinationMod.EventDestination = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.eventDestinationMod.EventDestination]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.eventDestinationMod.EventDestination = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.eventDestinationMod.EventDestination]
    @scala.inline
    def get(name: String, id: Input[ID], state: EventDestinationState): typings.pulumiAws.eventDestinationMod.EventDestination = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.eventDestinationMod.EventDestination]
    @scala.inline
    def get(name: String, id: Input[ID], state: EventDestinationState, opts: CustomResourceOptions): typings.pulumiAws.eventDestinationMod.EventDestination = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.eventDestinationMod.EventDestination]
    
    /**
      * Returns true if the given object is an instance of EventDestination.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/eventDestination.EventDestination */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/eventDestination.EventDestination */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ses.IdentityNotificationTopic")
  @js.native
  class IdentityNotificationTopic protected ()
    extends typings.pulumiAws.sesMod.IdentityNotificationTopic {
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
    
    @JSImport("@pulumi/aws", "ses.IdentityNotificationTopic")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing IdentityNotificationTopic resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.identityNotificationTopicMod.IdentityNotificationTopic = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.identityNotificationTopicMod.IdentityNotificationTopic]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.identityNotificationTopicMod.IdentityNotificationTopic = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.identityNotificationTopicMod.IdentityNotificationTopic]
    @scala.inline
    def get(name: String, id: Input[ID], state: IdentityNotificationTopicState): typings.pulumiAws.identityNotificationTopicMod.IdentityNotificationTopic = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.identityNotificationTopicMod.IdentityNotificationTopic]
    @scala.inline
    def get(name: String, id: Input[ID], state: IdentityNotificationTopicState, opts: CustomResourceOptions): typings.pulumiAws.identityNotificationTopicMod.IdentityNotificationTopic = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.identityNotificationTopicMod.IdentityNotificationTopic]
    
    /**
      * Returns true if the given object is an instance of IdentityNotificationTopic.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/identityNotificationTopic.IdentityNotificationTopic */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/identityNotificationTopic.IdentityNotificationTopic */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ses.IdentityPolicy")
  @js.native
  class IdentityPolicy protected ()
    extends typings.pulumiAws.sesMod.IdentityPolicy {
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
    
    @JSImport("@pulumi/aws", "ses.IdentityPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing IdentityPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.identityPolicyMod.IdentityPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.identityPolicyMod.IdentityPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.identityPolicyMod.IdentityPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.identityPolicyMod.IdentityPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: IdentityPolicyState): typings.pulumiAws.identityPolicyMod.IdentityPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.identityPolicyMod.IdentityPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: IdentityPolicyState, opts: CustomResourceOptions): typings.pulumiAws.identityPolicyMod.IdentityPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.identityPolicyMod.IdentityPolicy]
    
    /**
      * Returns true if the given object is an instance of IdentityPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/identityPolicy.IdentityPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/identityPolicy.IdentityPolicy */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ses.MailFrom")
  @js.native
  class MailFrom protected ()
    extends typings.pulumiAws.sesMod.MailFrom {
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
    
    @JSImport("@pulumi/aws", "ses.MailFrom")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing MailFrom resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.mailFromMod.MailFrom = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.mailFromMod.MailFrom]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.mailFromMod.MailFrom = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.mailFromMod.MailFrom]
    @scala.inline
    def get(name: String, id: Input[ID], state: MailFromState): typings.pulumiAws.mailFromMod.MailFrom = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.mailFromMod.MailFrom]
    @scala.inline
    def get(name: String, id: Input[ID], state: MailFromState, opts: CustomResourceOptions): typings.pulumiAws.mailFromMod.MailFrom = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.mailFromMod.MailFrom]
    
    /**
      * Returns true if the given object is an instance of MailFrom.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/mailFrom.MailFrom */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/mailFrom.MailFrom */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ses.ReceiptFilter")
  @js.native
  class ReceiptFilter protected ()
    extends typings.pulumiAws.sesMod.ReceiptFilter {
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
    
    @JSImport("@pulumi/aws", "ses.ReceiptFilter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ReceiptFilter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.receiptFilterMod.ReceiptFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.receiptFilterMod.ReceiptFilter]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.receiptFilterMod.ReceiptFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.receiptFilterMod.ReceiptFilter]
    @scala.inline
    def get(name: String, id: Input[ID], state: ReceiptFilterState): typings.pulumiAws.receiptFilterMod.ReceiptFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.receiptFilterMod.ReceiptFilter]
    @scala.inline
    def get(name: String, id: Input[ID], state: ReceiptFilterState, opts: CustomResourceOptions): typings.pulumiAws.receiptFilterMod.ReceiptFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.receiptFilterMod.ReceiptFilter]
    
    /**
      * Returns true if the given object is an instance of ReceiptFilter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/receiptFilter.ReceiptFilter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/receiptFilter.ReceiptFilter */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ses.ReceiptRule")
  @js.native
  class ReceiptRule protected ()
    extends typings.pulumiAws.sesMod.ReceiptRule {
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
    
    @JSImport("@pulumi/aws", "ses.ReceiptRule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ReceiptRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.receiptRuleMod.ReceiptRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.receiptRuleMod.ReceiptRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.receiptRuleMod.ReceiptRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.receiptRuleMod.ReceiptRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: ReceiptRuleState): typings.pulumiAws.receiptRuleMod.ReceiptRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.receiptRuleMod.ReceiptRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: ReceiptRuleState, opts: CustomResourceOptions): typings.pulumiAws.receiptRuleMod.ReceiptRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.receiptRuleMod.ReceiptRule]
    
    /**
      * Returns true if the given object is an instance of ReceiptRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/receiptRule.ReceiptRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/receiptRule.ReceiptRule */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ses.ReceiptRuleSet")
  @js.native
  class ReceiptRuleSet protected ()
    extends typings.pulumiAws.sesMod.ReceiptRuleSet {
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
    
    @JSImport("@pulumi/aws", "ses.ReceiptRuleSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ReceiptRuleSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.receiptRuleSetMod.ReceiptRuleSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.receiptRuleSetMod.ReceiptRuleSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.receiptRuleSetMod.ReceiptRuleSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.receiptRuleSetMod.ReceiptRuleSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: ReceiptRuleSetState): typings.pulumiAws.receiptRuleSetMod.ReceiptRuleSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.receiptRuleSetMod.ReceiptRuleSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: ReceiptRuleSetState, opts: CustomResourceOptions): typings.pulumiAws.receiptRuleSetMod.ReceiptRuleSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.receiptRuleSetMod.ReceiptRuleSet]
    
    /**
      * Returns true if the given object is an instance of ReceiptRuleSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/receiptRuleSet.ReceiptRuleSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/receiptRuleSet.ReceiptRuleSet */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ses.Template")
  @js.native
  class Template protected ()
    extends typings.pulumiAws.sesMod.Template {
    /**
      * Create a Template resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TemplateArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: TemplateArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Template {
    
    @JSImport("@pulumi/aws", "ses.Template")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Template resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.templateMod.Template = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.templateMod.Template]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.templateMod.Template = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.templateMod.Template]
    @scala.inline
    def get(name: String, id: Input[ID], state: TemplateState): typings.pulumiAws.templateMod.Template = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.templateMod.Template]
    @scala.inline
    def get(name: String, id: Input[ID], state: TemplateState, opts: CustomResourceOptions): typings.pulumiAws.templateMod.Template = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.templateMod.Template]
    
    /**
      * Returns true if the given object is an instance of Template.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/template.Template */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/template.Template */ Boolean]
  }
}
