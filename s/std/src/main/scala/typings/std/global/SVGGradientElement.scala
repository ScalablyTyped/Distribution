package typings.std.global

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGGradientElement")
@js.native
class SVGGradientElement ()
  extends StObject
     with typings.std.SVGGradientElement {
  
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
  override val href: typings.std.SVGAnimatedString = js.native
  
  /* CompleteClass */
  var innerHTML: java.lang.String = js.native
  
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: typings.std.Element | Null = js.native
  
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: typings.std.Element | Null = js.native
  
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
  override val style: typings.std.CSSStyleDeclaration = js.native
}
object SVGGradientElement {
  
  @JSGlobal("SVGGradientElement.SVG_SPREADMETHOD_PAD")
  @js.native
  val SVG_SPREADMETHOD_PAD: Double = js.native
  
  @JSGlobal("SVGGradientElement.SVG_SPREADMETHOD_REFLECT")
  @js.native
  val SVG_SPREADMETHOD_REFLECT: Double = js.native
  
  @JSGlobal("SVGGradientElement.SVG_SPREADMETHOD_REPEAT")
  @js.native
  val SVG_SPREADMETHOD_REPEAT: Double = js.native
  
  @JSGlobal("SVGGradientElement.SVG_SPREADMETHOD_UNKNOWN")
  @js.native
  val SVG_SPREADMETHOD_UNKNOWN: Double = js.native
}
