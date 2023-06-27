package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating <embed> elements.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLEmbedElement)
  */
@js.native
trait HTMLEmbedElement
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
  
  /** @deprecated */
  /* standard dom */
  var align: java.lang.String = js.native
  
  /* standard dom */
  def getSVGDocument(): Document | Null = js.native
  
  /** Sets or retrieves the height of the object. */
  /* standard dom */
  var height: java.lang.String = js.native
  
  /**
    * Sets or retrieves the name of the object.
    * @deprecated
    */
  /* standard dom */
  var name: java.lang.String = js.native
  
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
  
  /** Sets or retrieves a URL to be loaded by the object. */
  /* standard dom */
  var src: java.lang.String = js.native
  
  /* standard dom */
  var `type`: java.lang.String = js.native
  
  /** Sets or retrieves the width of the object. */
  /* standard dom */
  var width: java.lang.String = js.native
}
