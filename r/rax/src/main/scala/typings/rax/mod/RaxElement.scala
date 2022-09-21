package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaxElement[P, T /* <: String | JSXElementConstructor[Any] */] extends StObject {
  
  var key: Key | Null
  
  var props: P
  
  var `type`: T
}
object RaxElement {
  
  inline def apply[P, T /* <: String | JSXElementConstructor[Any] */](props: P, `type`: T): RaxElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaxElement[P, T]]
  }
  
  extension [Self <: RaxElement[?, ?], P, T /* <: String | JSXElementConstructor[Any] */](x: Self & (RaxElement[P, T])) {
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
