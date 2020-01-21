package typings.semanticUiDropdown.SemanticUI.Dropdown.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'You called a dropdown action that was not defined'
    */
  var action: String
  /**
    * @default 'Once a select has been initialized behaviors must be called on the created ui dropdown'
    */
  var alreadySetup: String
  /**
    * @default 'Allowing user additions currently requires the use of labels.'
    */
  var labels: String
  /**
    * @default 'The method you called is not defined.'
    */
  var method: String
  /**
    * @default 'This module requires ui transitions <https: github.com="" semantic-org="" ui-transition="">'
    */
  var noTransition: String
}

object Impl {
  @scala.inline
  def apply(action: String, alreadySetup: String, labels: String, method: String, noTransition: String): Impl = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], alreadySetup = alreadySetup.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], noTransition = noTransition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

