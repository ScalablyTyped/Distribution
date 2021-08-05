package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tryCatchMod {
  
  @JSImport("rxjs/internal/util/tryCatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tryCatch[T /* <: js.Function */](fn: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("tryCatch")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
}
