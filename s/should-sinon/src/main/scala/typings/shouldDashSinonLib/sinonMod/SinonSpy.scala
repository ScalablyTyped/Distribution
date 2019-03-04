package typings
package shouldDashSinonLib.sinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonSpy extends js.Object {
  var should: ShouldSinonAssertion
}

object SinonSpy {
  @scala.inline
  def apply(should: ShouldSinonAssertion): SinonSpy = {
    val __obj = js.Dynamic.literal(should = should)
  
    __obj.asInstanceOf[SinonSpy]
  }
}

