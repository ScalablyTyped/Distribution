package typings.rebindHost

import typings.express.mod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Handler = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Handler]
  inline def apply(forceHost: String): Handler = ^.asInstanceOf[js.Dynamic].apply(forceHost.asInstanceOf[js.Any]).asInstanceOf[Handler]
  
  @JSImport("rebind-host", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
