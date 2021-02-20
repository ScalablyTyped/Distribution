package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing ActiveReceiptRuleSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ses/activeReceiptRuleSet", "ActiveReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID]): ActiveReceiptRuleSet = js.native
    @JSImport("@pulumi/aws/ses/activeReceiptRuleSet", "ActiveReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ActiveReceiptRuleSet = js.native
    @JSImport("@pulumi/aws/ses/activeReceiptRuleSet", "ActiveReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ActiveReceiptRuleSetState): ActiveReceiptRuleSet = js.native
    @JSImport("@pulumi/aws/ses/activeReceiptRuleSet", "ActiveReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ActiveReceiptRuleSetState, opts: CustomResourceOptions): ActiveReceiptRuleSet = js.native
    
    /**
      * Returns true if the given object is an instance of ActiveReceiptRuleSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses/activeReceiptRuleSet", "ActiveReceiptRuleSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/activeReceiptRuleSet.ActiveReceiptRuleSet */ Boolean = js.native
  }
  
  @js.native
  trait ActiveReceiptRuleSetArgs extends StObject {
    
    /**
      * The name of the rule set
      */
    val ruleSetName: Input[String] = js.native
  }
  object ActiveReceiptRuleSetArgs {
    
    @scala.inline
    def apply(ruleSetName: Input[String]): ActiveReceiptRuleSetArgs = {
      val __obj = js.Dynamic.literal(ruleSetName = ruleSetName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActiveReceiptRuleSetArgs]
    }
    
    @scala.inline
    implicit class ActiveReceiptRuleSetArgsMutableBuilder[Self <: ActiveReceiptRuleSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRuleSetName(value: Input[String]): Self = StObject.set(x, "ruleSetName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ActiveReceiptRuleSetState extends StObject {
    
    /**
      * The name of the rule set
      */
    val ruleSetName: js.UndefOr[Input[String]] = js.native
  }
  object ActiveReceiptRuleSetState {
    
    @scala.inline
    def apply(): ActiveReceiptRuleSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActiveReceiptRuleSetState]
    }
    
    @scala.inline
    implicit class ActiveReceiptRuleSetStateMutableBuilder[Self <: ActiveReceiptRuleSetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRuleSetName(value: Input[String]): Self = StObject.set(x, "ruleSetName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleSetNameUndefined: Self = StObject.set(x, "ruleSetName", js.undefined)
    }
  }
}
