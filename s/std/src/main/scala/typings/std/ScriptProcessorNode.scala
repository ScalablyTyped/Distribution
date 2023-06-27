package typings.std

import typings.std.stdStrings.audioprocess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows the generation, processing, or analyzing of audio using JavaScript.
  * @deprecated As of the August 29 2014 Web Audio API spec publication, this feature has been marked as deprecated, and was replaced by AudioWorklet (see AudioWorkletNode).
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScriptProcessorNode)
  */
@js.native
trait ScriptProcessorNode
  extends StObject
     with AudioNode {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScriptProcessorNode/bufferSize)
    */
  /* standard dom */
  val bufferSize: Double = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScriptProcessorNode/audioprocess_event)
    */
  /* standard dom */
  var onaudioprocess: (js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
}
