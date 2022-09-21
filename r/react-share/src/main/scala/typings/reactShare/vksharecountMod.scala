package typings.reactShare

import typings.react.mod.global.JSX.Element
import typings.reactShare.anon.PickHTMLAttributesHTMLSpa
import typings.reactShare.anon.Share
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vksharecountMod {
  
  object default {
    
    inline def apply(props: PickHTMLAttributesHTMLSpa): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-share/lib/VKShareCount", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-share/lib/VKShareCount", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  object global {
    
    trait Window extends StObject {
      
      var VK: Share
    }
    object Window {
      
      inline def apply(VK: Share): Window = {
        val __obj = js.Dynamic.literal(VK = VK.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setVK(value: Share): Self = StObject.set(x, "VK", value.asInstanceOf[js.Any])
      }
    }
  }
}
