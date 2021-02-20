package typings.pulumiAws

import typings.pulumiAws.outputMod.organizations.GetOrganizationalUnitsChildren
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOrganizationalUnitsMod {
  
  @JSImport("@pulumi/aws/organizations/getOrganizationalUnits", "getOrganizationalUnits")
  @js.native
  def getOrganizationalUnits(args: GetOrganizationalUnitsArgs): js.Promise[GetOrganizationalUnitsResult] = js.native
  @JSImport("@pulumi/aws/organizations/getOrganizationalUnits", "getOrganizationalUnits")
  @js.native
  def getOrganizationalUnits(args: GetOrganizationalUnitsArgs, opts: InvokeOptions): js.Promise[GetOrganizationalUnitsResult] = js.native
  
  @js.native
  trait GetOrganizationalUnitsArgs extends StObject {
    
    /**
      * The parent ID of the organizational unit.
      */
    val parentId: String = js.native
  }
  object GetOrganizationalUnitsArgs {
    
    @scala.inline
    def apply(parentId: String): GetOrganizationalUnitsArgs = {
      val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOrganizationalUnitsArgs]
    }
    
    @scala.inline
    implicit class GetOrganizationalUnitsArgsMutableBuilder[Self <: GetOrganizationalUnitsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetOrganizationalUnitsResult extends StObject {
    
    /**
      * List of child organizational units, which have the following attributes:
      */
    val childrens: js.Array[GetOrganizationalUnitsChildren] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val parentId: String = js.native
  }
  object GetOrganizationalUnitsResult {
    
    @scala.inline
    def apply(childrens: js.Array[GetOrganizationalUnitsChildren], id: String, parentId: String): GetOrganizationalUnitsResult = {
      val __obj = js.Dynamic.literal(childrens = childrens.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOrganizationalUnitsResult]
    }
    
    @scala.inline
    implicit class GetOrganizationalUnitsResultMutableBuilder[Self <: GetOrganizationalUnitsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildrens(value: js.Array[GetOrganizationalUnitsChildren]): Self = StObject.set(x, "childrens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrensVarargs(value: GetOrganizationalUnitsChildren*): Self = StObject.set(x, "childrens", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    }
  }
}
