package typings.sipDotJs

import typings.sipDotJs.libCoreMessagesBodyMod.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCseq extends js.Object {
  var body: js.UndefOr[Body] = js.undefined
  var cseq: js.UndefOr[Double] = js.undefined
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_BodyCseq {
  @scala.inline
  def apply(body: Body = null, cseq: Int | Double = null, extraHeaders: js.Array[String] = null): Anon_BodyCseq = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (cseq != null) __obj.updateDynamic("cseq")(cseq.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders)
    __obj.asInstanceOf[Anon_BodyCseq]
  }
}

