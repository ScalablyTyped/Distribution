package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesEditorMod.EditorPointRefOptions
import typings.slate.distInterfacesPointMod.Point
import typings.slate.distInterfacesPointRefMod.PointRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEditorPointRefMod {
  
  @JSImport("slate/dist/editor/point-ref", "pointRef")
  @js.native
  val pointRef: js.Function3[
    /* editor */ Editor, 
    /* point */ Point, 
    /* options */ js.UndefOr[EditorPointRefOptions], 
    PointRef
  ] = js.native
}
