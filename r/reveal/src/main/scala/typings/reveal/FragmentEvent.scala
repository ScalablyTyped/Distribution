package typings.reveal

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/hakimel/reveal.js/#fragment-events
@js.native
trait FragmentEvent extends js.Object {
  
  var fragment: Element = js.native
}
object FragmentEvent {
  
  @scala.inline
  def apply(fragment: Element): FragmentEvent = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentEvent]
  }
  
  @scala.inline
  implicit class FragmentEventOps[Self <: FragmentEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFragment(value: Element): Self = this.set("fragment", value.asInstanceOf[js.Any])
  }
}
