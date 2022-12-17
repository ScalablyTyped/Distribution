package typings.prosemirrorGapcursor

import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-gapcursor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Gap cursor selections are represented using this class. Its
  `$anchor` and `$head` properties both point at the cursor position.
  */
  @JSImport("prosemirror-gapcursor", "GapCursor")
  @js.native
  open class GapCursor_ protected () extends Selection {
    /**
      Create a gap cursor.
      */
    def this($pos: ResolvedPos) = this()
  }
  
  /**
  Create a gap cursor plugin. When enabled, this will capture clicks
  near and arrow-key-motion past places that don't have a normally
  selectable position nearby, and create a gap cursor selection for
  them. The cursor is drawn as an element with class
  `ProseMirror-gapcursor`. You can either include
  `style/gapcursor.css` from the package's directory or add your own
  styles to make it visible.
  */
  inline def gapCursor(): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("gapCursor")().asInstanceOf[Plugin[Any]]
}
