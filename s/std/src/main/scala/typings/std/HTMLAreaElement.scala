package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides special properties and methods (beyond those of the regular object HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of <area> elements. */
@js.native
trait HTMLAreaElement
  extends StObject
     with HTMLElement
     with HTMLHyperlinkElementUtils {
  
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
  
  /** Sets or retrieves a text alternative to the graphic. */
  /* standard dom */
  var alt: java.lang.String = js.native
  
  /** Sets or retrieves the coordinates of the object. */
  /* standard dom */
  var coords: java.lang.String = js.native
  
  /* standard dom */
  var download: java.lang.String = js.native
  
  /**
    * Sets or gets whether clicks in this region cause action.
    * @deprecated
    */
  /* standard dom */
  var noHref: scala.Boolean = js.native
  
  /* standard dom */
  var ping: java.lang.String = js.native
  
  /* standard dom */
  var referrerPolicy: java.lang.String = js.native
  
  /* standard dom */
  var rel: java.lang.String = js.native
  
  /* standard dom */
  val relList: DOMTokenList = js.native
  
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
  
  /** Sets or retrieves the shape of the object. */
  /* standard dom */
  var shape: java.lang.String = js.native
  
  /** Sets or retrieves the window or frame at which to target content. */
  /* standard dom */
  var target: java.lang.String = js.native
}
