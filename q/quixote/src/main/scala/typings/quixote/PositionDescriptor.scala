package typings.quixote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Position descriptors represent an X or Y coordinate. The top-left corner of the page is (0, 0) and the values increase downward and to the right.
@js.native
trait PositionDescriptor extends StObject {
  
  // Create a new descriptor that is further down the page or to the right.
  def minus(amount: Double): PositionDescriptor = js.native
  // Create a new descriptor that is further down the page or to the right.
  def minus(amount: SizeDescriptor): PositionDescriptor = js.native
  
  // Create a new descriptor that is further down the page or to the right.
  def plus(amount: Double): PositionDescriptor = js.native
  // Create a new descriptor that is further down the page or to the right.
  def plus(amount: SizeDescriptor): PositionDescriptor = js.native
}
