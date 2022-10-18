package typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedValue[T] extends StObject {
  
  var value: T
}
object SharedValue {
  
  inline def apply[T](value: T): SharedValue[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedValue[T]]
  }
  
  extension [Self <: SharedValue[?], T](x: Self & SharedValue[T]) {
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
