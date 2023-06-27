package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The HTMLTrackElement
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement)
  */
@js.native
trait HTMLTrackElement
  extends StObject
     with HTMLElement {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/default) */
  /* standard dom */
  var default: scala.Boolean = js.native
  
  /* standard dom */
  val ERROR: `3` = js.native
  
  /* standard dom */
  val LOADED: `2` = js.native
  
  /* standard dom */
  val LOADING: `1` = js.native
  
  /* standard dom */
  val NONE: `0` = js.native
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/kind) */
  /* standard dom */
  var kind: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/label) */
  /* standard dom */
  var label: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/readyState) */
  /* standard dom */
  val readyState: Double = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/src) */
  /* standard dom */
  var src: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/srclang) */
  /* standard dom */
  var srclang: java.lang.String = js.native
  
  /**
    * Returns the TextTrack object corresponding to the text track of the track element.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/track)
    */
  /* standard dom */
  val track: TextTrack = js.native
}
