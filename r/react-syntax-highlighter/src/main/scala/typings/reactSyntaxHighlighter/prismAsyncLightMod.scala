package typings.reactSyntaxHighlighter

import typings.react.mod.Component
import typings.reactSyntaxHighlighter.mod.SyntaxHighlighterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-syntax-highlighter/dist/cjs/prism-async-light", JSImport.Namespace)
@js.native
object prismAsyncLightMod extends js.Object {
  
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
