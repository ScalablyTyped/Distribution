package typings.prismReactRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Highlight
  extends Component[HighlightProps, js.Object, js.Any] {
  
  def getLineProps(lineInputProps: LineInputProps): LineOutputProps = js.native
  
  def getStyleForToken(token: Token): StringDictionary[String] = js.native
  
  def getTokenProps(tokenInputPropsL: TokenInputProps): TokenOutputProps = js.native
  
  var themeDict: ThemeDict = js.native
}
