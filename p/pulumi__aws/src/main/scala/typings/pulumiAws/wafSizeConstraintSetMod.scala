package typings.pulumiAws

import typings.pulumiAws.outputMod.waf.SizeConstraintSetSizeConstraint
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wafSizeConstraintSetMod {
  
  @JSImport("@pulumi/aws/waf/sizeConstraintSet", "SizeConstraintSet")
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
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: SizeConstraintSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN)
      */
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
    
    /**
      * Get an existing SizeConstraintSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/waf/sizeConstraintSet", "SizeConstraintSet.get")
    @js.native
    def get(name: String, id: Input[ID]): SizeConstraintSet = js.native
    @JSImport("@pulumi/aws/waf/sizeConstraintSet", "SizeConstraintSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SizeConstraintSet = js.native
    @JSImport("@pulumi/aws/waf/sizeConstraintSet", "SizeConstraintSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: SizeConstraintSetState): SizeConstraintSet = js.native
    @JSImport("@pulumi/aws/waf/sizeConstraintSet", "SizeConstraintSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: SizeConstraintSetState, opts: CustomResourceOptions): SizeConstraintSet = js.native
    
    /**
      * Returns true if the given object is an instance of SizeConstraintSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/waf/sizeConstraintSet", "SizeConstraintSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/sizeConstraintSet.SizeConstraintSet */ Boolean = js.native
  }
  
  @js.native
  trait SizeConstraintSetArgs extends StObject {
    
    /**
      * The name or description of the Size Constraint Set.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the parts of web requests that you want to inspect the size of.
      */
    val sizeConstraints: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.waf.SizeConstraintSetSizeConstraint]]]
      ] = js.native
  }
  object SizeConstraintSetArgs {
    
    @scala.inline
    def apply(): SizeConstraintSetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeConstraintSetArgs]
    }
    
    @scala.inline
    implicit class SizeConstraintSetArgsMutableBuilder[Self <: SizeConstraintSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSizeConstraints(value: Input[js.Array[Input[typings.pulumiAws.inputMod.waf.SizeConstraintSetSizeConstraint]]]): Self = StObject.set(x, "sizeConstraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeConstraintsUndefined: Self = StObject.set(x, "sizeConstraints", js.undefined)
      
      @scala.inline
      def setSizeConstraintsVarargs(value: Input[typings.pulumiAws.inputMod.waf.SizeConstraintSetSizeConstraint]*): Self = StObject.set(x, "sizeConstraints", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SizeConstraintSetState extends StObject {
    
    /**
      * Amazon Resource Name (ARN)
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name or description of the Size Constraint Set.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the parts of web requests that you want to inspect the size of.
      */
    val sizeConstraints: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.waf.SizeConstraintSetSizeConstraint]]]
      ] = js.native
  }
  object SizeConstraintSetState {
    
    @scala.inline
    def apply(): SizeConstraintSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeConstraintSetState]
    }
    
    @scala.inline
    implicit class SizeConstraintSetStateMutableBuilder[Self <: SizeConstraintSetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSizeConstraints(value: Input[js.Array[Input[typings.pulumiAws.inputMod.waf.SizeConstraintSetSizeConstraint]]]): Self = StObject.set(x, "sizeConstraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeConstraintsUndefined: Self = StObject.set(x, "sizeConstraints", js.undefined)
      
      @scala.inline
      def setSizeConstraintsVarargs(value: Input[typings.pulumiAws.inputMod.waf.SizeConstraintSetSizeConstraint]*): Self = StObject.set(x, "sizeConstraints", js.Array(value :_*))
    }
  }
}
