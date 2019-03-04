package typings
package select2Lib.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  var term: java.lang.String
}

object SearchOptions {
  @scala.inline
  def apply(term: java.lang.String): SearchOptions = {
    val __obj = js.Dynamic.literal(term = term)
  
    __obj.asInstanceOf[SearchOptions]
  }
}

