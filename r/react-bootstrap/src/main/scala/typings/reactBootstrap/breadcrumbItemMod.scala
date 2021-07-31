package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.Props
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbItemMod {
  
  @JSImport("react-bootstrap/lib/BreadcrumbItem", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[BreadcrumbItemProps, js.Object, js.Any]
  
  @js.native
  trait BreadcrumbItem
    extends Component[BreadcrumbItemProps, js.Object, js.Any]
  
  trait BreadcrumbItemProps
    extends StObject
       with Props[BreadcrumbItem] {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object BreadcrumbItemProps {
    
    @scala.inline
    def apply(): BreadcrumbItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbItemProps]
    }
    
    @scala.inline
    implicit class BreadcrumbItemPropsMutableBuilder[Self <: BreadcrumbItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
