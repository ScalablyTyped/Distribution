package typings.reactHotkeys

import typings.reactHotkeys.mod.KeyEventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactHotkeysStrings {
  
  @js.native
  sealed trait ApplicationKeyMap extends StObject
  inline def ApplicationKeyMap: ApplicationKeyMap = "ApplicationKeyMap".asInstanceOf[ApplicationKeyMap]
  
  @js.native
  sealed trait KeyCombination extends StObject
  inline def KeyCombination: KeyCombination = "KeyCombination".asInstanceOf[KeyCombination]
  
  @js.native
  sealed trait KeyMap extends StObject
  inline def KeyMap: KeyMap = "KeyMap".asInstanceOf[KeyMap]
  
  @js.native
  sealed trait keydown
    extends StObject
       with KeyEventName
  inline def keydown: keydown = "keydown".asInstanceOf[keydown]
  
  @js.native
  sealed trait keypress
    extends StObject
       with KeyEventName
  inline def keypress: keypress = "keypress".asInstanceOf[keypress]
  
  @js.native
  sealed trait keyup
    extends StObject
       with KeyEventName
  inline def keyup: keyup = "keyup".asInstanceOf[keyup]
}
