package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distinctMod {
  
  @JSImport("rxjs-compat/operators/distinct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def distinct[T, K](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("distinct")().asInstanceOf[js.Any]
  inline def distinct[T, K](keySelector: js.Function1[/* value */ T, K]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(keySelector.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def distinct[T, K](
    keySelector: js.Function1[/* value */ T, K],
    flushes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(keySelector.asInstanceOf[js.Any], flushes.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def distinct[T, K](
    keySelector: Unit,
    flushes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(keySelector.asInstanceOf[js.Any], flushes.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
