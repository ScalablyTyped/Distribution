package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutProps
  extends StObject
     with HTMLProps[Any] {
  
  var fixedDrawer: js.UndefOr[Boolean] = js.undefined
  
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
  
  var fixedTabs: js.UndefOr[Boolean] = js.undefined
}
object LayoutProps {
  
  inline def apply(): LayoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutProps]
  }
  
  extension [Self <: LayoutProps](x: Self) {
    
    inline def setFixedDrawer(value: Boolean): Self = StObject.set(x, "fixedDrawer", value.asInstanceOf[js.Any])
    
    inline def setFixedDrawerUndefined: Self = StObject.set(x, "fixedDrawer", js.undefined)
    
    inline def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
    
    inline def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
    
    inline def setFixedTabs(value: Boolean): Self = StObject.set(x, "fixedTabs", value.asInstanceOf[js.Any])
    
    inline def setFixedTabsUndefined: Self = StObject.set(x, "fixedTabs", js.undefined)
  }
}
