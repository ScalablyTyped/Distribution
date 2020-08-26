package typings.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Semantics extends js.Object {
  var semantics: String = js.native
  var ssrcs: String = js.native
}

object Semantics {
  @scala.inline
  def apply(semantics: String, ssrcs: String): Semantics = {
    val __obj = js.Dynamic.literal(semantics = semantics.asInstanceOf[js.Any], ssrcs = ssrcs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Semantics]
  }
  @scala.inline
  implicit class SemanticsOps[Self <: Semantics] (val x: Self) extends AnyVal {
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
    def setSemantics(value: String): Self = this.set("semantics", value.asInstanceOf[js.Any])
    @scala.inline
    def setSsrcs(value: String): Self = this.set("ssrcs", value.asInstanceOf[js.Any])
  }
  
}

