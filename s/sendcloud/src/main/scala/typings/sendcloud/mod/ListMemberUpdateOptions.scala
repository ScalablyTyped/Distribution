package typings.sendcloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMemberUpdateOptions extends StObject {
  
  var name: js.UndefOr[String] = js.native
  
  var vars: js.UndefOr[String] = js.native
}
object ListMemberUpdateOptions {
  
  @scala.inline
  def apply(): ListMemberUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMemberUpdateOptions]
  }
  
  @scala.inline
  implicit class ListMemberUpdateOptionsMutableBuilder[Self <: ListMemberUpdateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setVars(value: String): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarsUndefined: Self = StObject.set(x, "vars", js.undefined)
  }
}
