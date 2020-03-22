package typings.semanticUiPopup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-popup.SemanticUI.Popup.MetadataSettings._Impl, keyof semantic-ui-popup.SemanticUI.Popup.MetadataSettings._Impl>> */
trait PartialPickImplkeyofImplContent extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var html: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var variation: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplContent {
  @scala.inline
  def apply(
    content: String = null,
    html: String = null,
    offset: String = null,
    position: String = null,
    title: String = null,
    variation: String = null
  ): PartialPickImplkeyofImplContent = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (variation != null) __obj.updateDynamic("variation")(variation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplContent]
  }
}

