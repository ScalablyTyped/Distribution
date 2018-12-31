package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLAreaElement
  extends HTMLElement
     with HTMLHyperlinkElementUtils {
  /**
    * Sets or retrieves a text alternative to the graphic.
    */
  var alt: java.lang.String = js.native
  /**
    * Sets or retrieves the coordinates of the object.
    */
  var coords: java.lang.String = js.native
  var download: java.lang.String = js.native
  /**
    * Sets or gets whether clicks in this region cause action.
    */
  /** @deprecated */
  var noHref: scala.Boolean = js.native
  var ping: java.lang.String = js.native
  var referrerPolicy: java.lang.String = js.native
  var rel: java.lang.String = js.native
  val relList: DOMTokenList = js.native
  /**
    * Sets or retrieves the shape of the object.
    */
  var shape: java.lang.String = js.native
  /**
    * Sets or retrieves the window or frame at which to target content.
    */
  var target: java.lang.String = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
}

@JSGlobal("HTMLAreaElement")
@js.native
object HTMLAreaElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLAreaElement]

