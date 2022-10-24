package typings.reactMdUtils

import typings.reactMdUtils.reactMdUtilsStrings.height
import typings.reactMdUtils.reactMdUtilsStrings.width
import typings.reactMdUtils.typesPositioningTypesMod.Coords
import typings.reactMdUtils.typesPositioningTypesMod.FixedPosition
import typings.reactMdUtils.typesPositioningTypesMod.FixedPositionOptions
import typings.reactMdUtils.typesPositioningTypesMod.PositionAnchor
import typings.std.DOMRect
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPositioningMod {
  
  @JSImport("@react-md/utils/types/positioning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/positioning", "ABOVE_CENTER_ANCHOR")
  @js.native
  val ABOVE_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "ABOVE_INNER_LEFT_ANCHOR")
  @js.native
  val ABOVE_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "ABOVE_INNER_RIGHT_ANCHOR")
  @js.native
  val ABOVE_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "ABOVE_LEFT_ANCHOR")
  @js.native
  val ABOVE_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "ABOVE_RIGHT_ANCHOR")
  @js.native
  val ABOVE_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "BELOW_CENTER_ANCHOR")
  @js.native
  val BELOW_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "BELOW_INNER_LEFT_ANCHOR")
  @js.native
  val BELOW_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "BELOW_INNER_RIGHT_ANCHOR")
  @js.native
  val BELOW_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "BELOW_LEFT_ANCHOR")
  @js.native
  val BELOW_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "BELOW_RIGHT_ANCHOR")
  @js.native
  val BELOW_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "BOTTOM_CENTER_ANCHOR")
  @js.native
  val BOTTOM_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "BOTTOM_INNER_LEFT_ANCHOR")
  @js.native
  val BOTTOM_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "BOTTOM_INNER_RIGHT_ANCHOR")
  @js.native
  val BOTTOM_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "BOTTOM_LEFT_ANCHOR")
  @js.native
  val BOTTOM_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "BOTTOM_RIGHT_ANCHOR")
  @js.native
  val BOTTOM_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "CENTER_CENTER_ANCHOR")
  @js.native
  val CENTER_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "CENTER_INNER_LEFT_ANCHOR")
  @js.native
  val CENTER_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "CENTER_INNER_RIGHT_ANCHOR")
  @js.native
  val CENTER_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "CENTER_LEFT_ANCHOR")
  @js.native
  val CENTER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "CENTER_RIGHT_ANCHOR")
  @js.native
  val CENTER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "TOP_CENTER_ANCHOR")
  @js.native
  val TOP_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "TOP_INNER_LEFT_ANCHOR")
  @js.native
  val TOP_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "TOP_INNER_RIGHT_ANCHOR")
  @js.native
  val TOP_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "TOP_LEFT_ANCHOR")
  @js.native
  val TOP_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils/types/positioning", "TOP_RIGHT_ANCHOR")
  @js.native
  val TOP_RIGHT_ANCHOR: PositionAnchor = js.native
  
  inline def findSizingContainer(): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findSizingContainer")().asInstanceOf[HTMLElement | Null]
  inline def findSizingContainer(el: HTMLElement): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findSizingContainer")(el.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
  
  inline def getElementRect(element: HTMLElement): DOMRect = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementRect")(element.asInstanceOf[js.Any]).asInstanceOf[DOMRect]
  inline def getElementRect(element: HTMLElement, coords: Coords): DOMRect = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementRect")(element.asInstanceOf[js.Any], coords.asInstanceOf[js.Any])).asInstanceOf[DOMRect]
  
  inline def getFixedPosition(param0: FixedPositionOptions): FixedPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("getFixedPosition")(param0.asInstanceOf[js.Any]).asInstanceOf[FixedPosition]
  
  inline def getViewportSize(direction: height | width): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewportSize")(direction.asInstanceOf[js.Any]).asInstanceOf[Double]
}
