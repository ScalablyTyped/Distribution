package typings.reactDom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nextMod {
  
  /* augmented module */
  object reactDomAugmentingMod {
    
    object PreinitAs {
      
      inline def script: "script" = "script".asInstanceOf["script"]
      
      inline def style: "style" = "style".asInstanceOf["style"]
    }
    type PreinitAs = "script" | "style"
    
    trait PreinitOptions extends StObject {
      
      var as: PreinitAs
      
      var crossOrigin: js.UndefOr[String] = js.undefined
      
      var integrity: js.UndefOr[String] = js.undefined
      
      var precedence: js.UndefOr[String] = js.undefined
    }
    object PreinitOptions {
      
      inline def apply(as: PreinitAs): PreinitOptions = {
        val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
        __obj.asInstanceOf[PreinitOptions]
      }
      
      extension [Self <: PreinitOptions](x: Self) {
        
        inline def setAs(value: PreinitAs): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
        
        inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
        
        inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
        
        inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
        
        inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
        
        inline def setPrecedence(value: String): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
        
        inline def setPrecedenceUndefined: Self = StObject.set(x, "precedence", js.undefined)
      }
    }
    
    object PreloadAs {
      
      inline def font: "font" = "font".asInstanceOf["font"]
      
      inline def script: "script" = "script".asInstanceOf["script"]
      
      inline def style: "style" = "style".asInstanceOf["style"]
    }
    type PreloadAs = "font" | "script" | "style"
    
    trait PreloadOptions extends StObject {
      
      var as: PreloadAs
      
      var crossOrigin: js.UndefOr[String] = js.undefined
      
      var integrity: js.UndefOr[String] = js.undefined
    }
    object PreloadOptions {
      
      inline def apply(as: PreloadAs): PreloadOptions = {
        val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
        __obj.asInstanceOf[PreloadOptions]
      }
      
      extension [Self <: PreloadOptions](x: Self) {
        
        inline def setAs(value: PreloadAs): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
        
        inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
        
        inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
        
        inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
        
        inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      }
    }
  }
}
