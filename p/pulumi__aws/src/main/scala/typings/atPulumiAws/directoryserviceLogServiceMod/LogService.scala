package typings.atPulumiAws.directoryserviceLogServiceMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directoryservice/logService", "LogService")
@js.native
class LogService protected () extends CustomResource {
  /**
    * Create a LogService resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LogServiceArgs) = this()
  def this(name: String, args: LogServiceArgs, opts: CustomResourceOptions) = this()
  /**
    * The id of directory.
    */
  val directoryId: Output[String] = js.native
  /**
    * Name of the cloudwatch log group to which the logs should be published. The log group should be already created and the directory service principal should be provided with required permission to create stream and publish logs. Changing this value would delete the current subscription and create a new one. A directory can only have one log subscription at a time.
    */
  val logGroupName: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/directoryservice/logService", "LogService")
@js.native
object LogService extends js.Object {
  /**
    * Get an existing LogService resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): LogService = js.native
  def get(name: String, id: Input[ID], state: LogServiceState): LogService = js.native
  def get(name: String, id: Input[ID], state: LogServiceState, opts: CustomResourceOptions): LogService = js.native
  /**
    * Returns true if the given object is an instance of LogService.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directoryservice/logService.LogService */ Boolean = js.native
}

