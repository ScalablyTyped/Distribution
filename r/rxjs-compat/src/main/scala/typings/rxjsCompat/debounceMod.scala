package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debounceMod {
  
  @JSImport("rxjs-compat/operators/debounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def debounce[T](
    durationSelector: js.Function1[
      /* value */ T, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ js.Any
    ]
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(durationSelector.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
