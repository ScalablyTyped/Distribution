package typings
package requestLib.requestMod.requestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AWSOptions extends js.Object {
  var bucket: js.UndefOr[java.lang.String] = js.undefined
  var secret: java.lang.String
}

object AWSOptions {
  @scala.inline
  def apply(secret: java.lang.String, bucket: java.lang.String = null): AWSOptions = {
    val __obj = js.Dynamic.literal(secret = secret)
    if (bucket != null) __obj.updateDynamic("bucket")(bucket)
    __obj.asInstanceOf[AWSOptions]
  }
}

