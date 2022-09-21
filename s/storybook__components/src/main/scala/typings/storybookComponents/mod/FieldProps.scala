package typings.storybookComponents.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldProps extends StObject {
  
  var label: js.UndefOr[ReactNode] = js.undefined
}
object FieldProps {
  
  inline def apply(): FieldProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldProps]
  }
  
  extension [Self <: FieldProps](x: Self) {
    
    inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
