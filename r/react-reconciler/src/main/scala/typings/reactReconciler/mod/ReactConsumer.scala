package typings.reactReconciler.mod

import typings.reactReconciler.anon.UnstableobservedBits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactConsumer[T] extends StObject {
  
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol | Double
  
  var key: Null | String
  
  var props: UnstableobservedBits[T]
  
  var ref: Null
  
  var `type`: ReactContext[T]
}
object ReactConsumer {
  
  inline def apply[T](
    DollarDollartypeof: js.Symbol | Double,
    props: UnstableobservedBits[T],
    ref: Null,
    `type`: ReactContext[T]
  ): ReactConsumer[T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], key = null)
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactConsumer[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReactConsumer[?], T] (val x: Self & ReactConsumer[T]) extends AnyVal {
    
    inline def setDollarDollartypeof(value: js.Symbol | Double): Self = StObject.set(x, "$$typeof", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setProps(value: UnstableobservedBits[T]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRef(value: Null): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setType(value: ReactContext[T]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
