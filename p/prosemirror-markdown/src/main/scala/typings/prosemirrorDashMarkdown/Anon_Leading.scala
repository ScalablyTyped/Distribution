package typings.prosemirrorDashMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Leading extends js.Object {
  var leading: js.UndefOr[String | Null] = js.undefined
  var trailing: js.UndefOr[String | Null] = js.undefined
}

object Anon_Leading {
  @scala.inline
  def apply(leading: String = null, trailing: String = null): Anon_Leading = {
    val __obj = js.Dynamic.literal()
    if (leading != null) __obj.updateDynamic("leading")(leading.asInstanceOf[js.Any])
    if (trailing != null) __obj.updateDynamic("trailing")(trailing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Leading]
  }
}

