package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object organizationConfigurationMod {
  
  @JSImport("@pulumi/aws/guardduty/organizationConfiguration", "OrganizationConfiguration")
  @js.native
  class OrganizationConfiguration protected () extends CustomResource {
    /**
      * Create a OrganizationConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: OrganizationConfigurationArgs) = this()
    def this(name: String, args: OrganizationConfigurationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * When this setting is enabled, all new accounts that are created in, or added to, the organization are added as a member accounts of the organization’s GuardDuty delegated administrator and GuardDuty is enabled in that AWS Region.
      */
    val autoEnable: Output_[Boolean] = js.native
    
    /**
      * The detector ID of the GuardDuty account.
      */
    val detectorId: Output_[String] = js.native
  }
  /* static members */
  object OrganizationConfiguration {
    
    @JSImport("@pulumi/aws/guardduty/organizationConfiguration", "OrganizationConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing OrganizationConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): OrganizationConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[OrganizationConfiguration]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): OrganizationConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[OrganizationConfiguration]
    @scala.inline
    def get(name: String, id: Input[ID], state: OrganizationConfigurationState): OrganizationConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[OrganizationConfiguration]
    @scala.inline
    def get(name: String, id: Input[ID], state: OrganizationConfigurationState, opts: CustomResourceOptions): OrganizationConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[OrganizationConfiguration]
    
    /**
      * Returns true if the given object is an instance of OrganizationConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/organizationConfiguration.OrganizationConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/guardduty/organizationConfiguration.OrganizationConfiguration */ Boolean]
  }
  
  trait OrganizationConfigurationArgs extends StObject {
    
    /**
      * When this setting is enabled, all new accounts that are created in, or added to, the organization are added as a member accounts of the organization’s GuardDuty delegated administrator and GuardDuty is enabled in that AWS Region.
      */
    val autoEnable: Input[Boolean]
    
    /**
      * The detector ID of the GuardDuty account.
      */
    val detectorId: Input[String]
  }
  object OrganizationConfigurationArgs {
    
    @scala.inline
    def apply(autoEnable: Input[Boolean], detectorId: Input[String]): OrganizationConfigurationArgs = {
      val __obj = js.Dynamic.literal(autoEnable = autoEnable.asInstanceOf[js.Any], detectorId = detectorId.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrganizationConfigurationArgs]
    }
    
    @scala.inline
    implicit class OrganizationConfigurationArgsMutableBuilder[Self <: OrganizationConfigurationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoEnable(value: Input[Boolean]): Self = StObject.set(x, "autoEnable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectorId(value: Input[String]): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    }
  }
  
  trait OrganizationConfigurationState extends StObject {
    
    /**
      * When this setting is enabled, all new accounts that are created in, or added to, the organization are added as a member accounts of the organization’s GuardDuty delegated administrator and GuardDuty is enabled in that AWS Region.
      */
    val autoEnable: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The detector ID of the GuardDuty account.
      */
    val detectorId: js.UndefOr[Input[String]] = js.undefined
  }
  object OrganizationConfigurationState {
    
    @scala.inline
    def apply(): OrganizationConfigurationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrganizationConfigurationState]
    }
    
    @scala.inline
    implicit class OrganizationConfigurationStateMutableBuilder[Self <: OrganizationConfigurationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoEnable(value: Input[Boolean]): Self = StObject.set(x, "autoEnable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoEnableUndefined: Self = StObject.set(x, "autoEnable", js.undefined)
      
      @scala.inline
      def setDetectorId(value: Input[String]): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectorIdUndefined: Self = StObject.set(x, "detectorId", js.undefined)
    }
  }
}
