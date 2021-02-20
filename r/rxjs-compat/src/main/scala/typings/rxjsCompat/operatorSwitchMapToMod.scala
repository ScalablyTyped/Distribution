package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorSwitchMapToMod {
  
  @JSImport("rxjs-compat/operator/switchMapTo", "switchMapTo")
  @js.native
  def switchMapTo[T, R](
    observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
  ): js.Any = js.native
  @JSImport("rxjs-compat/operator/switchMapTo", "switchMapTo")
  @js.native
  def switchMapTo[T, I, R](
    observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<I> */ js.Any,
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ I, 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): js.Any = js.native
}
