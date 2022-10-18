package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliRuntimeMod {
  
  @JSImport("snyk/dist/cli/runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isSupported(runtimeVersion: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")(runtimeVersion.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("snyk/dist/cli/runtime", "supportedRange")
  @js.native
  val supportedRange: String = js.native
}
