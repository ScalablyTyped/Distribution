package typings.rbx.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var `data-tooltip`: js.UndefOr[String | Double] = js.undefined
}
object `5` {
  
  inline def apply(): `5` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `5`] (val x: Self) extends AnyVal {
    
    inline def `setData-tooltip`(value: String | Double): Self = StObject.set(x, "data-tooltip", value.asInstanceOf[js.Any])
    
    inline def `setData-tooltipUndefined`: Self = StObject.set(x, "data-tooltip", js.undefined)
  }
}
