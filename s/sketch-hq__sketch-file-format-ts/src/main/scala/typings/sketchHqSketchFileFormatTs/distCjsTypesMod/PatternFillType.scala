package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PatternFillType extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "PatternFillType")
@js.native
object PatternFillType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PatternFillType & Double] = js.native
  
  @js.native
  sealed trait Fill
    extends StObject
       with PatternFillType
  /* 1 */ val Fill: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.PatternFillType.Fill & Double = js.native
  
  @js.native
  sealed trait Fit
    extends StObject
       with PatternFillType
  /* 3 */ val Fit: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.PatternFillType.Fit & Double = js.native
  
  @js.native
  sealed trait Stretch
    extends StObject
       with PatternFillType
  /* 2 */ val Stretch: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.PatternFillType.Stretch & Double = js.native
  
  @js.native
  sealed trait Tile
    extends StObject
       with PatternFillType
  /* 0 */ val Tile: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.PatternFillType.Tile & Double = js.native
}
