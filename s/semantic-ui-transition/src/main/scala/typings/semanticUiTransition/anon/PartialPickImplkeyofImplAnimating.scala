package typings.semanticUiTransition.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-transition.SemanticUI.Transition.ClassNameSettings._Impl, keyof semantic-ui-transition.SemanticUI.Transition.ClassNameSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplAnimating extends js.Object {
  var animating: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[String] = js.native
  var inward: js.UndefOr[String] = js.native
  var loading: js.UndefOr[String] = js.native
  var looping: js.UndefOr[String] = js.native
  var outward: js.UndefOr[String] = js.native
  var transition: js.UndefOr[String] = js.native
  var visible: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplAnimating {
  @scala.inline
  def apply(): PartialPickImplkeyofImplAnimating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplAnimating]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplAnimatingOps[Self <: PartialPickImplkeyofImplAnimating] (val x: Self) extends AnyVal {
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
    def setAnimating(value: String): Self = this.set("animating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimating: Self = this.set("animating", js.undefined)
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setInward(value: String): Self = this.set("inward", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInward: Self = this.set("inward", js.undefined)
    @scala.inline
    def setLoading(value: String): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setLooping(value: String): Self = this.set("looping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLooping: Self = this.set("looping", js.undefined)
    @scala.inline
    def setOutward(value: String): Self = this.set("outward", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutward: Self = this.set("outward", js.undefined)
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    @scala.inline
    def setVisible(value: String): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

