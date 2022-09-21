package typings.sketchHqSketchFileFormatTs.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlendMode extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "BlendMode")
@js.native
object BlendMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlendMode & Double] = js.native
  
  @js.native
  sealed trait Color
    extends StObject
       with BlendMode
  /* 14 */ val Color: typings.sketchHqSketchFileFormatTs.typesMod.BlendMode.Color & Double = js.native
  
  @js.native
  sealed trait ColorBurn
    extends StObject
       with BlendMode
  /* 3 */ val ColorBurn: typings.sketchHqSketchFileFormatTs.typesMod.BlendMode.ColorBurn & Double = js.native
  
  @js.native
  sealed trait ColorDodge
    extends StObject
       with BlendMode
  /* 6 */ val ColorDodge: typings.sketchHqSketchFileFormatTs.typesMod.BlendMode.ColorDodge & Double = js.native
  
  @js.native
  sealed trait Darken
    extends StObject
       with BlendMode
  /* 1 */ val Darken: typings.sketchHqSketchFileFormatTs.typesMod.BlendMode.Darken & Double = js.native
  
  @js.native
  sealed trait Difference
    extends StObject
       with BlendMode
  /* 10 */ val Difference: typings.sketchHqSketchFileFormatTs.typesMod.BlendMode.Difference & Double = js.native
  
  @js.native
  sealed trait Exclusion
    extends StObject
       with BlendMode
  /* 11 */ val Exclusion: typings.sketchHqSketchFileFormatTs.typesMod.BlendMode.Exclusion & Double = js.native
  
  @js.native
  sealed trait HardLight
    extends StObject
       with BlendMode
  /* 9 */ val HardLight: typings.sketchHqSketchFileFormatTs.typesMod.BlendMode.HardLight & Double = js.native
  
  @js.native
  sealed trait Hue
    extends StObject
       with BlendMode
  /* 12 */ val Hue: typings.sketchHqSketchFileFormatTs.typesMod.BlendMode.Hue & Double = js.native
  
  @js.native
  sealed trait Lighten
    extends StObject
       with BlendMode
  /* 4 */ val Lighten: typings.sketchHqSketchFileFormatTs.typesMod.BlendMode.Lighten & Double = js.native
  
  @js.native
  sealed trait Luminosity
    extends StObject
       with BlendMode
  /* 15 */ val Luminosity: typings.sketchHqSketchFileFormatTs.typesMod.BlendMode.Luminosity & Double = js.native
  
  @js.native
  sealed trait Multiply
    extends StObject
       with BlendMode
  /* 2 */ val Multiply: typings.sketchHqSketchFileFormatTs.typesMod.BlendMode.Multiply & Double = js.native
  
  @js.native
  sealed trait Normal
    extends StObject
       with BlendMode
  /* 0 */ val Normal: typings.sketchHqSketchFileFormatTs.typesMod.BlendMode.Normal & Double = js.native
  
  @js.native
  sealed trait Overlay
    extends StObject
       with BlendMode
  /* 7 */ val Overlay: typings.sketchHqSketchFileFormatTs.typesMod.BlendMode.Overlay & Double = js.native
  
  @js.native
  sealed trait PlusDarker
    extends StObject
       with BlendMode
  /* 16 */ val PlusDarker: typings.sketchHqSketchFileFormatTs.typesMod.BlendMode.PlusDarker & Double = js.native
  
  @js.native
  sealed trait PlusLighter
    extends StObject
       with BlendMode
  /* 17 */ val PlusLighter: typings.sketchHqSketchFileFormatTs.typesMod.BlendMode.PlusLighter & Double = js.native
  
  @js.native
  sealed trait Saturation
    extends StObject
       with BlendMode
  /* 13 */ val Saturation: typings.sketchHqSketchFileFormatTs.typesMod.BlendMode.Saturation & Double = js.native
  
  @js.native
  sealed trait Screen
    extends StObject
       with BlendMode
  /* 5 */ val Screen: typings.sketchHqSketchFileFormatTs.typesMod.BlendMode.Screen & Double = js.native
  
  @js.native
  sealed trait SoftLight
    extends StObject
       with BlendMode
  /* 8 */ val SoftLight: typings.sketchHqSketchFileFormatTs.typesMod.BlendMode.SoftLight & Double = js.native
}
