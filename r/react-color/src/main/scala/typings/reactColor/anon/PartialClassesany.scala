package typings.reactColor.anon

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reactcss.reactcss.Classes<any>> */
trait PartialClassesany extends StObject {
  
  var default: js.UndefOr[Partial[Any]] = js.undefined
}
object PartialClassesany {
  
  inline def apply(): PartialClassesany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesany]
  }
  
  extension [Self <: PartialClassesany](x: Self) {
    
    inline def setDefault(value: Partial[Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
