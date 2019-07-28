package typings.std

import org.scalablytyped.runtime.Instantiable0
import typings.std.stdStrings.ended
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioScheduledSourceNode extends AudioNode {
  var onended: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  @JSName("addEventListener")
  def addEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  def start(): Unit = js.native
  def start(when: Double): Unit = js.native
  def stop(): Unit = js.native
  def stop(when: Double): Unit = js.native
}

@JSGlobal("AudioScheduledSourceNode")
@js.native
class AudioScheduledSourceNodeCls () extends AudioScheduledSourceNode

@JSGlobal("AudioScheduledSourceNode")
@js.native
object AudioScheduledSourceNode extends Instantiable0[AudioScheduledSourceNode]

