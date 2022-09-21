package typings.rcSelect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useIdMod {
  
  @JSImport("rc-select/lib/hooks/useId", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[String]
  inline def default(id: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(id.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getUUID(): Double | String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUUID")().asInstanceOf[Double | String]
  
  @JSImport("rc-select/lib/hooks/useId", "isBrowserClient")
  @js.native
  val isBrowserClient: Boolean = js.native
}
