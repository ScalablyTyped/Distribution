package typings.refArray.mod

import typings.ref.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ref-array", JSImport.Namespace)
@js.native
class Class[T] protected () extends ArrayType[T] {
  def this(`type`: String) = this()
  def this(`type`: Type) = this()
  def this(`type`: String, length: Double) = this()
  def this(`type`: Type, length: Double) = this()
}

