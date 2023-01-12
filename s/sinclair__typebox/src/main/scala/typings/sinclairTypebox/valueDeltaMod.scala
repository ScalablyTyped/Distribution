package typings.sinclairTypebox

import typings.sinclairTypebox.sinclairTypeboxStrings.delete
import typings.sinclairTypebox.sinclairTypeboxStrings.insert
import typings.sinclairTypebox.sinclairTypeboxStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueDeltaMod {
  
  object ValueDelta {
    
    @JSImport("@sinclair/typebox/value/delta", "ValueDelta")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Diff[T](current: T, next: T): js.Array[Edit[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Diff")(current.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[js.Array[Edit[T]]]
    
    inline def Patch[T](current: T, edits: js.Array[Edit[T]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Patch")(current.asInstanceOf[js.Any], edits.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  trait Delete[T]
    extends StObject
       with Edit[T] {
    
    var brand: T
    
    var path: String
    
    var `type`: delete
  }
  object Delete {
    
    inline def apply[T](brand: T, path: String): Delete[T] = {
      val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("delete")
      __obj.asInstanceOf[Delete[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Delete[?], T] (val x: Self & Delete[T]) extends AnyVal {
      
      inline def setBrand(value: T): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: delete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sinclairTypebox.valueDeltaMod.Insert[T]
    - typings.sinclairTypebox.valueDeltaMod.Update[T]
    - typings.sinclairTypebox.valueDeltaMod.Delete[T]
  */
  trait Edit[T] extends StObject
  object Edit {
    
    inline def Delete[T](brand: T, path: String): typings.sinclairTypebox.valueDeltaMod.Delete[T] = {
      val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("delete")
      __obj.asInstanceOf[typings.sinclairTypebox.valueDeltaMod.Delete[T]]
    }
    
    inline def Insert[T](brand: T, path: String, value: Any): typings.sinclairTypebox.valueDeltaMod.Insert[T] = {
      val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("insert")
      __obj.asInstanceOf[typings.sinclairTypebox.valueDeltaMod.Insert[T]]
    }
    
    inline def Update[T](brand: T, path: String, value: Any): typings.sinclairTypebox.valueDeltaMod.Update[T] = {
      val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update")
      __obj.asInstanceOf[typings.sinclairTypebox.valueDeltaMod.Update[T]]
    }
  }
  
  trait Insert[T]
    extends StObject
       with Edit[T] {
    
    var brand: T
    
    var path: String
    
    var `type`: insert
    
    var value: Any
  }
  object Insert {
    
    inline def apply[T](brand: T, path: String, value: Any): Insert[T] = {
      val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("insert")
      __obj.asInstanceOf[Insert[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Insert[?], T] (val x: Self & Insert[T]) extends AnyVal {
      
      inline def setBrand(value: T): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: insert): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Update[T]
    extends StObject
       with Edit[T] {
    
    var brand: T
    
    var path: String
    
    var `type`: update
    
    var value: Any
  }
  object Update {
    
    inline def apply[T](brand: T, path: String, value: Any): Update[T] = {
      val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update")
      __obj.asInstanceOf[Update[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Update[?], T] (val x: Self & Update[T]) extends AnyVal {
      
      inline def setBrand(value: T): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
