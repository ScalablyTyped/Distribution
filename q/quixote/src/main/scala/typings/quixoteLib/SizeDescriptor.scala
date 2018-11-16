package typings
package quixoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Size descriptors represent width or height.
@js.native
trait SizeDescriptor extends js.Object {
  // Create a descriptor that's smaller than this one.
  def minus(amount: SizeDescriptor): SizeDescriptor = js.native
  // Create a descriptor that's smaller than this one.
  def minus(amount: scala.Double): SizeDescriptor = js.native
  // Create a descriptor that's bigger than this one.
  def plus(amount: SizeDescriptor): SizeDescriptor = js.native
  // Create a descriptor that's bigger than this one.
  def plus(amount: scala.Double): SizeDescriptor = js.native
  // Create a new descriptor that's a multiple or fraction of the size of this one.
  def times(multiple: scala.Double): SizeDescriptor = js.native
}

