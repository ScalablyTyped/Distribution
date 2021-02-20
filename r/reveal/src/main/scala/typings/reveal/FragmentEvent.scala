package typings.reveal

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/hakimel/reveal.js/#fragment-events
@js.native
trait FragmentEvent extends StObject {
  
  var fragment: Element = js.native
}
object FragmentEvent {
  
  @scala.inline
  def apply(fragment: Element): FragmentEvent = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentEvent]
  }
  
  @scala.inline
  implicit class FragmentEventMutableBuilder[Self <: FragmentEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFragment(value: Element): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
  }
}
