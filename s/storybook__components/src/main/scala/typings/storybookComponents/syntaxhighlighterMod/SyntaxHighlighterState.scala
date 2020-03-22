package typings.storybookComponents.syntaxhighlighterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyntaxHighlighterState extends js.Object {
  var copied: Boolean = js.native
}

object SyntaxHighlighterState {
  @scala.inline
  def apply(copied: Boolean): SyntaxHighlighterState = {
    val __obj = js.Dynamic.literal(copied = copied.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SyntaxHighlighterState]
  }
}

