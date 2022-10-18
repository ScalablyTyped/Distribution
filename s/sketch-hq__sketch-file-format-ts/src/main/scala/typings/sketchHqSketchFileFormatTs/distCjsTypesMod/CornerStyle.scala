package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CornerStyle extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "CornerStyle")
@js.native
object CornerStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CornerStyle & Double] = js.native
  
  @js.native
  sealed trait Angled
    extends StObject
       with CornerStyle
  /* 2 */ val Angled: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.CornerStyle.Angled & Double = js.native
  
  @js.native
  sealed trait Rounded
    extends StObject
       with CornerStyle
  /* 0 */ val Rounded: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.CornerStyle.Rounded & Double = js.native
  
  @js.native
  sealed trait RoundedInverted
    extends StObject
       with CornerStyle
  /* 1 */ val RoundedInverted: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.CornerStyle.RoundedInverted & Double = js.native
  
  @js.native
  sealed trait Squared
    extends StObject
       with CornerStyle
  /* 3 */ val Squared: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.CornerStyle.Squared & Double = js.native
}
