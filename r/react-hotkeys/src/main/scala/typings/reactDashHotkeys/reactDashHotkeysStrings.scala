package typings.reactDashHotkeys

import typings.reactDashHotkeys.reactDashHotkeysMod.KeyEventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashHotkeysStrings {
  @js.native
  sealed trait ApplicationKeyMap extends js.Object
  
  @js.native
  sealed trait KeyMap extends js.Object
  
  @js.native
  sealed trait keydown extends KeyEventName
  
  @js.native
  sealed trait keypress extends KeyEventName
  
  @js.native
  sealed trait keyup extends KeyEventName
  
  @scala.inline
  def ApplicationKeyMap: ApplicationKeyMap = "ApplicationKeyMap".asInstanceOf[ApplicationKeyMap]
  @scala.inline
  def KeyMap: KeyMap = "KeyMap".asInstanceOf[KeyMap]
  @scala.inline
  def keydown: keydown = "keydown".asInstanceOf[keydown]
  @scala.inline
  def keypress: keypress = "keypress".asInstanceOf[keypress]
  @scala.inline
  def keyup: keyup = "keyup".asInstanceOf[keyup]
}

