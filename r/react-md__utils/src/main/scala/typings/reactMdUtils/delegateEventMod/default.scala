package typings.reactMdUtils.delegateEventMod

import typings.std.AddEventListenerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/events/delegateEvent", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(eventType: String): DelegatedEventHandler = js.native
  def apply(
    eventType: String,
    eventTarget: js.UndefOr[DelegatedEventTarget],
    throttle: js.UndefOr[scala.Nothing],
    options: Boolean
  ): DelegatedEventHandler = js.native
  def apply(
    eventType: String,
    eventTarget: js.UndefOr[DelegatedEventTarget],
    throttle: js.UndefOr[scala.Nothing],
    options: AddEventListenerOptions
  ): DelegatedEventHandler = js.native
  def apply(eventType: String, eventTarget: js.UndefOr[DelegatedEventTarget], throttle: Boolean): DelegatedEventHandler = js.native
  def apply(
    eventType: String,
    eventTarget: js.UndefOr[DelegatedEventTarget],
    throttle: Boolean,
    options: Boolean
  ): DelegatedEventHandler = js.native
  def apply(
    eventType: String,
    eventTarget: js.UndefOr[DelegatedEventTarget],
    throttle: Boolean,
    options: AddEventListenerOptions
  ): DelegatedEventHandler = js.native
  def apply(eventType: String, eventTarget: DelegatedEventTarget): DelegatedEventHandler = js.native
}

