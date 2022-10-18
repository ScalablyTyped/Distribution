package typings.restartHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsUseDebouncedValueMod {
  
  @JSImport("@restart/hooks/cjs/useDebouncedValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TValue](value: TValue): TValue = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[TValue]
  inline def default[TValue](value: TValue, delayMs: Double): TValue = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], delayMs.asInstanceOf[js.Any])).asInstanceOf[TValue]
}
