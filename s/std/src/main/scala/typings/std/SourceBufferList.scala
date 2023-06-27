package typings.std

import org.scalablytyped.runtime.NumberDictionary
import typings.std.stdStrings.addsourcebuffer
import typings.std.stdStrings.removesourcebuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple container list for multiple SourceBuffer objects.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBufferList)
  */
@js.native
trait SourceBufferList
  extends StObject
     with EventTarget
     with /* standard dom */
/* index */ NumberDictionary[SourceBuffer] {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_addsourcebuffer(`type`: addsourcebuffer, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addsourcebuffer(
    `type`: addsourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addsourcebuffer(
    `type`: addsourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removesourcebuffer(`type`: removesourcebuffer, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removesourcebuffer(
    `type`: removesourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removesourcebuffer(
    `type`: removesourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SourceBuffer]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBufferList/length) */
  /* standard dom */
  val length: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBufferList/addsourcebuffer_event) */
  /* standard dom */
  var onaddsourcebuffer: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBufferList/removesourcebuffer_event) */
  /* standard dom */
  var onremovesourcebuffer: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_addsourcebuffer(`type`: addsourcebuffer, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addsourcebuffer(
    `type`: addsourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addsourcebuffer(
    `type`: addsourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removesourcebuffer(`type`: removesourcebuffer, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removesourcebuffer(
    `type`: removesourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removesourcebuffer(
    `type`: removesourcebuffer,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
}
