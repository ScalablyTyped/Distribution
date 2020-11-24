package typings.promiseSequential

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("promise-sequential", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(promises: js.Array[PromiseFunction]): js.Promise[js.Array[_]] = js.native
  
  type PromiseFunction = js.Function0[js.Promise[js.Any]]
}
