package typings.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBreadcrumbMod {
  
  @JSImport("react-bootstrap/lib/Breadcrumb", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[BreadcrumbProps, js.Object, Any]
  @JSImport("react-bootstrap/lib/Breadcrumb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Breadcrumb", "Item")
  @js.native
  open class Item ()
    extends typings.reactBootstrap.libBreadcrumbItemMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Breadcrumb", "Item")
  @js.native
  def Item: Instantiable0[typings.reactBootstrap.libBreadcrumbItemMod.^] = js.native
  inline def Item_=(x: Instantiable0[typings.reactBootstrap.libBreadcrumbItemMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  type Breadcrumb = Component[BreadcrumbProps, js.Object, Any]
  
  trait BreadcrumbProps
    extends StObject
       with HTMLProps[Breadcrumb] {
    
    var bsClass: js.UndefOr[String] = js.undefined
  }
  object BreadcrumbProps {
    
    inline def apply(): BreadcrumbProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreadcrumbProps] (val x: Self) extends AnyVal {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
    }
  }
}
