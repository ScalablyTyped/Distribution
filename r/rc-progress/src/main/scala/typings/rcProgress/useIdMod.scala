package typings.rcProgress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useIdMod {
  
  @JSImport("rc-progress/es/hooks/useId", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[String]
  inline def default(id: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(id.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("rc-progress/es/hooks/useId", "isBrowserClient")
  @js.native
  val isBrowserClient: Boolean = js.native
}
