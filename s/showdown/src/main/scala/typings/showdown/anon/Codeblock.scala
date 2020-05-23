package typings.showdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Codeblock extends js.Object {
  var codeblock: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Codeblock {
  @scala.inline
  def apply(codeblock: String = null, text: String = null): Codeblock = {
    val __obj = js.Dynamic.literal()
    if (codeblock != null) __obj.updateDynamic("codeblock")(codeblock.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codeblock]
  }
}

