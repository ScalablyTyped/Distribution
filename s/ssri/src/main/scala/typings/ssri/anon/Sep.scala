package typings.ssri.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sep extends StObject {
  
  var sep: js.UndefOr[String] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object Sep {
  
  @scala.inline
  def apply(): Sep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sep]
  }
  
  @scala.inline
  implicit class SepMutableBuilder[Self <: Sep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
