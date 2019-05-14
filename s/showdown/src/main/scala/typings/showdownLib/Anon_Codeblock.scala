package typings
package showdownLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Codeblock extends js.Object {
  var codeblock: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Codeblock {
  @scala.inline
  def apply(codeblock: java.lang.String = null, text: java.lang.String = null): Anon_Codeblock = {
    val __obj = js.Dynamic.literal()
    if (codeblock != null) __obj.updateDynamic("codeblock")(codeblock)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Codeblock]
  }
}

