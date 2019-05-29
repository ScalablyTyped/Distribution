package typings
package s3rverLib.s3rverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3rverBucketConfig extends js.Object {
  var configs: js.Array[nodeLib.Buffer | java.lang.String]
  var name: java.lang.String
}

object S3rverBucketConfig {
  @scala.inline
  def apply(configs: js.Array[nodeLib.Buffer | java.lang.String], name: java.lang.String): S3rverBucketConfig = {
    val __obj = js.Dynamic.literal(configs = configs, name = name)
  
    __obj.asInstanceOf[S3rverBucketConfig]
  }
}

