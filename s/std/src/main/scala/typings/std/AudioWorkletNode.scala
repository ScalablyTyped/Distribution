package typings.std

import typings.std.stdStrings.processorerror
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioWorkletNode extends AudioNode {
  var onprocessorerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  val parameters: AudioParamMap = js.native
  val port: MessagePort = js.native
  @JSName("addEventListener")
  def addEventListener_processorerror(`type`: processorerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_processorerror(
    `type`: processorerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_processorerror(
    `type`: processorerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_processorerror(`type`: processorerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_processorerror(
    `type`: processorerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_processorerror(
    `type`: processorerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
}

