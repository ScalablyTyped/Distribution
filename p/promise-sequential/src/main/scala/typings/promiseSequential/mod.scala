package typings.promiseSequential

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(promises: js.Array[PromiseFunction]): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].apply(promises.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
  
  @JSImport("promise-sequential", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type PromiseFunction = js.Function0[js.Promise[Any]]
}
