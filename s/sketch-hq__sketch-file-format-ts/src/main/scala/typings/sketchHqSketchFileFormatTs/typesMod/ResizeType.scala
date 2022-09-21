package typings.sketchHqSketchFileFormatTs.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResizeType extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "ResizeType")
@js.native
object ResizeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResizeType & Double] = js.native
  
  @js.native
  sealed trait Float
    extends StObject
       with ResizeType
  /* 3 */ val Float: typings.sketchHqSketchFileFormatTs.typesMod.ResizeType.Float & Double = js.native
  
  @js.native
  sealed trait PinToEdge
    extends StObject
       with ResizeType
  /* 1 */ val PinToEdge: typings.sketchHqSketchFileFormatTs.typesMod.ResizeType.PinToEdge & Double = js.native
  
  @js.native
  sealed trait Resize
    extends StObject
       with ResizeType
  /* 2 */ val Resize: typings.sketchHqSketchFileFormatTs.typesMod.ResizeType.Resize & Double = js.native
  
  @js.native
  sealed trait Stretch
    extends StObject
       with ResizeType
  /* 0 */ val Stretch: typings.sketchHqSketchFileFormatTs.typesMod.ResizeType.Stretch & Double = js.native
}
