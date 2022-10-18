package typings.reactDndHtml5Backend

import typings.std.DataTransfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNativeDragSourcesGetDataFromDataTransferMod {
  
  @JSImport("react-dnd-html5-backend/dist/NativeDragSources/getDataFromDataTransfer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDataFromDataTransfer(dataTransfer: DataTransfer, typesToTry: js.Array[String], defaultValue: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDataFromDataTransfer")(dataTransfer.asInstanceOf[js.Any], typesToTry.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[String]
}
