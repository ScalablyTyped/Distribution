package typings.reactDnd

import typings.react.mod.ReactElement
import typings.react.mod.RefObject
import typings.reactDnd.distTypesOptionsMod.DragPreviewOptions
import typings.reactDnd.distTypesOptionsMod.DragSourceOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConnectorsMod {
  
  type ConnectDragPreview = DragElementWrapper[DragPreviewOptions]
  
  type ConnectDragSource = DragElementWrapper[DragSourceOptions]
  
  type ConnectDropTarget = DragElementWrapper[Any]
  
  type ConnectableElement = RefObject[Any] | ReactElement | Element | Null
  
  type DragElementWrapper[Options] = js.Function2[
    /* elementOrNode */ ConnectableElement, 
    /* options */ js.UndefOr[Options], 
    ReactElement | Null
  ]
}
