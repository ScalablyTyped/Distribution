package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMPointReadOnly extends js.Object {
  
  def matrixTransform(): DOMPoint = js.native
  def matrixTransform(matrix: DOMMatrixInit): DOMPoint = js.native
  
  def toJSON(): js.Any = js.native
  
  val w: Double = js.native
  
  val x: Double = js.native
  
  val y: Double = js.native
  
  val z: Double = js.native
}
