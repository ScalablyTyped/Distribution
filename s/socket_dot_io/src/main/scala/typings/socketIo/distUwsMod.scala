package typings.socketIo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUwsMod {
  
  @JSImport("socket.io/dist/uws", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def patchAdapter(app: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("patchAdapter")(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def restoreAdapter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restoreAdapter")().asInstanceOf[Unit]
  
  inline def serveFile(res: Any, filepath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serveFile")(res.asInstanceOf[js.Any], filepath.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
