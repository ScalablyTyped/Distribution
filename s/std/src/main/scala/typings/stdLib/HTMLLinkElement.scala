package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLLinkElement
  extends HTMLElement
     with LinkStyle {
  var as: java.lang.String = js.native
  /**
       * Sets or retrieves the character set used to encode the object.
       */
  /** @deprecated */
  var charset: java.lang.String = js.native
  var crossOrigin: java.lang.String | scala.Null = js.native
  var disabled: scala.Boolean = js.native
  /**
       * Sets or retrieves a destination URL or an anchor point.
       */
  var href: java.lang.String = js.native
  /**
       * Sets or retrieves the language code of the object.
       */
  var hreflang: java.lang.String = js.native
  var integrity: java.lang.String = js.native
  /**
       * Sets or retrieves the media type.
       */
  var media: java.lang.String = js.native
  var referrerPolicy: java.lang.String = js.native
  /**
       * Sets or retrieves the relationship between the object and the destination of the link.
       */
  var rel: java.lang.String = js.native
  val relList: DOMTokenList = js.native
  /**
       * Sets or retrieves the relationship between the object and the destination of the link.
       */
  /** @deprecated */
  var rev: java.lang.String = js.native
  val sizes: DOMTokenList = js.native
  /**
       * Sets or retrieves the window or frame at which to target content.
       */
  /** @deprecated */
  var target: java.lang.String = js.native
  /**
       * Sets or retrieves the MIME type of the object.
       */
  var `type`: java.lang.String = js.native
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

@JSGlobal("HTMLLinkElement")
@js.native
object HTMLLinkElement
  extends ScalablyTyped.runtime.Instantiable0[HTMLLinkElement]

