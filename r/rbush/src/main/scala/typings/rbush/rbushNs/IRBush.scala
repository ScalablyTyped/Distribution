package typings.rbush.rbushNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRBush extends js.Object {
  /**
    * Create a spatial index.
    *
    * An optional argument to rbush defines the maximum number of entries in a tree node.
    * 9 (used by default) is a reasonable choice for most applications. Higher value means\
    * faster insertion and slower search, and vice versa.
    */
  def apply[T /* <: BBox */](): RBush[T] = js.native
  def apply[T /* <: BBox */](nodeSize: Double): RBush[T] = js.native
  def apply[T](nodeSize: Double, formatter: js.Array[String]): RBush[T] = js.native
}

