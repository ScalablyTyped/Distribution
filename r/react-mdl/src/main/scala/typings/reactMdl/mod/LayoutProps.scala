package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutProps
  extends HTMLProps[js.Any] {
  
  var fixedDrawer: js.UndefOr[Boolean] = js.native
  
  var fixedHeader: js.UndefOr[Boolean] = js.native
  
  var fixedTabs: js.UndefOr[Boolean] = js.native
}
object LayoutProps {
  
  @scala.inline
  def apply(): LayoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutProps]
  }
  
  @scala.inline
  implicit class LayoutPropsMutableBuilder[Self <: LayoutProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixedDrawer(value: Boolean): Self = StObject.set(x, "fixedDrawer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedDrawerUndefined: Self = StObject.set(x, "fixedDrawer", js.undefined)
    
    @scala.inline
    def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
    
    @scala.inline
    def setFixedTabs(value: Boolean): Self = StObject.set(x, "fixedTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedTabsUndefined: Self = StObject.set(x, "fixedTabs", js.undefined)
  }
}
