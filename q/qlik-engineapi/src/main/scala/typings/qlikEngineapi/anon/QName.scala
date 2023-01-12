package typings.qlikEngineapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QName extends StObject {
  
  var qName: String
}
object QName {
  
  inline def apply(qName: String): QName = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[QName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QName] (val x: Self) extends AnyVal {
    
    inline def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
  }
}
