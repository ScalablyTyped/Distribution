package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioWorkletNode extends AudioNode {
  var onprocessorerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  val parameters: AudioParamMap = js.native
  val port: MessagePort = js.native
  @JSName("addEventListener")
  def addEventListener_processorerror(
    `type`: stdLib.stdLibStrings.processorerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_processorerror(
    `type`: stdLib.stdLibStrings.processorerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_processorerror(
    `type`: stdLib.stdLibStrings.processorerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_processorerror(
    `type`: stdLib.stdLibStrings.processorerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_processorerror(
    `type`: stdLib.stdLibStrings.processorerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_processorerror(
    `type`: stdLib.stdLibStrings.processorerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
}

@JSGlobal("AudioWorkletNode")
@js.native
object AudioWorkletNode
  extends org.scalablytyped.runtime.Instantiable2[/* context */ BaseAudioContext, /* name */ java.lang.String, AudioWorkletNode]
     with org.scalablytyped.runtime.Instantiable3[
      /* context */ BaseAudioContext, 
      /* name */ java.lang.String, 
      /* options */ AudioWorkletNodeOptions, 
      AudioWorkletNode
    ]

