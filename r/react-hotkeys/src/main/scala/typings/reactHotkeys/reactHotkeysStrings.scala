package typings.reactHotkeys

import typings.reactHotkeys.mod.KeyEventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactHotkeysStrings {
  
  @js.native
  sealed trait ApplicationKeyMap extends StObject
  @scala.inline
  def ApplicationKeyMap: ApplicationKeyMap = "ApplicationKeyMap".asInstanceOf[ApplicationKeyMap]
  
  @js.native
  sealed trait KeyCombination extends StObject
  @scala.inline
  def KeyCombination: KeyCombination = "KeyCombination".asInstanceOf[KeyCombination]
  
  @js.native
  sealed trait KeyMap extends StObject
  @scala.inline
  def KeyMap: KeyMap = "KeyMap".asInstanceOf[KeyMap]
  
  @js.native
  sealed trait keydown extends KeyEventName
  @scala.inline
  def keydown: keydown = "keydown".asInstanceOf[keydown]
  
  @js.native
  sealed trait keypress extends KeyEventName
  @scala.inline
  def keypress: keypress = "keypress".asInstanceOf[keypress]
  
  @js.native
  sealed trait keyup extends KeyEventName
  @scala.inline
  def keyup: keyup = "keyup".asInstanceOf[keyup]
}
