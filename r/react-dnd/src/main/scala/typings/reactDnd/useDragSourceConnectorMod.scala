package typings.reactDnd

import typings.reactDnd.internalsMod.SourceConnector
import typings.reactDnd.optionsMod.DragPreviewOptions
import typings.reactDnd.optionsMod.DragSourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDragSourceConnectorMod {
  
  @JSImport("react-dnd/dist/hooks/useDrag/useDragSourceConnector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDragSourceConnector(): SourceConnector = ^.asInstanceOf[js.Dynamic].applyDynamic("useDragSourceConnector")().asInstanceOf[SourceConnector]
  inline def useDragSourceConnector(dragSourceOptions: Unit, dragPreviewOptions: DragPreviewOptions): SourceConnector = (^.asInstanceOf[js.Dynamic].applyDynamic("useDragSourceConnector")(dragSourceOptions.asInstanceOf[js.Any], dragPreviewOptions.asInstanceOf[js.Any])).asInstanceOf[SourceConnector]
  inline def useDragSourceConnector(dragSourceOptions: DragSourceOptions): SourceConnector = ^.asInstanceOf[js.Dynamic].applyDynamic("useDragSourceConnector")(dragSourceOptions.asInstanceOf[js.Any]).asInstanceOf[SourceConnector]
  inline def useDragSourceConnector(dragSourceOptions: DragSourceOptions, dragPreviewOptions: DragPreviewOptions): SourceConnector = (^.asInstanceOf[js.Dynamic].applyDynamic("useDragSourceConnector")(dragSourceOptions.asInstanceOf[js.Any], dragPreviewOptions.asInstanceOf[js.Any])).asInstanceOf[SourceConnector]
}
