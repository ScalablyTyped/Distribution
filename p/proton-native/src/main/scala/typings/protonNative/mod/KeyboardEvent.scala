package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardEvent extends StObject {
  
  var extKey: Double
  
  var key: String
  
  var modifierKey: Double
  
  var modifiers: Double
}
object KeyboardEvent {
  
  @scala.inline
  def apply(extKey: Double, key: String, modifierKey: Double, modifiers: Double): KeyboardEvent = {
    val __obj = js.Dynamic.literal(extKey = extKey.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], modifierKey = modifierKey.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEvent]
  }
  
  @scala.inline
  implicit class KeyboardEventMutableBuilder[Self <: KeyboardEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtKey(value: Double): Self = StObject.set(x, "extKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierKey(value: Double): Self = StObject.set(x, "modifierKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiers(value: Double): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
  }
}
