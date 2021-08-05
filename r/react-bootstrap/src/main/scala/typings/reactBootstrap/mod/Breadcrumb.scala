package typings.reactBootstrap.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-bootstrap", "Breadcrumb")
@js.native
class Breadcrumb ()
  extends typings.reactBootstrap.libMod.Breadcrumb
object Breadcrumb {
  
  @JSImport("react-bootstrap", "Breadcrumb")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap", "Breadcrumb.Item")
  @js.native
  class Item ()
    extends typings.reactBootstrap.breadcrumbItemMod.^
  /* static member */
  @JSImport("react-bootstrap", "Breadcrumb.Item")
  @js.native
  def Item: Instantiable0[typings.reactBootstrap.breadcrumbItemMod.^] = js.native
  inline def Item_=(x: Instantiable0[typings.reactBootstrap.breadcrumbItemMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
