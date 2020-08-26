package typings.sipJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cseq extends js.Object {
  var body: js.UndefOr[typings.sipJs.bodyMod.Body] = js.native
  var cseq: js.UndefOr[Double] = js.native
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
}

object Cseq {
  @scala.inline
  def apply(): Cseq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cseq]
  }
  @scala.inline
  implicit class CseqOps[Self <: Cseq] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody(value: typings.sipJs.bodyMod.Body): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setCseq(value: Double): Self = this.set("cseq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCseq: Self = this.set("cseq", js.undefined)
    @scala.inline
    def setExtraHeadersVarargs(value: String*): Self = this.set("extraHeaders", js.Array(value :_*))
    @scala.inline
    def setExtraHeaders(value: js.Array[String]): Self = this.set("extraHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraHeaders: Self = this.set("extraHeaders", js.undefined)
  }
  
}

