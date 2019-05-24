package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.UndefOr[sipDotJsLib.libCoreMessagesBodyMod.Body] = js.undefined
  var cseq: js.UndefOr[scala.Double] = js.undefined
  var extraHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(
    body: sipDotJsLib.libCoreMessagesBodyMod.Body = null,
    cseq: scala.Int | scala.Double = null,
    extraHeaders: js.Array[java.lang.String] = null
  ): Anon_Body = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (cseq != null) __obj.updateDynamic("cseq")(cseq.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders)
    __obj.asInstanceOf[Anon_Body]
  }
}

