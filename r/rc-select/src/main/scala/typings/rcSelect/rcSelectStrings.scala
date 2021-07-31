package typings.rcSelect

import typings.rcSelect.generatorMod.SelectSource
import typings.rcSelect.interfaceMod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rcSelectStrings {
  
  @js.native
  sealed trait click extends StObject
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait combobox
    extends StObject
       with Mode
  @scala.inline
  def combobox: combobox = "combobox".asInstanceOf[combobox]
  
  @js.native
  sealed trait focus extends StObject
  @scala.inline
  def focus: focus = "focus".asInstanceOf[focus]
  
  @js.native
  sealed trait input
    extends StObject
       with SelectSource
  @scala.inline
  def input: input = "input".asInstanceOf[input]
  
  @js.native
  sealed trait keyboard extends StObject
  @scala.inline
  def keyboard: keyboard = "keyboard".asInstanceOf[keyboard]
  
  @js.native
  sealed trait mouse extends StObject
  @scala.inline
  def mouse: mouse = "mouse".asInstanceOf[mouse]
  
  @js.native
  sealed trait multiple
    extends StObject
       with Mode
  @scala.inline
  def multiple: multiple = "multiple".asInstanceOf[multiple]
  
  @js.native
  sealed trait option
    extends StObject
       with SelectSource
  @scala.inline
  def option: option = "option".asInstanceOf[option]
  
  @js.native
  sealed trait options extends StObject
  @scala.inline
  def options: options = "options".asInstanceOf[options]
  
  @js.native
  sealed trait selection
    extends StObject
       with SelectSource
  @scala.inline
  def selection: selection = "selection".asInstanceOf[selection]
  
  @js.native
  sealed trait tags
    extends StObject
       with Mode
  @scala.inline
  def tags: tags = "tags".asInstanceOf[tags]
}
