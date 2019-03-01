package typings
package revealLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/hakimel/reveal.js/#fragment-events
trait FragmentEvent extends js.Object {
  var fragment: stdLib.Element
}

object FragmentEvent {
  @scala.inline
  def apply(fragment: stdLib.Element): FragmentEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fragment")(fragment)
    __obj.asInstanceOf[FragmentEvent]
  }
}

