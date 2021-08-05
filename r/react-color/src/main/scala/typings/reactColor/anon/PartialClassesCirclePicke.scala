package typings.reactColor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/circle/Circle.CirclePickerStylesProps>> */
trait PartialClassesCirclePicke extends StObject {
  
  var default: js.UndefOr[PartialCirclePickerStyles] = js.undefined
}
object PartialClassesCirclePicke {
  
  inline def apply(): PartialClassesCirclePicke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesCirclePicke]
  }
  
  extension [Self <: PartialClassesCirclePicke](x: Self) {
    
    inline def setDefault(value: PartialCirclePickerStyles): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
