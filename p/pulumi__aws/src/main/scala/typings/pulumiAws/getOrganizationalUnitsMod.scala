package typings.pulumiAws

import typings.pulumiAws.outputMod.organizations.GetOrganizationalUnitsChildren
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOrganizationalUnitsMod {
  
  @JSImport("@pulumi/aws/organizations/getOrganizationalUnits", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOrganizationalUnits(args: GetOrganizationalUnitsArgs): js.Promise[GetOrganizationalUnitsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrganizationalUnits")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetOrganizationalUnitsResult]]
  inline def getOrganizationalUnits(args: GetOrganizationalUnitsArgs, opts: InvokeOptions): js.Promise[GetOrganizationalUnitsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrganizationalUnits")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOrganizationalUnitsResult]]
  
  trait GetOrganizationalUnitsArgs extends StObject {
    
    /**
      * The parent ID of the organizational unit.
      */
    val parentId: String
  }
  object GetOrganizationalUnitsArgs {
    
    inline def apply(parentId: String): GetOrganizationalUnitsArgs = {
      val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOrganizationalUnitsArgs]
    }
    
    extension [Self <: GetOrganizationalUnitsArgs](x: Self) {
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetOrganizationalUnitsResult extends StObject {
    
    /**
      * List of child organizational units, which have the following attributes:
      */
    val childrens: js.Array[GetOrganizationalUnitsChildren]
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val parentId: String
  }
  object GetOrganizationalUnitsResult {
    
    inline def apply(childrens: js.Array[GetOrganizationalUnitsChildren], id: String, parentId: String): GetOrganizationalUnitsResult = {
      val __obj = js.Dynamic.literal(childrens = childrens.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOrganizationalUnitsResult]
    }
    
    extension [Self <: GetOrganizationalUnitsResult](x: Self) {
      
      inline def setChildrens(value: js.Array[GetOrganizationalUnitsChildren]): Self = StObject.set(x, "childrens", value.asInstanceOf[js.Any])
      
      inline def setChildrensVarargs(value: GetOrganizationalUnitsChildren*): Self = StObject.set(x, "childrens", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    }
  }
}
