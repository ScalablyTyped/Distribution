package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorMergeScanMod {
  
  @JSImport("rxjs-compat/operator/mergeScan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeScan[T, R](
    accumulator: js.Function2[
      /* acc */ R, 
      /* value */ T, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
    ],
    seed: R
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeScan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def mergeScan[T, R](
    accumulator: js.Function2[
      /* acc */ R, 
      /* value */ T, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
    ],
    seed: R,
    concurrent: Double
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeScan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
