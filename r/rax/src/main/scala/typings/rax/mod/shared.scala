package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shared {
  
  @JSImport("rax", "shared")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rax", "shared.Element")
  @js.native
  def Element: RaxElement[Any, String | JSXElementConstructor[Any]] = js.native
  inline def Element_=(x: RaxElement[Any, String | JSXElementConstructor[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Element")(x.asInstanceOf[js.Any])
  
  @JSImport("rax", "shared.Host")
  @js.native
  def Host: Any = js.native
  inline def Host_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Host")(x.asInstanceOf[js.Any])
  
  @JSImport("rax", "shared.Instance")
  @js.native
  def Instance: RaxInstance = js.native
  inline def Instance_=(x: RaxInstance): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Instance")(x.asInstanceOf[js.Any])
  
  @JSImport("rax", "shared.flattenChildren")
  @js.native
  def flattenChildren: Any = js.native
  inline def flattenChildren_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flattenChildren")(x.asInstanceOf[js.Any])
}
