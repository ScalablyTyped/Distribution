package typings.atStorybookComponents.distSyntaxhighlighterSyntaxhighlighterMod

import typings.atStorybookComponents.Anon_Copied
import typings.react.reactMod.Component
import typings.react.reactMod.MouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/components/dist/syntaxhighlighter/syntaxhighlighter", "SyntaxHighlighter")
@js.native
class SyntaxHighlighter ()
  extends Component[
      SyntaxHighlighterProps with ReactSyntaxHighlighterProps, 
      SyntaxHighlighterState, 
      js.Any
    ] {
  @JSName("state")
  var state_SyntaxHighlighter: Anon_Copied = js.native
  def onClick(e: MouseEvent[Element, typings.std.MouseEvent]): Unit = js.native
}

/* static members */
@JSImport("@storybook/components/dist/syntaxhighlighter/syntaxhighlighter", "SyntaxHighlighter")
@js.native
object SyntaxHighlighter extends js.Object {
  var defaultProps: SyntaxHighlighterProps = js.native
}

