package typings.qtip2.anon

import typings.qtip2.QTip2.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends js.Object {
  var text: Title
}

object Text {
  @scala.inline
  def apply(text: Title): Text = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

