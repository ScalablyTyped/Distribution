package typings.std

import typings.std.stdStrings.addtrack
import typings.std.stdStrings.removetrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A stream of media content. A stream consists of several tracks such as video or audio tracks. Each track is specified as an instance of MediaStreamTrack. */
@js.native
trait MediaStream
  extends StObject
     with EventTarget
     with MediaProvider {
  
  val active: scala.Boolean = js.native
  
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  def addTrack(track: MediaStreamTrack): Unit = js.native
  
  def getAudioTracks(): js.Array[MediaStreamTrack] = js.native
  
  def getTrackById(trackId: java.lang.String): MediaStreamTrack | Null = js.native
  
  def getTracks(): js.Array[MediaStreamTrack] = js.native
  
  def getVideoTracks(): js.Array[MediaStreamTrack] = js.native
  
  val id: java.lang.String = js.native
  
  var onaddtrack: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, js.Any]) | Null = js.native
  
  var onremovetrack: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, js.Any]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  def removeTrack(track: MediaStreamTrack): Unit = js.native
}
