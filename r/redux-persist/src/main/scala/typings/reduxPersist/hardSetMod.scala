package typings.reduxPersist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hardSetMod {
  
  @JSImport("redux-persist/es/stateReconciler/hardSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S](inboundState: S): S = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(inboundState.asInstanceOf[js.Any]).asInstanceOf[S]
}
