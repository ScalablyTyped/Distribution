package typings.sigstore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliMod {
  
  @JSImport("sigstore/dist/cli", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def processArgv(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("processArgv")().asInstanceOf[js.Promise[Unit]]
}
