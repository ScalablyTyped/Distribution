package typings.semanticUiVisibility.SemanticUI.Visibility.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.Visibility.ClassNameSettings._Impl, 'fixed'> & std.Partial<std.Pick<semantic-ui-visibility.SemanticUI.Visibility.ClassNameSettings._Impl, keyof semantic-ui-visibility.SemanticUI.Visibility.ClassNameSettings._Impl>> */
trait Param extends js.Object {
  var fixed: js.UndefOr[String] = js.undefined
}

object Param {
  @scala.inline
  def apply(fixed: String = null): Param = {
    val __obj = js.Dynamic.literal()
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Param]
  }
}

