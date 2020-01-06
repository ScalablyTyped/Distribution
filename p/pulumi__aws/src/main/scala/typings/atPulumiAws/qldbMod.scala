package typings.atPulumiAws

import typings.atPulumiAws.qldbGetLedgerMod.GetLedgerArgs
import typings.atPulumiAws.qldbGetLedgerMod.GetLedgerResult
import typings.atPulumiAws.qldbLedgerMod.LedgerArgs
import typings.atPulumiAws.qldbLedgerMod.LedgerState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/qldb", JSImport.Namespace)
@js.native
object qldbMod extends js.Object {
  @js.native
  class Ledger protected ()
    extends typings.atPulumiAws.qldbLedgerMod.Ledger {
    /**
      * Create a Ledger resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: LedgerArgs) = this()
    def this(name: String, args: LedgerArgs, opts: CustomResourceOptions) = this()
  }
  
  def getLedger(args: GetLedgerArgs): js.Promise[GetLedgerResult] with GetLedgerResult = js.native
  def getLedger(args: GetLedgerArgs, opts: InvokeOptions): js.Promise[GetLedgerResult] with GetLedgerResult = js.native
  /* static members */
  @js.native
  object Ledger extends js.Object {
    /**
      * Get an existing Ledger resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.qldbLedgerMod.Ledger = js.native
    def get(name: String, id: Input[ID], state: LedgerState): typings.atPulumiAws.qldbLedgerMod.Ledger = js.native
    def get(name: String, id: Input[ID], state: LedgerState, opts: CustomResourceOptions): typings.atPulumiAws.qldbLedgerMod.Ledger = js.native
    /**
      * Returns true if the given object is an instance of Ledger.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/qldb/ledger.Ledger */ Boolean = js.native
  }
  
}

