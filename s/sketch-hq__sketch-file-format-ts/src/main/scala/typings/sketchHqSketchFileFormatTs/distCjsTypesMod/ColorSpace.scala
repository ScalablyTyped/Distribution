package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColorSpace extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "ColorSpace")
@js.native
object ColorSpace extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColorSpace & Double] = js.native
  
  @js.native
  sealed trait P3
    extends StObject
       with ColorSpace
  /* 2 */ val P3: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.ColorSpace.P3 & Double = js.native
  
  @js.native
  sealed trait SRGB
    extends StObject
       with ColorSpace
  /* 1 */ val SRGB: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.ColorSpace.SRGB & Double = js.native
  
  @js.native
  sealed trait Unmanaged
    extends StObject
       with ColorSpace
  /* 0 */ val Unmanaged: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.ColorSpace.Unmanaged & Double = js.native
}
