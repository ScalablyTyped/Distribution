package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object receiptRuleSetMod {
  
  @JSImport("@pulumi/aws/ses/receiptRuleSet", "ReceiptRuleSet")
  @js.native
  class ReceiptRuleSet protected () extends CustomResource {
    /**
      * Create a ReceiptRuleSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReceiptRuleSetArgs) = this()
    def this(name: String, args: ReceiptRuleSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the rule set
      */
    val ruleSetName: Output_[String] = js.native
  }
  /* static members */
  object ReceiptRuleSet {
    
    @JSImport("@pulumi/aws/ses/receiptRuleSet", "ReceiptRuleSet")
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
    def get(name: String, id: Input[ID]): ReceiptRuleSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ReceiptRuleSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ReceiptRuleSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReceiptRuleSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: ReceiptRuleSetState): ReceiptRuleSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ReceiptRuleSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: ReceiptRuleSetState, opts: CustomResourceOptions): ReceiptRuleSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReceiptRuleSet]
    
    /**
      * Returns true if the given object is an instance of ReceiptRuleSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/receiptRuleSet.ReceiptRuleSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/receiptRuleSet.ReceiptRuleSet */ Boolean]
  }
  
  trait ReceiptRuleSetArgs extends StObject {
    
    /**
      * The name of the rule set
      */
    val ruleSetName: Input[String]
  }
  object ReceiptRuleSetArgs {
    
    @scala.inline
    def apply(ruleSetName: Input[String]): ReceiptRuleSetArgs = {
      val __obj = js.Dynamic.literal(ruleSetName = ruleSetName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleSetArgs]
    }
    
    @scala.inline
    implicit class ReceiptRuleSetArgsMutableBuilder[Self <: ReceiptRuleSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRuleSetName(value: Input[String]): Self = StObject.set(x, "ruleSetName", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReceiptRuleSetState extends StObject {
    
    /**
      * The name of the rule set
      */
    val ruleSetName: js.UndefOr[Input[String]] = js.undefined
  }
  object ReceiptRuleSetState {
    
    @scala.inline
    def apply(): ReceiptRuleSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReceiptRuleSetState]
    }
    
    @scala.inline
    implicit class ReceiptRuleSetStateMutableBuilder[Self <: ReceiptRuleSetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRuleSetName(value: Input[String]): Self = StObject.set(x, "ruleSetName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleSetNameUndefined: Self = StObject.set(x, "ruleSetName", js.undefined)
    }
  }
}
