package typings.quixote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Size descriptors represent width or height.
@js.native
trait SizeDescriptor extends js.Object {
  
  // Create a descriptor that's smaller than this one.
  def minus(amount: Double): SizeDescriptor = js.native
  // Create a descriptor that's smaller than this one.
  def minus(amount: SizeDescriptor): SizeDescriptor = js.native
  
  // Create a descriptor that's bigger than this one.
  def plus(amount: Double): SizeDescriptor = js.native
  // Create a descriptor that's bigger than this one.
  def plus(amount: SizeDescriptor): SizeDescriptor = js.native
  
  // Create a new descriptor that's a multiple or fraction of the size of this one.
  def times(multiple: Double): SizeDescriptor = js.native
}
