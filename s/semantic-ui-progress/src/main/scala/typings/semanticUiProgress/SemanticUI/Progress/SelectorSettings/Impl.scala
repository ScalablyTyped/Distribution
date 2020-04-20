package typings.semanticUiProgress.SemanticUI.Progress.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default '> .bar
    */
  var bar: String
  /**
    * @default '> .label'
    */
  var label: String
  /**
    * @default '.bar > .progress'
    */
  var progress: String
}

object Impl {
  @scala.inline
  def apply(bar: String, label: String, progress: String): Impl = {
    val __obj = js.Dynamic.literal(bar = bar.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

