package typings.semanticUiProgress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.SelectorSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.SelectorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplBar extends js.Object {
  var bar: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var progress: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplBar {
  @scala.inline
  def apply(): PartialPickImplkeyofImplBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplBar]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplBarOps[Self <: PartialPickImplkeyofImplBar] (val x: Self) extends AnyVal {
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
    def setBar(value: String): Self = this.set("bar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBar: Self = this.set("bar", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setProgress(value: String): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
  }
  
}

