package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implements the document object model (DOM) representation of the font element. The HTML Font Element <font> defines the font size, font face and color of text.
  * @deprecated
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFontElement)
  */
@js.native
trait HTMLFontElement
  extends StObject
     with HTMLElement {
  
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
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFontElement/color)
    */
  /* standard dom */
  var color: java.lang.String = js.native
  
  /**
    * Sets or retrieves the current typeface family.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFontElement/face)
    */
  /* standard dom */
  var face: java.lang.String = js.native
  
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
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFontElement/size)
    */
  /* standard dom */
  var size: java.lang.String = js.native
}
