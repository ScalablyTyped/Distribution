package typings.reactSyntaxHighlighter

import typings.react.mod.Component
import typings.reactSyntaxHighlighter.mod.SyntaxHighlighterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmPrismAsyncLightMod {
  
  @JSImport("react-syntax-highlighter/dist/esm/prism-async-light", JSImport.Default)
  @js.native
  class default ()
    extends Component[SyntaxHighlighterProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("react-syntax-highlighter/dist/esm/prism-async-light", "default.registerLanguage")
    @js.native
    def registerLanguage(name: String, func: js.Any): Unit = js.native
  }
  
  type SyntaxHighlighter = Component[SyntaxHighlighterProps, js.Object, js.Any]
}
