package typings.reactSyntaxHighlighter

import typings.react.mod.Component
import typings.reactSyntaxHighlighter.mod.SyntaxHighlighterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// esm end
// cjs start
object distCjsDefaultHighlightMod {
  
  @JSImport("react-syntax-highlighter/dist/cjs/default-highlight", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SyntaxHighlighterProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("react-syntax-highlighter/dist/cjs/default-highlight", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-syntax-highlighter/dist/cjs/default-highlight", "default.supportedLanguages")
    @js.native
    def supportedLanguages: js.Array[String] = js.native
    inline def supportedLanguages_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedLanguages")(x.asInstanceOf[js.Any])
  }
  
  type SyntaxHighlighter = Component[SyntaxHighlighterProps, js.Object, Any]
}
