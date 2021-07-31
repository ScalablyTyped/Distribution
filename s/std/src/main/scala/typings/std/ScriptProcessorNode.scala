package typings.std

import typings.std.stdStrings.audioprocess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows the generation, processing, or analyzing of audio using JavaScript. */
@js.native
trait ScriptProcessorNode
  extends StObject
     with AudioNode {
  
  @JSName("addEventListener")
  def addEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** @deprecated */
  val bufferSize: Double = js.native
  
  /** @deprecated */
  var onaudioprocess: (js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, js.Any]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
}
