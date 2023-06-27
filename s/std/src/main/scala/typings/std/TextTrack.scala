package typings.std

import typings.std.stdStrings.cuechange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface also inherits properties from EventTarget.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack)
  */
@js.native
trait TextTrack
  extends StObject
     with EventTarget {
  
  /**
    * Returns the text track cues from the text track list of cues that are currently active (i.e. that start before the current playback position and end after it), as a TextTrackCueList object.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/activeCues)
    */
  /* standard dom */
  val activeCues: TextTrackCueList | Null = js.native
  
  /**
    * Adds the given cue to textTrack's text track list of cues.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/addCue)
    */
  /* standard dom */
  def addCue(cue: TextTrackCue): Unit = js.native
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Returns the text track list of cues, as a TextTrackCueList object.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/cues)
    */
  /* standard dom */
  val cues: TextTrackCueList | Null = js.native
  
  /**
    * Returns the ID of the given track.
    *
    * For in-band tracks, this is the ID that can be used with a fragment if the format supports media fragment syntax, and that can be used with the getTrackById() method.
    *
    * For TextTrack objects corresponding to track elements, this is the ID of the track element.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/id)
    */
  /* standard dom */
  val id: java.lang.String = js.native
  
  /**
    * Returns the text track in-band metadata track dispatch type string.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/inBandMetadataTrackDispatchType)
    */
  /* standard dom */
  val inBandMetadataTrackDispatchType: java.lang.String = js.native
  
  /**
    * Returns the text track kind string.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/kind)
    */
  /* standard dom */
  val kind: TextTrackKind = js.native
  
  /**
    * Returns the text track label, if there is one, or the empty string otherwise (indicating that a custom label probably needs to be generated from the other attributes of the object if the object is exposed to the user).
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/label)
    */
  /* standard dom */
  val label: java.lang.String = js.native
  
  /**
    * Returns the text track language string.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/language)
    */
  /* standard dom */
  val language: java.lang.String = js.native
  
  /**
    * Returns the text track mode, represented by a string from the following list:
    *
    * Can be set, to change the mode.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/mode)
    */
  /* standard dom */
  var mode: TextTrackMode = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/cuechange_event) */
  /* standard dom */
  var oncuechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /**
    * Removes the given cue from textTrack's text track list of cues.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/removeCue)
    */
  /* standard dom */
  def removeCue(cue: TextTrackCue): Unit = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
}
