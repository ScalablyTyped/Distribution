package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Any HTML element. Some elements directly implement this interface, while others implement it via an interface that inherits it. */
@js.native
trait HTMLElement
  extends StObject
     with Element
     with ElementCSSInlineStyle
     with ElementContentEditable
     with GlobalEventHandlers
     with HTMLOrSVGElement {
  
  /* standard dom */
  var accessKey: java.lang.String = js.native
  
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
  
  /* standard dom */
  def attachInternals(): ElementInternals = js.native
  
  /* standard dom */
  var autocapitalize: java.lang.String = js.native
  
  /* standard dom */
  def click(): Unit = js.native
  
  /* standard dom */
  var dir: java.lang.String = js.native
  
  /* standard dom */
  var draggable: scala.Boolean = js.native
  
  /* standard dom */
  var hidden: scala.Boolean = js.native
  
  /* standard dom */
  var inert: scala.Boolean = js.native
  
  /* standard dom */
  var innerText: java.lang.String = js.native
  
  /* standard dom */
  var lang: java.lang.String = js.native
  
  /* standard dom */
  val offsetHeight: Double = js.native
  
  /* standard dom */
  val offsetLeft: Double = js.native
  
  /* standard dom */
  val offsetParent: Element | Null = js.native
  
  /* standard dom */
  val offsetTop: Double = js.native
  
  /* standard dom */
  val offsetWidth: Double = js.native
  
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
  
  /* standard dom */
  var spellcheck: scala.Boolean = js.native
  
  /* standard dom */
  var title: java.lang.String = js.native
  
  /* standard dom */
  var translate: scala.Boolean = js.native
}
