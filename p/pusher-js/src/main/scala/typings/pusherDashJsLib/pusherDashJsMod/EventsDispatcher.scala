package typings
package pusherDashJsLib.pusherDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsDispatcher extends js.Object {
  def bind(eventName: java.lang.String, callback: EventCallback): this.type = js.native
  def bind(eventName: java.lang.String, callback: EventCallback, context: js.Any): this.type = js.native
  def bind_global(callback: EventCallback): this.type = js.native
  def emit(eventName: java.lang.String): this.type = js.native
  def emit(eventName: java.lang.String, data: js.Any): this.type = js.native
  def unbind(): this.type = js.native
  def unbind(eventName: java.lang.String): this.type = js.native
  def unbind(eventName: java.lang.String, callback: EventCallback): this.type = js.native
  def unbind(eventName: java.lang.String, callback: EventCallback, context: js.Any): this.type = js.native
  def unbind(eventName: java.lang.String, callback: scala.Null, context: js.Any): this.type = js.native
  def unbind(eventName: scala.Null, callback: EventCallback): this.type = js.native
  def unbind(eventName: scala.Null, callback: EventCallback, context: js.Any): this.type = js.native
  def unbind(eventName: scala.Null, callback: scala.Null, context: js.Any): this.type = js.native
  def unbind_all(): this.type = js.native
  def unbind_global(): this.type = js.native
  def unbind_global(callback: EventCallback): this.type = js.native
}

