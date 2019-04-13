package typings
package prismDashReactDashRendererLib.prismDashReactDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps extends js.Object {
  var className: java.lang.String
  var style: StyleObj
  var tokens: js.Array[js.Array[Token]]
  def getLineProps(input: LineInputProps): LineOutputProps
  def getTokenProps(input: TokenInputProps): TokenOutputProps
}

object RenderProps {
  @scala.inline
  def apply(
    className: java.lang.String,
    getLineProps: LineInputProps => LineOutputProps,
    getTokenProps: TokenInputProps => TokenOutputProps,
    style: StyleObj,
    tokens: js.Array[js.Array[Token]]
  ): RenderProps = {
    val __obj = js.Dynamic.literal(className = className, getLineProps = js.Any.fromFunction1(getLineProps), getTokenProps = js.Any.fromFunction1(getTokenProps), style = style, tokens = tokens)
  
    __obj.asInstanceOf[RenderProps]
  }
}

