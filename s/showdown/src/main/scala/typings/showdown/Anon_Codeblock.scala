package typings.showdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Codeblock extends js.Object {
  var codeblock: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Anon_Codeblock {
  @scala.inline
  def apply(codeblock: String = null, text: String = null): Anon_Codeblock = {
    val __obj = js.Dynamic.literal()
    if (codeblock != null) __obj.updateDynamic("codeblock")(codeblock.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Codeblock]
  }
}

