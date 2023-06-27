package typings.std

import typings.std.stdStrings.processorerror
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode)
  */
@js.native
trait AudioWorkletNode
  extends StObject
     with AudioNode {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_processorerror(`type`: processorerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_processorerror(
    `type`: processorerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_processorerror(
    `type`: processorerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/processorerror_event) */
  /* standard dom */
  var onprocessorerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/parameters) */
  /* standard dom */
  val parameters: AudioParamMap = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/port) */
  /* standard dom */
  val port: MessagePort = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_processorerror(`type`: processorerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_processorerror(
    `type`: processorerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_processorerror(
    `type`: processorerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
}
