package typings.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrPage extends StObject {
  
  var currPage: Double
  
  var currSizePerPage: Double
}
object CurrPage {
  
  @scala.inline
  def apply(currPage: Double, currSizePerPage: Double): CurrPage = {
    val __obj = js.Dynamic.literal(currPage = currPage.asInstanceOf[js.Any], currSizePerPage = currSizePerPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrPage]
  }
  
  @scala.inline
  implicit class CurrPageMutableBuilder[Self <: CurrPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrPage(value: Double): Self = StObject.set(x, "currPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrSizePerPage(value: Double): Self = StObject.set(x, "currSizePerPage", value.asInstanceOf[js.Any])
  }
}
