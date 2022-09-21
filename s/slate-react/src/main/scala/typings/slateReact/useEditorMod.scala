package typings.slateReact

import typings.slateReact.reactEditorMod.ReactEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useEditorMod {
  
  @JSImport("slate-react/dist/hooks/use-editor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useEditor(): ReactEditor = ^.asInstanceOf[js.Dynamic].applyDynamic("useEditor")().asInstanceOf[ReactEditor]
}
