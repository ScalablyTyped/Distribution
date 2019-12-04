package typings.reactDashAce.libEditorOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashAce.reactDashAceStrings.minLines
  - typings.reactDashAce.reactDashAceStrings.maxLines
  - typings.reactDashAce.reactDashAceStrings.readOnly
  - typings.reactDashAce.reactDashAceStrings.highlightActiveLine
  - typings.reactDashAce.reactDashAceStrings.tabSize
  - typings.reactDashAce.reactDashAceStrings.enableBasicAutocompletion
  - typings.reactDashAce.reactDashAceStrings.enableLiveAutocompletion
  - typings.reactDashAce.reactDashAceStrings.enableSnippets
*/
trait EditorOption extends js.Object

object EditorOption {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def enableBasicAutocompletion: typings.reactDashAce.reactDashAceStrings.enableBasicAutocompletion = this.cast("enableBasicAutocompletion")
  @scala.inline
  def enableLiveAutocompletion: typings.reactDashAce.reactDashAceStrings.enableLiveAutocompletion = this.cast("enableLiveAutocompletion")
  @scala.inline
  def enableSnippets: typings.reactDashAce.reactDashAceStrings.enableSnippets = this.cast("enableSnippets")
  @scala.inline
  def highlightActiveLine: typings.reactDashAce.reactDashAceStrings.highlightActiveLine = this.cast("highlightActiveLine")
  @scala.inline
  def maxLines: typings.reactDashAce.reactDashAceStrings.maxLines = this.cast("maxLines")
  @scala.inline
  def minLines: typings.reactDashAce.reactDashAceStrings.minLines = this.cast("minLines")
  @scala.inline
  def readOnly: typings.reactDashAce.reactDashAceStrings.readOnly = this.cast("readOnly")
  @scala.inline
  def tabSize: typings.reactDashAce.reactDashAceStrings.tabSize = this.cast("tabSize")
}

