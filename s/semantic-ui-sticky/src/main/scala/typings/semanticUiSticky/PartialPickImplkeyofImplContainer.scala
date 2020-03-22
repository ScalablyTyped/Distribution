package typings.semanticUiSticky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ErrorSettings._Impl, keyof semantic-ui-sticky.SemanticUI.Sticky.ErrorSettings._Impl>> */
trait PartialPickImplkeyofImplContainer extends js.Object {
  var container: js.UndefOr[String] = js.undefined
  var elementSize: js.UndefOr[String] = js.undefined
  var invalidContext: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplContainer {
  @scala.inline
  def apply(
    container: String = null,
    elementSize: String = null,
    invalidContext: String = null,
    method: String = null,
    visible: String = null
  ): PartialPickImplkeyofImplContainer = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (elementSize != null) __obj.updateDynamic("elementSize")(elementSize.asInstanceOf[js.Any])
    if (invalidContext != null) __obj.updateDynamic("invalidContext")(invalidContext.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplContainer]
  }
}

