package typings.semanticUiVisibility.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'once'> */
@js.native
trait PickImplonce extends js.Object {
  var once: Boolean = js.native
}

object PickImplonce {
  @scala.inline
  def apply(once: Boolean): PickImplonce = {
    val __obj = js.Dynamic.literal(once = once.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonce]
  }
  @scala.inline
  implicit class PickImplonceOps[Self <: PickImplonce] (val x: Self) extends AnyVal {
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
    def setOnce(value: Boolean): Self = this.set("once", value.asInstanceOf[js.Any])
  }
  
}

