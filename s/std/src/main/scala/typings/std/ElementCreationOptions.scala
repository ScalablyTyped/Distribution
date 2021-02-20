package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementCreationOptions extends StObject {
  
  var is: js.UndefOr[java.lang.String] = js.native
}
object ElementCreationOptions {
  
  @scala.inline
  def apply(): ElementCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementCreationOptions]
  }
  
  @scala.inline
  implicit class ElementCreationOptionsMutableBuilder[Self <: ElementCreationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIs(value: java.lang.String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
  }
}
