package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Any HTML element. Some elements directly implement this interface, while others implement it via an interface that inherits it.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement)
  */
@js.native
trait HTMLElement
  extends StObject
     with Element
     with ElementCSSInlineStyle
     with ElementContentEditable
     with GlobalEventHandlers
     with HTMLOrSVGElement {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/accessKey) */
  /* standard dom */
  var accessKey: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/accessKeyLabel) */
  /* standard dom */
  val accessKeyLabel: java.lang.String = js.native
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/attachInternals) */
  /* standard dom */
  def attachInternals(): ElementInternals = js.native
  
  /* standard dom */
  var autocapitalize: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/click) */
  /* standard dom */
  def click(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dir) */
  /* standard dom */
  var dir: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/draggable) */
  /* standard dom */
  var draggable: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/hidden) */
  /* standard dom */
  var hidden: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inert) */
  /* standard dom */
  var inert: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/innerText) */
  /* standard dom */
  var innerText: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/lang) */
  /* standard dom */
  var lang: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetHeight) */
  /* standard dom */
  val offsetHeight: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetLeft) */
  /* standard dom */
  val offsetLeft: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetParent) */
  /* standard dom */
  val offsetParent: Element | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetTop) */
  /* standard dom */
  val offsetTop: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetWidth) */
  /* standard dom */
  val offsetWidth: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/outerText) */
  /* standard dom */
  var outerText: java.lang.String = js.native
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/spellcheck) */
  /* standard dom */
  var spellcheck: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/title) */
  /* standard dom */
  var title: java.lang.String = js.native
  
  /* standard dom */
  var translate: scala.Boolean = js.native
}
