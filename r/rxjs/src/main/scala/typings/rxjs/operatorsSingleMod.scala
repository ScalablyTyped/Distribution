package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsSingleMod {
  
  @JSImport("rxjs/operators/single", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def single[T](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("single")().asInstanceOf[js.Any]
  @scala.inline
  def single[T](
    predicate: js.Function3[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
      Boolean
    ]
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("single")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
