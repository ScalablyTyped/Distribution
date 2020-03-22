package typings.semanticUiRating.SemanticUI.Rating.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-rating.SemanticUI.Rating.SelectorSettings._Impl, 'icon'> & std.Partial<std.Pick<semantic-ui-rating.SemanticUI.Rating.SelectorSettings._Impl, keyof semantic-ui-rating.SemanticUI.Rating.SelectorSettings._Impl>> */
trait Param extends js.Object {
  var icon: js.UndefOr[String] = js.undefined
}

object Param {
  @scala.inline
  def apply(icon: String = null): Param = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Param]
  }
}

