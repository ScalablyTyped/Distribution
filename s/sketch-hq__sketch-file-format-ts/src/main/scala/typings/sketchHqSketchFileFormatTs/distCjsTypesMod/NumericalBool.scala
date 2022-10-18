package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NumericalBool extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "NumericalBool")
@js.native
object NumericalBool extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NumericalBool & Double] = js.native
  
  @js.native
  sealed trait False
    extends StObject
       with NumericalBool
  /* 1 */ val False: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.NumericalBool.False & Double = js.native
  
  @js.native
  sealed trait True
    extends StObject
       with NumericalBool
  /* 0 */ val True: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.NumericalBool.True & Double = js.native
}
