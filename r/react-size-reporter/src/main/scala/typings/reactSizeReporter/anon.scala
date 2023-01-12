package typings.reactSizeReporter

import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactSizeReporter.mod.ReactSizeReporterRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    // Children with static or dynamic height or width
    var children: ReactNode
    
    // Callback called on mount and size changes.
    def onSizeChange(newDimensions: Height): Unit
    
    var ref: js.UndefOr[Ref[ReactSizeReporterRef]] = js.undefined
  }
  object Children {
    
    inline def apply(onSizeChange: Height => Unit): Children = {
      val __obj = js.Dynamic.literal(onSizeChange = js.Any.fromFunction1(onSizeChange))
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnSizeChange(value: Height => Unit): Self = StObject.set(x, "onSizeChange", js.Any.fromFunction1(value))
      
      inline def setRef(value: Ref[ReactSizeReporterRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ ReactSizeReporterRef | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
