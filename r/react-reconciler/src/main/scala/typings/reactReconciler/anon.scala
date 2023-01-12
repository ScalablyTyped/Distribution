package typings.reactReconciler

import typings.react.mod.ReactNode
import typings.reactReconciler.mod.BoundingRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children[T] extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var value: T
  }
  object Children {
    
    inline def apply[T](value: T): Children[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children[?], T] (val x: Self & Children[T]) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Disconnect extends StObject {
    
    def disconnect(): Unit
  }
  object Disconnect {
    
    inline def apply(disconnect: () => Unit): Disconnect = {
      val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect))
      __obj.asInstanceOf[Disconnect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Disconnect] (val x: Self) extends AnyVal {
      
      inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
    }
  }
  
  trait EndTime extends StObject {
    
    var endTime: Double
    
    var name: js.UndefOr[String] = js.undefined
    
    var newName: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object EndTime {
    
    inline def apply(endTime: Double, `type`: String): EndTime = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndTime]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EndTime] (val x: Self) extends AnyVal {
      
      inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNewName(value: String): Self = StObject.set(x, "newName", value.asInstanceOf[js.Any])
      
      inline def setNewNameUndefined: Self = StObject.set(x, "newName", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: Null | String
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal(name = null)
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
    }
  }
  
  trait Ratio extends StObject {
    
    var ratio: Double
    
    var rect: BoundingRect
  }
  object Ratio {
    
    inline def apply(ratio: Double, rect: BoundingRect): Ratio = {
      val __obj = js.Dynamic.literal(ratio = ratio.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ratio]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ratio] (val x: Self) extends AnyVal {
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRect(value: BoundingRect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    }
  }
  
  trait StringRef extends StObject {
    
    var _stringRef: js.UndefOr[String | Null] = js.undefined
  }
  object StringRef {
    
    inline def apply(): StringRef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringRef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StringRef] (val x: Self) extends AnyVal {
      
      inline def set_stringRef(value: String): Self = StObject.set(x, "_stringRef", value.asInstanceOf[js.Any])
      
      inline def set_stringRefNull: Self = StObject.set(x, "_stringRef", null)
      
      inline def set_stringRefUndefined: Self = StObject.set(x, "_stringRef", js.undefined)
    }
  }
  
  trait UnstableobservedBits[T] extends StObject {
    
    def children(value: T): ReactNode
    
    var unstable_observedBits: js.UndefOr[Double] = js.undefined
  }
  object UnstableobservedBits {
    
    inline def apply[T](children: T => ReactNode): UnstableobservedBits[T] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[UnstableobservedBits[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnstableobservedBits[?], T] (val x: Self & UnstableobservedBits[T]) extends AnyVal {
      
      inline def setChildren(value: T => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setUnstable_observedBits(value: Double): Self = StObject.set(x, "unstable_observedBits", value.asInstanceOf[js.Any])
      
      inline def setUnstable_observedBitsUndefined: Self = StObject.set(x, "unstable_observedBits", js.undefined)
    }
  }
}
