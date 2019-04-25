package typings
package s3rverLib.s3rverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3rverBucketConfig extends js.Object {
  var configs: js.Array[java.lang.String] | js.Array[nodeLib.Buffer]
  var name: java.lang.String
}

object S3rverBucketConfig {
  @scala.inline
  def apply(configs: js.Array[java.lang.String] | js.Array[nodeLib.Buffer], name: java.lang.String): S3rverBucketConfig = {
    val __obj = js.Dynamic.literal(configs = configs.asInstanceOf[js.Any], name = name)
  
    __obj.asInstanceOf[S3rverBucketConfig]
  }
}

