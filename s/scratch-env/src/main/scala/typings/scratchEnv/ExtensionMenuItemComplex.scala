package typings.scratchEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A menu item for which the label and value can differ. */
trait ExtensionMenuItemComplex extends StObject {
  
  /** The human-readable label of this menu item in the menu. */
  var text: String
  
  /** The value of the block argument when this menu item is selected. */
  var value: js.Any
}
object ExtensionMenuItemComplex {
  
  @scala.inline
  def apply(text: String, value: js.Any): ExtensionMenuItemComplex = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionMenuItemComplex]
  }
  
  @scala.inline
  implicit class ExtensionMenuItemComplexMutableBuilder[Self <: ExtensionMenuItemComplex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
