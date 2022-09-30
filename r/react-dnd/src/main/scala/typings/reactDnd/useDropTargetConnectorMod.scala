package typings.reactDnd

import typings.reactDnd.internalsMod.TargetConnector
import typings.reactDnd.optionsMod.DropTargetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDropTargetConnectorMod {
  
  @JSImport("react-dnd/dist/hooks/useDrop/useDropTargetConnector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDropTargetConnector(options: DropTargetOptions): TargetConnector = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropTargetConnector")(options.asInstanceOf[js.Any]).asInstanceOf[TargetConnector]
}
