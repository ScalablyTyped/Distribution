package typings.reactDndHtml5Backend

import typings.dndCore.interfacesMod.XYCoord
import typings.reactDndHtml5Backend.anon.AnchorX
import typings.reactDndHtml5Backend.anon.OffsetX
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object offsetUtilsMod {
  
  @JSImport("react-dnd-html5-backend/lib/OffsetUtils", "getDragPreviewOffset")
  @js.native
  def getDragPreviewOffset(
    sourceNode: HTMLElement,
    dragPreview: HTMLElement,
    clientOffset: XYCoord,
    anchorPoint: AnchorX,
    offsetPoint: OffsetX
  ): XYCoord = js.native
  
  @JSImport("react-dnd-html5-backend/lib/OffsetUtils", "getEventClientOffset")
  @js.native
  def getEventClientOffset(e: MouseEvent): XYCoord = js.native
  
  @JSImport("react-dnd-html5-backend/lib/OffsetUtils", "getNodeClientOffset")
  @js.native
  def getNodeClientOffset(node: Node): XYCoord | Null = js.native
}
