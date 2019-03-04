package typings
package semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.ErrorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'You called a dropdown action that was not defined'
    */
  var action: java.lang.String
  /**
    * @default 'Once a select has been initialized behaviors must be called on the created ui dropdown'
    */
  var alreadySetup: java.lang.String
  /**
    * @default 'Allowing user additions currently requires the use of labels.'
    */
  var labels: java.lang.String
  /**
    * @default 'The method you called is not defined.'
    */
  var method: java.lang.String
  /**
    * @default 'This module requires ui transitions <https: github.com="" semantic-org="" ui-transition="">'
    */
  var noTransition: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    action: java.lang.String,
    alreadySetup: java.lang.String,
    labels: java.lang.String,
    method: java.lang.String,
    noTransition: java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal(action = action, alreadySetup = alreadySetup, labels = labels, method = method, noTransition = noTransition)
  
    __obj.asInstanceOf[_Impl]
  }
}

