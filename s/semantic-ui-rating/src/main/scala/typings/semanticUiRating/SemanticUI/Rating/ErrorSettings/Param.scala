package typings.semanticUiRating.SemanticUI.Rating.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-rating.SemanticUI.Rating.ErrorSettings._Impl, 'action'> & std.Partial<std.Pick<semantic-ui-rating.SemanticUI.Rating.ErrorSettings._Impl, keyof semantic-ui-rating.SemanticUI.Rating.ErrorSettings._Impl>> */
trait Param extends js.Object {
  var action: js.UndefOr[String] = js.undefined
}

object Param {
  @scala.inline
  def apply(action: String = null): Param = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.asInstanceOf[Param]
  }
}

