package typings.std

import typings.std.stdStrings.enter
import typings.std.stdStrings.exit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TextTrackCues represent a string of text that will be displayed for some duration of time on a TextTrack. This includes the start and end times that the cue will be displayed. A TextTrackCue cannot be used directly, instead one of the derived types (e.g. VTTCue) must be used.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue)
  */
@js.native
trait TextTrackCue
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_enter(`type`: enter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enter(
    `type`: enter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enter(
    `type`: enter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(`type`: exit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(
    `type`: exit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(
    `type`: exit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Returns the text track cue end time, in seconds.
    *
    * Can be set.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/endTime)
    */
  /* standard dom */
  var endTime: Double = js.native
  
  /**
    * Returns the text track cue identifier.
    *
    * Can be set.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/id)
    */
  /* standard dom */
  var id: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/enter_event) */
  /* standard dom */
  var onenter: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/exit_event) */
  /* standard dom */
  var onexit: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /**
    * Returns true if the text track cue pause-on-exit flag is set, false otherwise.
    *
    * Can be set.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/pauseOnExit)
    */
  /* standard dom */
  var pauseOnExit: scala.Boolean = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_enter(`type`: enter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enter(
    `type`: enter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enter(
    `type`: enter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_exit(`type`: exit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_exit(
    `type`: exit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_exit(
    `type`: exit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /**
    * Returns the text track cue start time, in seconds.
    *
    * Can be set.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/startTime)
    */
  /* standard dom */
  var startTime: Double = js.native
  
  /**
    * Returns the TextTrack object to which this text track cue belongs, if any, or null otherwise.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/track)
    */
  /* standard dom */
  val track: TextTrack | Null = js.native
}
