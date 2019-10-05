package typings.semanticDashUiDashProgress.SemanticUI.Progress.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
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

object _Impl {
  @scala.inline
  def apply(bar: String, label: String, progress: String): _Impl = {
    val __obj = js.Dynamic.literal(bar = bar, label = label, progress = progress)
  
    __obj.asInstanceOf[_Impl]
  }
}

