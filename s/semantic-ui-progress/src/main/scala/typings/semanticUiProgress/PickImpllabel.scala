package typings.semanticUiProgress

import typings.semanticUiProgress.semanticUiProgressStrings.percent
import typings.semanticUiProgress.semanticUiProgressStrings.ratio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'label'> */
trait PickImpllabel extends js.Object {
  var label: percent | ratio
}

object PickImpllabel {
  @scala.inline
  def apply(label: percent | ratio): PickImpllabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickImpllabel]
  }
}

