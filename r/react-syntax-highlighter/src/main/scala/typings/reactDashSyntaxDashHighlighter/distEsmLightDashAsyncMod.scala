package typings.reactDashSyntaxDashHighlighter

import typings.react.reactMod.Component
import typings.reactDashSyntaxDashHighlighter.distEsmLightDashAsyncMod.SyntaxHighlighter
import typings.reactDashSyntaxDashHighlighter.reactDashSyntaxDashHighlighterMod.SyntaxHighlighterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-syntax-highlighter/dist/esm/light-async", JSImport.Namespace)
@js.native
object distEsmLightDashAsyncMod extends js.Object {
  @js.native
  class default () extends SyntaxHighlighter
  
  /* static members */
  @js.native
  object default extends js.Object {
    def registerLanguage(name: String, func: js.Any): Unit = js.native
  }
  
  type SyntaxHighlighter = Component[SyntaxHighlighterProps, js.Object, js.Any]
}

