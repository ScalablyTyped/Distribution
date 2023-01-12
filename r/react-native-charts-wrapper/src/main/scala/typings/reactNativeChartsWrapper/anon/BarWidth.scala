package typings.reactNativeChartsWrapper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarWidth extends StObject {
  
  var barWidth: js.UndefOr[Double] = js.undefined
  
  var group: js.UndefOr[BarSpace] = js.undefined
}
object BarWidth {
  
  inline def apply(): BarWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarWidth] (val x: Self) extends AnyVal {
    
    inline def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
    
    inline def setBarWidthUndefined: Self = StObject.set(x, "barWidth", js.undefined)
    
    inline def setGroup(value: BarSpace): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
  }
}
