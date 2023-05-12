package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesEditorMod.EditorPositionsOptions
import typings.slate.distInterfacesPointMod.Point
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEditorPositionsMod {
  
  @JSImport("slate/dist/editor/positions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def positions(editor: Editor): Generator[Point, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("positions")(editor.asInstanceOf[js.Any]).asInstanceOf[Generator[Point, Unit, Unit]]
  inline def positions(editor: Editor, options: EditorPositionsOptions): Generator[Point, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("positions")(editor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[Point, Unit, Unit]]
}
