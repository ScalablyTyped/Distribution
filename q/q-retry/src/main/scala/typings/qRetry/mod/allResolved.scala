package typings.qRetry.mod

import typings.q.mod.IWhenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("q-retry", "allResolved")
@js.native
object allResolved extends js.Object {
  
  def apply[T](promises: IWhenable[js.Array[IWhenable[T]]]): typings.q.mod.Promise[js.Array[typings.q.mod.Promise[T]]] = js.native
}
