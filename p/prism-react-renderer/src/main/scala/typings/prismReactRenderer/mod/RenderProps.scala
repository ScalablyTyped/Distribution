package typings.prismReactRenderer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps extends js.Object {
  var className: String
  var style: StyleObj
  var tokens: js.Array[js.Array[Token]]
  def getLineProps(input: LineInputProps): LineOutputProps
  def getTokenProps(input: TokenInputProps): TokenOutputProps
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
}

