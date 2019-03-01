package typings
package qtip2Lib.QTip2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var attr: js.UndefOr[java.lang.String] = js.undefined
  var button: js.UndefOr[java.lang.String | qtip2Lib.JQuery | scala.Boolean] = js.undefined
  var text: js.UndefOr[Text] = js.undefined
  var title: js.UndefOr[Title | qtip2Lib.Anon_Text] = js.undefined
}

object Content {
  @scala.inline
  def apply(
    attr: java.lang.String = null,
    button: java.lang.String | qtip2Lib.JQuery | scala.Boolean = null,
    text: Text = null,
    title: Title | qtip2Lib.Anon_Text = null
  ): Content = {
    val __obj = js.Dynamic.literal()
    if (attr != null) __obj.updateDynamic("attr")(attr)
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

