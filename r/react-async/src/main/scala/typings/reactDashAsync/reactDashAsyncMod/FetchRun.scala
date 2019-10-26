package typings.reactDashAsync.reactDashAsyncMod

import typings.react.reactMod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.Partial
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchRun[T] extends js.Object {
  def run(): Unit = js.native
  def run(ignoredEvent: SyntheticEvent[Element, Event]): Unit = js.native
  def run(ignoredEvent: Event): Unit = js.native
  def run(overrideInit: js.Function1[/* init */ RequestInit, RequestInit]): Unit = js.native
  def run(overrideInit: Partial[RequestInit]): Unit = js.native
}

