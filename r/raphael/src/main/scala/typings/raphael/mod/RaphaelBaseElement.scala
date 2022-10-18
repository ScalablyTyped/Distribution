package typings.raphael.mod

import typings.raphael.anon.ArraykeyofRaphaelReadAttr
import typings.raphael.anon.PartialRaphaelAttributes
import typings.raphael.anon.PartialRaphaelGlowSetting
import typings.raphael.raphaelStrings.`arrow-end`
import typings.raphael.raphaelStrings.`clip-rect`
import typings.raphael.raphaelStrings.`fill-opacity`
import typings.raphael.raphaelStrings.`font-family`
import typings.raphael.raphaelStrings.`font-size`
import typings.raphael.raphaelStrings.`font-weight`
import typings.raphael.raphaelStrings.`stroke-dasharray`
import typings.raphael.raphaelStrings.`stroke-linecap`
import typings.raphael.raphaelStrings.`stroke-linejoin`
import typings.raphael.raphaelStrings.`stroke-miterlimit`
import typings.raphael.raphaelStrings.`stroke-opacity`
import typings.raphael.raphaelStrings.`stroke-width`
import typings.raphael.raphaelStrings.`text-anchor`
import typings.raphael.raphaelStrings.cursor
import typings.raphael.raphaelStrings.cx
import typings.raphael.raphaelStrings.cy
import typings.raphael.raphaelStrings.fill
import typings.raphael.raphaelStrings.font
import typings.raphael.raphaelStrings.height
import typings.raphael.raphaelStrings.href
import typings.raphael.raphaelStrings.opacity
import typings.raphael.raphaelStrings.path
import typings.raphael.raphaelStrings.r_
import typings.raphael.raphaelStrings.rx
import typings.raphael.raphaelStrings.ry
import typings.raphael.raphaelStrings.src
import typings.raphael.raphaelStrings.stroke
import typings.raphael.raphaelStrings.target
import typings.raphael.raphaelStrings.text
import typings.raphael.raphaelStrings.title
import typings.raphael.raphaelStrings.transform
import typings.raphael.raphaelStrings.width
import typings.raphael.raphaelStrings.x
import typings.raphael.raphaelStrings.y
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelBaseElement[TTechnology /* <: RaphaelTechnology */] extends StObject {
  
  /**
    * Creates and starts animation for given element.
    * @param animation The animation to apply to this element. Use {@link RaphaelStatic.animation} to create an
    * animation.
    * @return this element for chaining.
    */
  def animate(animation: RaphaelAnimation): this.type = js.native
  /**
    * Creates and starts animation for given element.
    * @param targetAttributes Final attributes for the element, see also {@link attr}.
    * @param durationMilliseconds Number of milliseconds for the animation to run.
    * @param easing Easing type. Accept one of {@link RaphaelStatic.easing_formulas} or CSS forms such as
    * `cubic‐bezier(XX, XX, XX, XX)`.
    * @param onAnimationComplete Callback function. Will be called at the end of animation.
    * @return this element for chaining.
    */
  def animate(targetAttributes: PartialRaphaelAttributes, durationMilliseconds: Double): this.type = js.native
  def animate(
    targetAttributes: PartialRaphaelAttributes,
    durationMilliseconds: Double,
    easing: Unit,
    onAnimationComplete: RaphaelOnAnimationCompleteHandler[this.type]
  ): this.type = js.native
  def animate(
    targetAttributes: PartialRaphaelAttributes,
    durationMilliseconds: Double,
    easing: RaphaelBuiltinEasingFormula
  ): this.type = js.native
  def animate(
    targetAttributes: PartialRaphaelAttributes,
    durationMilliseconds: Double,
    easing: RaphaelBuiltinEasingFormula,
    onAnimationComplete: RaphaelOnAnimationCompleteHandler[this.type]
  ): this.type = js.native
  def animate(
    targetAttributes: PartialRaphaelAttributes,
    durationMilliseconds: Double,
    easing: RaphaelCustomEasingFormula
  ): this.type = js.native
  def animate(
    targetAttributes: PartialRaphaelAttributes,
    durationMilliseconds: Double,
    easing: RaphaelCustomEasingFormula,
    onAnimationComplete: RaphaelOnAnimationCompleteHandler[this.type]
  ): this.type = js.native
  
  /**
    * Acts similar to {@link animate}, but ensures that the given animation runs in sync with another given element.
    * @param otherElement Element to sync with.
    * @param otherAnimation animation to sync with.
    * @param animation The animation to apply to this element. Use {@link RaphaelStatic.animation} to create an
    * animation.
    * @return this element for chaining.
    */
  def animateWith(
    otherElement: RaphaelElement[
      TTechnology, 
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ],
    otherAnimation: RaphaelAnimation,
    animation: RaphaelAnimation
  ): this.type = js.native
  /**
    * Acts similar to {@link animate}, but ensures that the given animation runs in sync with another given
    * element.
    * @param otherElement Element to sync with.
    * @param otherAnimation animation to sync with.
    * @param targetAttributes Final attributes for the element, see also {@link attr}.
    * @param durationMilliseconds Number of milliseconds for the animation to run.
    * @param easing Easing type. Accept one of RaphaelStatic.easing_formulas or CSS forma such as
    * `cubic‐bezier(XX, XX, XX, XX)`.
    * @param onAnimationComplete Callback function. Will be called at the end of animation.
    * @return this element for chaining.
    */
  def animateWith(
    otherElement: RaphaelElement[
      TTechnology, 
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ],
    otherAnimation: RaphaelAnimation,
    targetAttributes: PartialRaphaelAttributes,
    durationMilliseconds: Double
  ): this.type = js.native
  def animateWith(
    otherElement: RaphaelElement[
      TTechnology, 
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ],
    otherAnimation: RaphaelAnimation,
    targetAttributes: PartialRaphaelAttributes,
    durationMilliseconds: Double,
    easing: Unit,
    onAnimationComplete: RaphaelOnAnimationCompleteHandler[this.type]
  ): this.type = js.native
  def animateWith(
    otherElement: RaphaelElement[
      TTechnology, 
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ],
    otherAnimation: RaphaelAnimation,
    targetAttributes: PartialRaphaelAttributes,
    durationMilliseconds: Double,
    easing: RaphaelBuiltinEasingFormula
  ): this.type = js.native
  def animateWith(
    otherElement: RaphaelElement[
      TTechnology, 
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ],
    otherAnimation: RaphaelAnimation,
    targetAttributes: PartialRaphaelAttributes,
    durationMilliseconds: Double,
    easing: RaphaelBuiltinEasingFormula,
    onAnimationComplete: RaphaelOnAnimationCompleteHandler[this.type]
  ): this.type = js.native
  def animateWith(
    otherElement: RaphaelElement[
      TTechnology, 
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ],
    otherAnimation: RaphaelAnimation,
    targetAttributes: PartialRaphaelAttributes,
    durationMilliseconds: Double,
    easing: RaphaelCustomEasingFormula
  ): this.type = js.native
  def animateWith(
    otherElement: RaphaelElement[
      TTechnology, 
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ],
    otherAnimation: RaphaelAnimation,
    targetAttributes: PartialRaphaelAttributes,
    durationMilliseconds: Double,
    easing: RaphaelCustomEasingFormula,
    onAnimationComplete: RaphaelOnAnimationCompleteHandler[this.type]
  ): this.type = js.native
  
  /**
    * Writes the given attributes to this element.
    * @param attributes Attributes to set on this element.
    * @return this element for chaining.
    */
  def attr(attributes: PartialRaphaelAttributes): this.type = js.native
  /**
    * Finds the current value of the given attributes.
    * @typeparam K Type of the attribute names to read.
    * @param attributeNames Names of the attributes to read.
    * @return A tuple with the values of the given attribute names.
    */
  def attr[// Trick compiler into inferring a tuple type without the consumer having to specify the tuple type explicitly
  // https://github.com/microsoft/TypeScript/issues/22679
  K /* <: ArraykeyofRaphaelReadAttr */](attributeNames: K): /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof K ]: K[P] extends 'transform'? raphael.raphael.RaphaelReadAttributes[K[P]] | undefined : never} */ js.Any = js.native
  /**
    * Set the given attribute of this element to the given value.
    * @typeparam K Type of the attribute name to set.
    * @param attributeName Name of an attribute to set.
    * @param attributeValue New value for the attribute.
    * @return this element for chaining.
    */
  @JSName("attr")
  def attr_arrowend(attributeName: `arrow-end`): this.type = js.native
  @JSName("attr")
  def attr_arrowend(attributeName: `arrow-end`, attributeValue: String): this.type = js.native
  @JSName("attr")
  def attr_arrowend_Union(attributeName: `arrow-end`): js.UndefOr[String] = js.native
  @JSName("attr")
  def attr_cliprect(attributeName: `clip-rect`): this.type = js.native
  @JSName("attr")
  def attr_cliprect(attributeName: `clip-rect`, attributeValue: String): this.type = js.native
  @JSName("attr")
  def attr_cliprect_Union(attributeName: `clip-rect`): js.UndefOr[String] = js.native
  @JSName("attr")
  def attr_cursor(attributeName: cursor): this.type = js.native
  @JSName("attr")
  def attr_cursor(attributeName: cursor, attributeValue: String): this.type = js.native
  @JSName("attr")
  def attr_cursor_Union(attributeName: cursor): js.UndefOr[String] = js.native
  @JSName("attr")
  def attr_cx(attributeName: cx): this.type = js.native
  @JSName("attr")
  def attr_cx(attributeName: cx, attributeValue: Double): this.type = js.native
  @JSName("attr")
  def attr_cx_Union(attributeName: cx): js.UndefOr[Double] = js.native
  @JSName("attr")
  def attr_cy(attributeName: cy): this.type = js.native
  @JSName("attr")
  def attr_cy(attributeName: cy, attributeValue: Double): this.type = js.native
  @JSName("attr")
  def attr_cy_Union(attributeName: cy): js.UndefOr[Double] = js.native
  @JSName("attr")
  def attr_fill(attributeName: fill): this.type = js.native
  @JSName("attr")
  def attr_fill(attributeName: fill, attributeValue: String): this.type = js.native
  @JSName("attr")
  def attr_fill_Union(attributeName: fill): js.UndefOr[String] = js.native
  @JSName("attr")
  def attr_fillopacity(attributeName: `fill-opacity`): this.type = js.native
  @JSName("attr")
  def attr_fillopacity(attributeName: `fill-opacity`, attributeValue: Double): this.type = js.native
  @JSName("attr")
  def attr_fillopacity_Union(attributeName: `fill-opacity`): js.UndefOr[Double] = js.native
  @JSName("attr")
  def attr_font(attributeName: font): this.type = js.native
  @JSName("attr")
  def attr_font(attributeName: font, attributeValue: String): this.type = js.native
  @JSName("attr")
  def attr_font_Union(attributeName: font): js.UndefOr[String] = js.native
  @JSName("attr")
  def attr_fontfamily(attributeName: `font-family`): this.type = js.native
  @JSName("attr")
  def attr_fontfamily(attributeName: `font-family`, attributeValue: String): this.type = js.native
  @JSName("attr")
  def attr_fontfamily_Union(attributeName: `font-family`): js.UndefOr[String] = js.native
  @JSName("attr")
  def attr_fontsize(attributeName: `font-size`): this.type = js.native
  @JSName("attr")
  def attr_fontsize(attributeName: `font-size`, attributeValue: Double | String): this.type = js.native
  @JSName("attr")
  def attr_fontsize_Union(attributeName: `font-size`): js.UndefOr[Double | String] = js.native
  @JSName("attr")
  def attr_fontweight(attributeName: `font-weight`): this.type = js.native
  @JSName("attr")
  def attr_fontweight(attributeName: `font-weight`, attributeValue: String): this.type = js.native
  @JSName("attr")
  def attr_fontweight_Union(attributeName: `font-weight`): js.UndefOr[String] = js.native
  @JSName("attr")
  def attr_height(attributeName: height): this.type = js.native
  @JSName("attr")
  def attr_height(attributeName: height, attributeValue: Double): this.type = js.native
  @JSName("attr")
  def attr_height_Union(attributeName: height): js.UndefOr[Double] = js.native
  @JSName("attr")
  def attr_href(attributeName: href): this.type = js.native
  @JSName("attr")
  def attr_href(attributeName: href, attributeValue: String): this.type = js.native
  @JSName("attr")
  def attr_href_Union(attributeName: href): js.UndefOr[String] = js.native
  @JSName("attr")
  def attr_opacity(attributeName: opacity): this.type = js.native
  @JSName("attr")
  def attr_opacity(attributeName: opacity, attributeValue: Double): this.type = js.native
  @JSName("attr")
  def attr_opacity_Union(attributeName: opacity): js.UndefOr[Double] = js.native
  @JSName("attr")
  def attr_path(attributeName: path): this.type = js.native
  @JSName("attr")
  def attr_path(attributeName: path, attributeValue: String): this.type = js.native
  @JSName("attr")
  def attr_path_Union(attributeName: path): js.UndefOr[String] = js.native
  @JSName("attr")
  def attr_r(attributeName: r_): this.type = js.native
  @JSName("attr")
  def attr_r(attributeName: r_, attributeValue: Double): this.type = js.native
  @JSName("attr")
  def attr_r_Union(attributeName: r_): js.UndefOr[Double] = js.native
  @JSName("attr")
  def attr_rx(attributeName: rx): this.type = js.native
  @JSName("attr")
  def attr_rx(attributeName: rx, attributeValue: Double): this.type = js.native
  @JSName("attr")
  def attr_rx_Union(attributeName: rx): js.UndefOr[Double] = js.native
  @JSName("attr")
  def attr_ry(attributeName: ry): this.type = js.native
  @JSName("attr")
  def attr_ry(attributeName: ry, attributeValue: Double): this.type = js.native
  @JSName("attr")
  def attr_ry_Union(attributeName: ry): js.UndefOr[Double] = js.native
  @JSName("attr")
  def attr_src(attributeName: src): this.type = js.native
  @JSName("attr")
  def attr_src(attributeName: src, attributeValue: String): this.type = js.native
  @JSName("attr")
  def attr_src_Union(attributeName: src): js.UndefOr[String] = js.native
  @JSName("attr")
  def attr_stroke(attributeName: stroke): this.type = js.native
  @JSName("attr")
  def attr_stroke(attributeName: stroke, attributeValue: String): this.type = js.native
  @JSName("attr")
  def attr_stroke_Union(attributeName: stroke): js.UndefOr[String] = js.native
  @JSName("attr")
  def attr_strokedasharray(attributeName: `stroke-dasharray`): this.type = js.native
  @JSName("attr")
  def attr_strokedasharray(attributeName: `stroke-dasharray`, attributeValue: RaphaelDashArrayType): this.type = js.native
  @JSName("attr")
  def attr_strokedasharray_Union(attributeName: `stroke-dasharray`): js.UndefOr[RaphaelDashArrayType] = js.native
  @JSName("attr")
  def attr_strokelinecap(attributeName: `stroke-linecap`): this.type = js.native
  @JSName("attr")
  def attr_strokelinecap(attributeName: `stroke-linecap`, attributeValue: RaphaelLineCapType): this.type = js.native
  @JSName("attr")
  def attr_strokelinecap_Union(attributeName: `stroke-linecap`): js.UndefOr[RaphaelLineCapType] = js.native
  @JSName("attr")
  def attr_strokelinejoin(attributeName: `stroke-linejoin`): this.type = js.native
  @JSName("attr")
  def attr_strokelinejoin(attributeName: `stroke-linejoin`, attributeValue: RaphaelLineJoinType): this.type = js.native
  @JSName("attr")
  def attr_strokelinejoin_Union(attributeName: `stroke-linejoin`): js.UndefOr[RaphaelLineJoinType] = js.native
  @JSName("attr")
  def attr_strokemiterlimit(attributeName: `stroke-miterlimit`): this.type = js.native
  @JSName("attr")
  def attr_strokemiterlimit(attributeName: `stroke-miterlimit`, attributeValue: Double): this.type = js.native
  @JSName("attr")
  def attr_strokemiterlimit_Union(attributeName: `stroke-miterlimit`): js.UndefOr[Double] = js.native
  @JSName("attr")
  def attr_strokeopacity(attributeName: `stroke-opacity`): this.type = js.native
  @JSName("attr")
  def attr_strokeopacity(attributeName: `stroke-opacity`, attributeValue: Double): this.type = js.native
  @JSName("attr")
  def attr_strokeopacity_Union(attributeName: `stroke-opacity`): js.UndefOr[Double] = js.native
  @JSName("attr")
  def attr_strokewidth(attributeName: `stroke-width`): this.type = js.native
  @JSName("attr")
  def attr_strokewidth(attributeName: `stroke-width`, attributeValue: Double): this.type = js.native
  @JSName("attr")
  def attr_strokewidth_Union(attributeName: `stroke-width`): js.UndefOr[Double] = js.native
  @JSName("attr")
  def attr_target(attributeName: target): this.type = js.native
  @JSName("attr")
  def attr_target(attributeName: target, attributeValue: String): this.type = js.native
  @JSName("attr")
  def attr_target_Union(attributeName: target): js.UndefOr[String] = js.native
  @JSName("attr")
  def attr_text(attributeName: text): this.type = js.native
  @JSName("attr")
  def attr_text(attributeName: text, attributeValue: String): this.type = js.native
  @JSName("attr")
  def attr_text_Union(attributeName: text): js.UndefOr[String] = js.native
  @JSName("attr")
  def attr_textanchor(attributeName: `text-anchor`): this.type = js.native
  @JSName("attr")
  def attr_textanchor(attributeName: `text-anchor`, attributeValue: RaphaelTextAnchorType): this.type = js.native
  @JSName("attr")
  def attr_textanchor_Union(attributeName: `text-anchor`): js.UndefOr[RaphaelTextAnchorType] = js.native
  @JSName("attr")
  def attr_title(attributeName: title): this.type = js.native
  @JSName("attr")
  def attr_title(attributeName: title, attributeValue: String): this.type = js.native
  @JSName("attr")
  def attr_title_Union(attributeName: title): js.UndefOr[String] = js.native
  @JSName("attr")
  def attr_transform(attributeName: transform): this.type = js.native
  @JSName("attr")
  def attr_transform(
    attributeName: transform,
    attributeValue: String | RaphaelTransformSegment | js.Array[RaphaelTransformSegment]
  ): this.type = js.native
  /**
    * Finds the current value of the given attribute.
    * @typeparam K Type of the attribute name to read.
    * @param attributeName Name of the attribute to read.
    * @return The value of the given attribute, or `undefined` if the attribute is unset or does not exist.
    */
  @JSName("attr")
  def attr_transform_Union(attributeName: transform): js.UndefOr[js.Array[RaphaelTransformSegment]] = js.native
  @JSName("attr")
  def attr_width(attributeName: width): this.type = js.native
  @JSName("attr")
  def attr_width(attributeName: width, attributeValue: Double): this.type = js.native
  @JSName("attr")
  def attr_width_Union(attributeName: width): js.UndefOr[Double] = js.native
  @JSName("attr")
  def attr_x(attributeName: x): this.type = js.native
  @JSName("attr")
  def attr_x(attributeName: x, attributeValue: Double): this.type = js.native
  @JSName("attr")
  def attr_x_Union(attributeName: x): js.UndefOr[Double] = js.native
  @JSName("attr")
  def attr_y(attributeName: y): this.type = js.native
  @JSName("attr")
  def attr_y(attributeName: y, attributeValue: Double): this.type = js.native
  @JSName("attr")
  def attr_y_Union(attributeName: y): js.UndefOr[Double] = js.native
  
  /**
    * Adds an event handler for the click event to this element.
    * @param handler Handler for the event.
    * @return this element for chaining.
    */
  def click(handler: RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent]): this.type = js.native
  
  /**
    * Retrieves the value associated with the given key. See also {@link removeData}.
    * @param key Key of the datum to retrieve.
    * @return The data associated with the given key.
    */
  def data(key: String): Any = js.native
  /**
    * Adds the given value associated with the given key. See also {@link removeData}.
    * @param key Key of the datum to store.
    * @param value Datum to store.
    */
  def data(key: String, value: Any): this.type = js.native
  
  /**
    * Adds an event handler for the double click event to this element.
    * @param handler Handler for the event.
    * @return this element for chaining.
    */
  def dblclick(handler: RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent]): this.type = js.native
  
  /**
    * Adds the event handlers for a drag of this element.
    * @typeparam MoveThisContext Type of the this context for the `onMove` handler.
    * @typeparam StartThisContext Type of the this context for the `onStart` handler.
    * @typeparam EndThisContext Type of the this context for the `onEnd` handler.
    * @param onMoveHandler Handler for when the pointer is moved while dragging.
    * @param onStartHandler Handler for when the dragging starts.
    * @param onEndHandler Handler for when the dragging ends.
    * @param moveThisContext The this context with which the `onMove` handler is invoked.
    * @param startThisContext The this context with which the `onStart` handler is invoked.
    * @param endThisContext The this context with which the `onEnd` handler is invoked.
    * @return this element for chaining.
    */
  def drag[MoveThisContext, StartThisContext, EndThisContext](
    onMoveHandler: RaphaelDragOnMoveHandler[MoveThisContext],
    onStartHandler: RaphaelDragOnStartHandler[StartThisContext],
    onEndHandler: RaphaelDragOnEndHandler[EndThisContext]
  ): this.type = js.native
  def drag[MoveThisContext, StartThisContext, EndThisContext](
    onMoveHandler: RaphaelDragOnMoveHandler[MoveThisContext],
    onStartHandler: RaphaelDragOnStartHandler[StartThisContext],
    onEndHandler: RaphaelDragOnEndHandler[EndThisContext],
    moveThisContext: MoveThisContext
  ): this.type = js.native
  def drag[MoveThisContext, StartThisContext, EndThisContext](
    onMoveHandler: RaphaelDragOnMoveHandler[MoveThisContext],
    onStartHandler: RaphaelDragOnStartHandler[StartThisContext],
    onEndHandler: RaphaelDragOnEndHandler[EndThisContext],
    moveThisContext: MoveThisContext,
    startThisContext: StartThisContext
  ): this.type = js.native
  def drag[MoveThisContext, StartThisContext, EndThisContext](
    onMoveHandler: RaphaelDragOnMoveHandler[MoveThisContext],
    onStartHandler: RaphaelDragOnStartHandler[StartThisContext],
    onEndHandler: RaphaelDragOnEndHandler[EndThisContext],
    moveThisContext: MoveThisContext,
    startThisContext: StartThisContext,
    endThisContext: EndThisContext
  ): this.type = js.native
  def drag[MoveThisContext, StartThisContext, EndThisContext](
    onMoveHandler: RaphaelDragOnMoveHandler[MoveThisContext],
    onStartHandler: RaphaelDragOnStartHandler[StartThisContext],
    onEndHandler: RaphaelDragOnEndHandler[EndThisContext],
    moveThisContext: MoveThisContext,
    startThisContext: Unit,
    endThisContext: EndThisContext
  ): this.type = js.native
  def drag[MoveThisContext, StartThisContext, EndThisContext](
    onMoveHandler: RaphaelDragOnMoveHandler[MoveThisContext],
    onStartHandler: RaphaelDragOnStartHandler[StartThisContext],
    onEndHandler: RaphaelDragOnEndHandler[EndThisContext],
    moveThisContext: Unit,
    startThisContext: StartThisContext
  ): this.type = js.native
  def drag[MoveThisContext, StartThisContext, EndThisContext](
    onMoveHandler: RaphaelDragOnMoveHandler[MoveThisContext],
    onStartHandler: RaphaelDragOnStartHandler[StartThisContext],
    onEndHandler: RaphaelDragOnEndHandler[EndThisContext],
    moveThisContext: Unit,
    startThisContext: StartThisContext,
    endThisContext: EndThisContext
  ): this.type = js.native
  def drag[MoveThisContext, StartThisContext, EndThisContext](
    onMoveHandler: RaphaelDragOnMoveHandler[MoveThisContext],
    onStartHandler: RaphaelDragOnStartHandler[StartThisContext],
    onEndHandler: RaphaelDragOnEndHandler[EndThisContext],
    moveThisContext: Unit,
    startThisContext: Unit,
    endThisContext: EndThisContext
  ): this.type = js.native
  
  /**
    * Returns a bounding box for this element.
    * @param isWithoutTransform `true` if you want to have bounding box before transformations are applied.
    * Default is `false`.
    * @return The smallest bounding box that contains this element.
    */
  def getBBox(): RaphaelAxisAlignedBoundingBox = js.native
  def getBBox(isWithoutTransform: Boolean): RaphaelAxisAlignedBoundingBox = js.native
  
  /**
    * Return a set of elements that create a glow-like effect around this element.
    *
    * Note: Glow is not connected to the element. If you change element attributes it will not adjust itself.
    * @param glow Optional settings for the glow effect.
    * @return A set of elements that produce the given glow effect.
    */
  def glow(): RaphaelSet[TTechnology] = js.native
  def glow(glow: PartialRaphaelGlowSetting): RaphaelSet[TTechnology] = js.native
  
  /**
    * Makes this element invisible. See also {@link RaphaelElement.show}.
    * @return this element for chaining.
    */
  def hide(): this.type = js.native
  
  /**
    * Adds event handlers for the hover events to this element.
    * @typeparam HoverInThisContext Type of the this context for the `onHoverIn` handler.
    * @typeparam HoverOutThisContext Type of the this context for the `onHoverOut` handler.
    * @param onHoverInHandler Handler for when the pointer enters this element.
    * @param onHoverOutHandler Handler for when the pointer leaves this element.
    * @param hoverInThisContext The this context with which the `onHoverIn` handler is invoked.
    * @param hoverOutThisContext The this context with which the `onHoverOut` handler is invoked.
    * @return this element for chaining.
    */
  def hover[HoverInThisContext, HoverOutThisContext](
    onHoverInHandler: RaphaelBasicEventHandler[HoverInThisContext, MouseEvent],
    onHoverOutHandler: RaphaelBasicEventHandler[HoverOutThisContext, MouseEvent]
  ): this.type = js.native
  def hover[HoverInThisContext, HoverOutThisContext](
    onHoverInHandler: RaphaelBasicEventHandler[HoverInThisContext, MouseEvent],
    onHoverOutHandler: RaphaelBasicEventHandler[HoverOutThisContext, MouseEvent],
    hoverInThisContext: HoverInThisContext
  ): this.type = js.native
  def hover[HoverInThisContext, HoverOutThisContext](
    onHoverInHandler: RaphaelBasicEventHandler[HoverInThisContext, MouseEvent],
    onHoverOutHandler: RaphaelBasicEventHandler[HoverOutThisContext, MouseEvent],
    hoverInThisContext: HoverInThisContext,
    hoverOutThisContext: HoverOutThisContext
  ): this.type = js.native
  def hover[HoverInThisContext, HoverOutThisContext](
    onHoverInHandler: RaphaelBasicEventHandler[HoverInThisContext, MouseEvent],
    onHoverOutHandler: RaphaelBasicEventHandler[HoverOutThisContext, MouseEvent],
    hoverInThisContext: Unit,
    hoverOutThisContext: HoverOutThisContext
  ): this.type = js.native
  
  /**
    * Inserts current object after the given one in the DOM.
    * @param element Element to insert.
    * @return this element for chaining.
    */
  def insertAfter(
    element: RaphaelElement[
      TTechnology, 
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ]
  ): this.type = js.native
  
  /**
    * Inserts current object before the given one.
    * @param element Element to insert.
    * @return this element for chaining.
    */
  def insertBefore(
    element: RaphaelElement[
      TTechnology, 
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ]
  ): this.type = js.native
  
  /**
    * Determine if given point is inside this element’s shape
    * @param x x coordinate of the point
    * @param y y coordinate of the point
    * @return `true` if point inside the shape
    */
  def isPointInside(x: Double, y: Double): Boolean = js.native
  
  /**
    * The current transform matrix representing the total transform of this element.
    */
  var matrix: RaphaelMatrix = js.native
  
  /**
    * Adds an event handler for the mousedown event to this element.
    * @param handler Handler for the event.
    * @return this element for chaining.
    */
  def mousedown(handler: RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent]): this.type = js.native
  
  /**
    * Adds an event handler for the mousemove event to this element.
    * @param handler Handler for the event.
    * @return this element for chaining.
    */
  def mousemove(handler: RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent]): this.type = js.native
  
  /**
    * Adds an event handler for the mouseout event to this element.
    * @param handler Handler for the event.
    * @return this element for chaining.
    */
  def mouseout(handler: RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent]): this.type = js.native
  
  /**
    * Adds an event handler for the mouseover event to this element.
    * @param handler Handler for the event.
    * @return this element for chaining.
    */
  def mouseover(handler: RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent]): this.type = js.native
  
  /**
    * Adds an event handler for the mouseup event to this element.
    * @param handler Handler for the event.
    * @return this element for chaining.
    */
  def mouseup(handler: RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent]): this.type = js.native
  
  /**
    * Shortcut for assigning an event handler for the `drag.over.<id>` event, where `id` is the ID of the element,
    * see {@link RaphaelElement.id}.
    * @param onDragOverHandler Handler for event, first argument would be the element you are dragging over
    * @return this element for chaining.
    */
  def onDragOver(
    onDragOverHandler: RaphaelDragOnOverHandler[TTechnology, RaphaelUnwrapElement[TTechnology, this.type]]
  ): this.type = js.native
  
  /**
    * Stops an animation of this element with the ability to resume it later on.
    * @param anim Animation to pause. If not given, pauses all current animations.
    * @return this element for chaining.
    */
  def pause(): this.type = js.native
  def pause(anim: RaphaelAnimation): this.type = js.native
  
  /**
    * Removes this element from the paper.
    */
  def remove(): Unit = js.native
  
  /**
    * Removes the value associated with this element by the given key. If the key is not provided, removes all the
    * data of this element.
    * @param key Key of the datum to remove.
    * @return this element for chaining.
    */
  def removeData(): this.type = js.native
  def removeData(key: String): this.type = js.native
  
  /**
    * Resumes animation if it was paused with {@link RaphaelElement.pause} method.
    * @param anim The animation that was paused. If not given, resumes all currently paused animations.
    * @return this element for chaining.
    */
  def resume(): this.type = js.native
  def resume(anim: RaphaelAnimation): this.type = js.native
  
  /**
    * Rotates this element by the given angle around the center of this shape.
    * @param degrees Angle in degrees by which to rotate.
    * @return this element for chaining.
    */
  def rotate(degrees: Double): this.type = js.native
  /**
    * Rotates this element by the given angle around the given point.
    * @param degrees Angle in degrees by which to rotate.
    * @param centerX Horizontal coordinate of the center of rotation.
    * @param centerY Vertical coordinate of the center of rotation.
    * @return this element for chaining.
    */
  def rotate(degrees: Double, centerX: Double, centerY: Double): this.type = js.native
  
  /**
    * Scales this element by the given scale factor. The center of this
    * shape is used as the center of the scaling operation.
    * @param scaleFactorX Horizontal part of the scale factor.
    * @param scaleFactorY Vertical part of the scale factor. If not given, defaults to `scaleFactorX`.
    * @return this element for chaining.
    */
  def scale(scaleFactorX: Double): this.type = js.native
  def scale(scaleFactorX: Double, scaleFactorY: Double): this.type = js.native
  /**
    * Scales this element by the given scale factor, relative to the given center.
    * @param scaleFactorX Horizontal part of the scale factor.
    * @param scaleFactorY Vertical part of the scale factor.
    * @param centerX Horizontal coordinate of the center of the scaling operation.
    * @param centerY Vertical coordinate of the center of the scaling operation.
    * @return this element for chaining.
    */
  def scale(scaleFactorX: Double, scaleFactorY: Double, centerX: Double, centerY: Double): this.type = js.native
  
  /**
    * Sets the status of animation of the element in milliseconds. Similar to {@link status} method.
    * @param animation Animation for which to set the status.
    * @param value Number of milliseconds from the beginning of the animation.
    * @return this element for chaining.
    */
  def setTime(animation: RaphaelAnimation, value: Double): this.type = js.native
  
  /**
    * Makes this element visible. See also {@link RaphaelElement.hide}.
    * @return this element for chaining.
    */
  def show(): this.type = js.native
  
  /**
    * Gets the status (normalized animation time) of the current animations of this element.
    * @return The status of all animations currently playing.
    */
  def status(): js.Array[RaphaelAnimationStatus] = js.native
  /**
    * Gets the status of the given animation of this element.
    * @param animation Animation object for which to retrieve the status.
    * @return The current value (normalized animation time) of the given animation.
    */
  def status(animation: RaphaelAnimation): Double = js.native
  /**
    * Sets the status of the given animation of this element to the given value. This will cause the animation to
    * jump to the given position.
    * @param animation Animation object for which to set the status.
    * @param value New value (normalized animation time) for the animation, between `0` and `1`.
    * @return this element for chaining.
    */
  def status(animation: RaphaelAnimation, value: Double): this.type = js.native
  
  /**
    * Stops all or the the given animation of this element.
    * @param animation An animation to stop. If not given, stops all animations currently playing.
    * @return this element for chaining.
    */
  def stop(): this.type = js.native
  def stop(animation: RaphaelAnimation): this.type = js.native
  
  /**
    * Moves this element so it is the furthest from the viewer’s eyes, behind other elements.
    * @return this element for chaining.
    */
  def toBack(): this.type = js.native
  
  /**
    * Moves this element so it is the closest to the viewer’s eyes, on top of other elements.
    * @return this element for chaining.
    */
  def toFront(): this.type = js.native
  
  /**
    * Adds an event handler for the touchcancel event to this element.
    * @param handler Handler for the event.
    * @return this element for chaining.
    */
  def touchcancel(handler: RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent]): this.type = js.native
  
  /**
    * Adds an event handler for the touchend event to this element.
    * @param handler Handler for the event.
    * @return this element for chaining.
    */
  def touchend(handler: RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent]): this.type = js.native
  
  /**
    * Adds an event handler for the touchmove event to this element.
    * @param handler Handler for the event.
    * @return this element for chaining.
    */
  def touchmove(handler: RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent]): this.type = js.native
  
  /**
    * Adds an event handler for the touchstart event to this element.
    * @param handler Handler for the event.
    * @return this element for chaining.
    */
  def touchstart(handler: RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent]): this.type = js.native
  
  /**
    * Returns the current transformation of this element. This transformation is separate to other attributes, i.e.
    * translation does not change x or y of the rectangle. The format of transformation string is similar to the
    * path string syntax:
    *
    * ```
    * "t100,100r30,100,100s2,2,100,100r45s1.5"
    * ```
    *
    * Each letter is a command. There are four commands:
    * - `t` is for translate
    * - `r` is for rotate,
    * - `s` is for scale
    * - `m` is for matrix.
    *
    * So, the example line above could be read like
    *
    * ```
    * translate by 100, 100;
    * rotate 30° around 100, 100;
    * scale twice around 100, 100;
    * rotate 45° around centre;
    * scale 1.5 times relative to centre
    * ```
    *
    * As you can see rotate and scale commands have origin coordinates as optional parameters, the default is the
    * centre point of the element. Matrix accepts six parameters.
    *
    * ```javascript
    * // to get current value call it without parameters
    * console.log(el.transform());
    * ```
    *
    * @return The current transformation of this element.
    */
  def transform(): String = js.native
  /**
    * Adds transformation to this element which is separate to other attributes, i.e. translation does not change x
    * or y of the rectangle. The format of transformation string is similar to the path string syntax:
    *
    * ```
    * "t100,100r30,100,100s2,2,100,100r45s1.5"
    * ```
    *
    * Each letter is a command. There are four commands:
    * - `t` is for translate
    * - `r` is for rotate,
    * - `s` is for scale
    * - `m` is for matrix.
    *
    * So, the example line above could be read like
    *
    * ```
    * translate by 100, 100;
    * rotate 30° around 100, 100;
    * scale twice around 100, 100;
    * rotate 45° around centre;
    * scale 1.5 times relative to centre
    * ```
    *
    * As you can see rotate and scale commands have origin coordinates as optional parameters, the default is the
    * centre point of the element. Matrix accepts six parameters.
    *
    * ```javascript
    * var el = paper.rect(10, 20, 300, 200);
    *
    * // translate 100, 100, rotate 45°, translate -100, 0
    * el.transform("t100,100r45t-100,0");
    *
    * // if you want you can append or prepend transformations
    * el.transform("...t50,50");
    * el.transform("s2...");
    *
    * // or even wrap
    * el.transform("t50,50...t-50-50");
    *
    * // to reset transformation call method with empty string
    * el.transform("");
    * ```
    *
    * @param A transform string by which to transform this element.
    * @return this element for chaining.
    */
  def transform(transformString: String): this.type = js.native
  
  /**
    * Translates this element by the given amount.
    * @param deltaX Amount by which to translate in the horizontal direction.
    * @param deltaY Amount by which to translate in the vertical direction.
    * @return this element for chaining.
    */
  def translate(deltaX: Double, deltaY: Double): this.type = js.native
  
  /**
    * Removes an event handler for the click event from this element. See {@link click}.
    * @param handler A handler to remove.
    * @return this element for chaining.
    */
  def unclick(handler: RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent]): this.type = js.native
  
  /**
    * Removes an event handler for the double click event from this element. See {@link dblclick}.
    * @param handler A handler to remove.
    * @return this element for chaining.
    */
  def undblclick(handler: RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent]): this.type = js.native
  
  /**
    * Removes all drag event handlers from this element.
    * @return this element for chaining.
    */
  def undrag(): this.type = js.native
  
  /**
    * Removes the event handlers for the hover event from this element. See {@link hover}.
    * @param onHoverInHandler Hover-in handler to remove.
    * @param onHoverOutHandler Hover-out handler to remove.
    * @return this element for chaining.
    */
  def unhover(
    onHoverInHandler: RaphaelBasicEventHandler[Any, MouseEvent],
    onHoverOutHandler: RaphaelBasicEventHandler[Any, MouseEvent]
  ): this.type = js.native
  
  /**
    * Removes an event handler for the mousedown event from this element. See {@link mousedown}.
    * @param handler A handler to remove.
    * @return this element for chaining.
    */
  def unmousedown(handler: RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent]): this.type = js.native
  
  /**
    * Removes an event handler for the mousemove event from this element. See {@link mousemove}.
    * @param handler A handler to remove.
    * @return this element for chaining.
    */
  def unmousemove(handler: RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent]): this.type = js.native
  
  /**
    * Removes an event handler for the mouseout event from this element. See {@link mouseout}.
    * @param handler A handler to remove.
    * @return this element for chaining.
    */
  def unmouseout(handler: RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent]): this.type = js.native
  
  /**
    * Removes an event handler for the mouseover event from this element. See {@link mouseover}.
    * @param handler A handler to remove.
    * @return this element for chaining.
    */
  def unmouseover(handler: RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent]): this.type = js.native
  
  /**
    * Removes an event handler for the mouseup event from this element. See {@link mouseup}.
    * @param handler A handler to remove.
    * @return this element for chaining.
    */
  def unmouseup(handler: RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent]): this.type = js.native
  
  /**
    * Removes an event handler for the touchcancel event from this element. See {@link touchcancel}.
    * @param handler A handler to remove.
    * @return this element for chaining.
    */
  def untouchcancel(handler: RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent]): this.type = js.native
  
  /**
    * Removes an event handler for the touchend event from this element. See {@link touchend}.
    * @param handler A handler to remove.
    * @return this element for chaining.
    */
  def untouchend(handler: RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent]): this.type = js.native
  
  /**
    * Removes an event handler for the touchmove event from this element. See {@link touchmove}.
    * @param handler A handler to remove.
    * @return this element for chaining.
    */
  def untouchmove(handler: RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent]): this.type = js.native
  
  /**
    * Removes an event handler for the touchstart event from this element. See {@link touchstart}.
    * @param handler A handler to remove.
    * @return this element for chaining.
    */
  def untouchstart(handler: RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent]): this.type = js.native
}
