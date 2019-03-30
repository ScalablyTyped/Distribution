package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The MediaSource interface of the Media Source Extensions API represents a source of media data for an HTMLMediaElement object. A MediaSource object can be attached to a HTMLMediaElement to be played in the user agent. */
@js.native
trait MediaSource extends EventTarget {
  val activeSourceBuffers: SourceBufferList = js.native
  var duration: scala.Double = js.native
  var onsourceclose: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onsourceended: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onsourceopen: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  val readyState: ReadyState = js.native
  val sourceBuffers: SourceBufferList = js.native
  @JSName("addEventListener")
  def addEventListener_sourceclose(
    `type`: stdLib.stdLibStrings.sourceclose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceclose(
    `type`: stdLib.stdLibStrings.sourceclose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceclose(
    `type`: stdLib.stdLibStrings.sourceclose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceended(
    `type`: stdLib.stdLibStrings.sourceended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceended(
    `type`: stdLib.stdLibStrings.sourceended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceended(
    `type`: stdLib.stdLibStrings.sourceended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceopen(
    `type`: stdLib.stdLibStrings.sourceopen,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceopen(
    `type`: stdLib.stdLibStrings.sourceopen,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceopen(
    `type`: stdLib.stdLibStrings.sourceopen,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def addSourceBuffer(`type`: java.lang.String): SourceBuffer = js.native
  def clearLiveSeekableRange(): scala.Unit = js.native
  def endOfStream(): scala.Unit = js.native
  def endOfStream(error: EndOfStreamError): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceclose(
    `type`: stdLib.stdLibStrings.sourceclose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceclose(
    `type`: stdLib.stdLibStrings.sourceclose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceclose(
    `type`: stdLib.stdLibStrings.sourceclose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceended(
    `type`: stdLib.stdLibStrings.sourceended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceended(
    `type`: stdLib.stdLibStrings.sourceended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceended(
    `type`: stdLib.stdLibStrings.sourceended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceopen(
    `type`: stdLib.stdLibStrings.sourceopen,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceopen(
    `type`: stdLib.stdLibStrings.sourceopen,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceopen(
    `type`: stdLib.stdLibStrings.sourceopen,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  def removeSourceBuffer(sourceBuffer: SourceBuffer): scala.Unit = js.native
  def setLiveSeekableRange(start: scala.Double, end: scala.Double): scala.Unit = js.native
}

@JSGlobal("MediaSource")
@js.native
class MediaSourceCls () extends MediaSource

@JSGlobal("MediaSource")
@js.native
object MediaSource
  extends org.scalablytyped.runtime.Instantiable0[MediaSource] {
  def isTypeSupported(`type`: java.lang.String): scala.Boolean = js.native
}

