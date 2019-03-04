package typings
package atReachRouterLib.atReachRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistorySource extends js.Object {
  var history: atReachRouterLib.Anon_PushState
  val location: WindowLocation
  def addEventListener(name: java.lang.String, listener: js.Function1[/* event */ reactLib.Event, scala.Unit]): scala.Unit
  def removeEventListener(name: java.lang.String, listener: js.Function1[/* event */ reactLib.Event, scala.Unit]): scala.Unit
}

object HistorySource {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* event */ reactLib.Event, scala.Unit], scala.Unit],
    history: atReachRouterLib.Anon_PushState,
    location: WindowLocation,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* event */ reactLib.Event, scala.Unit], scala.Unit]
  ): HistorySource = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, history = history, location = location, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[HistorySource]
  }
}

