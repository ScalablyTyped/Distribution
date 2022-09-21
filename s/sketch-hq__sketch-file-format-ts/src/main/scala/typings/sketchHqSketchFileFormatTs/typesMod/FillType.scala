package typings.sketchHqSketchFileFormatTs.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FillType extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "FillType")
@js.native
object FillType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FillType & Double] = js.native
  
  @js.native
  sealed trait Color
    extends StObject
       with FillType
  /* 0 */ val Color: typings.sketchHqSketchFileFormatTs.typesMod.FillType.Color & Double = js.native
  
  @js.native
  sealed trait Gradient
    extends StObject
       with FillType
  /* 1 */ val Gradient: typings.sketchHqSketchFileFormatTs.typesMod.FillType.Gradient & Double = js.native
  
  @js.native
  sealed trait Pattern
    extends StObject
       with FillType
  /* 4 */ val Pattern: typings.sketchHqSketchFileFormatTs.typesMod.FillType.Pattern & Double = js.native
}
