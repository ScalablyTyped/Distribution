package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Any HTML element. Some elements directly implement this interface, while others implement it via an interface that inherits it. */
@js.native
trait HTMLElement
  extends Element
     with DocumentAndElementEventHandlers
     with ElementCSSInlineStyle
     with ElementContentEditable
     with GlobalEventHandlers
     with HTMLOrSVGElement {
  
  var accessKey: java.lang.String = js.native
  
  val accessKeyLabel: java.lang.String = js.native
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  var autocapitalize: java.lang.String = js.native
  
  def click(): Unit = js.native
  
  var dir: java.lang.String = js.native
  
  var draggable: scala.Boolean = js.native
  
  var hidden: scala.Boolean = js.native
  
  var innerText: java.lang.String = js.native
  
  var lang: java.lang.String = js.native
  
  val offsetHeight: Double = js.native
  
  val offsetLeft: Double = js.native
  
  val offsetParent: Element | Null = js.native
  
  val offsetTop: Double = js.native
  
  val offsetWidth: Double = js.native
  
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
  
  var spellcheck: scala.Boolean = js.native
  
  var title: java.lang.String = js.native
  
  var translate: scala.Boolean = js.native
}
