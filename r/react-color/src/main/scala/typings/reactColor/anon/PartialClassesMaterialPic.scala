package typings.reactColor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/material/Material.MaterialPickerStylesProps>> */
trait PartialClassesMaterialPic extends StObject {
  
  var default: js.UndefOr[PartialMaterialPickerStyl] = js.undefined
}
object PartialClassesMaterialPic {
  
  inline def apply(): PartialClassesMaterialPic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesMaterialPic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialClassesMaterialPic] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: PartialMaterialPickerStyl): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
