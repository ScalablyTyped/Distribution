package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AnimationType extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "AnimationType")
@js.native
object AnimationType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AnimationType & Double] = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with AnimationType
  /* 0 */ val None: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.AnimationType.None & Double = js.native
  
  @js.native
  sealed trait SlideFromBottom
    extends StObject
       with AnimationType
  /* 3 */ val SlideFromBottom: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.AnimationType.SlideFromBottom & Double = js.native
  
  @js.native
  sealed trait SlideFromLeft
    extends StObject
       with AnimationType
  /* 1 */ val SlideFromLeft: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.AnimationType.SlideFromLeft & Double = js.native
  
  @js.native
  sealed trait SlideFromRight
    extends StObject
       with AnimationType
  /* 2 */ val SlideFromRight: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.AnimationType.SlideFromRight & Double = js.native
  
  @js.native
  sealed trait SlideFromTop
    extends StObject
       with AnimationType
  /* 4 */ val SlideFromTop: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.AnimationType.SlideFromTop & Double = js.native
}
