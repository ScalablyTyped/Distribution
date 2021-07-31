package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.enumsEc2Mod.PlacementStrategy
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placementGroupMod {
  
  @JSImport("@pulumi/aws/ec2/placementGroup", "PlacementGroup")
  @js.native
  class PlacementGroup protected () extends CustomResource {
    /**
      * Create a PlacementGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PlacementGroupArgs) = this()
    def this(name: String, args: PlacementGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the placement group.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name of the placement group.
      */
    val name: Output_[String] = js.native
    
    /**
      * The ID of the placement group.
      */
    val placementGroupId: Output_[String] = js.native
    
    /**
      * The placement strategy. Can be `"cluster"`, `"partition"` or `"spread"`.
      */
    val strategy: Output_[PlacementStrategy] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object PlacementGroup {
    
    @JSImport("@pulumi/aws/ec2/placementGroup", "PlacementGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PlacementGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): PlacementGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[PlacementGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): PlacementGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PlacementGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: PlacementGroupState): PlacementGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PlacementGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: PlacementGroupState, opts: CustomResourceOptions): PlacementGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PlacementGroup]
    
    /**
      * Returns true if the given object is an instance of PlacementGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/placementGroup.PlacementGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/placementGroup.PlacementGroup */ Boolean]
  }
  
  trait PlacementGroupArgs extends StObject {
    
    /**
      * The name of the placement group.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The placement strategy. Can be `"cluster"`, `"partition"` or `"spread"`.
      */
    val strategy: Input[PlacementStrategy]
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object PlacementGroupArgs {
    
    @scala.inline
    def apply(strategy: Input[PlacementStrategy]): PlacementGroupArgs = {
      val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlacementGroupArgs]
    }
    
    @scala.inline
    implicit class PlacementGroupArgsMutableBuilder[Self <: PlacementGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setStrategy(value: Input[PlacementStrategy]): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait PlacementGroupState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the placement group.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the placement group.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the placement group.
      */
    val placementGroupId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The placement strategy. Can be `"cluster"`, `"partition"` or `"spread"`.
      */
    val strategy: js.UndefOr[Input[PlacementStrategy]] = js.undefined
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object PlacementGroupState {
    
    @scala.inline
    def apply(): PlacementGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlacementGroupState]
    }
    
    @scala.inline
    implicit class PlacementGroupStateMutableBuilder[Self <: PlacementGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlacementGroupId(value: Input[String]): Self = StObject.set(x, "placementGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementGroupIdUndefined: Self = StObject.set(x, "placementGroupId", js.undefined)
      
      @scala.inline
      def setStrategy(value: Input[PlacementStrategy]): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
