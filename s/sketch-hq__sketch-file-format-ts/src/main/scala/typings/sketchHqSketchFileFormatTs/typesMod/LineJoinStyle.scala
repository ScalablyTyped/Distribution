package typings.sketchHqSketchFileFormatTs.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LineJoinStyle extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "LineJoinStyle")
@js.native
object LineJoinStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LineJoinStyle & Double] = js.native
  
  @js.native
  sealed trait Bevel
    extends StObject
       with LineJoinStyle
  /* 2 */ val Bevel: typings.sketchHqSketchFileFormatTs.typesMod.LineJoinStyle.Bevel & Double = js.native
  
  @js.native
  sealed trait Miter
    extends StObject
       with LineJoinStyle
  /* 0 */ val Miter: typings.sketchHqSketchFileFormatTs.typesMod.LineJoinStyle.Miter & Double = js.native
  
  @js.native
  sealed trait Round
    extends StObject
       with LineJoinStyle
  /* 1 */ val Round: typings.sketchHqSketchFileFormatTs.typesMod.LineJoinStyle.Round & Double = js.native
}
