package typings.reactTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Header extends StObject {
  
  var Header: String
}
object Header {
  
  inline def apply(Header: String): Header = {
    val __obj = js.Dynamic.literal(Header = Header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
    
    inline def setHeader(value: String): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
  }
}
