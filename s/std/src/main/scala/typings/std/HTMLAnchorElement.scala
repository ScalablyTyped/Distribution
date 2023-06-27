package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hyperlink elements and provides special properties and methods (beyond those of the regular HTMLElement object interface that they inherit from) for manipulating the layout and presentation of such elements.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement)
  */
@js.native
trait HTMLAnchorElement
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
  
  /**
    * Sets or retrieves the character set used to encode the object.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/charset)
    */
  /* standard dom */
  var charset: java.lang.String = js.native
  
  /**
    * Sets or retrieves the coordinates of the object.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/coords)
    */
  /* standard dom */
  var coords: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/download) */
  /* standard dom */
  var download: java.lang.String = js.native
  
  /**
    * Sets or retrieves the language code of the object.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/hreflang)
    */
  /* standard dom */
  var hreflang: java.lang.String = js.native
  
  /**
    * Sets or retrieves the shape of the object.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/name)
    */
  /* standard dom */
  var name: java.lang.String = js.native
  
  /* standard dom */
  var ping: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/referrerPolicy) */
  /* standard dom */
  var referrerPolicy: java.lang.String = js.native
  
  /**
    * Sets or retrieves the relationship between the object and the destination of the link.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/rel)
    */
  /* standard dom */
  var rel: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/relList) */
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
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/rev)
    */
  /* standard dom */
  var rev: java.lang.String = js.native
  
  /**
    * Sets or retrieves the shape of the object.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/shape)
    */
  /* standard dom */
  var shape: java.lang.String = js.native
  
  /**
    * Sets or retrieves the window or frame at which to target content.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/target)
    */
  /* standard dom */
  var target: java.lang.String = js.native
  
  /**
    * Retrieves or sets the text of the object as a string.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/text)
    */
  /* standard dom */
  var text: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/type) */
  /* standard dom */
  var `type`: java.lang.String = js.native
}
