package typings.prismReactRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Highlight
  extends Component[HighlightProps, js.Object, js.Any] {
  var themeDict: ThemeDict = js.native
  def getLineProps(lineInputProps: LineInputProps): LineOutputProps = js.native
  def getStyleForToken(token: Token): StringDictionary[String] = js.native
  def getTokenProps(tokenInputPropsL: TokenInputProps): TokenOutputProps = js.native
}

