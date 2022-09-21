package typings.slateReact

import typings.slate.rangeMod.Range
import typings.slateReact.reactEditorMod.ReactEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linesMod {
  
  @JSImport("slate-react/dist/utils/lines", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findCurrentLineRange(editor: ReactEditor, parentRange: Range): Range = (^.asInstanceOf[js.Dynamic].applyDynamic("findCurrentLineRange")(editor.asInstanceOf[js.Any], parentRange.asInstanceOf[js.Any])).asInstanceOf[Range]
}
