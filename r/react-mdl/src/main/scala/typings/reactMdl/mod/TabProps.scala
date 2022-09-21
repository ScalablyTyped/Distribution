package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabProps
  extends StObject
     with HTMLProps[Any]
     with CustomRenderedComponent {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var cssPrefix: js.UndefOr[String] = js.undefined
  
  var onTabClick: js.UndefOr[js.Function1[/* tabId */ Double, Any]] = js.undefined
  
  var tabId: js.UndefOr[Double] = js.undefined
}
object TabProps {
  
  inline def apply(): TabProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabProps]
  }
  
  extension [Self <: TabProps](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCssPrefix(value: String): Self = StObject.set(x, "cssPrefix", value.asInstanceOf[js.Any])
    
    inline def setCssPrefixUndefined: Self = StObject.set(x, "cssPrefix", js.undefined)
    
    inline def setOnTabClick(value: /* tabId */ Double => Any): Self = StObject.set(x, "onTabClick", js.Any.fromFunction1(value))
    
    inline def setOnTabClickUndefined: Self = StObject.set(x, "onTabClick", js.undefined)
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
  }
}
