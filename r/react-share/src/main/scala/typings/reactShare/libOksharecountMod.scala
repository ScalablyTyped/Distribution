package typings.reactShare

import typings.react.mod.global.JSX.Element
import typings.reactShare.anon.Callbacks
import typings.reactShare.anon.OmitHTMLAttributesHTMLSpa
import typings.reactShare.anon.UpdateCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOksharecountMod {
  
  object default {
    
    inline def apply(props: OmitHTMLAttributesHTMLSpa): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-share/lib/OKShareCount", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-share/lib/OKShareCount", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  object global {
    
    trait Window extends StObject {
      
      var ODKL: UpdateCount
      
      var OK: Callbacks
    }
    object Window {
      
      inline def apply(ODKL: UpdateCount, OK: Callbacks): Window = {
        val __obj = js.Dynamic.literal(ODKL = ODKL.asInstanceOf[js.Any], OK = OK.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def setODKL(value: UpdateCount): Self = StObject.set(x, "ODKL", value.asInstanceOf[js.Any])
        
        inline def setOK(value: Callbacks): Self = StObject.set(x, "OK", value.asInstanceOf[js.Any])
      }
    }
  }
}
