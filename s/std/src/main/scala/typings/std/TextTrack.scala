package typings.std

import typings.std.stdStrings.cuechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface also inherits properties from EventTarget. */
@js.native
trait TextTrack extends EventTarget {
  /**
    * Returns the text track cues from the text track list of cues that are currently active (i.e. that start before the current playback position and end after it), as a TextTrackCueList object.
    */
  val activeCues: TextTrackCueList | Null = js.native
  /**
    * Returns the text track list of cues, as a TextTrackCueList object.
    */
  val cues: TextTrackCueList | Null = js.native
  /**
    * Returns the ID of the given track.
    * 
    * For in-band tracks, this is the ID that can be used with a fragment if the format supports media fragment syntax, and that can be used with the getTrackById() method.
    * 
    * For TextTrack objects corresponding to track elements, this is the ID of the track element.
    */
  val id: java.lang.String = js.native
  /**
    * Returns the text track in-band metadata track dispatch type string.
    */
  val inBandMetadataTrackDispatchType: java.lang.String = js.native
  /**
    * Returns the text track kind string.
    */
  val kind: TextTrackKind = js.native
  /**
    * Returns the text track label, if there is one, or the empty string otherwise (indicating that a custom label probably needs to be generated from the other attributes of the object if the object is exposed to the user).
    */
  val label: java.lang.String = js.native
  /**
    * Returns the text track language string.
    */
  val language: java.lang.String = js.native
  /**
    * Returns the text track mode, represented by a string from the following list:
    * 
    * Can be set, to change the mode.
    */
  var mode: TextTrackMode = js.native
  var oncuechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  val sourceBuffer: SourceBuffer | Null = js.native
  /**
    * Adds the given cue to textTrack's text track list of cues.
    */
  def addCue(cue: TextTrackCue): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  /**
    * Removes the given cue from textTrack's text track list of cues.
    */
  def removeCue(cue: TextTrackCue): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
}

