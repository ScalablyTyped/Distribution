package typings
package quixoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QElement extends js.Object {
  // Compare the element's descriptors to a set of expected values and throw an exception if they don't match
  def assert(expected: ElementDescriptor): scala.Unit = js.native
  def assert(expected: ElementDescriptor, message: java.lang.String): scala.Unit = js.native
  // Compare the element's descriptors to a set of expected values.
  def diff(expected: ElementDescriptor): java.lang.String = js.native
  // Determine where an element is displayed within the frame viewport, as computed by the browser
  def getRawPosition(): RawPositionObject = js.native
  // Determine how the browser is actually rendering an element's style. This uses getComputedStyle() under the covers. (On IE 8, it uses currentStyle)
  def getRawStyle(property: java.lang.String): java.lang.String = js.native
  // Retrieve the underlying HTMLElement DOM element for the frame.
  def toDomElement(): stdLib.HTMLElement = js.native
}

