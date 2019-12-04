package typings.rxDotWamp.rxDotWampMod

import typings.autobahn.autobahnMod.ISubscribeOptions
import typings.rxDashLite.Rx.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx.wamp", "Subscriber")
@js.native
class Subscriber () extends js.Object {
  def dispose(): Unit = js.native
  def to(topic: String, options: ISubscribeOptions): Subscriber = js.native
  def to(
    topic: String,
    options: ISubscribeOptions,
    observerOrOnNext: js.Function1[/* value */ IWampEvent, Unit]
  ): Subscriber = js.native
  def to(
    topic: String,
    options: ISubscribeOptions,
    observerOrOnNext: js.Function1[/* value */ IWampEvent, Unit],
    onError: js.Function1[/* exception */ js.Any, Unit]
  ): Subscriber = js.native
  def to(
    topic: String,
    options: ISubscribeOptions,
    observerOrOnNext: js.Function1[/* value */ IWampEvent, Unit],
    onError: js.Function1[/* exception */ js.Any, Unit],
    onCompleted: js.Function0[Unit]
  ): Subscriber = js.native
  def to(topic: String, options: ISubscribeOptions, observerOrOnNext: IObserver[IWampEvent]): Subscriber = js.native
  def to(
    topic: String,
    options: ISubscribeOptions,
    observerOrOnNext: IObserver[IWampEvent],
    onError: js.Function1[/* exception */ js.Any, Unit]
  ): Subscriber = js.native
  def to(
    topic: String,
    options: ISubscribeOptions,
    observerOrOnNext: IObserver[IWampEvent],
    onError: js.Function1[/* exception */ js.Any, Unit],
    onCompleted: js.Function0[Unit]
  ): Subscriber = js.native
}

