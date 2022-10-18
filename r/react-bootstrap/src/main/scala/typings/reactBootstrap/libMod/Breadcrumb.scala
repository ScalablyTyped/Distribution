package typings.reactBootstrap.libMod

import org.scalablytyped.runtime.Instantiable0
import typings.reactBootstrap.libBreadcrumbMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-bootstrap/lib", "Breadcrumb")
@js.native
open class Breadcrumb () extends ^
object Breadcrumb {
  
  @JSImport("react-bootstrap/lib", "Breadcrumb")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib", "Breadcrumb.Item")
  @js.native
  open class Item ()
    extends typings.reactBootstrap.libBreadcrumbItemMod.^
  /* static member */
  @JSImport("react-bootstrap/lib", "Breadcrumb.Item")
  @js.native
  def Item: Instantiable0[typings.reactBootstrap.libBreadcrumbItemMod.^] = js.native
  inline def Item_=(x: Instantiable0[typings.reactBootstrap.libBreadcrumbItemMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
