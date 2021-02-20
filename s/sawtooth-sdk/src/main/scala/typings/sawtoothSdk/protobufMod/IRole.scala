package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRole extends StObject {
  
  /** Role name */
  var name: js.UndefOr[String | Null] = js.native
  
  /** Role policyName */
  var policyName: js.UndefOr[String | Null] = js.native
}
object IRole {
  
  @scala.inline
  def apply(): IRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRole]
  }
  
  @scala.inline
  implicit class IRoleMutableBuilder[Self <: IRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPolicyName(value: String): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameNull: Self = StObject.set(x, "policyName", null)
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
  }
}
