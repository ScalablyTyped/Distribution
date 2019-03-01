package typings
package semanticDashUiDashPopupLib.SemanticUINs.PopupNs.ErrorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'Popup does not fit within the boundaries of the viewport'
    */
  var cannotPlace: java.lang.String
  /**
    * @default 'The position you specified is not a valid position'
    */
  var invalidPosition: java.lang.String
  /**
    * @default 'The method you called is not defined.'
    */
  var method: java.lang.String
  /**
    * @default 'This module requires ui transitions <https: github.com="" semantic-org="" ui-transition="">'
    */
  var noTransition: java.lang.String
  /**
    * @default 'The target or popup you specified does not exist on the page'
    */
  var notFound: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    cannotPlace: java.lang.String,
    invalidPosition: java.lang.String,
    method: java.lang.String,
    noTransition: java.lang.String,
    notFound: java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cannotPlace")(cannotPlace)
    __obj.updateDynamic("invalidPosition")(invalidPosition)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("noTransition")(noTransition)
    __obj.updateDynamic("notFound")(notFound)
    __obj.asInstanceOf[_Impl]
  }
}

