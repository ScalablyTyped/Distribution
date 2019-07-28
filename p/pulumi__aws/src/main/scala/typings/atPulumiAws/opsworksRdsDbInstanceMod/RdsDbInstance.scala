package typings.atPulumiAws.opsworksRdsDbInstanceMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/opsworks/rdsDbInstance", "RdsDbInstance")
@js.native
class RdsDbInstance protected () extends CustomResource {
  /**
    * Create a RdsDbInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RdsDbInstanceArgs) = this()
  def this(name: String, args: RdsDbInstanceArgs, opts: CustomResourceOptions) = this()
  /**
    * A db password
    */
  val dbPassword: Output[String] = js.native
  /**
    * A db username
    */
  val dbUser: Output[String] = js.native
  /**
    * The db instance to register for this stack. Changing this will force a new resource.
    */
  val rdsDbInstanceArn: Output[String] = js.native
  /**
    * The stack to register a db instance for. Changing this will force a new resource.
    */
  val stackId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/opsworks/rdsDbInstance", "RdsDbInstance")
@js.native
object RdsDbInstance extends js.Object {
  /**
    * Get an existing RdsDbInstance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): RdsDbInstance = js.native
  def get(name: String, id: Input[ID], state: RdsDbInstanceState): RdsDbInstance = js.native
  def get(name: String, id: Input[ID], state: RdsDbInstanceState, opts: CustomResourceOptions): RdsDbInstance = js.native
  /**
    * Returns true if the given object is an instance of RdsDbInstance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/rdsDbInstance.RdsDbInstance */ Boolean = js.native
}

