package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibRightPadMod {
  
  @JSImport("snyk/dist/lib/right-pad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rightPadWithSpaces(s: String, padding: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rightPadWithSpaces")(s.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[String]
}
