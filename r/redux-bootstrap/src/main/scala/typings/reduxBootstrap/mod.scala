package typings.reduxBootstrap

import typings.reduxBootstrap.interfacesMod.interfaces.BoostrapOptions
import typings.reduxBootstrap.interfacesMod.interfaces.BootstrapResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-bootstrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def bootstrap(options: BoostrapOptions): BootstrapResult = ^.asInstanceOf[js.Dynamic].applyDynamic("bootstrap")(options.asInstanceOf[js.Any]).asInstanceOf[BootstrapResult]
}
