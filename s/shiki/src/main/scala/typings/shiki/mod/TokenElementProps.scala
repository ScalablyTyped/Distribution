package typings.shiki.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenElementProps
  extends StObject
     with ElementProps {
  
  var index: Double
  
  var style: String
  
  var token: IThemedToken
  
  var tokens: js.Array[IThemedToken]
}
object TokenElementProps {
  
  inline def apply(
    children: String,
    index: Double,
    style: String,
    token: IThemedToken,
    tokens: js.Array[IThemedToken]
  ): TokenElementProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenElementProps]
  }
  
  extension [Self <: TokenElementProps](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setToken(value: IThemedToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokens(value: js.Array[IThemedToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensVarargs(value: IThemedToken*): Self = StObject.set(x, "tokens", js.Array(value*))
  }
}
