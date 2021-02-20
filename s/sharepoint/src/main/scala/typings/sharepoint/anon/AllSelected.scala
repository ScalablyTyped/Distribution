package typings.sharepoint.anon

import typings.sharepoint.SP.JsGrid.IStyleType.Header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllSelected extends StObject {
  
  var allSelected: Header = js.native
  
  var allSelectedHover: Header = js.native
  
  var normal: Header = js.native
  
  var normalHover: Header = js.native
  
  var partSelected: Header = js.native
  
  var partSelectedHover: Header = js.native
}
object AllSelected {
  
  @scala.inline
  def apply(
    allSelected: Header,
    allSelectedHover: Header,
    normal: Header,
    normalHover: Header,
    partSelected: Header,
    partSelectedHover: Header
  ): AllSelected = {
    val __obj = js.Dynamic.literal(allSelected = allSelected.asInstanceOf[js.Any], allSelectedHover = allSelectedHover.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalHover = normalHover.asInstanceOf[js.Any], partSelected = partSelected.asInstanceOf[js.Any], partSelectedHover = partSelectedHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllSelected]
  }
  
  @scala.inline
  implicit class AllSelectedMutableBuilder[Self <: AllSelected] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllSelected(value: Header): Self = StObject.set(x, "allSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllSelectedHover(value: Header): Self = StObject.set(x, "allSelectedHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: Header): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalHover(value: Header): Self = StObject.set(x, "normalHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartSelected(value: Header): Self = StObject.set(x, "partSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartSelectedHover(value: Header): Self = StObject.set(x, "partSelectedHover", value.asInstanceOf[js.Any])
  }
}
