package typings.reactHotkeys

import typings.reactHotkeys.mod.KeyEventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactHotkeysStrings {
  
  @scala.inline
  def ApplicationKeyMap: ApplicationKeyMap = "ApplicationKeyMap".asInstanceOf[ApplicationKeyMap]
  
  @scala.inline
  def KeyCombination: KeyCombination = "KeyCombination".asInstanceOf[KeyCombination]
  
  @scala.inline
  def KeyMap: KeyMap = "KeyMap".asInstanceOf[KeyMap]
  
  @scala.inline
  def keydown: keydown = "keydown".asInstanceOf[keydown]
  
  @scala.inline
  def keypress: keypress = "keypress".asInstanceOf[keypress]
  
  @scala.inline
  def keyup: keyup = "keyup".asInstanceOf[keyup]
  
  @js.native
  sealed trait ApplicationKeyMap extends js.Object
  
  @js.native
  sealed trait KeyCombination extends js.Object
  
  @js.native
  sealed trait KeyMap extends js.Object
  
  @js.native
  sealed trait keydown extends KeyEventName
  
  @js.native
  sealed trait keypress extends KeyEventName
  
  @js.native
  sealed trait keyup extends KeyEventName
}
