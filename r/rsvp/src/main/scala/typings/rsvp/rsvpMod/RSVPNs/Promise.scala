package typings.rsvp.rsvpMod.RSVPNs

import typings.std.PromiseLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promise[T] extends PromiseLike[T] {
  @JSName(scala.scalajs.js.Symbol.toStringTag)
  val toStringTag: typings.rsvp.rsvpStrings.Promise = js.native
  def `catch`[TResult](): typings.rsvp.rsvpMod.RSVPNs.Promise[T | TResult] = js.native
  def `catch`[TResult](onRejected: js.UndefOr[scala.Nothing], label: String): typings.rsvp.rsvpMod.RSVPNs.Promise[T | TResult] = js.native
  def `catch`[TResult](onRejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): typings.rsvp.rsvpMod.RSVPNs.Promise[T | TResult] = js.native
  def `catch`[TResult](onRejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]], label: String): typings.rsvp.rsvpMod.RSVPNs.Promise[T | TResult] = js.native
  def `catch`[TResult](onRejected: Null, label: String): typings.rsvp.rsvpMod.RSVPNs.Promise[T | TResult] = js.native
  def `finally`[U](): typings.rsvp.rsvpMod.RSVPNs.Promise[T] = js.native
  def `finally`[U](onFinally: U): typings.rsvp.rsvpMod.RSVPNs.Promise[T] = js.native
  def `finally`[U](onFinally: js.Thenable[U]): typings.rsvp.rsvpMod.RSVPNs.Promise[T] = js.native
  def `then`[TResult1, TResult2](onFulfilled: js.UndefOr[scala.Nothing], onRejected: js.UndefOr[scala.Nothing], label: String): typings.rsvp.rsvpMod.RSVPNs.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onFulfilled: js.UndefOr[scala.Nothing],
    onRejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]],
    label: String
  ): typings.rsvp.rsvpMod.RSVPNs.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onFulfilled: js.UndefOr[scala.Nothing], onRejected: Null, label: String): typings.rsvp.rsvpMod.RSVPNs.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onFulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
    onRejected: js.UndefOr[scala.Nothing],
    label: String
  ): typings.rsvp.rsvpMod.RSVPNs.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onFulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
    onRejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]],
    label: String
  ): typings.rsvp.rsvpMod.RSVPNs.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onFulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
    onRejected: Null,
    label: String
  ): typings.rsvp.rsvpMod.RSVPNs.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onFulfilled: Null, onRejected: js.UndefOr[scala.Nothing], label: String): typings.rsvp.rsvpMod.RSVPNs.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onFulfilled: Null,
    onRejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]],
    label: String
  ): typings.rsvp.rsvpMod.RSVPNs.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onFulfilled: Null, onRejected: Null, label: String): typings.rsvp.rsvpMod.RSVPNs.Promise[TResult1 | TResult2] = js.native
}

