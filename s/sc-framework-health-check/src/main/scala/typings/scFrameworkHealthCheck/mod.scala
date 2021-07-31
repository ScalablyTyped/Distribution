package typings.scFrameworkHealthCheck

import typings.express.mod.Express
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sc-framework-health-check", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def attach(worker: typings.socketcluster.scworkerMod.^, expressApp: Express): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(worker.asInstanceOf[js.Any], expressApp.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
