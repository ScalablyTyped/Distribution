package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the serializeToString() method to construct an XML string representing a DOM tree. */
trait XMLSerializer extends StObject {
  
  /* standard dom */
  def serializeToString(root: Node): java.lang.String
}
object XMLSerializer {
  
  inline def apply(serializeToString: Node => java.lang.String): XMLSerializer = {
    val __obj = js.Dynamic.literal(serializeToString = js.Any.fromFunction1(serializeToString))
    __obj.asInstanceOf[XMLSerializer]
  }
  
  extension [Self <: XMLSerializer](x: Self) {
    
    inline def setSerializeToString(value: Node => java.lang.String): Self = StObject.set(x, "serializeToString", js.Any.fromFunction1(value))
  }
}
