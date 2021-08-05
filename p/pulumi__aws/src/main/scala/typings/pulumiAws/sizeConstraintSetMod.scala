package typings.pulumiAws

import typings.pulumiAws.outputMod.wafregional.SizeConstraintSetSizeConstraint
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sizeConstraintSetMod {
  
  @JSImport("@pulumi/aws/wafregional/sizeConstraintSet", "SizeConstraintSet")
  @js.native
  class SizeConstraintSet protected () extends CustomResource {
    /**
      * Create a SizeConstraintSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: SizeConstraintSetArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: SizeConstraintSetArgs, opts: CustomResourceOptions) = this()
    
    val arn: Output_[String] = js.native
    
    /**
      * The name or description of the Size Constraint Set.
      */
    val name: Output_[String] = js.native
    
    /**
      * Specifies the parts of web requests that you want to inspect the size of.
      */
    val sizeConstraints: Output_[js.UndefOr[js.Array[SizeConstraintSetSizeConstraint]]] = js.native
  }
  /* static members */
  object SizeConstraintSet {
    
    @JSImport("@pulumi/aws/wafregional/sizeConstraintSet", "SizeConstraintSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SizeConstraintSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): SizeConstraintSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SizeConstraintSet]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): SizeConstraintSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SizeConstraintSet]
    inline def get(name: String, id: Input[ID], state: SizeConstraintSetState): SizeConstraintSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SizeConstraintSet]
    inline def get(name: String, id: Input[ID], state: SizeConstraintSetState, opts: CustomResourceOptions): SizeConstraintSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SizeConstraintSet]
    
    /**
      * Returns true if the given object is an instance of SizeConstraintSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/sizeConstraintSet.SizeConstraintSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/wafregional/sizeConstraintSet.SizeConstraintSet */ Boolean]
  }
  
  trait SizeConstraintSetArgs extends StObject {
    
    /**
      * The name or description of the Size Constraint Set.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the parts of web requests that you want to inspect the size of.
      */
    val sizeConstraints: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.wafregional.SizeConstraintSetSizeConstraint]]
        ]
      ] = js.undefined
  }
  object SizeConstraintSetArgs {
    
    inline def apply(): SizeConstraintSetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeConstraintSetArgs]
    }
    
    extension [Self <: SizeConstraintSetArgs](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSizeConstraints(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.wafregional.SizeConstraintSetSizeConstraint]]
            ]
      ): Self = StObject.set(x, "sizeConstraints", value.asInstanceOf[js.Any])
      
      inline def setSizeConstraintsUndefined: Self = StObject.set(x, "sizeConstraints", js.undefined)
      
      inline def setSizeConstraintsVarargs(value: Input[typings.pulumiAws.inputMod.wafregional.SizeConstraintSetSizeConstraint]*): Self = StObject.set(x, "sizeConstraints", js.Array(value :_*))
    }
  }
  
  trait SizeConstraintSetState extends StObject {
    
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name or description of the Size Constraint Set.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the parts of web requests that you want to inspect the size of.
      */
    val sizeConstraints: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.wafregional.SizeConstraintSetSizeConstraint]]
        ]
      ] = js.undefined
  }
  object SizeConstraintSetState {
    
    inline def apply(): SizeConstraintSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeConstraintSetState]
    }
    
    extension [Self <: SizeConstraintSetState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSizeConstraints(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.wafregional.SizeConstraintSetSizeConstraint]]
            ]
      ): Self = StObject.set(x, "sizeConstraints", value.asInstanceOf[js.Any])
      
      inline def setSizeConstraintsUndefined: Self = StObject.set(x, "sizeConstraints", js.undefined)
      
      inline def setSizeConstraintsVarargs(value: Input[typings.pulumiAws.inputMod.wafregional.SizeConstraintSetSizeConstraint]*): Self = StObject.set(x, "sizeConstraints", js.Array(value :_*))
    }
  }
}
