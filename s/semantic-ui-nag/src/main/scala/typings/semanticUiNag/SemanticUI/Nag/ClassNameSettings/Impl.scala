package typings.semanticUiNag.SemanticUI.Nag.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'bottom'
    */
  var bottom: String = js.native
  /**
    * @default 'fixed'
    */
  var fixed: String = js.native
}

object Impl {
  @scala.inline
  def apply(bottom: String, fixed: String): Impl = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
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
    def setBottom(value: String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixed(value: String): Self = this.set("fixed", value.asInstanceOf[js.Any])
  }
  
}

