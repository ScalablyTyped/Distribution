package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UnderlineStyle extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "UnderlineStyle")
@js.native
object UnderlineStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnderlineStyle & Double] = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with UnderlineStyle
  /* 0 */ val None: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.UnderlineStyle.None & Double = js.native
  
  @js.native
  sealed trait Underlined
    extends StObject
       with UnderlineStyle
  /* 1 */ val Underlined: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.UnderlineStyle.Underlined & Double = js.native
}
