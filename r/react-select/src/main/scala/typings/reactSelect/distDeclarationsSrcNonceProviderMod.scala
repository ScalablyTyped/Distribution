package typings.reactSelect

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcNonceProviderMod {
  
  @JSImport("react-select/dist/declarations/src/NonceProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: NonceProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NonceProviderProps] (val x: Self) extends AnyVal {
      
      inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    }
  }
}
