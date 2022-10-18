package typings.reactBootstrap.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-bootstrap", "Pager")
@js.native
open class Pager ()
  extends typings.reactBootstrap.libMod.Pager
object Pager {
  
  @JSImport("react-bootstrap", "Pager")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap", "Pager.Item")
  @js.native
  open class Item ()
    extends typings.reactBootstrap.libPagerItemMod.^
  /* static member */
  @JSImport("react-bootstrap", "Pager.Item")
  @js.native
  def Item: Instantiable0[typings.reactBootstrap.libPagerItemMod.^] = js.native
  inline def Item_=(x: Instantiable0[typings.reactBootstrap.libPagerItemMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
