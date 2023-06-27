package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reference information for external resources and the relationship of those resources to a document and vice-versa. This object inherits all of the properties and methods of the HTMLElement interface.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement)
  */
@js.native
trait HTMLLinkElement
  extends StObject
     with HTMLElement
     with LinkStyle {
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/as) */
  /* standard dom */
  var as: java.lang.String = js.native
  
  /**
    * Sets or retrieves the character set used to encode the object.
    * @deprecated
    */
  /* standard dom */
  var charset: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/crossOrigin) */
  /* standard dom */
  var crossOrigin: java.lang.String | Null = js.native
  
  /* standard dom */
  var disabled: scala.Boolean = js.native
  
  /** Sets or retrieves a destination URL or an anchor point. */
  /* standard dom */
  var href: java.lang.String = js.native
  
  /** Sets or retrieves the language code of the object. */
  /* standard dom */
  var hreflang: java.lang.String = js.native
  
  /* standard dom */
  var imageSizes: java.lang.String = js.native
  
  /* standard dom */
  var imageSrcset: java.lang.String = js.native
  
  /* standard dom */
  var integrity: java.lang.String = js.native
  
  /** Sets or retrieves the media type. */
  /* standard dom */
  var media: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/referrerPolicy) */
  /* standard dom */
  var referrerPolicy: java.lang.String = js.native
  
  /**
    * Sets or retrieves the relationship between the object and the destination of the link.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/rel)
    */
  /* standard dom */
  var rel: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/relList) */
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
  
  /**
    * Sets or retrieves the relationship between the object and the destination of the link.
    * @deprecated
    */
  /* standard dom */
  var rev: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/sizes) */
  /* standard dom */
  val sizes: DOMTokenList = js.native
  
  /**
    * Sets or retrieves the window or frame at which to target content.
    * @deprecated
    */
  /* standard dom */
  var target: java.lang.String = js.native
  
  /** Sets or retrieves the MIME type of the object. */
  /* standard dom */
  var `type`: java.lang.String = js.native
}
