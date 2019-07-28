package typings.strange.strangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strange", JSImport.Namespace)
@js.native
/**
  *
  * @param begin Range's beginning, or left endpoint.
  * @param end Range's end, or right endpoint.
  * @param bounds Range's bounds.
  */
class Class[T /* <: Endpoint */] () extends Range[T] {
  def this(begin: T) = this()
  def this(begin: T, end: T) = this()
  def this(begin: Null, end: T) = this()
  def this(begin: T, end: T, bounds: Bounds) = this()
  def this(begin: T, end: Null, bounds: Bounds) = this()
  def this(begin: Null, end: T, bounds: Bounds) = this()
  def this(begin: Null, end: Null, bounds: Bounds) = this()
}

