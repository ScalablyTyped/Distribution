package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.stdStrings.addtrack
import typings.std.stdStrings.removetrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A stream of media content. A stream consists of several tracks such as video or audio tracks. Each track is specified as an instance of MediaStreamTrack. */
@js.native
trait MediaStream extends EventTarget {
  val active: scala.Boolean = js.native
  val id: java.lang.String = js.native
  var onaddtrack: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _]) | Null = js.native
  var onremovetrack: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _]) | Null = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def addTrack(track: MediaStreamTrack): Unit = js.native
  def getAudioTracks(): js.Array[MediaStreamTrack] = js.native
  def getTrackById(trackId: java.lang.String): MediaStreamTrack | Null = js.native
  def getTracks(): js.Array[MediaStreamTrack] = js.native
  def getVideoTracks(): js.Array[MediaStreamTrack] = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  def removeTrack(track: MediaStreamTrack): Unit = js.native
}

@JSGlobal("MediaStream")
@js.native
class MediaStreamCls () extends MediaStream {
  def this(stream: MediaStream) = this()
  def this(tracks: js.Array[MediaStreamTrack]) = this()
}

@JSGlobal("MediaStream")
@js.native
object MediaStream
  extends Instantiable0[MediaStream]
     with Instantiable1[
      (/* tracks */ js.Array[MediaStreamTrack]) | (/* stream */ MediaStream), 
      MediaStream
    ]

