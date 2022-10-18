package typings.reactBootstrap.libMod

import org.scalablytyped.runtime.Instantiable0
import typings.reactBootstrap.libPagerMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-bootstrap/lib", "Pager")
@js.native
open class Pager () extends ^
object Pager {
  
  @JSImport("react-bootstrap/lib", "Pager")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib", "Pager.Item")
  @js.native
  open class Item ()
    extends typings.reactBootstrap.libPagerItemMod.^
  /* static member */
  @JSImport("react-bootstrap/lib", "Pager.Item")
  @js.native
  def Item: Instantiable0[typings.reactBootstrap.libPagerItemMod.^] = js.native
  inline def Item_=(x: Instantiable0[typings.reactBootstrap.libPagerItemMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
