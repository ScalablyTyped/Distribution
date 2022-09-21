package typings.sketchHqSketchFileFormatTs.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BooleanOperation extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "BooleanOperation")
@js.native
object BooleanOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BooleanOperation & Double] = js.native
  
  @js.native
  sealed trait Difference
    extends StObject
       with BooleanOperation
  /* 3 */ val Difference: typings.sketchHqSketchFileFormatTs.typesMod.BooleanOperation.Difference & Double = js.native
  
  @js.native
  sealed trait Intersection
    extends StObject
       with BooleanOperation
  /* 2 */ val Intersection: typings.sketchHqSketchFileFormatTs.typesMod.BooleanOperation.Intersection & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with BooleanOperation
  /* -1 */ val None: typings.sketchHqSketchFileFormatTs.typesMod.BooleanOperation.None & Double = js.native
  
  @js.native
  sealed trait Subtract
    extends StObject
       with BooleanOperation
  /* 1 */ val Subtract: typings.sketchHqSketchFileFormatTs.typesMod.BooleanOperation.Subtract & Double = js.native
  
  @js.native
  sealed trait Union
    extends StObject
       with BooleanOperation
  /* 0 */ val Union: typings.sketchHqSketchFileFormatTs.typesMod.BooleanOperation.Union & Double = js.native
}
