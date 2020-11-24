package typings.prismReactRenderer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderProps extends js.Object {
  
  var className: String = js.native
  
  def getLineProps(input: LineInputProps): LineOutputProps = js.native
  
  def getTokenProps(input: TokenInputProps): TokenOutputProps = js.native
  
  var style: StyleObj = js.native
  
  var tokens: js.Array[js.Array[Token]] = js.native
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
  implicit class RenderPropsOps[Self <: RenderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLineProps(value: LineInputProps => LineOutputProps): Self = this.set("getLineProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTokenProps(value: TokenInputProps => TokenOutputProps): Self = this.set("getTokenProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyle(value: StyleObj): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensVarargs(value: js.Array[Token]*): Self = this.set("tokens", js.Array(value :_*))
    
    @scala.inline
    def setTokens(value: js.Array[js.Array[Token]]): Self = this.set("tokens", value.asInstanceOf[js.Any])
  }
}
