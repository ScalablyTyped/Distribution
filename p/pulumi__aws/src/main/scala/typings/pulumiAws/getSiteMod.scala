package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSiteMod {
  
  @JSImport("@pulumi/aws/outposts/getSite", "getSite")
  @js.native
  def getSite(): js.Promise[GetSiteResult] = js.native
  @JSImport("@pulumi/aws/outposts/getSite", "getSite")
  @js.native
  def getSite(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSiteResult] = js.native
  @JSImport("@pulumi/aws/outposts/getSite", "getSite")
  @js.native
  def getSite(args: GetSiteArgs): js.Promise[GetSiteResult] = js.native
  @JSImport("@pulumi/aws/outposts/getSite", "getSite")
  @js.native
  def getSite(args: GetSiteArgs, opts: InvokeOptions): js.Promise[GetSiteResult] = js.native
  
  @js.native
  trait GetSiteArgs extends StObject {
    
    /**
      * Identifier of the Site.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * Name of the Site.
      */
    val name: js.UndefOr[String] = js.native
  }
  object GetSiteArgs {
    
    @scala.inline
    def apply(): GetSiteArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSiteArgs]
    }
    
    @scala.inline
    implicit class GetSiteArgsMutableBuilder[Self <: GetSiteArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait GetSiteResult extends StObject {
    
    /**
      * AWS Account identifier.
      */
    val accountId: String = js.native
    
    /**
      * Description.
      */
    val description: String = js.native
    
    val id: String = js.native
    
    val name: String = js.native
  }
  object GetSiteResult {
    
    @scala.inline
    def apply(accountId: String, description: String, id: String, name: String): GetSiteResult = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSiteResult]
    }
    
    @scala.inline
    implicit class GetSiteResultMutableBuilder[Self <: GetSiteResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
