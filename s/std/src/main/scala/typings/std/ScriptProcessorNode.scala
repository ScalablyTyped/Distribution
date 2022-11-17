package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows the generation, processing, or analyzing of audio using JavaScript.
  * @deprecated As of the August 29 2014 Web Audio API spec publication, this feature has been marked as deprecated, and was replaced by AudioWorklet (see AudioWorkletNode).
  */
@js.native
trait ScriptProcessorNode
  extends StObject
     with AudioNode {
  
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_audioprocess")
  def addEventListener(
    `type`: "audioprocess",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_audioprocess")
  def addEventListener(
    `type`: "audioprocess",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_audioprocess")
  def addEventListener(
    `type`: "audioprocess",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** @deprecated */
  /* standard dom */
  val bufferSize: Double = js.native
  
  /** @deprecated */
  /* standard dom */
  var onaudioprocess: (js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_audioprocess")
  def removeEventListener(
    `type`: "audioprocess",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_audioprocess")
  def removeEventListener(
    `type`: "audioprocess",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_audioprocess")
  def removeEventListener(
    `type`: "audioprocess",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
}
