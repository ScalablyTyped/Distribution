package typings.sketchHqSketchFileFormatTs.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextVerticalAlignment extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "TextVerticalAlignment")
@js.native
object TextVerticalAlignment extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextVerticalAlignment & Double] = js.native
  
  @js.native
  sealed trait Bottom
    extends StObject
       with TextVerticalAlignment
  /* 2 */ val Bottom: typings.sketchHqSketchFileFormatTs.typesMod.TextVerticalAlignment.Bottom & Double = js.native
  
  @js.native
  sealed trait Middle
    extends StObject
       with TextVerticalAlignment
  /* 1 */ val Middle: typings.sketchHqSketchFileFormatTs.typesMod.TextVerticalAlignment.Middle & Double = js.native
  
  @js.native
  sealed trait Top
    extends StObject
       with TextVerticalAlignment
  /* 0 */ val Top: typings.sketchHqSketchFileFormatTs.typesMod.TextVerticalAlignment.Top & Double = js.native
}
