package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distinctUntilKeyChangedMod {
  
  @JSImport("rxjs-compat/operators/distinctUntilKeyChanged", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def distinctUntilKeyChanged[T](key: /* keyof T */ String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilKeyChanged")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def distinctUntilKeyChanged[T, K /* <: /* keyof T */ String */](
    key: K,
    compare: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* x */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* y */ js.Any, 
      Boolean
    ]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilKeyChanged")(key.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
