package typings.reactDashAsync.reactDashAsyncMod

import typings.react.Element
import typings.react.Event
import typings.react.reactMod.SyntheticEvent
import typings.std.Partial
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchRun[T] extends js.Object {
  def run(): Unit = js.native
  def run(ignoredEvent: SyntheticEvent[Element, Event]): Unit = js.native
  def run(ignoredEvent: typings.std.Event): Unit = js.native
  def run(overrideInit: js.Function1[/* init */ RequestInit, RequestInit]): Unit = js.native
  def run(overrideInit: Partial[RequestInit]): Unit = js.native
}

