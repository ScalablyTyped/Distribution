package typings.s3rver.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3rverBucketConfig extends js.Object {
  var configs: js.Array[Buffer | String]
  var name: String
}

object S3rverBucketConfig {
  @scala.inline
  def apply(configs: js.Array[Buffer | String], name: String): S3rverBucketConfig = {
    val __obj = js.Dynamic.literal(configs = configs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[S3rverBucketConfig]
  }
}

