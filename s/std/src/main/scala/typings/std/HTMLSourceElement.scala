package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides special properties (beyond the regular HTMLElement object interface it also has available to it by inheritance) for manipulating <source> elements.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement)
  */
@js.native
trait HTMLSourceElement
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
  
  /* standard dom */
  var height: Double = js.native
  
  /**
    * Gets or sets the intended media type of the media source.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/media)
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/sizes) */
  /* standard dom */
  var sizes: java.lang.String = js.native
  
  /**
    * The address or URL of the a media resource that is to be considered.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/src)
    */
  /* standard dom */
  var src: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/srcset) */
  /* standard dom */
  var srcset: java.lang.String = js.native
  
  /**
    * Gets or sets the MIME type of a media resource.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/type)
    */
  /* standard dom */
  var `type`: java.lang.String = js.native
  
  /* standard dom */
  var width: Double = js.native
}
