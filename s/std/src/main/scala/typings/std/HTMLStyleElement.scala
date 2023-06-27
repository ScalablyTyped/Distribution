package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A <style> element. It inherits properties and methods from its parent, HTMLElement, and from LinkStyle.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLStyleElement)
  */
@js.native
trait HTMLStyleElement
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
  
  /**
    * Enables or disables the style sheet.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLStyleElement/disabled)
    */
  /* standard dom */
  var disabled: scala.Boolean = js.native
  
  /**
    * Sets or retrieves the media type.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLStyleElement/media)
    */
  /* standard dom */
  var media: java.lang.String = js.native
  
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
    * Retrieves the CSS language in which the style sheet is written.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLStyleElement/type)
    */
  /* standard dom */
  var `type`: java.lang.String = js.native
}
