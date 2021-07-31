package typings.restifyErrors.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestifyRestErrorOptions
  extends StObject
     with RestifyHttpErrorOptions {
  
  var restCode: js.UndefOr[String] = js.undefined
}
object RestifyRestErrorOptions {
  
  @scala.inline
  def apply(): RestifyRestErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestifyRestErrorOptions]
  }
  
  @scala.inline
  implicit class RestifyRestErrorOptionsMutableBuilder[Self <: RestifyRestErrorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRestCode(value: String): Self = StObject.set(x, "restCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestCodeUndefined: Self = StObject.set(x, "restCode", js.undefined)
  }
}
