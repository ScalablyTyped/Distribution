package typings.sortObjectKeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sort-object-keys", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[T](`object`: T): T = js.native
  def apply[T](`object`: T, sortWith: js.Array[/* keyof T */ String]): T = js.native
  def apply[T](
    `object`: T,
    sortWith: js.Function2[/* keyof T */ /* a */ String, /* keyof T */ /* b */ String, Double]
  ): T = js.native
}

