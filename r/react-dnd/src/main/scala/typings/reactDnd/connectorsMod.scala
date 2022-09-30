package typings.reactDnd

import typings.reactDnd.internalsMod.SourceConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectorsMod {
  
  @JSImport("react-dnd/dist/hooks/useDrag/connectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useConnectDragPreview(connector: SourceConnector): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useConnectDragPreview")(connector.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def useConnectDragSource(connector: SourceConnector): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useConnectDragSource")(connector.asInstanceOf[js.Any]).asInstanceOf[Any]
}
