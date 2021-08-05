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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
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
    
    @JSImport("@pulumi/aws/cfg/configurationAggregator", "ConfigurationAggregator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ConfigurationAggregator resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ConfigurationAggregator = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ConfigurationAggregator]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ConfigurationAggregator = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ConfigurationAggregator]
    inline def get(name: String, id: Input[ID], state: ConfigurationAggregatorState): ConfigurationAggregator = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ConfigurationAggregator]
    inline def get(name: String, id: Input[ID], state: ConfigurationAggregatorState, opts: CustomResourceOptions): ConfigurationAggregator = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ConfigurationAggregator]
    
    /**
      * Returns true if the given object is an instance of ConfigurationAggregator.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/configurationAggregator.ConfigurationAggregator */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cfg/configurationAggregator.ConfigurationAggregator */ Boolean]
  }
  
  trait ConfigurationAggregatorArgs extends StObject {
    
    /**
      * The account(s) to aggregate config data from as documented below.
      */
    val accountAggregationSource: js.UndefOr[
        Input[typings.pulumiAws.inputMod.cfg.ConfigurationAggregatorAccountAggregationSource]
      ] = js.undefined
    
    /**
      * The name of the configuration aggregator.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The organization to aggregate config data from as documented below.
      */
    val organizationAggregationSource: js.UndefOr[
        Input[
          typings.pulumiAws.inputMod.cfg.ConfigurationAggregatorOrganizationAggregationSource
        ]
      ] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object ConfigurationAggregatorArgs {
    
    inline def apply(): ConfigurationAggregatorArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationAggregatorArgs]
    }
    
    extension [Self <: ConfigurationAggregatorArgs](x: Self) {
      
      inline def setAccountAggregationSource(value: Input[typings.pulumiAws.inputMod.cfg.ConfigurationAggregatorAccountAggregationSource]): Self = StObject.set(x, "accountAggregationSource", value.asInstanceOf[js.Any])
      
      inline def setAccountAggregationSourceUndefined: Self = StObject.set(x, "accountAggregationSource", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOrganizationAggregationSource(
        value: Input[
              typings.pulumiAws.inputMod.cfg.ConfigurationAggregatorOrganizationAggregationSource
            ]
      ): Self = StObject.set(x, "organizationAggregationSource", value.asInstanceOf[js.Any])
      
      inline def setOrganizationAggregationSourceUndefined: Self = StObject.set(x, "organizationAggregationSource", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait ConfigurationAggregatorState extends StObject {
    
    /**
      * The account(s) to aggregate config data from as documented below.
      */
    val accountAggregationSource: js.UndefOr[
        Input[typings.pulumiAws.inputMod.cfg.ConfigurationAggregatorAccountAggregationSource]
      ] = js.undefined
    
    /**
      * The ARN of the aggregator
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the configuration aggregator.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The organization to aggregate config data from as documented below.
      */
    val organizationAggregationSource: js.UndefOr[
        Input[
          typings.pulumiAws.inputMod.cfg.ConfigurationAggregatorOrganizationAggregationSource
        ]
      ] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object ConfigurationAggregatorState {
    
    inline def apply(): ConfigurationAggregatorState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationAggregatorState]
    }
    
    extension [Self <: ConfigurationAggregatorState](x: Self) {
      
      inline def setAccountAggregationSource(value: Input[typings.pulumiAws.inputMod.cfg.ConfigurationAggregatorAccountAggregationSource]): Self = StObject.set(x, "accountAggregationSource", value.asInstanceOf[js.Any])
      
      inline def setAccountAggregationSourceUndefined: Self = StObject.set(x, "accountAggregationSource", js.undefined)
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOrganizationAggregationSource(
        value: Input[
              typings.pulumiAws.inputMod.cfg.ConfigurationAggregatorOrganizationAggregationSource
            ]
      ): Self = StObject.set(x, "organizationAggregationSource", value.asInstanceOf[js.Any])
      
      inline def setOrganizationAggregationSourceUndefined: Self = StObject.set(x, "organizationAggregationSource", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
