package typings.sketchHqSketchFileFormatTs.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StrikethroughStyle extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "StrikethroughStyle")
@js.native
object StrikethroughStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StrikethroughStyle & Double] = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with StrikethroughStyle
  /* 0 */ val None: typings.sketchHqSketchFileFormatTs.typesMod.StrikethroughStyle.None & Double = js.native
  
  @js.native
  sealed trait Strikethrough
    extends StObject
       with StrikethroughStyle
  /* 1 */ val Strikethrough: typings.sketchHqSketchFileFormatTs.typesMod.StrikethroughStyle.Strikethrough & Double = js.native
}
