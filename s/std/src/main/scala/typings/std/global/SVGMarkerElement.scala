package typings.std.global

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGMarkerElement")
@js.native
class SVGMarkerElement ()
  extends StObject
     with typings.std.SVGMarkerElement {
  
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
  var innerHTML: java.lang.String = js.native
  
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: typings.std.Element | Null = js.native
  
  /* CompleteClass */
  override val preserveAspectRatio: typings.std.SVGAnimatedPreserveAspectRatio = js.native
  
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
  
  /* CompleteClass */
  override val viewBox: typings.std.SVGAnimatedRect = js.native
}
object SVGMarkerElement {
  
  @JSGlobal("SVGMarkerElement.SVG_MARKERUNITS_STROKEWIDTH")
  @js.native
  val SVG_MARKERUNITS_STROKEWIDTH: Double = js.native
  
  @JSGlobal("SVGMarkerElement.SVG_MARKERUNITS_UNKNOWN")
  @js.native
  val SVG_MARKERUNITS_UNKNOWN: Double = js.native
  
  @JSGlobal("SVGMarkerElement.SVG_MARKERUNITS_USERSPACEONUSE")
  @js.native
  val SVG_MARKERUNITS_USERSPACEONUSE: Double = js.native
  
  @JSGlobal("SVGMarkerElement.SVG_MARKER_ORIENT_ANGLE")
  @js.native
  val SVG_MARKER_ORIENT_ANGLE: Double = js.native
  
  @JSGlobal("SVGMarkerElement.SVG_MARKER_ORIENT_AUTO")
  @js.native
  val SVG_MARKER_ORIENT_AUTO: Double = js.native
  
  @JSGlobal("SVGMarkerElement.SVG_MARKER_ORIENT_UNKNOWN")
  @js.native
  val SVG_MARKER_ORIENT_UNKNOWN: Double = js.native
}
