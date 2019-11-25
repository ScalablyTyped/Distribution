package typings.semanticDashUiDashProgress.SemanticUI.Progress.RandomSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 5
    */
  var max: Double
  /**
    * @default 2
    */
  var min: Double
}

object _Impl {
  @scala.inline
  def apply(max: Double, min: Double): _Impl = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

