package typings.request.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AWSOptions extends js.Object {
  var bucket: js.UndefOr[String] = js.undefined
  var secret: String
}

object AWSOptions {
  @scala.inline
  def apply(secret: String, bucket: String = null): AWSOptions = {
    val __obj = js.Dynamic.literal(secret = secret)
    if (bucket != null) __obj.updateDynamic("bucket")(bucket)
    __obj.asInstanceOf[AWSOptions]
  }
}

