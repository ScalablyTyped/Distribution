package typings.router5

import typings.router5.routerMod.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateMod {
  
  @JSImport("router5/dist/core/state", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Dependencies](router: Router[Dependencies]): Router[Dependencies] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(router.asInstanceOf[js.Any]).asInstanceOf[Router[Dependencies]]
}
