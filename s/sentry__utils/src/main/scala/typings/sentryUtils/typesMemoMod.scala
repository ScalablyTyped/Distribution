package typings.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMemoMod {
  
  @JSImport("@sentry/utils/types/memo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def memoBuilder(): MemoFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("memoBuilder")().asInstanceOf[MemoFunc]
  
  type MemoFunc = js.Tuple2[js.Function1[/* obj */ Any, Boolean], js.Function1[/* obj */ Any, Unit]]
}
