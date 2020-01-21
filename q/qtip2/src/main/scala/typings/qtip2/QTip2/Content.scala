package typings.qtip2.QTip2

import typings.qtip2.AnonText
import typings.qtip2.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var attr: js.UndefOr[String] = js.undefined
  var button: js.UndefOr[String | JQuery | Boolean] = js.undefined
  var text: js.UndefOr[Text] = js.undefined
  var title: js.UndefOr[Title | AnonText] = js.undefined
}

object Content {
  @scala.inline
  def apply(
    attr: String = null,
    button: String | JQuery | Boolean = null,
    text: Text = null,
    title: Title | AnonText = null
  ): Content = {
    val __obj = js.Dynamic.literal()
    if (attr != null) __obj.updateDynamic("attr")(attr.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

