package typings.prompts

import typings.prompts.promptsMod.PromptType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object promptsStrings {
  @js.native
  sealed trait Answers extends js.Object
  
  @js.native
  sealed trait autocomplete extends PromptType
  
  @js.native
  sealed trait autocompleteMultiselect extends PromptType
  
  @js.native
  sealed trait confirm extends PromptType
  
  @js.native
  sealed trait date extends PromptType
  
  @js.native
  sealed trait invisible extends PromptType
  
  @js.native
  sealed trait list extends PromptType
  
  @js.native
  sealed trait multiselect extends PromptType
  
  @js.native
  sealed trait number extends PromptType
  
  @js.native
  sealed trait password extends PromptType
  
  @js.native
  sealed trait select extends PromptType
  
  @js.native
  sealed trait text extends PromptType
  
  @js.native
  sealed trait toggle extends PromptType
  
  @scala.inline
  def Answers: Answers = "Answers".asInstanceOf[Answers]
  @scala.inline
  def autocomplete: autocomplete = "autocomplete".asInstanceOf[autocomplete]
  @scala.inline
  def autocompleteMultiselect: autocompleteMultiselect = "autocompleteMultiselect".asInstanceOf[autocompleteMultiselect]
  @scala.inline
  def confirm: confirm = "confirm".asInstanceOf[confirm]
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  @scala.inline
  def invisible: invisible = "invisible".asInstanceOf[invisible]
  @scala.inline
  def list: list = "list".asInstanceOf[list]
  @scala.inline
  def multiselect: multiselect = "multiselect".asInstanceOf[multiselect]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def password: password = "password".asInstanceOf[password]
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def toggle: toggle = "toggle".asInstanceOf[toggle]
}

