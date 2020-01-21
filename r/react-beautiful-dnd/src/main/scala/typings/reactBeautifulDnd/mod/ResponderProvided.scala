package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponderProvided extends js.Object {
  var announce: Announce
}

object ResponderProvided {
  @scala.inline
  def apply(announce: /* message */ String => Unit): ResponderProvided = {
    val __obj = js.Dynamic.literal(announce = js.Any.fromFunction1(announce))
  
    __obj.asInstanceOf[ResponderProvided]
  }
}

