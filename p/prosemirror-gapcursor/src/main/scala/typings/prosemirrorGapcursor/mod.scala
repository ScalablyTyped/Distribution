package typings.prosemirrorGapcursor

import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.Selection
import typings.prosemirrorState.mod.SelectionRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-gapcursor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prosemirror-gapcursor", "GapCursor")
  @js.native
  open class GapCursor_ protected () extends Selection {
    /**
      Initialize a selection with the head and anchor and ranges. If no
      ranges are given, constructs a single range across `$anchor` and
      `$head`.
      */
    def this(
      /**
      The resolved anchor of the selection (the side that stays in
      place when the selection is modified).
      */
    $anchor: ResolvedPos,
      /**
      The resolved head of the selection (the side that moves when
      the selection is modified).
      */
    $head: ResolvedPos
    ) = this()
    def this(
      /**
      The resolved anchor of the selection (the side that stays in
      place when the selection is modified).
      */
    $anchor: ResolvedPos,
      /**
      The resolved head of the selection (the side that moves when
      the selection is modified).
      */
    $head: ResolvedPos,
      ranges: js.Array[SelectionRange]
    ) = this()
  }
  
  inline def gapCursor(): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("gapCursor")().asInstanceOf[Plugin[Any]]
  
  /* augmented module */
  object prosemirrorModelAugmentingMod {
    
    trait NodeSpec extends StObject {
      
      /**
        * By default, gap cursor are only allowed in places where the
        * default content node (in the schema content constraints) is a
        * textblock node. You can customize this by adding an `allowGapCursor`
        * property to your node specs — if it's true, gap cursor are allowed
        * everywhere in that node, if it's false they are never allowed.
        */
      var allowGapCursor: js.UndefOr[Boolean] = js.undefined
    }
    object NodeSpec {
      
      inline def apply(): NodeSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NodeSpec]
      }
      
      extension [Self <: NodeSpec](x: Self) {
        
        inline def setAllowGapCursor(value: Boolean): Self = StObject.set(x, "allowGapCursor", value.asInstanceOf[js.Any])
        
        inline def setAllowGapCursorUndefined: Self = StObject.set(x, "allowGapCursor", js.undefined)
      }
    }
  }
}
