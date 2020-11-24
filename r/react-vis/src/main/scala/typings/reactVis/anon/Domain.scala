package typings.reactVis.anon

import typings.reactVis.mod.RVTickFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Domain extends js.Object {
  
  var domain: js.Array[Double] = js.native
  
  var name: String = js.native
  
  var tickFormat: js.UndefOr[RVTickFormat] = js.native
}
object Domain {
  
  @scala.inline
  def apply(domain: js.Array[Double], name: String): Domain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
  
  @scala.inline
  implicit class DomainOps[Self <: Domain] (val x: Self) extends AnyVal {
    
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
    def setDomainVarargs(value: Double*): Self = this.set("domain", js.Array(value :_*))
    
    @scala.inline
    def setDomain(value: js.Array[Double]): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickFormat(value: /* tick */ js.Any => String): Self = this.set("tickFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTickFormat: Self = this.set("tickFormat", js.undefined)
  }
}
