package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorCountMod {
  
  @JSImport("rxjs-compat/operator/count", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def count[T](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[js.Any]
  @scala.inline
  def count[T](
    predicate: js.Function3[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
      Boolean
    ]
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
