package typings.semanticUiDimmer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.SelectorSettings._Impl, keyof semantic-ui-dimmer.SemanticUI.Dimmer.SelectorSettings._Impl>> */
trait PartialPickImplkeyofImplContent extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var dimmable: js.UndefOr[String] = js.undefined
  var dimmer: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplContent {
  @scala.inline
  def apply(content: String = null, dimmable: String = null, dimmer: String = null): PartialPickImplkeyofImplContent = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (dimmable != null) __obj.updateDynamic("dimmable")(dimmable.asInstanceOf[js.Any])
    if (dimmer != null) __obj.updateDynamic("dimmer")(dimmer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplContent]
  }
}

