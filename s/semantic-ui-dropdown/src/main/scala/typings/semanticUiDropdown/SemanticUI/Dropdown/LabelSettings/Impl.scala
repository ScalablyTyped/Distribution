package typings.semanticUiDropdown.SemanticUI.Dropdown.LabelSettings

import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 200
    */
  var duration: Double = js.native
  /**
    * @default 'horizontal flip'
    */
  var transition: String = js.native
  /**
    * @default false
    */
  var variation: `false` | String = js.native
}

object Impl {
  @scala.inline
  def apply(duration: Double, transition: String, variation: `false` | String): Impl = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], variation = variation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariation(value: `false` | String): Self = this.set("variation", value.asInstanceOf[js.Any])
  }
  
}

