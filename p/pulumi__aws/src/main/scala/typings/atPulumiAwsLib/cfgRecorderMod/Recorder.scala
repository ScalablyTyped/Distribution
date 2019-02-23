package typings
package atPulumiAwsLib.cfgRecorderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cfg/recorder", "Recorder")
@js.native
class Recorder protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Recorder resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: RecorderArgs) = this()
  def this(name: java.lang.String, args: RecorderArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The name of the recorder. Defaults to `default`. Changing it recreates the resource.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Recording group - see below.
    */
  val recordingGroup: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.Anon_AllSupported] = js.native
  /**
    * Amazon Resource Name (ARN) of the IAM role.
    * used to make read or write requests to the delivery channel and to describe the AWS resources associated with the account.
    * See [AWS Docs](http://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) for more details.
    */
  val roleArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cfg/recorder", "Recorder")
@js.native
object Recorder extends js.Object {
  /**
    * Get an existing Recorder resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cfgRecorderMod.Recorder = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cfgRecorderMod.RecorderState
  ): atPulumiAwsLib.cfgRecorderMod.Recorder = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cfgRecorderMod.RecorderState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cfgRecorderMod.Recorder = js.native
}

