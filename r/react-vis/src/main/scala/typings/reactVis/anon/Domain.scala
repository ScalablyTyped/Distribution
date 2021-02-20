package typings.reactVis.anon

import typings.reactVis.mod.RVTickFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Domain extends StObject {
  
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
  implicit class DomainMutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: js.Array[Double]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainVarargs(value: Double*): Self = StObject.set(x, "domain", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickFormat(value: /* tick */ js.Any => String): Self = StObject.set(x, "tickFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTickFormatUndefined: Self = StObject.set(x, "tickFormat", js.undefined)
  }
}
