package typings.reactBootstrap.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-bootstrap", "Dropdown")
@js.native
open class Dropdown ()
  extends typings.reactBootstrap.libMod.Dropdown
object Dropdown {
  
  @JSImport("react-bootstrap", "Dropdown")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap", "Dropdown.Menu")
  @js.native
  open class Menu ()
    extends typings.reactBootstrap.libDropdownMenuMod.^
  /* static member */
  @JSImport("react-bootstrap", "Dropdown.Menu")
  @js.native
  def Menu: Instantiable0[typings.reactBootstrap.libDropdownMenuMod.^] = js.native
  inline def Menu_=(x: Instantiable0[typings.reactBootstrap.libDropdownMenuMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Menu")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap", "Dropdown.Toggle")
  @js.native
  open class Toggle ()
    extends typings.reactBootstrap.libDropdownToggleMod.^
  /* static member */
  @JSImport("react-bootstrap", "Dropdown.Toggle")
  @js.native
  def Toggle: Instantiable0[typings.reactBootstrap.libDropdownToggleMod.^] = js.native
  inline def Toggle_=(x: Instantiable0[typings.reactBootstrap.libDropdownToggleMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Toggle")(x.asInstanceOf[js.Any])
}
