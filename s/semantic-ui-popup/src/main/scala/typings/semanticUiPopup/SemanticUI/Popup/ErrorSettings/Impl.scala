package typings.semanticUiPopup.SemanticUI.Popup.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'Popup does not fit within the boundaries of the viewport'
    */
  var cannotPlace: String
  /**
    * @default 'The position you specified is not a valid position'
    */
  var invalidPosition: String
  /**
    * @default 'The method you called is not defined.'
    */
  var method: String
  /**
    * @default 'This module requires ui transitions <https: github.com="" semantic-org="" ui-transition="">'
    */
  var noTransition: String
  /**
    * @default 'The target or popup you specified does not exist on the page'
    */
  var notFound: String
}

object Impl {
  @scala.inline
  def apply(
    cannotPlace: String,
    invalidPosition: String,
    method: String,
    noTransition: String,
    notFound: String
  ): Impl = {
    val __obj = js.Dynamic.literal(cannotPlace = cannotPlace.asInstanceOf[js.Any], invalidPosition = invalidPosition.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], noTransition = noTransition.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

