package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorDistinctUntilKeyChangedMod {
  
  @JSImport("rxjs-compat/operator/distinctUntilKeyChanged", "distinctUntilKeyChanged")
  @js.native
  def distinctUntilKeyChanged[T](key: /* keyof T */ String): js.Any = js.native
  @JSImport("rxjs-compat/operator/distinctUntilKeyChanged", "distinctUntilKeyChanged")
  @js.native
  def distinctUntilKeyChanged[T, K /* <: /* keyof T */ String */](
    key: K,
    compare: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* x */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* y */ js.Any, 
      Boolean
    ]
  ): js.Any = js.native
}
