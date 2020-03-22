package typings.semanticUiNag.SemanticUI.Nag.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.Nag.SelectorSettings._Impl, 'close'> & std.Partial<std.Pick<semantic-ui-nag.SemanticUI.Nag.SelectorSettings._Impl, keyof semantic-ui-nag.SemanticUI.Nag.SelectorSettings._Impl>> */
trait Param extends js.Object {
  var close: js.UndefOr[String] = js.undefined
}

object Param {
  @scala.inline
  def apply(close: String = null): Param = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    __obj.asInstanceOf[Param]
  }
}

