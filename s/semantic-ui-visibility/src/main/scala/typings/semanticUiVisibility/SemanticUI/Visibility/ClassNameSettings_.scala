package typings.semanticUiVisibility.SemanticUI.Visibility

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined semantic-ui-visibility.SemanticUI.Visibility.ClassNameSettings.Param */
trait ClassNameSettings_ extends js.Object {
  var fixed: js.UndefOr[String] = js.undefined
}

object ClassNameSettings_ {
  @scala.inline
  def apply(fixed: String = null): ClassNameSettings_ = {
    val __obj = js.Dynamic.literal()
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNameSettings_]
  }
}

