package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.cfg.ConfigurationAggregatorAccountAggregationSource
import typings.pulumiAws.outputMod.cfg.ConfigurationAggregatorOrganizationAggregationSource
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationAggregatorMod {
  
  @JSImport("@pulumi/aws/cfg/configurationAggregator", "ConfigurationAggregator")
  @js.native
  class ConfigurationAggregator protected () extends CustomResource {
    /**
      * Create a ConfigurationAggregator resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ConfigurationAggregatorArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ConfigurationAggregatorArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The account(s) to aggregate config data from as documented below.
      */
    val accountAggregationSource: Output_[js.UndefOr[ConfigurationAggregatorAccountAggregationSource]] = js.native
    
    /**
      * The ARN of the aggregator
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name of the configuration aggregator.
      */
    val name: Output_[String] = js.native
    
    /**
      * The organization to aggregate config data from as documented below.
      */
    val organizationAggregationSource: Output_[js.UndefOr[ConfigurationAggregatorOrganizationAggregationSource]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object ConfigurationAggregator {
    
    /**
      * Get an existing ConfigurationAggregator resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cfg/configurationAggregator", "ConfigurationAggregator.get")
    @js.native
    def get(name: String, id: Input[ID]): ConfigurationAggregator = js.native
    @JSImport("@pulumi/aws/cfg/configurationAggregator", "ConfigurationAggregator.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ConfigurationAggregator = js.native
    @JSImport("@pulumi/aws/cfg/configurationAggregator", "ConfigurationAggregator.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfigurationAggregatorState): ConfigurationAggregator = js.native
    @JSImport("@pulumi/aws/cfg/configurationAggregator", "ConfigurationAggregator.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfigurationAggregatorState, opts: CustomResourceOptions): ConfigurationAggregator = js.native
    
    /**
      * Returns true if the given object is an instance of ConfigurationAggregator.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cfg/configurationAggregator", "ConfigurationAggregator.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/configurationAggregator.ConfigurationAggregator */ Boolean = js.native
  }
  
  @js.native
  trait ConfigurationAggregatorArgs extends StObject {
    
    /**
      * The account(s) to aggregate config data from as documented below.
      */
    val accountAggregationSource: js.UndefOr[
        Input[typings.pulumiAws.inputMod.cfg.ConfigurationAggregatorAccountAggregationSource]
      ] = js.native
    
    /**
      * The name of the configuration aggregator.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The organization to aggregate config data from as documented below.
      */
    val organizationAggregationSource: js.UndefOr[
        Input[
          typings.pulumiAws.inputMod.cfg.ConfigurationAggregatorOrganizationAggregationSource
        ]
      ] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ConfigurationAggregatorArgs {
    
    @scala.inline
    def apply(): ConfigurationAggregatorArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationAggregatorArgs]
    }
    
    @scala.inline
    implicit class ConfigurationAggregatorArgsMutableBuilder[Self <: ConfigurationAggregatorArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountAggregationSource(value: Input[typings.pulumiAws.inputMod.cfg.ConfigurationAggregatorAccountAggregationSource]): Self = StObject.set(x, "accountAggregationSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountAggregationSourceUndefined: Self = StObject.set(x, "accountAggregationSource", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOrganizationAggregationSource(
        value: Input[
              typings.pulumiAws.inputMod.cfg.ConfigurationAggregatorOrganizationAggregationSource
            ]
      ): Self = StObject.set(x, "organizationAggregationSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganizationAggregationSourceUndefined: Self = StObject.set(x, "organizationAggregationSource", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait ConfigurationAggregatorState extends StObject {
    
    /**
      * The account(s) to aggregate config data from as documented below.
      */
    val accountAggregationSource: js.UndefOr[
        Input[typings.pulumiAws.inputMod.cfg.ConfigurationAggregatorAccountAggregationSource]
      ] = js.native
    
    /**
      * The ARN of the aggregator
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the configuration aggregator.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The organization to aggregate config data from as documented below.
      */
    val organizationAggregationSource: js.UndefOr[
        Input[
          typings.pulumiAws.inputMod.cfg.ConfigurationAggregatorOrganizationAggregationSource
        ]
      ] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ConfigurationAggregatorState {
    
    @scala.inline
    def apply(): ConfigurationAggregatorState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationAggregatorState]
    }
    
    @scala.inline
    implicit class ConfigurationAggregatorStateMutableBuilder[Self <: ConfigurationAggregatorState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountAggregationSource(value: Input[typings.pulumiAws.inputMod.cfg.ConfigurationAggregatorAccountAggregationSource]): Self = StObject.set(x, "accountAggregationSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountAggregationSourceUndefined: Self = StObject.set(x, "accountAggregationSource", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOrganizationAggregationSource(
        value: Input[
              typings.pulumiAws.inputMod.cfg.ConfigurationAggregatorOrganizationAggregationSource
            ]
      ): Self = StObject.set(x, "organizationAggregationSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganizationAggregationSourceUndefined: Self = StObject.set(x, "organizationAggregationSource", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
