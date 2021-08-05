package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponderProvided extends StObject {
  
  var announce: Announce
}
object ResponderProvided {
  
  inline def apply(announce: /* message */ String => Unit): ResponderProvided = {
    val __obj = js.Dynamic.literal(announce = js.Any.fromFunction1(announce))
    __obj.asInstanceOf[ResponderProvided]
  }
  
  extension [Self <: ResponderProvided](x: Self) {
    
    inline def setAnnounce(value: /* message */ String => Unit): Self = StObject.set(x, "announce", js.Any.fromFunction1(value))
  }
}
