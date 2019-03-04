package typings
package shellDashQuoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Glob
  extends shellDashQuoteLib.shellDashQuoteMod._ParseEntry {
  var op: shellDashQuoteLib.shellDashQuoteLibStrings.glob
  var pattern: java.lang.String
}

object Anon_Glob {
  @scala.inline
  def apply(op: shellDashQuoteLib.shellDashQuoteLibStrings.glob, pattern: java.lang.String): Anon_Glob = {
    val __obj = js.Dynamic.literal(op = op, pattern = pattern)
  
    __obj.asInstanceOf[Anon_Glob]
  }
}

