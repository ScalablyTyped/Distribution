package typings.reactNativeChartsWrapper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarWidth extends StObject {
  
  var barWidth: js.UndefOr[Double] = js.native
  
  var group: js.UndefOr[BarSpace] = js.native
}
object BarWidth {
  
  @scala.inline
  def apply(): BarWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarWidth]
  }
  
  @scala.inline
  implicit class BarWidthMutableBuilder[Self <: BarWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarWidthUndefined: Self = StObject.set(x, "barWidth", js.undefined)
    
    @scala.inline
    def setGroup(value: BarSpace): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
  }
}
