package typings.sketchHqSketchFileFormatTs.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BorderPosition extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "BorderPosition")
@js.native
object BorderPosition extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BorderPosition & Double] = js.native
  
  @js.native
  sealed trait Center
    extends StObject
       with BorderPosition
  /* 0 */ val Center: typings.sketchHqSketchFileFormatTs.typesMod.BorderPosition.Center & Double = js.native
  
  @js.native
  sealed trait Inside
    extends StObject
       with BorderPosition
  /* 1 */ val Inside: typings.sketchHqSketchFileFormatTs.typesMod.BorderPosition.Inside & Double = js.native
  
  @js.native
  sealed trait Outside
    extends StObject
       with BorderPosition
  /* 2 */ val Outside: typings.sketchHqSketchFileFormatTs.typesMod.BorderPosition.Outside & Double = js.native
}
