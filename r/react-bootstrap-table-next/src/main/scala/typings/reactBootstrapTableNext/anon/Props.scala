package typings.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Props[T /* <: js.Object */] extends StObject {
  
  var props: Data[T]
}
object Props {
  
  inline def apply[T /* <: js.Object */](props: Data[T]): Props[T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
  
  extension [Self <: Props[?], T /* <: js.Object */](x: Self & Props[T]) {
    
    inline def setProps(value: Data[T]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
