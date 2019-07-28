package typings.refDashArray.refDashArrayMod

import typings.ref.refMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ref-array", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](`type`: String): ArrayType[T] = js.native
  def apply[T](`type`: String, length: Double): ArrayType[T] = js.native
  def apply[T](`type`: Type): ArrayType[T] = js.native
  def apply[T](`type`: Type, length: Double): ArrayType[T] = js.native
}

