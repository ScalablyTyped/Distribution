package typings.std.global

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("HTMLAnchorElement")
@js.native
class HTMLAnchorElement ()
  extends StObject
     with typings.std.HTMLAnchorElement {
  
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
  
  /* CompleteClass */
  override val assignedSlot: typings.std.HTMLSlotElement | Null = js.native
  
  /* CompleteClass */
  var contentEditable: java.lang.String = js.native
  
  /* CompleteClass */
  var enterKeyHint: java.lang.String = js.native
  
  /* CompleteClass */
  var hash: java.lang.String = js.native
  
  /* CompleteClass */
  var host: java.lang.String = js.native
  
  /* CompleteClass */
  var hostname: java.lang.String = js.native
  
  /* CompleteClass */
  var href: java.lang.String = js.native
  
  /* CompleteClass */
  var innerHTML: java.lang.String = js.native
  
  /* CompleteClass */
  var inputMode: java.lang.String = js.native
  
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
  
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: typings.std.Element | Null = js.native
  
  /* CompleteClass */
  override val origin: java.lang.String = js.native
  
  /* CompleteClass */
  var password: java.lang.String = js.native
  
  /* CompleteClass */
  var pathname: java.lang.String = js.native
  
  /* CompleteClass */
  var port: java.lang.String = js.native
  
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: typings.std.Element | Null = js.native
  
  /* CompleteClass */
  var protocol: java.lang.String = js.native
  
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
  
  /* CompleteClass */
  var search: java.lang.String = js.native
  
  /* CompleteClass */
  override val style: typings.std.CSSStyleDeclaration = js.native
  
  /* CompleteClass */
  var username: java.lang.String = js.native
}
