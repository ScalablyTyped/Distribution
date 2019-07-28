package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bucket extends js.Object {
  var bucket: String
  var enabled: Boolean
  var prefix: String
}

object Anon_Bucket {
  @scala.inline
  def apply(bucket: String, enabled: Boolean, prefix: String): Anon_Bucket = {
    val __obj = js.Dynamic.literal(bucket = bucket, enabled = enabled, prefix = prefix)
  
    __obj.asInstanceOf[Anon_Bucket]
  }
}

