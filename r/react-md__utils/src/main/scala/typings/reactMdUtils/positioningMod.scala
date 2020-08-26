package typings.reactMdUtils

import typings.reactMdUtils.reactMdUtilsStrings.height
import typings.reactMdUtils.reactMdUtilsStrings.width
import typings.reactMdUtils.typesMod.Coords
import typings.reactMdUtils.typesMod.FixedPosition
import typings.reactMdUtils.typesMod.FixedPositionOptions
import typings.reactMdUtils.typesMod.PositionAnchor
import typings.std.ClientRect
import typings.std.DOMRect
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/positioning", JSImport.Namespace)
@js.native
object positioningMod extends js.Object {
  val ABOVE_CENTER_ANCHOR: PositionAnchor = js.native
  val ABOVE_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  val ABOVE_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  val ABOVE_LEFT_ANCHOR: PositionAnchor = js.native
  val ABOVE_RIGHT_ANCHOR: PositionAnchor = js.native
  val BELOW_CENTER_ANCHOR: PositionAnchor = js.native
  val BELOW_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  val BELOW_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  val BELOW_LEFT_ANCHOR: PositionAnchor = js.native
  val BELOW_RIGHT_ANCHOR: PositionAnchor = js.native
  val BOTTOM_CENTER_ANCHOR: PositionAnchor = js.native
  val BOTTOM_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  val BOTTOM_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  val BOTTOM_LEFT_ANCHOR: PositionAnchor = js.native
  val BOTTOM_RIGHT_ANCHOR: PositionAnchor = js.native
  val CENTER_CENTER_ANCHOR: PositionAnchor = js.native
  val CENTER_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  val CENTER_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  val CENTER_LEFT_ANCHOR: PositionAnchor = js.native
  val CENTER_RIGHT_ANCHOR: PositionAnchor = js.native
  val TOP_CENTER_ANCHOR: PositionAnchor = js.native
  val TOP_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  val TOP_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  val TOP_LEFT_ANCHOR: PositionAnchor = js.native
  val TOP_RIGHT_ANCHOR: PositionAnchor = js.native
  def findSizingContainer(): HTMLElement | Null = js.native
  def findSizingContainer(el: HTMLElement): HTMLElement | Null = js.native
  def getElementRect(element: HTMLElement): DOMRect | ClientRect = js.native
  def getElementRect(element: HTMLElement, coords: Coords): DOMRect | ClientRect = js.native
  def getFixedPosition(
    hasContainerElementAnchorInitialXInitialYVwMarginVhMarginXMarginYMarginWidthPreventOverlapTransformOriginDisableSwappingDisableVHBounds: FixedPositionOptions
  ): FixedPosition = js.native
  @JSName("getViewportSize")
  def getViewportSize_height(direction: height): Double = js.native
  @JSName("getViewportSize")
  def getViewportSize_width(direction: width): Double = js.native
}

