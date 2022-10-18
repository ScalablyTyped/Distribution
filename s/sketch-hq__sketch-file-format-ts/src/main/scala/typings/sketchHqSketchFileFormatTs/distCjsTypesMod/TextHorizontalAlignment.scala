package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextHorizontalAlignment extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "TextHorizontalAlignment")
@js.native
object TextHorizontalAlignment extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextHorizontalAlignment & Double] = js.native
  
  @js.native
  sealed trait Centered
    extends StObject
       with TextHorizontalAlignment
  /* 2 */ val Centered: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.TextHorizontalAlignment.Centered & Double = js.native
  
  @js.native
  sealed trait Justified
    extends StObject
       with TextHorizontalAlignment
  /* 3 */ val Justified: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.TextHorizontalAlignment.Justified & Double = js.native
  
  @js.native
  sealed trait Left
    extends StObject
       with TextHorizontalAlignment
  /* 0 */ val Left: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.TextHorizontalAlignment.Left & Double = js.native
  
  @js.native
  sealed trait Natural
    extends StObject
       with TextHorizontalAlignment
  /* 4 */ val Natural: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.TextHorizontalAlignment.Natural & Double = js.native
  
  @js.native
  sealed trait Right
    extends StObject
       with TextHorizontalAlignment
  /* 1 */ val Right: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.TextHorizontalAlignment.Right & Double = js.native
}
