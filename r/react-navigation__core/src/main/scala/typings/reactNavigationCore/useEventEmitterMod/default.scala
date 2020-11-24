package typings.reactNavigationCore.useEventEmitterMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/core/lib/typescript/src/useEventEmitter", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[T /* <: Record[String, _] */](): NavigationEventEmitter[T] = js.native
  def apply[T /* <: Record[String, _] */](listen: js.Function1[/* e */ js.Any, Unit]): NavigationEventEmitter[T] = js.native
}
