package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSiteMod {
  
  @JSImport("@pulumi/aws/outposts/getSite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSite(): js.Promise[GetSiteResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSite")().asInstanceOf[js.Promise[GetSiteResult]]
  inline def getSite(args: Unit, opts: InvokeOptions): js.Promise[GetSiteResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSite")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSiteResult]]
  inline def getSite(args: GetSiteArgs): js.Promise[GetSiteResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSite")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSiteResult]]
  inline def getSite(args: GetSiteArgs, opts: InvokeOptions): js.Promise[GetSiteResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSite")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSiteResult]]
  
  trait GetSiteArgs extends StObject {
    
    /**
      * Identifier of the Site.
      */
    val id: js.UndefOr[String] = js.undefined
    
    /**
      * Name of the Site.
      */
    val name: js.UndefOr[String] = js.undefined
  }
  object GetSiteArgs {
    
    inline def apply(): GetSiteArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSiteArgs]
    }
    
    extension [Self <: GetSiteArgs](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait GetSiteResult extends StObject {
    
    /**
      * AWS Account identifier.
      */
    val accountId: String
    
    /**
      * Description.
      */
    val description: String
    
    val id: String
    
    val name: String
  }
  object GetSiteResult {
    
    inline def apply(accountId: String, description: String, id: String, name: String): GetSiteResult = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSiteResult]
    }
    
    extension [Self <: GetSiteResult](x: Self) {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
