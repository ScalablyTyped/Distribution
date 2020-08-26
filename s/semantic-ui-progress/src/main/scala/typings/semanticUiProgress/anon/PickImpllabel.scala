package typings.semanticUiProgress.anon

import typings.semanticUiProgress.semanticUiProgressStrings.percent
import typings.semanticUiProgress.semanticUiProgressStrings.ratio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'label'> */
@js.native
trait PickImpllabel extends js.Object {
  var label: percent | ratio = js.native
}

object PickImpllabel {
  @scala.inline
  def apply(label: percent | ratio): PickImpllabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpllabel]
  }
  @scala.inline
  implicit class PickImpllabelOps[Self <: PickImpllabel] (val x: Self) extends AnyVal {
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
    def setLabel(value: percent | ratio): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

