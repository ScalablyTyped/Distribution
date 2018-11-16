package typings
package reactDashRelayLib.classicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store extends js.Object {
  def commitUpdate(mutation: Mutation[_, _]): js.Any = js.native
  def commitUpdate(mutation: Mutation[_, _], callbacks: StoreUpdateCallbacks[_]): js.Any = js.native
}

