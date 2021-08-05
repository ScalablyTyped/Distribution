package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.imagebuilder.DistributionConfigurationDistribution
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributionConfigurationMod {
  
  @JSImport("@pulumi/aws/imagebuilder/distributionConfiguration", "DistributionConfiguration")
  @js.native
  class DistributionConfiguration protected () extends CustomResource {
    /**
      * Create a DistributionConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DistributionConfigurationArgs) = this()
    def this(name: String, args: DistributionConfigurationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * (Required) Amazon Resource Name (ARN) of the distribution configuration.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Date the distribution configuration was created.
      */
    val dateCreated: Output_[String] = js.native
    
    /**
      * Date the distribution configuration was updated.
      */
    val dateUpdated: Output_[String] = js.native
    
    /**
      * Description to apply to the distributed AMI.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * One or more configuration blocks with distribution settings. Detailed below.
      */
    val distributions: Output_[js.Array[DistributionConfigurationDistribution]] = js.native
    
    /**
      * Name to apply to the distributed AMI.
      */
    val name: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags for the distribution configuration.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object DistributionConfiguration {
    
    @JSImport("@pulumi/aws/imagebuilder/distributionConfiguration", "DistributionConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DistributionConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): DistributionConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[DistributionConfiguration]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): DistributionConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DistributionConfiguration]
    inline def get(name: String, id: Input[ID], state: DistributionConfigurationState): DistributionConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[DistributionConfiguration]
    inline def get(name: String, id: Input[ID], state: DistributionConfigurationState, opts: CustomResourceOptions): DistributionConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DistributionConfiguration]
    
    /**
      * Returns true if the given object is an instance of DistributionConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/imagebuilder/distributionConfiguration.DistributionConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/imagebuilder/distributionConfiguration.DistributionConfiguration */ Boolean]
  }
  
  trait DistributionConfigurationArgs extends StObject {
    
    /**
      * Description to apply to the distributed AMI.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * One or more configuration blocks with distribution settings. Detailed below.
      */
    val distributions: Input[
        js.Array[
          Input[typings.pulumiAws.inputMod.imagebuilder.DistributionConfigurationDistribution]
        ]
      ]
    
    /**
      * Name to apply to the distributed AMI.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags for the distribution configuration.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object DistributionConfigurationArgs {
    
    inline def apply(
      distributions: Input[
          js.Array[
            Input[typings.pulumiAws.inputMod.imagebuilder.DistributionConfigurationDistribution]
          ]
        ]
    ): DistributionConfigurationArgs = {
      val __obj = js.Dynamic.literal(distributions = distributions.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistributionConfigurationArgs]
    }
    
    extension [Self <: DistributionConfigurationArgs](x: Self) {
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDistributions(
        value: Input[
              js.Array[
                Input[typings.pulumiAws.inputMod.imagebuilder.DistributionConfigurationDistribution]
              ]
            ]
      ): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
      
      inline def setDistributionsVarargs(value: Input[typings.pulumiAws.inputMod.imagebuilder.DistributionConfigurationDistribution]*): Self = StObject.set(x, "distributions", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait DistributionConfigurationState extends StObject {
    
    /**
      * (Required) Amazon Resource Name (ARN) of the distribution configuration.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Date the distribution configuration was created.
      */
    val dateCreated: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Date the distribution configuration was updated.
      */
    val dateUpdated: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Description to apply to the distributed AMI.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * One or more configuration blocks with distribution settings. Detailed below.
      */
    val distributions: js.UndefOr[
        Input[
          js.Array[
            Input[typings.pulumiAws.inputMod.imagebuilder.DistributionConfigurationDistribution]
          ]
        ]
      ] = js.undefined
    
    /**
      * Name to apply to the distributed AMI.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags for the distribution configuration.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object DistributionConfigurationState {
    
    inline def apply(): DistributionConfigurationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributionConfigurationState]
    }
    
    extension [Self <: DistributionConfigurationState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDateCreated(value: Input[String]): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
      
      inline def setDateUpdated(value: Input[String]): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
      
      inline def setDateUpdatedUndefined: Self = StObject.set(x, "dateUpdated", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDistributions(
        value: Input[
              js.Array[
                Input[typings.pulumiAws.inputMod.imagebuilder.DistributionConfigurationDistribution]
              ]
            ]
      ): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
      
      inline def setDistributionsUndefined: Self = StObject.set(x, "distributions", js.undefined)
      
      inline def setDistributionsVarargs(value: Input[typings.pulumiAws.inputMod.imagebuilder.DistributionConfigurationDistribution]*): Self = StObject.set(x, "distributions", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
