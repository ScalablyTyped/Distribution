package typings
package strangeLib.strangeMod

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
class namespacedCls[T /* <: strangeLib.strangeMod.RangeNs.Endpoint */] () extends Range[T] {
  def this(begin: T) = this()
  def this(begin: T, end: T) = this()
  def this(begin: scala.Null, end: T) = this()
  def this(begin: T, end: T, bounds: strangeLib.strangeMod.RangeNs.Bounds) = this()
  def this(begin: T, end: scala.Null, bounds: strangeLib.strangeMod.RangeNs.Bounds) = this()
  def this(begin: scala.Null, end: T, bounds: strangeLib.strangeMod.RangeNs.Bounds) = this()
  def this(begin: scala.Null, end: scala.Null, bounds: strangeLib.strangeMod.RangeNs.Bounds) = this()
}

