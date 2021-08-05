package typings.reactMathjax

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: ReactNode
    
    var options: js.UndefOr[js.Object] = js.undefined
    
    var script: js.UndefOr[String | Boolean] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setScript(value: String | Boolean): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    }
  }
  
  trait Formula extends StObject {
    
    var formula: String
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var onRender: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Formula {
    
    inline def apply(formula: String): Formula = {
      val __obj = js.Dynamic.literal(formula = formula.asInstanceOf[js.Any])
      __obj.asInstanceOf[Formula]
    }
    
    extension [Self <: Formula](x: Self) {
      
      inline def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setOnRender(value: () => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction0(value))
      
      inline def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
    }
  }
}
