package typings.reactBootstrapTypeahead.mod

import typings.react.mod.HTMLAttributes
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearButtonProps
  extends StObject
     with HTMLAttributes[button] {
  
  var label: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[TypeaheadBsSizes] = js.undefined
}
object ClearButtonProps {
  
  inline def apply(): ClearButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearButtonProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearButtonProps] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSize(value: TypeaheadBsSizes): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
