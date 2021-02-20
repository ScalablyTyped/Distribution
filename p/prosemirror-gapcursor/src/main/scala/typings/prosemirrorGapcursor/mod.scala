package typings.prosemirrorGapcursor

import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.Selection
import typings.prosemirrorState.mod.SelectionRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-gapcursor", "GapCursor")
  @js.native
  class GapCursor_ protected ()
    extends Selection[js.Any] {
    /**
      * Initialize a selection with the head and anchor and ranges. If no
      * ranges are given, constructs a single range across `$anchor` and
      * `$head`.
      */
    def this($anchor: ResolvedPos[_], $head: ResolvedPos[_]) = this()
    def this($anchor: ResolvedPos[_], $head: ResolvedPos[_], ranges: js.Array[SelectionRange[_]]) = this()
  }
  
  @JSImport("prosemirror-gapcursor", "gapCursor")
  @js.native
  def gapCursor(): Plugin[_, _] = js.native
}
