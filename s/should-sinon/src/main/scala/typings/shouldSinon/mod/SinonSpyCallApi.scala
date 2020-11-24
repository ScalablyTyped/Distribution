package typings.shouldSinon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonSpyCallApi extends js.Object {
  
  var should: ShouldSinonAssertion = js.native
}
object SinonSpyCallApi {
  
  @scala.inline
  def apply(should: ShouldSinonAssertion): SinonSpyCallApi = {
    val __obj = js.Dynamic.literal(should = should.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinonSpyCallApi]
  }
  
  @scala.inline
  implicit class SinonSpyCallApiOps[Self <: SinonSpyCallApi] (val x: Self) extends AnyVal {
    
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
