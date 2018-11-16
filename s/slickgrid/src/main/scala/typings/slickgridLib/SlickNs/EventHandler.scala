package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.EventHandler")
@js.native
class EventHandler () extends js.Object {
  def subscribe(event: EventData, handler: js.Function): EventHandler = js.native
  def unsubscribe(event: EventData, handler: js.Function): EventHandler = js.native
  def unsubscribeAll(): EventHandler = js.native
}

