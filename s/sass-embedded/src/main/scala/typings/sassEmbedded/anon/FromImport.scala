package typings.sassEmbedded.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromImport extends StObject {
  
  var fromImport: Boolean
}
object FromImport {
  
  inline def apply(fromImport: Boolean): FromImport = {
    val __obj = js.Dynamic.literal(fromImport = fromImport.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromImport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FromImport] (val x: Self) extends AnyVal {
    
    inline def setFromImport(value: Boolean): Self = StObject.set(x, "fromImport", value.asInstanceOf[js.Any])
  }
}
