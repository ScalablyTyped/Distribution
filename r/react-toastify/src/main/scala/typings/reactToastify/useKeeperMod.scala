package typings.reactToastify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useKeeperMod {
  
  @JSImport("react-toastify/dist/hooks/useKeeper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useKeeper[T](arg: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeeper")(arg.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useKeeper[T](arg: T, refresh: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeeper")(arg.asInstanceOf[js.Any], refresh.asInstanceOf[js.Any])).asInstanceOf[T]
}
