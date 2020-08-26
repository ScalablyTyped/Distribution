package typings.semanticUiDropdown.SemanticUI.Dropdown.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'You called a dropdown action that was not defined'
    */
  var action: String = js.native
  /**
    * @default 'Once a select has been initialized behaviors must be called on the created ui dropdown'
    */
  var alreadySetup: String = js.native
  /**
    * @default 'Allowing user additions currently requires the use of labels.'
    */
  var labels: String = js.native
  /**
    * @default 'The method you called is not defined.'
    */
  var method: String = js.native
  /**
    * @default 'This module requires ui transitions <https: github.com="" semantic-org="" ui-transition="">'
    */
  var noTransition: String = js.native
}

object Impl {
  @scala.inline
  def apply(action: String, alreadySetup: String, labels: String, method: String, noTransition: String): Impl = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], alreadySetup = alreadySetup.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], noTransition = noTransition.asInstanceOf[js.Any])
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlreadySetup(value: String): Self = this.set("alreadySetup", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabels(value: String): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoTransition(value: String): Self = this.set("noTransition", value.asInstanceOf[js.Any])
  }
  
}

