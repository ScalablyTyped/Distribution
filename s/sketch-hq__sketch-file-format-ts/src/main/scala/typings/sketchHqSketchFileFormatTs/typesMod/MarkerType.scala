package typings.sketchHqSketchFileFormatTs.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MarkerType extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "MarkerType")
@js.native
object MarkerType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerType & Double] = js.native
  
  @js.native
  sealed trait FilledArrow
    extends StObject
       with MarkerType
  /* 1 */ val FilledArrow: typings.sketchHqSketchFileFormatTs.typesMod.MarkerType.FilledArrow & Double = js.native
  
  @js.native
  sealed trait FilledCircle
    extends StObject
       with MarkerType
  /* 4 */ val FilledCircle: typings.sketchHqSketchFileFormatTs.typesMod.MarkerType.FilledCircle & Double = js.native
  
  @js.native
  sealed trait FilledSquare
    extends StObject
       with MarkerType
  /* 6 */ val FilledSquare: typings.sketchHqSketchFileFormatTs.typesMod.MarkerType.FilledSquare & Double = js.native
  
  @js.native
  sealed trait Line
    extends StObject
       with MarkerType
  /* 2 */ val Line: typings.sketchHqSketchFileFormatTs.typesMod.MarkerType.Line & Double = js.native
  
  @js.native
  sealed trait OpenArrow
    extends StObject
       with MarkerType
  /* 0 */ val OpenArrow: typings.sketchHqSketchFileFormatTs.typesMod.MarkerType.OpenArrow & Double = js.native
  
  @js.native
  sealed trait OpenCircle
    extends StObject
       with MarkerType
  /* 3 */ val OpenCircle: typings.sketchHqSketchFileFormatTs.typesMod.MarkerType.OpenCircle & Double = js.native
  
  @js.native
  sealed trait OpenSquare
    extends StObject
       with MarkerType
  /* 5 */ val OpenSquare: typings.sketchHqSketchFileFormatTs.typesMod.MarkerType.OpenSquare & Double = js.native
}
