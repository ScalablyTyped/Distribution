package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Array")
@js.native
class ArrayCls[T] protected () extends Array[T] {
  def this(arrayLength: Double) = this()
  def this(items: T*) = this()
}

