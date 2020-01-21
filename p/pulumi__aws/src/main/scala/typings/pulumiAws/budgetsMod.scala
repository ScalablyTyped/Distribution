package typings.pulumiAws

import typings.pulumiAws.budgetMod.BudgetArgs
import typings.pulumiAws.budgetMod.BudgetState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/budgets", JSImport.Namespace)
@js.native
object budgetsMod extends js.Object {
  @js.native
  class Budget protected ()
    extends typings.pulumiAws.budgetMod.Budget {
    /**
      * Create a Budget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BudgetArgs) = this()
    def this(name: String, args: BudgetArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Budget extends js.Object {
    /**
      * Get an existing Budget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.budgetMod.Budget = js.native
    def get(name: String, id: Input[ID], state: BudgetState): typings.pulumiAws.budgetMod.Budget = js.native
    def get(name: String, id: Input[ID], state: BudgetState, opts: CustomResourceOptions): typings.pulumiAws.budgetMod.Budget = js.native
    /**
      * Returns true if the given object is an instance of Budget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/budgets/budget.Budget */ Boolean = js.native
  }
  
}

