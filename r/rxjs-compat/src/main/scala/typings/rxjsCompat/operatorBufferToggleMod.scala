package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorBufferToggleMod {
  
  @JSImport("rxjs-compat/operator/bufferToggle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def bufferToggle[T, O](
    openings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<O> */ js.Any,
    closingSelector: js.Function1[
      /* value */ O, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ js.Any
    ]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferToggle")(openings.asInstanceOf[js.Any], closingSelector.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
