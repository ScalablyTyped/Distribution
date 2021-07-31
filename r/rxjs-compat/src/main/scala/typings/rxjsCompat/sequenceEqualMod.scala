package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sequenceEqualMod {
  
  @JSImport("rxjs-compat/operators/sequenceEqual", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sequenceEqual[T](
    compareTo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceEqual")(compareTo.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def sequenceEqual[T](
    compareTo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
    comparor: js.Function2[/* a */ T, /* b */ T, Boolean]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sequenceEqual")(compareTo.asInstanceOf[js.Any], comparor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
