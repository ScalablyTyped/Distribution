package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorMergeMapToMod {
  
  @JSImport("rxjs/operator/mergeMapTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def mergeMapTo[T, R](
    innerObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def mergeMapTo[T, R](
    innerObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any,
    concurrent: Double
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
