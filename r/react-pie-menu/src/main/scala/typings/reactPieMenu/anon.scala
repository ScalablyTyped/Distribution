package typings.reactPieMenu

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Context[T] extends StObject {
    
    var context: StringDictionary[T]
  }
  object Context {
    
    inline def apply[T](context: StringDictionary[T]): Context[T] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context[?], T] (val x: Self & Context[T]) extends AnyVal {
      
      inline def setContext(value: StringDictionary[T]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemId extends StObject {
    
    var itemId: String
    
    var slice: js.Array[ReactNode]
  }
  object ItemId {
    
    inline def apply(itemId: String, slice: js.Array[ReactNode]): ItemId = {
      val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any], slice = slice.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemId] (val x: Self) extends AnyVal {
      
      inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      inline def setSlice(value: js.Array[ReactNode]): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
      
      inline def setSliceVarargs(value: ReactNode*): Self = StObject.set(x, "slice", js.Array(value*))
    }
  }
}
