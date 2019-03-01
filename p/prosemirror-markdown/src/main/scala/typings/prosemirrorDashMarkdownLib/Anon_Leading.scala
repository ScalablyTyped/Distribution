package typings
package prosemirrorDashMarkdownLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Leading extends js.Object {
  var leading: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var trailing: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object Anon_Leading {
  @scala.inline
  def apply(leading: java.lang.String = null, trailing: java.lang.String = null): Anon_Leading = {
    val __obj = js.Dynamic.literal()
    if (leading != null) __obj.updateDynamic("leading")(leading)
    if (trailing != null) __obj.updateDynamic("trailing")(trailing)
    __obj.asInstanceOf[Anon_Leading]
  }
}

