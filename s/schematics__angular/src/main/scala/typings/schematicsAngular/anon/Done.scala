package typings.schematicsAngular.anon

import typings.schematicsAngular.schematicsAngularBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Done[T] extends StObject {
  
  var done: js.UndefOr[`false`] = js.undefined
  
  var value: T
}
object Done {
  
  inline def apply[T](value: T): Done[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Done[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Done[?], T] (val x: Self & Done[T]) extends AnyVal {
    
    inline def setDone(value: `false`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
