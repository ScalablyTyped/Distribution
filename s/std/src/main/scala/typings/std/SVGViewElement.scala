package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the properties of <view> elements, as well as methods to manipulate them. */
@js.native
trait SVGViewElement
  extends SVGElement
     with SVGFitToViewBox
     with SVGZoomAndPan {
  /** @deprecated */
  val viewTarget: SVGStringList = js.native
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
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
}

@JSGlobal("SVGViewElement")
@js.native
object SVGViewElement extends Instantiable0[SVGViewElement] {
  val SVG_ZOOMANDPAN_DISABLE: Double = js.native
  val SVG_ZOOMANDPAN_MAGNIFY: Double = js.native
  val SVG_ZOOMANDPAN_UNKNOWN: Double = js.native
}

