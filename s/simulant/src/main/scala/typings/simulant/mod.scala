package typings.simulant

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.std.Node
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simulant", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(eventName: String): Event = js.native
  def apply(eventName: String, payload: StringDictionary[js.Any]): Event = js.native
  def apply(window: Window, eventName: String): Event = js.native
  def apply(window: Window, eventName: String, payload: StringDictionary[js.Any]): Event = js.native
  def fire(el: Node, e: String): Unit = js.native
  def fire(el: Node, e: String, payload: StringDictionary[js.Any]): Unit = js.native
  def fire(el: Node, e: Event): Unit = js.native
}

