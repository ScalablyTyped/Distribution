package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ANGLE_instanced_arrays extends js.Object {
  val VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE: scala.Double
  def drawArraysInstancedANGLE(mode: scala.Double, first: scala.Double, count: scala.Double, primcount: scala.Double): scala.Unit
  def drawElementsInstancedANGLE(
    mode: scala.Double,
    count: scala.Double,
    `type`: scala.Double,
    offset: scala.Double,
    primcount: scala.Double
  ): scala.Unit
  def vertexAttribDivisorANGLE(index: scala.Double, divisor: scala.Double): scala.Unit
}

@JSGlobal("ANGLE_instanced_arrays")
@js.native
object ANGLE_instanced_arrays
  extends ScalablyTyped.runtime.Instantiable0[ANGLE_instanced_arrays] {
  val VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE: scala.Double = js.native
}

