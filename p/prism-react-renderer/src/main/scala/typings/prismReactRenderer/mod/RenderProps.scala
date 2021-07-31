package typings.prismReactRenderer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderProps extends StObject {
  
  var className: String
  
  def getLineProps(input: LineInputProps): LineOutputProps
  
  def getTokenProps(input: TokenInputProps): TokenOutputProps
  
  var style: StyleObj
  
  var tokens: js.Array[js.Array[Token]]
}
object RenderProps {
  
  @scala.inline
  def apply(
    className: String,
    getLineProps: LineInputProps => LineOutputProps,
    getTokenProps: TokenInputProps => TokenOutputProps,
    style: StyleObj,
    tokens: js.Array[js.Array[Token]]
  ): RenderProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], getLineProps = js.Any.fromFunction1(getLineProps), getTokenProps = js.Any.fromFunction1(getTokenProps), style = style.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProps]
  }
  
  @scala.inline
  implicit class RenderPropsMutableBuilder[Self <: RenderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLineProps(value: LineInputProps => LineOutputProps): Self = StObject.set(x, "getLineProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTokenProps(value: TokenInputProps => TokenOutputProps): Self = StObject.set(x, "getTokenProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyle(value: StyleObj): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokens(value: js.Array[js.Array[Token]]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensVarargs(value: js.Array[Token]*): Self = StObject.set(x, "tokens", js.Array(value :_*))
  }
}
