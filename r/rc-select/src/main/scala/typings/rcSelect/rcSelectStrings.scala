package typings.rcSelect

import typings.rcSelect.generatorMod.SelectSource
import typings.rcSelect.interfaceMod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rcSelectStrings {
  @js.native
  sealed trait click extends js.Object
  
  @js.native
  sealed trait combobox extends Mode
  
  @js.native
  sealed trait focus extends js.Object
  
  @js.native
  sealed trait input extends SelectSource
  
  @js.native
  sealed trait multiple extends Mode
  
  @js.native
  sealed trait option extends SelectSource
  
  @js.native
  sealed trait options extends js.Object
  
  @js.native
  sealed trait selection extends SelectSource
  
  @js.native
  sealed trait tags extends Mode
  
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  @scala.inline
  def combobox: combobox = "combobox".asInstanceOf[combobox]
  @scala.inline
  def focus: focus = "focus".asInstanceOf[focus]
  @scala.inline
  def input: input = "input".asInstanceOf[input]
  @scala.inline
  def multiple: multiple = "multiple".asInstanceOf[multiple]
  @scala.inline
  def option: option = "option".asInstanceOf[option]
  @scala.inline
  def options: options = "options".asInstanceOf[options]
  @scala.inline
  def selection: selection = "selection".asInstanceOf[selection]
  @scala.inline
  def tags: tags = "tags".asInstanceOf[tags]
}

