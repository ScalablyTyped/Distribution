package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSitesMod {
  
  @JSImport("@pulumi/aws/outposts/getSites", "getSites")
  @js.native
  def getSites(): js.Promise[GetSitesResult] = js.native
  @JSImport("@pulumi/aws/outposts/getSites", "getSites")
  @js.native
  def getSites(opts: InvokeOptions): js.Promise[GetSitesResult] = js.native
  
  @js.native
  trait GetSitesResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * Set of Outposts Site identifiers.
      */
    val ids: js.Array[String] = js.native
  }
  object GetSitesResult {
    
    @scala.inline
    def apply(id: String, ids: js.Array[String]): GetSitesResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSitesResult]
    }
    
    @scala.inline
    implicit class GetSitesResultMutableBuilder[Self <: GetSitesResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
    }
  }
}
