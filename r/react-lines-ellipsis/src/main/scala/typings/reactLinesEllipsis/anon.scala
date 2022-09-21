package typings.reactLinesEllipsis

import typings.react.mod.LegacyRef
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Clamped extends StObject {
    
    var clamped: Boolean
    
    var text: String
  }
  object Clamped {
    
    inline def apply(clamped: Boolean, text: String): Clamped = {
      val __obj = js.Dynamic.literal(clamped = clamped.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Clamped]
    }
    
    extension [Self <: Clamped](x: Self) {
      
      inline def setClamped(value: Boolean): Self = StObject.set(x, "clamped", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait InnerRef extends StObject {
    
    var innerRef: js.UndefOr[LegacyRef[HTMLDivElement]] = js.undefined
  }
  object InnerRef {
    
    inline def apply(): InnerRef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InnerRef]
    }
    
    extension [Self <: InnerRef](x: Self) {
      
      inline def setInnerRef(value: LegacyRef[HTMLDivElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    }
  }
}
