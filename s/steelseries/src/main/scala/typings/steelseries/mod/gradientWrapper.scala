package typings.steelseries.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steelseries", "gradientWrapper")
@js.native
open class gradientWrapper protected () extends StObject {
  def this(start: Double, end: Double, fractions: js.Array[Double], colors: js.Array[rgbaColor]) = this()
  
  def getColorAt(fraction: Double): rgbaColor | js.Array[Double] = js.native
  
  def getEnd(): Double = js.native
  
  def getStart(): Double = js.native
}
