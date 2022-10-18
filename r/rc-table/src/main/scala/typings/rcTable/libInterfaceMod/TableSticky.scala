package typings.rcTable.libInterfaceMod

import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableSticky extends StObject {
  
  var getContainer: js.UndefOr[js.Function0[Window | HTMLElement]] = js.undefined
  
  var offsetHeader: js.UndefOr[Double] = js.undefined
  
  var offsetScroll: js.UndefOr[Double] = js.undefined
  
  var offsetSummary: js.UndefOr[Double] = js.undefined
}
object TableSticky {
  
  inline def apply(): TableSticky = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableSticky]
  }
  
  extension [Self <: TableSticky](x: Self) {
    
    inline def setGetContainer(value: () => Window | HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
    
    inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
    
    inline def setOffsetHeader(value: Double): Self = StObject.set(x, "offsetHeader", value.asInstanceOf[js.Any])
    
    inline def setOffsetHeaderUndefined: Self = StObject.set(x, "offsetHeader", js.undefined)
    
    inline def setOffsetScroll(value: Double): Self = StObject.set(x, "offsetScroll", value.asInstanceOf[js.Any])
    
    inline def setOffsetScrollUndefined: Self = StObject.set(x, "offsetScroll", js.undefined)
    
    inline def setOffsetSummary(value: Double): Self = StObject.set(x, "offsetSummary", value.asInstanceOf[js.Any])
    
    inline def setOffsetSummaryUndefined: Self = StObject.set(x, "offsetSummary", js.undefined)
  }
}
