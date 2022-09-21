package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IamRole extends StObject {
  
  var managedPolicies: js.UndefOr[js.Array[String]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var permissionBoundary: js.UndefOr[String] = js.undefined
  
  var statements: js.UndefOr[js.Array[IamRoleStatement]] = js.undefined
  
  var tags: js.UndefOr[Tags] = js.undefined
}
object IamRole {
  
  inline def apply(): IamRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamRole]
  }
  
  extension [Self <: IamRole](x: Self) {
    
    inline def setManagedPolicies(value: js.Array[String]): Self = StObject.set(x, "managedPolicies", value.asInstanceOf[js.Any])
    
    inline def setManagedPoliciesUndefined: Self = StObject.set(x, "managedPolicies", js.undefined)
    
    inline def setManagedPoliciesVarargs(value: String*): Self = StObject.set(x, "managedPolicies", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermissionBoundary(value: String): Self = StObject.set(x, "permissionBoundary", value.asInstanceOf[js.Any])
    
    inline def setPermissionBoundaryUndefined: Self = StObject.set(x, "permissionBoundary", js.undefined)
    
    inline def setStatements(value: js.Array[IamRoleStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    
    inline def setStatementsVarargs(value: IamRoleStatement*): Self = StObject.set(x, "statements", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
