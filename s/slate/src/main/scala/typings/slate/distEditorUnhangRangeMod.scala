package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesEditorMod.EditorUnhangRangeOptions
import typings.slate.distInterfacesRangeMod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEditorUnhangRangeMod {
  
  @JSImport("slate/dist/editor/unhang-range", "unhangRange")
  @js.native
  val unhangRange: js.Function3[
    /* editor */ Editor, 
    /* range */ Range, 
    /* options */ js.UndefOr[EditorUnhangRangeOptions], 
    Range
  ] = js.native
}
