package typings.prismReactRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenInputProps
  extends StObject
     with /* otherProps */ StringDictionary[Any] {
  
  var className: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[Key] = js.undefined
  
  var style: js.UndefOr[StyleObj] = js.undefined
  
  var token: Token
}
object TokenInputProps {
  
  inline def apply(token: Token): TokenInputProps = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenInputProps]
  }
  
  extension [Self <: TokenInputProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setStyle(value: StyleObj): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
