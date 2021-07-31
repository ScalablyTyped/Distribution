package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferWhenMod {
  
  @JSImport("rxjs-compat/operators/bufferWhen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def bufferWhen[T](
    closingSelector: js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
    ]
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferWhen")(closingSelector.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
