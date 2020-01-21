package typings.prompts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.prompts.promptsStrings.text
  - typings.prompts.promptsStrings.password
  - typings.prompts.promptsStrings.invisible
  - typings.prompts.promptsStrings.number
  - typings.prompts.promptsStrings.confirm
  - typings.prompts.promptsStrings.list
  - typings.prompts.promptsStrings.toggle
  - typings.prompts.promptsStrings.select
  - typings.prompts.promptsStrings.multiselect
  - typings.prompts.promptsStrings.autocomplete
  - typings.prompts.promptsStrings.date
  - typings.prompts.promptsStrings.autocompleteMultiselect
*/
trait PromptType extends js.Object

object PromptType {
  @scala.inline
  def autocomplete: typings.prompts.promptsStrings.autocomplete = this.cast("autocomplete")
  @scala.inline
  def autocompleteMultiselect: typings.prompts.promptsStrings.autocompleteMultiselect = this.cast("autocompleteMultiselect")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confirm: typings.prompts.promptsStrings.confirm = this.cast("confirm")
  @scala.inline
  def date: typings.prompts.promptsStrings.date = this.cast("date")
  @scala.inline
  def invisible: typings.prompts.promptsStrings.invisible = this.cast("invisible")
  @scala.inline
  def list: typings.prompts.promptsStrings.list = this.cast("list")
  @scala.inline
  def multiselect: typings.prompts.promptsStrings.multiselect = this.cast("multiselect")
  @scala.inline
  def number: typings.prompts.promptsStrings.number = this.cast("number")
  @scala.inline
  def password: typings.prompts.promptsStrings.password = this.cast("password")
  @scala.inline
  def select: typings.prompts.promptsStrings.select = this.cast("select")
  @scala.inline
  def text: typings.prompts.promptsStrings.text = this.cast("text")
  @scala.inline
  def toggle: typings.prompts.promptsStrings.toggle = this.cast("toggle")
}

