package typings.sketchHqSketchFileFormatTs.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextBehaviour extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "TextBehaviour")
@js.native
object TextBehaviour extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextBehaviour & Double] = js.native
  
  @js.native
  sealed trait Fixed
    extends StObject
       with TextBehaviour
  /* 1 */ val Fixed: typings.sketchHqSketchFileFormatTs.typesMod.TextBehaviour.Fixed & Double = js.native
  
  @js.native
  sealed trait FixedWidthAndHeight
    extends StObject
       with TextBehaviour
  /* 2 */ val FixedWidthAndHeight: typings.sketchHqSketchFileFormatTs.typesMod.TextBehaviour.FixedWidthAndHeight & Double = js.native
  
  @js.native
  sealed trait Flexible
    extends StObject
       with TextBehaviour
  /* 0 */ val Flexible: typings.sketchHqSketchFileFormatTs.typesMod.TextBehaviour.Flexible & Double = js.native
}
