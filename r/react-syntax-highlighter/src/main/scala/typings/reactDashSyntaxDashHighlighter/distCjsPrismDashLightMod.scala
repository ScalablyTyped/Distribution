package typings.reactDashSyntaxDashHighlighter

import typings.react.reactMod.Component
import typings.reactDashSyntaxDashHighlighter.reactDashSyntaxDashHighlighterMod.SyntaxHighlighterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-syntax-highlighter/dist/cjs/prism-light", JSImport.Namespace)
@js.native
object distCjsPrismDashLightMod extends js.Object {
  @js.native
  class default ()
    extends Component[SyntaxHighlighterProps, js.Object, js.Any]
  
  /* static members */
  @js.native
  object default extends js.Object {
    def registerLanguage(name: String, func: js.Any): Unit = js.native
  }
  
  type SyntaxHighlighter = Component[SyntaxHighlighterProps, js.Object, js.Any]
}

