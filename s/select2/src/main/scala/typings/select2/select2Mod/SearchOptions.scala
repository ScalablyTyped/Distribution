package typings.select2.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  var term: String
}

object SearchOptions {
  @scala.inline
  def apply(term: String): SearchOptions = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchOptions]
  }
}

