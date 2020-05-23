package typings.std

import typings.std.stdStrings.enter
import typings.std.stdStrings.exit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TextTrackCues represent a string of text that will be displayed for some duration of time on a TextTrack. This includes the start and end times that the cue will be displayed. A TextTrackCue cannot be used directly, instead one of the derived types (e.g. VTTCue) must be used. */
@js.native
trait TextTrackCue extends EventTarget {
  /**
    * Returns the text track cue end time, in seconds.
    * 
    * Can be set.
    */
  var endTime: Double = js.native
  /**
    * Returns the text track cue identifier.
    * 
    * Can be set.
    */
  var id: java.lang.String = js.native
  var onenter: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onexit: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  /**
    * Returns true if the text track cue pause-on-exit flag is set, false otherwise.
    * 
    * Can be set.
    */
  var pauseOnExit: scala.Boolean = js.native
  /**
    * Returns the text track cue start time, in seconds.
    * 
    * Can be set.
    */
  var startTime: Double = js.native
  /**
    * Returns the TextTrack object to which this text track cue belongs, if any, or null otherwise.
    */
  val track: TextTrack | Null = js.native
  @JSName("addEventListener")
  def addEventListener_enter(`type`: enter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enter(
    `type`: enter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enter(
    `type`: enter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(`type`: exit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(
    `type`: exit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(
    `type`: exit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enter(`type`: enter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enter(
    `type`: enter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enter(
    `type`: enter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_exit(`type`: exit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_exit(
    `type`: exit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_exit(
    `type`: exit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
}

