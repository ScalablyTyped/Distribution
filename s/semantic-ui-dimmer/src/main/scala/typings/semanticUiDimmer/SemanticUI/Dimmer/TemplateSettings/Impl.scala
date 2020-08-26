package typings.semanticUiDimmer.SemanticUI.Dimmer.TemplateSettings

import typings.semanticUiDimmer.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  def dimmer(): JQuery = js.native
}

object Impl {
  @scala.inline
  def apply(dimmer: () => JQuery): Impl = {
    val __obj = js.Dynamic.literal(dimmer = js.Any.fromFunction0(dimmer))
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
    def setDimmer(value: () => JQuery): Self = this.set("dimmer", js.Any.fromFunction0(value))
  }
  
}

