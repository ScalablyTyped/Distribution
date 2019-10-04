package typings.atPulumiAws.typesOutputMod.gameliftNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildStorageLocation extends js.Object {
  /**
    * Name of your S3 bucket.
    */
  var bucket: String
  /**
    * Name of the zip file containing your build files.
    */
  var key: String
  /**
    * ARN of the access role that allows Amazon GameLift to access your S3 bucket.
    */
  var roleArn: String
}

object BuildStorageLocation {
  @scala.inline
  def apply(bucket: String, key: String, roleArn: String): BuildStorageLocation = {
    val __obj = js.Dynamic.literal(bucket = bucket, key = key, roleArn = roleArn)
  
    __obj.asInstanceOf[BuildStorageLocation]
  }
}

