package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activeReceiptRuleSetMod {
  
  @JSImport("@pulumi/aws/ses/activeReceiptRuleSet", "ActiveReceiptRuleSet")
  @js.native
  class ActiveReceiptRuleSet protected () extends CustomResource {
    /**
      * Create a ActiveReceiptRuleSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ActiveReceiptRuleSetArgs) = this()
    def this(name: String, args: ActiveReceiptRuleSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the rule set
      */
    val ruleSetName: Output_[String] = js.native
  }
  /* static members */
  object ActiveReceiptRuleSet {
    
    @JSImport("@pulumi/aws/ses/activeReceiptRuleSet", "ActiveReceiptRuleSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ActiveReceiptRuleSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ActiveReceiptRuleSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ActiveReceiptRuleSet]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ActiveReceiptRuleSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ActiveReceiptRuleSet]
    inline def get(name: String, id: Input[ID], state: ActiveReceiptRuleSetState): ActiveReceiptRuleSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ActiveReceiptRuleSet]
    inline def get(name: String, id: Input[ID], state: ActiveReceiptRuleSetState, opts: CustomResourceOptions): ActiveReceiptRuleSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ActiveReceiptRuleSet]
    
    /**
      * Returns true if the given object is an instance of ActiveReceiptRuleSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/activeReceiptRuleSet.ActiveReceiptRuleSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/activeReceiptRuleSet.ActiveReceiptRuleSet */ Boolean]
  }
  
  trait ActiveReceiptRuleSetArgs extends StObject {
    
    /**
      * The name of the rule set
      */
    val ruleSetName: Input[String]
  }
  object ActiveReceiptRuleSetArgs {
    
    inline def apply(ruleSetName: Input[String]): ActiveReceiptRuleSetArgs = {
      val __obj = js.Dynamic.literal(ruleSetName = ruleSetName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActiveReceiptRuleSetArgs]
    }
    
    extension [Self <: ActiveReceiptRuleSetArgs](x: Self) {
      
      inline def setRuleSetName(value: Input[String]): Self = StObject.set(x, "ruleSetName", value.asInstanceOf[js.Any])
    }
  }
  
  trait ActiveReceiptRuleSetState extends StObject {
    
    /**
      * The name of the rule set
      */
    val ruleSetName: js.UndefOr[Input[String]] = js.undefined
  }
  object ActiveReceiptRuleSetState {
    
    inline def apply(): ActiveReceiptRuleSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActiveReceiptRuleSetState]
    }
    
    extension [Self <: ActiveReceiptRuleSetState](x: Self) {
      
      inline def setRuleSetName(value: Input[String]): Self = StObject.set(x, "ruleSetName", value.asInstanceOf[js.Any])
      
      inline def setRuleSetNameUndefined: Self = StObject.set(x, "ruleSetName", js.undefined)
    }
  }
}
