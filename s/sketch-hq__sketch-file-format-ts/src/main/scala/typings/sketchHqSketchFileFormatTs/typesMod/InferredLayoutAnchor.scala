package typings.sketchHqSketchFileFormatTs.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InferredLayoutAnchor extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "InferredLayoutAnchor")
@js.native
object InferredLayoutAnchor extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InferredLayoutAnchor & Double] = js.native
  
  @js.native
  sealed trait Max
    extends StObject
       with InferredLayoutAnchor
  /* 2 */ val Max: typings.sketchHqSketchFileFormatTs.typesMod.InferredLayoutAnchor.Max & Double = js.native
  
  @js.native
  sealed trait Middle
    extends StObject
       with InferredLayoutAnchor
  /* 1 */ val Middle: typings.sketchHqSketchFileFormatTs.typesMod.InferredLayoutAnchor.Middle & Double = js.native
  
  @js.native
  sealed trait Min
    extends StObject
       with InferredLayoutAnchor
  /* 0 */ val Min: typings.sketchHqSketchFileFormatTs.typesMod.InferredLayoutAnchor.Min & Double = js.native
}
