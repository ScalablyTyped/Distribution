package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The HTMLTrackElement */
@js.native
trait HTMLTrackElement
  extends StObject
     with HTMLElement {
  
  /* standard dom */
  var default: scala.Boolean = js.native
  
  /* standard dom */
  val ERROR: Double = js.native
  
  /* standard dom */
  val LOADED: Double = js.native
  
  /* standard dom */
  val LOADING: Double = js.native
  
  /* standard dom */
  val NONE: Double = js.native
  
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
  
  /* standard dom */
  var kind: java.lang.String = js.native
  
  /* standard dom */
  var label: java.lang.String = js.native
  
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
  
  /* standard dom */
  var src: java.lang.String = js.native
  
  /* standard dom */
  var srclang: java.lang.String = js.native
  
  /** Returns the TextTrack object corresponding to the text track of the track element. */
  /* standard dom */
  val track: TextTrack = js.native
}
