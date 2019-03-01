package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bucket extends js.Object {
  var bucket: java.lang.String
  var enabled: scala.Boolean
  var prefix: java.lang.String
}

object Anon_Bucket {
  @scala.inline
  def apply(bucket: java.lang.String, enabled: scala.Boolean, prefix: java.lang.String): Anon_Bucket = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bucket")(bucket)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Anon_Bucket]
  }
}

