package typings.prismReactRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenInputProps
  extends /* otherProps */ StringDictionary[js.Any] {
  
  var className: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[Key] = js.native
  
  var style: js.UndefOr[StyleObj] = js.native
  
  var token: Token = js.native
}
object TokenInputProps {
  
  @scala.inline
  def apply(token: Token): TokenInputProps = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenInputProps]
  }
  
  @scala.inline
  implicit class TokenInputPropsMutableBuilder[Self <: TokenInputProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleObj): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
