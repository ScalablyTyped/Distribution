package typings.prosemirrorMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeading extends js.Object {
  var leading: js.UndefOr[String | Null] = js.undefined
  var trailing: js.UndefOr[String | Null] = js.undefined
}

object AnonLeading {
  @scala.inline
  def apply(leading: String = null, trailing: String = null): AnonLeading = {
    val __obj = js.Dynamic.literal()
    if (leading != null) __obj.updateDynamic("leading")(leading.asInstanceOf[js.Any])
    if (trailing != null) __obj.updateDynamic("trailing")(trailing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeading]
  }
}

