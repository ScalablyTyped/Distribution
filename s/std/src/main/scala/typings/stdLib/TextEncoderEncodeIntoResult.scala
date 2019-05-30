package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEncoderEncodeIntoResult extends js.Object {
  var read: js.UndefOr[scala.Double] = js.undefined
  var written: js.UndefOr[scala.Double] = js.undefined
}

object TextEncoderEncodeIntoResult {
  @scala.inline
  def apply(read: scala.Int | scala.Double = null, written: scala.Int | scala.Double = null): TextEncoderEncodeIntoResult = {
    val __obj = js.Dynamic.literal()
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (written != null) __obj.updateDynamic("written")(written.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEncoderEncodeIntoResult]
  }
}

