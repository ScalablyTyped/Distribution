package typings.promiseSequential

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-sequential", JSImport.Namespace)
  @js.native
  def apply(promises: js.Array[PromiseFunction]): js.Promise[js.Array[_]] = js.native
  
  type PromiseFunction = js.Function0[js.Promise[js.Any]]
}
