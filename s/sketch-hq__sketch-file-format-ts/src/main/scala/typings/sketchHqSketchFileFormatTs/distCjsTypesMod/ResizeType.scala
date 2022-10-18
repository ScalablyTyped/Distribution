package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

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
  /* 3 */ val Float: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.ResizeType.Float & Double = js.native
  
  @js.native
  sealed trait PinToEdge
    extends StObject
       with ResizeType
  /* 1 */ val PinToEdge: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.ResizeType.PinToEdge & Double = js.native
  
  @js.native
  sealed trait Resize
    extends StObject
       with ResizeType
  /* 2 */ val Resize: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.ResizeType.Resize & Double = js.native
  
  @js.native
  sealed trait Stretch
    extends StObject
       with ResizeType
  /* 0 */ val Stretch: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.ResizeType.Stretch & Double = js.native
}
