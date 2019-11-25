package typings.shouldDashSinon.sinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonSpy extends js.Object {
  var should: ShouldSinonAssertion
}

object SinonSpy {
  @scala.inline
  def apply(should: ShouldSinonAssertion): SinonSpy = {
    val __obj = js.Dynamic.literal(should = should.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SinonSpy]
  }
}

