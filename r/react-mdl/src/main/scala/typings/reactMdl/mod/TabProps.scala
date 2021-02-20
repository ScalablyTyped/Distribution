package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabProps
  extends HTMLProps[js.Any]
     with CustomRenderedComponent {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var cssPrefix: js.UndefOr[String] = js.native
  
  var onTabClick: js.UndefOr[js.Function1[/* tabId */ Double, _]] = js.native
  
  var tabId: js.UndefOr[Double] = js.native
}
object TabProps {
  
  @scala.inline
  def apply(): TabProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabProps]
  }
  
  @scala.inline
  implicit class TabPropsMutableBuilder[Self <: TabProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setCssPrefix(value: String): Self = StObject.set(x, "cssPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssPrefixUndefined: Self = StObject.set(x, "cssPrefix", js.undefined)
    
    @scala.inline
    def setOnTabClick(value: /* tabId */ Double => _): Self = StObject.set(x, "onTabClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTabClickUndefined: Self = StObject.set(x, "onTabClick", js.undefined)
    
    @scala.inline
    def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
  }
}
