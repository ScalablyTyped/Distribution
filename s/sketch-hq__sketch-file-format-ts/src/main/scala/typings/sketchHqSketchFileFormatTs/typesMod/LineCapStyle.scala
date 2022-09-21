package typings.sketchHqSketchFileFormatTs.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LineCapStyle extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "LineCapStyle")
@js.native
object LineCapStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LineCapStyle & Double] = js.native
  
  @js.native
  sealed trait Butt
    extends StObject
       with LineCapStyle
  /* 0 */ val Butt: typings.sketchHqSketchFileFormatTs.typesMod.LineCapStyle.Butt & Double = js.native
  
  @js.native
  sealed trait Projecting
    extends StObject
       with LineCapStyle
  /* 2 */ val Projecting: typings.sketchHqSketchFileFormatTs.typesMod.LineCapStyle.Projecting & Double = js.native
  
  @js.native
  sealed trait Round
    extends StObject
       with LineCapStyle
  /* 1 */ val Round: typings.sketchHqSketchFileFormatTs.typesMod.LineCapStyle.Round & Double = js.native
}
