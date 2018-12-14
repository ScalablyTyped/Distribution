package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptProcessorNode extends AudioNode {
  /** @deprecated */
  val bufferSize: scala.Double = js.native
  /** @deprecated */
  var onaudioprocess: (js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, _]) | scala.Null = js.native
  @JSName("addEventListener")
  def addEventListener_audioprocess(
    `type`: stdLib.stdLibStrings.audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audioprocess(
    `type`: stdLib.stdLibStrings.audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audioprocess(
    `type`: stdLib.stdLibStrings.audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioprocess(
    `type`: stdLib.stdLibStrings.audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioprocess(
    `type`: stdLib.stdLibStrings.audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioprocess(
    `type`: stdLib.stdLibStrings.audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
}

@JSGlobal("ScriptProcessorNode")
@js.native
object ScriptProcessorNode
  extends org.scalablytyped.runtime.Instantiable0[ScriptProcessorNode]

