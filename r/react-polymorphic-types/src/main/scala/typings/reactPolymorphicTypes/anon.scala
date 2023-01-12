package typings.reactPolymorphicTypes

import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait As[T /* <: ElementType[Any] */] extends StObject {
    
    var as: js.UndefOr[T] = js.undefined
  }
  object As {
    
    inline def apply[T /* <: ElementType[Any] */](): As[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[As[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: As[?], T /* <: ElementType[Any] */] (val x: Self & As[T]) extends AnyVal {
      
      inline def setAs(value: T): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    }
  }
}
