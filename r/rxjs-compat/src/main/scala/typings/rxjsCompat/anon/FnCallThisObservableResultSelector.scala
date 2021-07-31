package typings.rxjsCompat.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisObservableResultSelector extends StObject {
  
  def apply[T, R](
    observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
  ): js.Any = js.native
  def apply[T, I, R](
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
