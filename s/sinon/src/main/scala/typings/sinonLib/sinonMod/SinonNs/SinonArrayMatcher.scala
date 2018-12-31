package typings
package sinonLib.sinonMod.SinonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonArrayMatcher extends SinonMatcher {
  /**
    * Requires an Array to contain each one of the values the given array has.
    */
  def contains(expected: js.Array[_]): SinonMatcher
  /**
    * Requires an Array to be deep equal another one.
    */
  def deepEquals(expected: js.Array[_]): SinonMatcher
  /**
    * Requires an Array to end with the same values as another one.
    */
  def endsWith(expected: js.Array[_]): SinonMatcher
  /**
    * Requires an Array to start with the same values as another one.
    */
  def startsWith(expected: js.Array[_]): SinonMatcher
}

