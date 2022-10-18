package typings.reactDnd

import typings.reactDnd.distInternalsMod.SourceConnector
import typings.reactDnd.distTypesOptionsMod.DragPreviewOptions
import typings.reactDnd.distTypesOptionsMod.DragSourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseDragUseDragSourceConnectorMod {
  
  @JSImport("react-dnd/dist/hooks/useDrag/useDragSourceConnector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDragSourceConnector(): SourceConnector = ^.asInstanceOf[js.Dynamic].applyDynamic("useDragSourceConnector")().asInstanceOf[SourceConnector]
  inline def useDragSourceConnector(dragSourceOptions: Unit, dragPreviewOptions: DragPreviewOptions): SourceConnector = (^.asInstanceOf[js.Dynamic].applyDynamic("useDragSourceConnector")(dragSourceOptions.asInstanceOf[js.Any], dragPreviewOptions.asInstanceOf[js.Any])).asInstanceOf[SourceConnector]
  inline def useDragSourceConnector(dragSourceOptions: DragSourceOptions): SourceConnector = ^.asInstanceOf[js.Dynamic].applyDynamic("useDragSourceConnector")(dragSourceOptions.asInstanceOf[js.Any]).asInstanceOf[SourceConnector]
  inline def useDragSourceConnector(dragSourceOptions: DragSourceOptions, dragPreviewOptions: DragPreviewOptions): SourceConnector = (^.asInstanceOf[js.Dynamic].applyDynamic("useDragSourceConnector")(dragSourceOptions.asInstanceOf[js.Any], dragPreviewOptions.asInstanceOf[js.Any])).asInstanceOf[SourceConnector]
}
