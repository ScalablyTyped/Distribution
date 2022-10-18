package typings.raygun

import typings.raygun.buildTypesMod.SendOptionsWithoutCB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildRaygunDotsyncDottransportMod {
  
  @JSImport("raygun/build/raygun.sync.transport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def send(options: SendOptionsWithoutCB): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
