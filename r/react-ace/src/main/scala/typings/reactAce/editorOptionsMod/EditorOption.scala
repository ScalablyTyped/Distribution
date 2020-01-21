package typings.reactAce.editorOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactAce.reactAceStrings.minLines
  - typings.reactAce.reactAceStrings.maxLines
  - typings.reactAce.reactAceStrings.readOnly
  - typings.reactAce.reactAceStrings.highlightActiveLine
  - typings.reactAce.reactAceStrings.tabSize
  - typings.reactAce.reactAceStrings.enableBasicAutocompletion
  - typings.reactAce.reactAceStrings.enableLiveAutocompletion
  - typings.reactAce.reactAceStrings.enableSnippets
*/
trait EditorOption extends js.Object

object EditorOption {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def enableBasicAutocompletion: typings.reactAce.reactAceStrings.enableBasicAutocompletion = this.cast("enableBasicAutocompletion")
  @scala.inline
  def enableLiveAutocompletion: typings.reactAce.reactAceStrings.enableLiveAutocompletion = this.cast("enableLiveAutocompletion")
  @scala.inline
  def enableSnippets: typings.reactAce.reactAceStrings.enableSnippets = this.cast("enableSnippets")
  @scala.inline
  def highlightActiveLine: typings.reactAce.reactAceStrings.highlightActiveLine = this.cast("highlightActiveLine")
  @scala.inline
  def maxLines: typings.reactAce.reactAceStrings.maxLines = this.cast("maxLines")
  @scala.inline
  def minLines: typings.reactAce.reactAceStrings.minLines = this.cast("minLines")
  @scala.inline
  def readOnly: typings.reactAce.reactAceStrings.readOnly = this.cast("readOnly")
  @scala.inline
  def tabSize: typings.reactAce.reactAceStrings.tabSize = this.cast("tabSize")
}

