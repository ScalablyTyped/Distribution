package typings.reactSyntaxHighlighter

import typings.react.mod.Component
import typings.reactSyntaxHighlighter.mod.SyntaxHighlighterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmLightAsyncMod {
  
  @JSImport("react-syntax-highlighter/dist/esm/light-async", JSImport.Default)
  @js.native
  class default ()
    extends Component[SyntaxHighlighterProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("react-syntax-highlighter/dist/esm/light-async", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def registerLanguage(name: String, func: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguage")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  type SyntaxHighlighter = Component[SyntaxHighlighterProps, js.Object, js.Any]
}
