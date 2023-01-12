package typings.rbx.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datatooltip extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var `data-badge`: js.UndefOr[String | Double] = js.undefined
  
  var `data-tooltip`: js.UndefOr[String | Double] = js.undefined
}
object Datatooltip {
  
  inline def apply(): Datatooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datatooltip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Datatooltip] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def `setData-badge`(value: String | Double): Self = StObject.set(x, "data-badge", value.asInstanceOf[js.Any])
    
    inline def `setData-badgeUndefined`: Self = StObject.set(x, "data-badge", js.undefined)
    
    inline def `setData-tooltip`(value: String | Double): Self = StObject.set(x, "data-tooltip", value.asInstanceOf[js.Any])
    
    inline def `setData-tooltipUndefined`: Self = StObject.set(x, "data-tooltip", js.undefined)
  }
}
