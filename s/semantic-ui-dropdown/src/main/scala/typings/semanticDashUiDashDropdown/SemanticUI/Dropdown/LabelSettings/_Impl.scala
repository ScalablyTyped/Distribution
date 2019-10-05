package typings.semanticDashUiDashDropdown.SemanticUI.Dropdown.LabelSettings

import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 200
    */
  var duration: Double
  /**
    * @default 'horizontal flip'
    */
  var transition: String
  /**
    * @default false
    */
  var variation: `false` | String
}

object _Impl {
  @scala.inline
  def apply(duration: Double, transition: String, variation: `false` | String): _Impl = {
    val __obj = js.Dynamic.literal(duration = duration, transition = transition, variation = variation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

