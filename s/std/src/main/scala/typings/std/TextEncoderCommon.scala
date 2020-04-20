package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEncoderCommon extends js.Object {
  /**
    * Returns "utf-8".
    */
  val encoding: java.lang.String
}

object TextEncoderCommon {
  @scala.inline
  def apply(encoding: java.lang.String): TextEncoderCommon = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEncoderCommon]
  }
}

