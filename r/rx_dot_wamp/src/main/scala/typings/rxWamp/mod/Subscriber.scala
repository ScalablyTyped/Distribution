package typings.rxWamp.mod

import typings.autobahn.mod.ISubscribeOptions
import typings.rx.Rx.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx.wamp", "Subscriber")
@js.native
class Subscriber () extends js.Object {
  
  def dispose(): Unit = js.native
  
  def to(topic: String, options: ISubscribeOptions): Subscriber = js.native
  def to(
    topic: String,
    options: ISubscribeOptions,
    observerOrOnNext: js.UndefOr[scala.Nothing],
    onError: js.UndefOr[scala.Nothing],
    onCompleted: js.Function0[Unit]
  ): Subscriber = js.native
  def to(
    topic: String,
    options: ISubscribeOptions,
    observerOrOnNext: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* exception */ js.Any, Unit]
  ): Subscriber = js.native
  def to(
    topic: String,
    options: ISubscribeOptions,
    observerOrOnNext: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* exception */ js.Any, Unit],
    onCompleted: js.Function0[Unit]
  ): Subscriber = js.native
  def to(
    topic: String,
    options: ISubscribeOptions,
    observerOrOnNext: js.Function1[/* value */ IWampEvent, Unit]
  ): Subscriber = js.native
  def to(
    topic: String,
    options: ISubscribeOptions,
    observerOrOnNext: js.Function1[/* value */ IWampEvent, Unit],
    onError: js.UndefOr[scala.Nothing],
    onCompleted: js.Function0[Unit]
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
    onError: js.UndefOr[scala.Nothing],
    onCompleted: js.Function0[Unit]
  ): Subscriber = js.native
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
