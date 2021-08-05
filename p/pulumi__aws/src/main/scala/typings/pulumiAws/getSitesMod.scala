package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSitesMod {
  
  @JSImport("@pulumi/aws/outposts/getSites", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSites(): js.Promise[GetSitesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSites")().asInstanceOf[js.Promise[GetSitesResult]]
  inline def getSites(opts: InvokeOptions): js.Promise[GetSitesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSites")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSitesResult]]
  
  trait GetSitesResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * Set of Outposts Site identifiers.
      */
    val ids: js.Array[String]
  }
  object GetSitesResult {
    
    inline def apply(id: String, ids: js.Array[String]): GetSitesResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSitesResult]
    }
    
    extension [Self <: GetSitesResult](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
    }
  }
}
