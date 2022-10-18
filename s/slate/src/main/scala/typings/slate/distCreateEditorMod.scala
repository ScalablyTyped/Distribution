package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCreateEditorMod {
  
  @JSImport("slate/dist/create-editor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEditor(): Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")().asInstanceOf[Editor]
}
