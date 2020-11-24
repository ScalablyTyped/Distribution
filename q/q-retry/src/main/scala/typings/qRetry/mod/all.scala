package typings.qRetry.mod

import typings.q.mod.IWhenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("q-retry", "all")
@js.native
object all extends js.Object {
  
  def apply[T](promises: IWhenable[js.Array[IWhenable[T]]]): typings.q.mod.Promise[js.Array[T]] = js.native
}
