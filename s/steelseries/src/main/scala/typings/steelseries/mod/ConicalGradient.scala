package typings.steelseries.mod

import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steelseries", "ConicalGradient")
@js.native
open class ConicalGradient protected () extends StObject {
  def this(fractions: js.Array[Double], colors: js.Array[rgbaColor]) = this()
  
  def fillCircle(cts: CanvasRenderingContext2D, centerX: Double, centerY: Double, innerX: Double, outerX: Double): Unit = js.native
  
  def fillRect(
    ctx: CanvasRenderingContext2D,
    centerX: Double,
    centerY: Double,
    width: Double,
    height: Double,
    thicknessX: Double,
    thicknessY: Double
  ): Unit = js.native
}
