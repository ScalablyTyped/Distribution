package typings
package prismDashReactDashRendererLib.prismDashReactDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Highlight
  extends reactLib.reactMod.Component[HighlightProps, js.Object, js.Any] {
  var themeDict: ThemeDict = js.native
  def getLineProps(lineInputProps: LineInputProps): LineOutputProps = js.native
  def getStyleForToken(token: Token): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def getTokenProps(tokenInputPropsL: TokenInputProps): TokenOutputProps = js.native
}

