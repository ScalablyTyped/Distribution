package typings.semanticDashUiDashProgress.SemanticUI.Progress.MetadataSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'percent'
    */
  var percent: String
  /**
    * @default 'total'
    */
  var total: String
  /**
    * @default 'value'
    */
  var value: String
}

object _Impl {
  @scala.inline
  def apply(percent: String, total: String, value: String): _Impl = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

