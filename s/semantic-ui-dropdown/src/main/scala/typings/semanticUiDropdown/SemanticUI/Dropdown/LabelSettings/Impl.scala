package typings.semanticUiDropdown.SemanticUI.Dropdown.LabelSettings

import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
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

object Impl {
  @scala.inline
  def apply(duration: Double, transition: String, variation: `false` | String): Impl = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], variation = variation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

