package typings.semanticUiAccordion.SemanticUI.Accordion.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'active'
    */
  var active: String = js.native
  /**
    * @default 'animating'
    */
  var animating: String = js.native
}

object Impl {
  @scala.inline
  def apply(active: String, animating: String): Impl = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any])
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimating(value: String): Self = this.set("animating", value.asInstanceOf[js.Any])
  }
  
}

