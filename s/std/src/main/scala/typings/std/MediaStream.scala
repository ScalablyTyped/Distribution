package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A stream of media content. A stream consists of several tracks such as video or audio tracks. Each track is specified as an instance of MediaStreamTrack. */
@js.native
trait MediaStream
  extends StObject
     with EventTarget {
  
  /* standard dom */
  val active: scala.Boolean = js.native
  
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_addtrack")
  def addEventListener(
    `type`: "addtrack",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_removetrack")
  def addEventListener(
    `type`: "removetrack",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_addtrack")
  def addEventListener(
    `type`: "addtrack",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_removetrack")
  def addEventListener(
    `type`: "removetrack",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_addtrack")
  def addEventListener(
    `type`: "addtrack",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_removetrack")
  def addEventListener(
    `type`: "removetrack",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def addTrack(track: MediaStreamTrack): Unit = js.native
  
  /* standard dom */
  def getAudioTracks(): js.Array[MediaStreamTrack] = js.native
  
  /* standard dom */
  def getTrackById(trackId: java.lang.String): MediaStreamTrack | Null = js.native
  
  /* standard dom */
  def getTracks(): js.Array[MediaStreamTrack] = js.native
  
  /* standard dom */
  def getVideoTracks(): js.Array[MediaStreamTrack] = js.native
  
  /* standard dom */
  val id: java.lang.String = js.native
  
  /* standard dom */
  var onaddtrack: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any]) | Null = js.native
  
  /* standard dom */
  var onremovetrack: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any]) | Null = js.native
  
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_removetrack")
  def removeEventListener(
    `type`: "removetrack",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any]
  ): Unit = js.native
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_addtrack")
  def removeEventListener(
    `type`: "addtrack",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_removetrack")
  def removeEventListener(
    `type`: "removetrack",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_addtrack")
  def removeEventListener(
    `type`: "addtrack",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_removetrack")
  def removeEventListener(
    `type`: "removetrack",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_addtrack")
  def removeEventListener(
    `type`: "addtrack",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def removeTrack(track: MediaStreamTrack): Unit = js.native
}
