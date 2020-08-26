package typings.pulumiAws.inputMod.gamelift

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildStorageLocation extends js.Object {
  /**
    * Name of your S3 bucket.
    */
  var bucket: Input[String] = js.native
  /**
    * Name of the zip file containing your build files.
    */
  var key: Input[String] = js.native
  /**
    * ARN of the access role that allows Amazon GameLift to access your S3 bucket.
    */
  var roleArn: Input[String] = js.native
}

object BuildStorageLocation {
  @scala.inline
  def apply(bucket: Input[String], key: Input[String], roleArn: Input[String]): BuildStorageLocation = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildStorageLocation]
  }
  @scala.inline
  implicit class BuildStorageLocationOps[Self <: BuildStorageLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucket(value: Input[String]): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Input[String]): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
  }
  
}

