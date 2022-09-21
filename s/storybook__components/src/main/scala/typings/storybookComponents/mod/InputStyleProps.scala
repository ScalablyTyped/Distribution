package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputStyleProps extends StObject {
  
  var align: js.UndefOr[Alignments] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Sizes] = js.undefined
  
  var valid: js.UndefOr[ValidationStates] = js.undefined
}
object InputStyleProps {
  
  inline def apply(): InputStyleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputStyleProps]
  }
  
  extension [Self <: InputStyleProps](x: Self) {
    
    inline def setAlign(value: Alignments): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSize(value: Sizes): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setValid(value: ValidationStates): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
  }
}
