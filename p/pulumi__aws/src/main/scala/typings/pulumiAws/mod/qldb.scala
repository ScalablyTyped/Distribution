package typings.pulumiAws.mod

import typings.pulumiAws.getLedgerMod.GetLedgerArgs
import typings.pulumiAws.getLedgerMod.GetLedgerResult
import typings.pulumiAws.ledgerMod.LedgerArgs
import typings.pulumiAws.ledgerMod.LedgerState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object qldb {
  
  @JSImport("@pulumi/aws", "qldb.Ledger")
  @js.native
  class Ledger protected ()
    extends typings.pulumiAws.qldbMod.Ledger {
    /**
      * Create a Ledger resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: LedgerArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: LedgerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Ledger {
    
    /**
      * Get an existing Ledger resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "qldb.Ledger.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.ledgerMod.Ledger = js.native
    @JSImport("@pulumi/aws", "qldb.Ledger.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.ledgerMod.Ledger = js.native
    @JSImport("@pulumi/aws", "qldb.Ledger.get")
    @js.native
    def get(name: String, id: Input[ID], state: LedgerState): typings.pulumiAws.ledgerMod.Ledger = js.native
    @JSImport("@pulumi/aws", "qldb.Ledger.get")
    @js.native
    def get(name: String, id: Input[ID], state: LedgerState, opts: CustomResourceOptions): typings.pulumiAws.ledgerMod.Ledger = js.native
    
    /**
      * Returns true if the given object is an instance of Ledger.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "qldb.Ledger.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/qldb/ledger.Ledger */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "qldb.getLedger")
  @js.native
  def getLedger(args: GetLedgerArgs): js.Promise[GetLedgerResult] = js.native
  @JSImport("@pulumi/aws", "qldb.getLedger")
  @js.native
  def getLedger(args: GetLedgerArgs, opts: InvokeOptions): js.Promise[GetLedgerResult] = js.native
}
