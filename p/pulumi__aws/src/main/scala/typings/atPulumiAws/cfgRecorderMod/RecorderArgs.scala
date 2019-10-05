package typings.atPulumiAws.cfgRecorderMod

import typings.atPulumiAws.typesInputMod.cfg.RecorderRecordingGroup
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecorderArgs extends js.Object {
  /**
    * The name of the recorder. Defaults to `default`. Changing it recreates the resource.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Recording group - see below.
    */
  val recordingGroup: js.UndefOr[Input[RecorderRecordingGroup]] = js.undefined
  /**
    * Amazon Resource Name (ARN) of the IAM role.
    * used to make read or write requests to the delivery channel and to describe the AWS resources associated with the account.
    * See [AWS Docs](http://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) for more details.
    */
  val roleArn: Input[String]
}

object RecorderArgs {
  @scala.inline
  def apply(
    roleArn: Input[String],
    name: Input[String] = null,
    recordingGroup: Input[RecorderRecordingGroup] = null
  ): RecorderArgs = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (recordingGroup != null) __obj.updateDynamic("recordingGroup")(recordingGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderArgs]
  }
}

