package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBreadcrumbItemMod {
  
  @JSImport("react-bootstrap/lib/BreadcrumbItem", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[BreadcrumbItemProps, js.Object, Any]
  
  type BreadcrumbItem = Component[BreadcrumbItemProps, js.Object, Any]
  
  trait BreadcrumbItemProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[BreadcrumbItem]] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object BreadcrumbItemProps {
    
    inline def apply(): BreadcrumbItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbItemProps]
    }
    
    extension [Self <: BreadcrumbItemProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setRef(value: LegacyRef[BreadcrumbItem]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ BreadcrumbItem | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
