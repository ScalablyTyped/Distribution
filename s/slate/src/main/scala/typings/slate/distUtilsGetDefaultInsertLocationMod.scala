package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesLocationMod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsGetDefaultInsertLocationMod {
  
  @JSImport("slate/dist/utils/get-default-insert-location", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefaultInsertLocation(editor: Editor): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultInsertLocation")(editor.asInstanceOf[js.Any]).asInstanceOf[Location]
}
