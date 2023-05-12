package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesEditorMod.EditorRangeRefOptions
import typings.slate.distInterfacesRangeMod.Range
import typings.slate.distInterfacesRangeRefMod.RangeRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEditorRangeRefMod {
  
  @JSImport("slate/dist/editor/range-ref", "rangeRef")
  @js.native
  val rangeRef: js.Function3[
    /* editor */ Editor, 
    /* range */ Range, 
    /* options */ js.UndefOr[EditorRangeRefOptions], 
    RangeRef
  ] = js.native
}
