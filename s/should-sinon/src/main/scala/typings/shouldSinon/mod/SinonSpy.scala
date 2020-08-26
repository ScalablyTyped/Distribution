package typings.shouldSinon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonSpy extends js.Object {
  var should: ShouldSinonAssertion = js.native
}

object SinonSpy {
  @scala.inline
  def apply(should: ShouldSinonAssertion): SinonSpy = {
    val __obj = js.Dynamic.literal(should = should.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinonSpy]
  }
  @scala.inline
  implicit class SinonSpyOps[Self <: SinonSpy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setShould(value: ShouldSinonAssertion): Self = this.set("should", value.asInstanceOf[js.Any])
  }
  
}

