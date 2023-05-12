package typings.reactDom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nextMod {
  
  /* augmented module */
  object reactDomAugmentingMod {
    
    /* Rewritten from type alias, can be one of: 
      - typings.reactDom.reactDomStrings.script
      - typings.reactDom.reactDomStrings.style
    */
    trait PreinitAs extends StObject
    object PreinitAs {
      
      inline def script: typings.reactDom.reactDomStrings.script = "script".asInstanceOf[typings.reactDom.reactDomStrings.script]
      
      inline def style: typings.reactDom.reactDomStrings.style = "style".asInstanceOf[typings.reactDom.reactDomStrings.style]
    }
    
    trait PreinitOptions extends StObject {
      
      var as: PreinitAs
      
      var crossOrigin: js.UndefOr[String] = js.undefined
      
      var integrity: js.UndefOr[String] = js.undefined
      
      var nonce: js.UndefOr[String] = js.undefined
      
      var precedence: js.UndefOr[String] = js.undefined
    }
    object PreinitOptions {
      
      inline def apply(as: PreinitAs): PreinitOptions = {
        val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
        __obj.asInstanceOf[PreinitOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PreinitOptions] (val x: Self) extends AnyVal {
        
        inline def setAs(value: PreinitAs): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
        
        inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
        
        inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
        
        inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
        
        inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
        
        inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
        
        inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
        
        inline def setPrecedence(value: String): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
        
        inline def setPrecedenceUndefined: Self = StObject.set(x, "precedence", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.reactDom.reactDomStrings.font
      - typings.reactDom.reactDomStrings.script
      - typings.reactDom.reactDomStrings.style
    */
    trait PreloadAs extends StObject
    object PreloadAs {
      
      inline def font: typings.reactDom.reactDomStrings.font = "font".asInstanceOf[typings.reactDom.reactDomStrings.font]
      
      inline def script: typings.reactDom.reactDomStrings.script = "script".asInstanceOf[typings.reactDom.reactDomStrings.script]
      
      inline def style: typings.reactDom.reactDomStrings.style = "style".asInstanceOf[typings.reactDom.reactDomStrings.style]
    }
    
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PreloadOptions] (val x: Self) extends AnyVal {
        
        inline def setAs(value: PreloadAs): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
        
        inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
        
        inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
        
        inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
        
        inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      }
    }
  }
}
