package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponderProvided extends StObject {
  
  var announce: Announce = js.native
}
object ResponderProvided {
  
  @scala.inline
  def apply(announce: /* message */ String => Unit): ResponderProvided = {
    val __obj = js.Dynamic.literal(announce = js.Any.fromFunction1(announce))
    __obj.asInstanceOf[ResponderProvided]
  }
  
  @scala.inline
  implicit class ResponderProvidedMutableBuilder[Self <: ResponderProvided] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnounce(value: /* message */ String => Unit): Self = StObject.set(x, "announce", js.Any.fromFunction1(value))
  }
}
