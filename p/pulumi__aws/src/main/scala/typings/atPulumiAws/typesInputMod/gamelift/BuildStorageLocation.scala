package typings.atPulumiAws.typesInputMod.gamelift

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildStorageLocation extends js.Object {
  /**
    * Name of your S3 bucket.
    */
  var bucket: Input[String]
  /**
    * Name of the zip file containing your build files.
    */
  var key: Input[String]
  /**
    * ARN of the access role that allows Amazon GameLift to access your S3 bucket.
    */
  var roleArn: Input[String]
}

object BuildStorageLocation {
  @scala.inline
  def apply(bucket: Input[String], key: Input[String], roleArn: Input[String]): BuildStorageLocation = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildStorageLocation]
  }
}

