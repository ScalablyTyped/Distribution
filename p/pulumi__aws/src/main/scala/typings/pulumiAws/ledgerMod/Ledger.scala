package typings.pulumiAws.ledgerMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/qldb/ledger", "Ledger")
@js.native
class Ledger protected () extends CustomResource {
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
  /**
    * The ARN of the QLDB Ledger
    */
  val arn: Output_[String] = js.native
  val deletionProtection: Output_[js.UndefOr[Boolean]] = js.native
  val name: Output_[String] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/qldb/ledger", "Ledger")
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
  def get(name: String, id: Input[ID]): Ledger = js.native
  def get(name: String, id: Input[ID], state: LedgerState): Ledger = js.native
  def get(name: String, id: Input[ID], state: LedgerState, opts: CustomResourceOptions): Ledger = js.native
  /**
    * Returns true if the given object is an instance of Ledger.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/qldb/ledger.Ledger */ Boolean = js.native
}

