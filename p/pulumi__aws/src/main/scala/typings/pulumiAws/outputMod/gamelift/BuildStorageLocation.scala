package typings.pulumiAws.outputMod.gamelift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildStorageLocation extends js.Object {
  /**
    * Name of your S3 bucket.
    */
  var bucket: String = js.native
  /**
    * Name of the zip file containing your build files.
    */
  var key: String = js.native
  /**
    * ARN of the access role that allows Amazon GameLift to access your S3 bucket.
    */
  var roleArn: String = js.native
}

object BuildStorageLocation {
  @scala.inline
  def apply(bucket: String, key: String, roleArn: String): BuildStorageLocation = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildStorageLocation]
  }
}

