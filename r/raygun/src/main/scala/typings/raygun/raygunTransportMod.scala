package typings.raygun

import typings.raygun.typesMod.SendOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object raygunTransportMod {
  
  @JSImport("raygun/build/raygun.transport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def send(options: SendOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
