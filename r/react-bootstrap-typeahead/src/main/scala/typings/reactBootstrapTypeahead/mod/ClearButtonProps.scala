package typings.reactBootstrapTypeahead.mod

import typings.react.mod.HTMLAttributes
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearButtonProps
  extends StObject
     with HTMLAttributes[button] {
  
  var bsSize: js.UndefOr[TypeaheadBsSizes] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
}
object ClearButtonProps {
  
  inline def apply(): ClearButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearButtonProps]
  }
  
  extension [Self <: ClearButtonProps](x: Self) {
    
    inline def setBsSize(value: TypeaheadBsSizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
    
    inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
