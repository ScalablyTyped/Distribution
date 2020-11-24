package typings.reduxStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-storage", "createLoader")
@js.native
object createLoader extends js.Object {
  
  def apply[TState](engine: StorageEngine): Loader[TState] = js.native
}
