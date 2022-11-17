package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TextTrackCues represent a string of text that will be displayed for some duration of time on a TextTrack. This includes the start and end times that the cue will be displayed. A TextTrackCue cannot be used directly, instead one of the derived types (e.g. VTTCue) must be used. */
@js.native
trait TextTrackCue
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_exit")
  def addEventListener(`type`: "exit", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_enter")
  def addEventListener(`type`: "enter", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_exit")
  def addEventListener(
    `type`: "exit",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_enter")
  def addEventListener(
    `type`: "enter",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_enter")
  def addEventListener(
    `type`: "enter",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_exit")
  def addEventListener(
    `type`: "exit",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Returns the text track cue end time, in seconds.
    *
    * Can be set.
    */
  /* standard dom */
  var endTime: Double = js.native
  
  /**
    * Returns the text track cue identifier.
    *
    * Can be set.
    */
  /* standard dom */
  var id: java.lang.String = js.native
  
  /* standard dom */
  var onenter: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onexit: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /**
    * Returns true if the text track cue pause-on-exit flag is set, false otherwise.
    *
    * Can be set.
    */
  /* standard dom */
  var pauseOnExit: scala.Boolean = js.native
  
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_exit")
  def removeEventListener(`type`: "exit", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_enter")
  def removeEventListener(`type`: "enter", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_exit")
  def removeEventListener(
    `type`: "exit",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_enter")
  def removeEventListener(
    `type`: "enter",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_exit")
  def removeEventListener(
    `type`: "exit",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_enter")
  def removeEventListener(
    `type`: "enter",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /**
    * Returns the text track cue start time, in seconds.
    *
    * Can be set.
    */
  /* standard dom */
  var startTime: Double = js.native
  
  /** Returns the TextTrack object to which this text track cue belongs, if any, or null otherwise. */
  /* standard dom */
  val track: TextTrack | Null = js.native
}
