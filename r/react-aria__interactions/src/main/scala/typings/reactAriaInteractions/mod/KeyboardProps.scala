package typings.reactAriaInteractions.mod

import typings.reactTypesShared.srcEventsMod.KeyboardEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardProps
  extends StObject
     with KeyboardEvents {
  
  /** Whether the keyboard events should be disabled. */
  var isDisabled: js.UndefOr[Boolean] = js.undefined
}
object KeyboardProps {
  
  inline def apply(): KeyboardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardProps]
  }
  
  extension [Self <: KeyboardProps](x: Self) {
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
  }
}
