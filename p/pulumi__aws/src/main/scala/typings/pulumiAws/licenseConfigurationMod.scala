package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object licenseConfigurationMod {
  
  @JSImport("@pulumi/aws/licensemanager/licenseConfiguration", "LicenseConfiguration")
  @js.native
  class LicenseConfiguration protected () extends CustomResource {
    /**
      * Create a LicenseConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LicenseConfigurationArgs) = this()
    def this(name: String, args: LicenseConfigurationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Description of the license configuration.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Number of licenses managed by the license configuration.
      */
    val licenseCount: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * Sets the number of available licenses as a hard limit.
      */
    val licenseCountHardLimit: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Dimension to use to track license inventory. Specify either `vCPU`, `Instance`, `Core` or `Socket`.
      */
    val licenseCountingType: Output_[String] = js.native
    
    /**
      * Array of configured License Manager rules.
      */
    val licenseRules: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Name of the license configuration.
      */
    val name: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object LicenseConfiguration {
    
    @JSImport("@pulumi/aws/licensemanager/licenseConfiguration", "LicenseConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LicenseConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): LicenseConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[LicenseConfiguration]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): LicenseConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LicenseConfiguration]
    @scala.inline
    def get(name: String, id: Input[ID], state: LicenseConfigurationState): LicenseConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[LicenseConfiguration]
    @scala.inline
    def get(name: String, id: Input[ID], state: LicenseConfigurationState, opts: CustomResourceOptions): LicenseConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LicenseConfiguration]
    
    /**
      * Returns true if the given object is an instance of LicenseConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/licensemanager/licenseConfiguration.LicenseConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/licensemanager/licenseConfiguration.LicenseConfiguration */ Boolean]
  }
  
  trait LicenseConfigurationArgs extends StObject {
    
    /**
      * Description of the license configuration.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Number of licenses managed by the license configuration.
      */
    val licenseCount: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Sets the number of available licenses as a hard limit.
      */
    val licenseCountHardLimit: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Dimension to use to track license inventory. Specify either `vCPU`, `Instance`, `Core` or `Socket`.
      */
    val licenseCountingType: Input[String]
    
    /**
      * Array of configured License Manager rules.
      */
    val licenseRules: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Name of the license configuration.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object LicenseConfigurationArgs {
    
    @scala.inline
    def apply(licenseCountingType: Input[String]): LicenseConfigurationArgs = {
      val __obj = js.Dynamic.literal(licenseCountingType = licenseCountingType.asInstanceOf[js.Any])
      __obj.asInstanceOf[LicenseConfigurationArgs]
    }
    
    @scala.inline
    implicit class LicenseConfigurationArgsMutableBuilder[Self <: LicenseConfigurationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setLicenseCount(value: Input[Double]): Self = StObject.set(x, "licenseCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseCountHardLimit(value: Input[Boolean]): Self = StObject.set(x, "licenseCountHardLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseCountHardLimitUndefined: Self = StObject.set(x, "licenseCountHardLimit", js.undefined)
      
      @scala.inline
      def setLicenseCountUndefined: Self = StObject.set(x, "licenseCount", js.undefined)
      
      @scala.inline
      def setLicenseCountingType(value: Input[String]): Self = StObject.set(x, "licenseCountingType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseRules(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "licenseRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseRulesUndefined: Self = StObject.set(x, "licenseRules", js.undefined)
      
      @scala.inline
      def setLicenseRulesVarargs(value: Input[String]*): Self = StObject.set(x, "licenseRules", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait LicenseConfigurationState extends StObject {
    
    /**
      * Description of the license configuration.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Number of licenses managed by the license configuration.
      */
    val licenseCount: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Sets the number of available licenses as a hard limit.
      */
    val licenseCountHardLimit: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Dimension to use to track license inventory. Specify either `vCPU`, `Instance`, `Core` or `Socket`.
      */
    val licenseCountingType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Array of configured License Manager rules.
      */
    val licenseRules: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Name of the license configuration.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object LicenseConfigurationState {
    
    @scala.inline
    def apply(): LicenseConfigurationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LicenseConfigurationState]
    }
    
    @scala.inline
    implicit class LicenseConfigurationStateMutableBuilder[Self <: LicenseConfigurationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setLicenseCount(value: Input[Double]): Self = StObject.set(x, "licenseCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseCountHardLimit(value: Input[Boolean]): Self = StObject.set(x, "licenseCountHardLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseCountHardLimitUndefined: Self = StObject.set(x, "licenseCountHardLimit", js.undefined)
      
      @scala.inline
      def setLicenseCountUndefined: Self = StObject.set(x, "licenseCount", js.undefined)
      
      @scala.inline
      def setLicenseCountingType(value: Input[String]): Self = StObject.set(x, "licenseCountingType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseCountingTypeUndefined: Self = StObject.set(x, "licenseCountingType", js.undefined)
      
      @scala.inline
      def setLicenseRules(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "licenseRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseRulesUndefined: Self = StObject.set(x, "licenseRules", js.undefined)
      
      @scala.inline
      def setLicenseRulesVarargs(value: Input[String]*): Self = StObject.set(x, "licenseRules", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
