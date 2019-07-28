package typings.pretty.prettyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrettyOptions extends js.Object {
  var ocd: Boolean
}

object PrettyOptions {
  @scala.inline
  def apply(ocd: Boolean): PrettyOptions = {
    val __obj = js.Dynamic.literal(ocd = ocd)
  
    __obj.asInstanceOf[PrettyOptions]
  }
}

