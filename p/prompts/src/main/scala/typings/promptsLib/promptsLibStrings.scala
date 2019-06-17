package typings
package promptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object promptsLibStrings {
  @js.native
  sealed trait Answers extends js.Object
  
  @js.native
  sealed trait autocomplete
    extends promptsLib.promptsMod.PromptType
  
  @js.native
  sealed trait autocompleteMultiselect
    extends promptsLib.promptsMod.PromptType
  
  @js.native
  sealed trait confirm
    extends promptsLib.promptsMod.PromptType
  
  @js.native
  sealed trait date
    extends promptsLib.promptsMod.PromptType
  
  @js.native
  sealed trait invisible
    extends promptsLib.promptsMod.PromptType
  
  @js.native
  sealed trait list
    extends promptsLib.promptsMod.PromptType
  
  @js.native
  sealed trait multiselect
    extends promptsLib.promptsMod.PromptType
  
  @js.native
  sealed trait number
    extends promptsLib.promptsMod.PromptType
  
  @js.native
  sealed trait password
    extends promptsLib.promptsMod.PromptType
  
  @js.native
  sealed trait select
    extends promptsLib.promptsMod.PromptType
  
  @js.native
  sealed trait text
    extends promptsLib.promptsMod.PromptType
  
  @js.native
  sealed trait toggle
    extends promptsLib.promptsMod.PromptType
  
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

