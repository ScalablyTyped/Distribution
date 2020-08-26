package typings.priorityqueuejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("priorityqueuejs", JSImport.Namespace)
@js.native
/**
  * Initializes a new empty PriorityQueue wich uses .DEFAULT_COMPARATOR() as the comparator function for its elements.
  */
class ^[T] () extends PriorityQueue[T] {
  /**
    * Initializes a new empty PriorityQueue with uses the given comparator(a, b) function as the comparator for its elements.
    * The comparator function must return a positive number when a > b, 0 when a == b and a negative number when a < b.
    */
  def this(comparator: Comparator[T]) = this()
}

@JSImport("priorityqueuejs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Compares two Number or String objects.
    */
  @JSName("DEFAULT_COMPARATOR")
  var DEFAULT_COMPARATOR_Original: Comparator[Double | String] = js.native
  def DEFAULT_COMPARATOR(a: String, b: String): Double = js.native
  def DEFAULT_COMPARATOR(a: String, b: Double): Double = js.native
  def DEFAULT_COMPARATOR(a: Double, b: String): Double = js.native
  /**
    * Compares two Number or String objects.
    */
  def DEFAULT_COMPARATOR(a: Double, b: Double): Double = js.native
}

