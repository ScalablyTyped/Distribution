package typings.reactScrollSync

import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-scroll-sync", "ScrollSync")
  @js.native
  val ScrollSync: FC[ScrollSyncProps] = js.native
  
  @JSImport("react-scroll-sync", "ScrollSyncPane")
  @js.native
  val ScrollSyncPane: FC[ScrollSyncPaneProps] = js.native
  
  trait ScrollSyncPaneProps extends StObject {
    
    var attachTo: js.UndefOr[HTMLElement] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var group: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object ScrollSyncPaneProps {
    
    inline def apply(): ScrollSyncPaneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollSyncPaneProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollSyncPaneProps] (val x: Self) extends AnyVal {
      
      inline def setAttachTo(value: HTMLElement): Self = StObject.set(x, "attachTo", value.asInstanceOf[js.Any])
      
      inline def setAttachToUndefined: Self = StObject.set(x, "attachTo", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setGroup(value: String | js.Array[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setGroupVarargs(value: String*): Self = StObject.set(x, "group", js.Array(value*))
    }
  }
  
  trait ScrollSyncProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var onSync: js.UndefOr[js.Function1[/* el */ Element, Unit]] = js.undefined
    
    var proportional: js.UndefOr[Boolean] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object ScrollSyncProps {
    
    inline def apply(): ScrollSyncProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollSyncProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollSyncProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setOnSync(value: /* el */ Element => Unit): Self = StObject.set(x, "onSync", js.Any.fromFunction1(value))
      
      inline def setOnSyncUndefined: Self = StObject.set(x, "onSync", js.undefined)
      
      inline def setProportional(value: Boolean): Self = StObject.set(x, "proportional", value.asInstanceOf[js.Any])
      
      inline def setProportionalUndefined: Self = StObject.set(x, "proportional", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
