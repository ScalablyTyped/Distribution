package typings.reactDndHtml5Backend

import typings.dndCore.interfacesMod.XYCoord
import typings.reactDndHtml5Backend.anon.AnchorX
import typings.reactDndHtml5Backend.anon.OffsetX
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object offsetUtilsMod {
  
  @JSImport("react-dnd-html5-backend/dist/OffsetUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDragPreviewOffset(
    sourceNode: HTMLElement,
    dragPreview: HTMLElement,
    clientOffset: XYCoord,
    anchorPoint: AnchorX,
    offsetPoint: OffsetX
  ): XYCoord = (^.asInstanceOf[js.Dynamic].applyDynamic("getDragPreviewOffset")(sourceNode.asInstanceOf[js.Any], dragPreview.asInstanceOf[js.Any], clientOffset.asInstanceOf[js.Any], anchorPoint.asInstanceOf[js.Any], offsetPoint.asInstanceOf[js.Any])).asInstanceOf[XYCoord]
  
  inline def getEventClientOffset(e: MouseEvent): XYCoord = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventClientOffset")(e.asInstanceOf[js.Any]).asInstanceOf[XYCoord]
  
  inline def getNodeClientOffset(node: Node): XYCoord | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeClientOffset")(node.asInstanceOf[js.Any]).asInstanceOf[XYCoord | Null]
}
