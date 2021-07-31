package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaxElement[P, T /* <: String | JSXElementConstructor[js.Any] */] extends StObject {
  
  var key: Key | Null
  
  var props: P
  
  var `type`: T
}
object RaxElement {
  
  @scala.inline
  def apply[P, T /* <: String | JSXElementConstructor[js.Any] */](props: P, `type`: T): RaxElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaxElement[P, T]]
  }
  
  @scala.inline
  implicit class RaxElementMutableBuilder[Self <: RaxElement[?, ?], P, T /* <: String | JSXElementConstructor[js.Any] */] (val x: Self & (RaxElement[P, T])) extends AnyVal {
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
