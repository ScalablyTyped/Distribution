package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.guardduty.FilterFindingCriteria
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterMod {
  
  @JSImport("@pulumi/aws/guardduty/filter", "Filter")
  @js.native
  class Filter protected () extends CustomResource {
    /**
      * Create a Filter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FilterArgs) = this()
    def this(name: String, args: FilterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Specifies the action that is to be applied to the findings that match the filter. Can be one of `ARCHIVE` or `NOOP`.
      */
    val action: Output_[String] = js.native
    
    /**
      * The ARN of the GuardDuty filter.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Description of the filter.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * ID of a GuardDuty detector, attached to your account.
      */
    val detectorId: Output_[String] = js.native
    
    /**
      * Represents the criteria to be used in the filter for querying findings. Contains one or more `criterion` blocks, documented below.
      */
    val findingCriteria: Output_[FilterFindingCriteria] = js.native
    
    /**
      * The name of your filter.
      */
    val name: Output_[String] = js.native
    
    /**
      * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
      */
    val rank: Output_[Double] = js.native
    
    /**
      * The tags that you want to add to the Filter resource. A tag consists of a key and a value.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Filter {
    
    @JSImport("@pulumi/aws/guardduty/filter", "Filter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Filter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Filter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Filter]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Filter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Filter]
    inline def get(name: String, id: Input[ID], state: FilterState): Filter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Filter]
    inline def get(name: String, id: Input[ID], state: FilterState, opts: CustomResourceOptions): Filter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Filter]
    
    /**
      * Returns true if the given object is an instance of Filter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/filter.Filter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/guardduty/filter.Filter */ Boolean]
  }
  
  trait FilterArgs extends StObject {
    
    /**
      * Specifies the action that is to be applied to the findings that match the filter. Can be one of `ARCHIVE` or `NOOP`.
      */
    val action: Input[String]
    
    /**
      * Description of the filter.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ID of a GuardDuty detector, attached to your account.
      */
    val detectorId: Input[String]
    
    /**
      * Represents the criteria to be used in the filter for querying findings. Contains one or more `criterion` blocks, documented below.
      */
    val findingCriteria: Input[typings.pulumiAws.inputMod.guardduty.FilterFindingCriteria]
    
    /**
      * The name of your filter.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
      */
    val rank: Input[Double]
    
    /**
      * The tags that you want to add to the Filter resource. A tag consists of a key and a value.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object FilterArgs {
    
    inline def apply(
      action: Input[String],
      detectorId: Input[String],
      findingCriteria: Input[typings.pulumiAws.inputMod.guardduty.FilterFindingCriteria],
      rank: Input[Double]
    ): FilterArgs = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], detectorId = detectorId.asInstanceOf[js.Any], findingCriteria = findingCriteria.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterArgs]
    }
    
    extension [Self <: FilterArgs](x: Self) {
      
      inline def setAction(value: Input[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDetectorId(value: Input[String]): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
      
      inline def setFindingCriteria(value: Input[typings.pulumiAws.inputMod.guardduty.FilterFindingCriteria]): Self = StObject.set(x, "findingCriteria", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRank(value: Input[Double]): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait FilterState extends StObject {
    
    /**
      * Specifies the action that is to be applied to the findings that match the filter. Can be one of `ARCHIVE` or `NOOP`.
      */
    val action: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the GuardDuty filter.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Description of the filter.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ID of a GuardDuty detector, attached to your account.
      */
    val detectorId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Represents the criteria to be used in the filter for querying findings. Contains one or more `criterion` blocks, documented below.
      */
    val findingCriteria: js.UndefOr[Input[typings.pulumiAws.inputMod.guardduty.FilterFindingCriteria]] = js.undefined
    
    /**
      * The name of your filter.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
      */
    val rank: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The tags that you want to add to the Filter resource. A tag consists of a key and a value.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object FilterState {
    
    inline def apply(): FilterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterState]
    }
    
    extension [Self <: FilterState](x: Self) {
      
      inline def setAction(value: Input[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDetectorId(value: Input[String]): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
      
      inline def setDetectorIdUndefined: Self = StObject.set(x, "detectorId", js.undefined)
      
      inline def setFindingCriteria(value: Input[typings.pulumiAws.inputMod.guardduty.FilterFindingCriteria]): Self = StObject.set(x, "findingCriteria", value.asInstanceOf[js.Any])
      
      inline def setFindingCriteriaUndefined: Self = StObject.set(x, "findingCriteria", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRank(value: Input[Double]): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
      
      inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
