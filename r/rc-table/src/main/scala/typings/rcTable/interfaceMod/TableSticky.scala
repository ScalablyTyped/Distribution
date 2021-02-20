package typings.rcTable.interfaceMod

import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableSticky extends StObject {
  
  var getContainer: js.UndefOr[js.Function0[Window | HTMLElement]] = js.native
  
  var offsetHeader: js.UndefOr[Double] = js.native
  
  var offsetScroll: js.UndefOr[Double] = js.native
}
object TableSticky {
  
  @scala.inline
  def apply(): TableSticky = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableSticky]
  }
  
  @scala.inline
  implicit class TableStickyMutableBuilder[Self <: TableSticky] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetContainer(value: () => Window | HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
    
    @scala.inline
    def setOffsetHeader(value: Double): Self = StObject.set(x, "offsetHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetHeaderUndefined: Self = StObject.set(x, "offsetHeader", js.undefined)
    
    @scala.inline
    def setOffsetScroll(value: Double): Self = StObject.set(x, "offsetScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetScrollUndefined: Self = StObject.set(x, "offsetScroll", js.undefined)
  }
}
