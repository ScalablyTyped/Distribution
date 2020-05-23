package typings.std

import typings.std.stdStrings.sourceclose
import typings.std.stdStrings.sourceended
import typings.std.stdStrings.sourceopen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Media Source Extensions API interface represents a source of media data for an HTMLMediaElement object. A MediaSource object can be attached to a HTMLMediaElement to be played in the user agent. */
@js.native
trait MediaSource
  extends EventTarget
     with MediaProvider {
  val activeSourceBuffers: SourceBufferList = js.native
  var duration: Double = js.native
  var onsourceclose: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onsourceended: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onsourceopen: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  val readyState: ReadyState = js.native
  val sourceBuffers: SourceBufferList = js.native
  @JSName("addEventListener")
  def addEventListener_sourceclose(`type`: sourceclose, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceclose(
    `type`: sourceclose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceclose(
    `type`: sourceclose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceended(`type`: sourceended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceended(
    `type`: sourceended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceended(
    `type`: sourceended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceopen(`type`: sourceopen, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceopen(
    `type`: sourceopen,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceopen(
    `type`: sourceopen,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def addSourceBuffer(`type`: java.lang.String): SourceBuffer = js.native
  def clearLiveSeekableRange(): Unit = js.native
  def endOfStream(): Unit = js.native
  def endOfStream(error: EndOfStreamError): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceclose(`type`: sourceclose, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceclose(
    `type`: sourceclose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceclose(
    `type`: sourceclose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceended(`type`: sourceended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceended(
    `type`: sourceended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceended(
    `type`: sourceended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceopen(`type`: sourceopen, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceopen(
    `type`: sourceopen,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceopen(
    `type`: sourceopen,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  def removeSourceBuffer(sourceBuffer: SourceBuffer): Unit = js.native
  def setLiveSeekableRange(start: Double, end: Double): Unit = js.native
}

