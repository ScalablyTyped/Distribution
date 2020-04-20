package typings.pretty.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrettyOptions extends js.Object {
  var ocd: Boolean
}

object PrettyOptions {
  @scala.inline
  def apply(ocd: Boolean): PrettyOptions = {
    val __obj = js.Dynamic.literal(ocd = ocd.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrettyOptions]
  }
}

