package typings.rbx.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Datatooltip extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var `data-badge`: js.UndefOr[String | Double] = js.native
  
  var `data-tooltip`: js.UndefOr[String | Double] = js.native
}
object Datatooltip {
  
  @scala.inline
  def apply(): Datatooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datatooltip]
  }
  
  @scala.inline
  implicit class DatatooltipMutableBuilder[Self <: Datatooltip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def `setData-badge`(value: String | Double): Self = StObject.set(x, "data-badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setData-badgeUndefined`: Self = StObject.set(x, "data-badge", js.undefined)
    
    @scala.inline
    def `setData-tooltip`(value: String | Double): Self = StObject.set(x, "data-tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setData-tooltipUndefined`: Self = StObject.set(x, "data-tooltip", js.undefined)
  }
}
