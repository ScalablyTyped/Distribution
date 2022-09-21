package typings.sketchHqSketchFileFormatTs.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WindingRule extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "WindingRule")
@js.native
object WindingRule extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WindingRule & Double] = js.native
  
  @js.native
  sealed trait EvenOdd
    extends StObject
       with WindingRule
  /* 1 */ val EvenOdd: typings.sketchHqSketchFileFormatTs.typesMod.WindingRule.EvenOdd & Double = js.native
  
  @js.native
  sealed trait NonZero
    extends StObject
       with WindingRule
  /* 0 */ val NonZero: typings.sketchHqSketchFileFormatTs.typesMod.WindingRule.NonZero & Double = js.native
}
