package typings.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbMod {
  
  @JSImport("react-bootstrap/lib/Breadcrumb", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[BreadcrumbProps, js.Object, js.Any]
  @JSImport("react-bootstrap/lib/Breadcrumb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Breadcrumb", "Item")
  @js.native
  class Item ()
    extends typings.reactBootstrap.breadcrumbItemMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Breadcrumb", "Item")
  @js.native
  def Item: Instantiable0[typings.reactBootstrap.breadcrumbItemMod.^] = js.native
  @scala.inline
  def Item_=(x: Instantiable0[typings.reactBootstrap.breadcrumbItemMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Breadcrumb
    extends Component[BreadcrumbProps, js.Object, js.Any]
  
  @js.native
  trait BreadcrumbProps extends HTMLProps[Breadcrumb] {
    
    var bsClass: js.UndefOr[String] = js.native
  }
  object BreadcrumbProps {
    
    @scala.inline
    def apply(): BreadcrumbProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbProps]
    }
    
    @scala.inline
    implicit class BreadcrumbPropsMutableBuilder[Self <: BreadcrumbProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
    }
  }
}
