package typings.reveal

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/hakimel/reveal.js/#fragment-events
trait FragmentEvent extends js.Object {
  var fragment: Element
}

object FragmentEvent {
  @scala.inline
  def apply(fragment: Element): FragmentEvent = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FragmentEvent]
  }
}

