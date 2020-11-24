package typings.signaturePad.pointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("signature_pad/dist/types/point", "Point")
@js.native
class Point protected () extends BasicPoint {
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, time: Double) = this()
  
  def distanceTo(start: BasicPoint): Double = js.native
  
  def equals(other: BasicPoint): Boolean = js.native
  
  def velocityFrom(start: BasicPoint): Double = js.native
}
