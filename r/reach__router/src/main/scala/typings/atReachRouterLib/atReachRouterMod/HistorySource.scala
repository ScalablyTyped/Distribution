package typings
package atReachRouterLib.atReachRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistorySource extends js.Object {
  var history: atReachRouterLib.Anon_PushState
  val location: WindowLocation
  def addEventListener(name: java.lang.String, listener: js.Function1[/* event */ stdLib.Event, scala.Unit]): scala.Unit
  def removeEventListener(name: java.lang.String, listener: js.Function1[/* event */ stdLib.Event, scala.Unit]): scala.Unit
}

object HistorySource {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* event */ stdLib.Event, scala.Unit]) => scala.Unit,
    history: atReachRouterLib.Anon_PushState,
    location: WindowLocation,
    removeEventListener: (java.lang.String, js.Function1[/* event */ stdLib.Event, scala.Unit]) => scala.Unit
  ): HistorySource = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), history = history, location = location, removeEventListener = js.Any.fromFunction2(removeEventListener))
  
    __obj.asInstanceOf[HistorySource]
  }
}

