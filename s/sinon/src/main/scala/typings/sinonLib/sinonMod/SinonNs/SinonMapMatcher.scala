package typings
package sinonLib.sinonMod.SinonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SinonMapMatcher extends SinonMatcher {
  /**
           * Requires a Map to contain each one of the items the given map has.
           */
  def contains(expected: SimplifiedMap): SinonMatcher
  /**
           * Requires a Map to be deep equal another one.
           */
  def deepEquals(expected: SimplifiedMap): SinonMatcher
}

