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

object SinonMapMatcher {
  @scala.inline
  def apply(
    and: js.Function1[SinonMatcher, SinonMatcher],
    contains: js.Function1[SimplifiedMap, SinonMatcher],
    deepEquals: js.Function1[SimplifiedMap, SinonMatcher],
    or: js.Function1[SinonMatcher, SinonMatcher],
    test: js.Function1[js.Any, scala.Boolean]
  ): SinonMapMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("and")(and)
    __obj.updateDynamic("contains")(contains)
    __obj.updateDynamic("deepEquals")(deepEquals)
    __obj.updateDynamic("or")(or)
    __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[SinonMapMatcher]
  }
}

