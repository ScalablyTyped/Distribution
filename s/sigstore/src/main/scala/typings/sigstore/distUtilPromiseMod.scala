package typings.sigstore

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilPromiseMod {
  
  @JSImport("sigstore/dist/util/promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def promiseAny[T](values: js.Iterable[PromiseLike[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("promiseAny")(values.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
}
