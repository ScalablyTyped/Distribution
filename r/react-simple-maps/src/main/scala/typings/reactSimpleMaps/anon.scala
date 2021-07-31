package typings.reactSimpleMaps

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Default extends StObject {
    
    var default: js.UndefOr[CSSProperties] = js.undefined
    
    var hover: js.UndefOr[CSSProperties] = js.undefined
    
    var pressed: js.UndefOr[CSSProperties] = js.undefined
  }
  object Default {
    
    @scala.inline
    def apply(): Default = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Default]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: CSSProperties): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setHover(value: CSSProperties): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      @scala.inline
      def setPressed(value: CSSProperties): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressedUndefined: Self = StObject.set(x, "pressed", js.undefined)
    }
  }
}
