package typings.primereact

import typings.primereact.menuItemMod.MenuItem
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbBreadCrumbMod {
  
  @JSImport("primereact/components/breadcrumb/BreadCrumb", "BreadCrumb")
  @js.native
  class BreadCrumb protected ()
    extends Component[BreadCrumbProps, js.Any, js.Any] {
    def this(props: BreadCrumbProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BreadCrumbProps, context: js.Any) = this()
  }
  
  trait BreadCrumbProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var home: js.UndefOr[js.Any] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var model: js.UndefOr[js.Array[MenuItem]] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object BreadCrumbProps {
    
    inline def apply(): BreadCrumbProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadCrumbProps]
    }
    
    extension [Self <: BreadCrumbProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHome(value: js.Any): Self = StObject.set(x, "home", value.asInstanceOf[js.Any])
      
      inline def setHomeUndefined: Self = StObject.set(x, "home", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setModel(value: js.Array[MenuItem]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setModelVarargs(value: MenuItem*): Self = StObject.set(x, "model", js.Array(value :_*))
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
