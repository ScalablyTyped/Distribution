package typings.semanticUiPopup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-popup.SemanticUI.Popup.ErrorSettings._Impl, keyof semantic-ui-popup.SemanticUI.Popup.ErrorSettings._Impl>> */
trait PartialPickImplkeyofImplCannotPlace extends js.Object {
  var cannotPlace: js.UndefOr[String] = js.undefined
  var invalidPosition: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var noTransition: js.UndefOr[String] = js.undefined
  var notFound: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplCannotPlace {
  @scala.inline
  def apply(
    cannotPlace: String = null,
    invalidPosition: String = null,
    method: String = null,
    noTransition: String = null,
    notFound: String = null
  ): PartialPickImplkeyofImplCannotPlace = {
    val __obj = js.Dynamic.literal()
    if (cannotPlace != null) __obj.updateDynamic("cannotPlace")(cannotPlace.asInstanceOf[js.Any])
    if (invalidPosition != null) __obj.updateDynamic("invalidPosition")(invalidPosition.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (noTransition != null) __obj.updateDynamic("noTransition")(noTransition.asInstanceOf[js.Any])
    if (notFound != null) __obj.updateDynamic("notFound")(notFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplCannotPlace]
  }
}

