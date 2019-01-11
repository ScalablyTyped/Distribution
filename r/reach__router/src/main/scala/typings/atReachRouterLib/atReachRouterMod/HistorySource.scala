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

