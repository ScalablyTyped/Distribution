package typings.reduxObservable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsConsoleMod {
  
  @JSImport("redux-observable/dist/types/utils/console", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deprecate(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deprecate")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def resetDeprecationsSeen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetDeprecationsSeen")().asInstanceOf[Unit]
  
  inline def warn(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
