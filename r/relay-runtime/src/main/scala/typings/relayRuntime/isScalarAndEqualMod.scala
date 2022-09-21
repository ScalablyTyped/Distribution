package typings.relayRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isScalarAndEqualMod {
  
  @JSImport("relay-runtime/lib/util/isScalarAndEqual", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(valueA: Any, valueB: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(valueA.asInstanceOf[js.Any], valueB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
