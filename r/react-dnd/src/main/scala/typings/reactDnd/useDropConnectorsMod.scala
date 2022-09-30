package typings.reactDnd

import typings.reactDnd.internalsMod.TargetConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDropConnectorsMod {
  
  @JSImport("react-dnd/dist/hooks/useDrop/connectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useConnectDropTarget(connector: TargetConnector): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useConnectDropTarget")(connector.asInstanceOf[js.Any]).asInstanceOf[Any]
}
