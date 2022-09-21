package typings.reactSelect

import typings.emotionUtils.mod.EmotionCache
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nonceProviderMod {
  
  @JSImport("react-select/dist/declarations/src/NonceProvider", JSImport.Default)
  @js.native
  open class default protected () extends NonceProvider {
    def this(props: NonceProviderProps) = this()
  }
  
  @js.native
  trait NonceProvider
    extends Component[NonceProviderProps, js.Object, Any] {
    
    def createEmotionCache(nonce: String, key: String): EmotionCache = js.native
  }
  
  trait NonceProviderProps extends StObject {
    
    var cacheKey: String
    
    var children: ReactNode
    
    var nonce: String
  }
  object NonceProviderProps {
    
    inline def apply(cacheKey: String, nonce: String): NonceProviderProps = {
      val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
      __obj.asInstanceOf[NonceProviderProps]
    }
    
    extension [Self <: NonceProviderProps](x: Self) {
      
      inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    }
  }
}
