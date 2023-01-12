package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InnerHTML extends StObject {
  
  /* standard dom */
  var innerHTML: java.lang.String
}
object InnerHTML {
  
  inline def apply(innerHTML: java.lang.String): InnerHTML = {
    val __obj = js.Dynamic.literal(innerHTML = innerHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerHTML]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InnerHTML] (val x: Self) extends AnyVal {
    
    inline def setInnerHTML(value: java.lang.String): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
  }
}
