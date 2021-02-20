package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorMergeScanMod {
  
  @JSImport("rxjs-compat/operator/mergeScan", "mergeScan")
  @js.native
  def mergeScan[T, R](
    accumulator: js.Function2[
      /* acc */ R, 
      /* value */ T, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
    ],
    seed: R
  ): js.Any = js.native
  @JSImport("rxjs-compat/operator/mergeScan", "mergeScan")
  @js.native
  def mergeScan[T, R](
    accumulator: js.Function2[
      /* acc */ R, 
      /* value */ T, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
    ],
    seed: R,
    concurrent: Double
  ): js.Any = js.native
}
