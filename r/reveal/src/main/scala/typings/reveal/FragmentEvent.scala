package typings.reveal

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/hakimel/reveal.js/#fragment-events
trait FragmentEvent extends StObject {
  
  var fragment: Element
}
object FragmentEvent {
  
  inline def apply(fragment: Element): FragmentEvent = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentEvent]
  }
  
  extension [Self <: FragmentEvent](x: Self) {
    
    inline def setFragment(value: Element): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
  }
}
