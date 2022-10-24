package typings.reactAriaInteractions.mod

import typings.react.mod.RefObject
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PressHookProps
  extends StObject
     with PressProps {
  
  /** A ref to the target element. */
  var ref: js.UndefOr[RefObject[Element]] = js.undefined
}
object PressHookProps {
  
  inline def apply(): PressHookProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PressHookProps]
  }
  
  extension [Self <: PressHookProps](x: Self) {
    
    inline def setRef(value: RefObject[Element]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
