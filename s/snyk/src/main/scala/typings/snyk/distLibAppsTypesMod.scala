package typings.snyk

import typings.snyk.anon.Detail
import typings.snyk.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibAppsTypesMod {
  
  trait ICreateAppOptions
    extends StObject
       with IGenerateAppsOptions {
    
    var name: js.UndefOr[String] = js.undefined
    
    @JSName("org")
    var org_ : js.UndefOr[String] = js.undefined
    
    var redirectUris: js.UndefOr[String] = js.undefined
    
    var scopes: js.UndefOr[String] = js.undefined
  }
  object ICreateAppOptions {
    
    inline def apply(): ICreateAppOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICreateAppOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICreateAppOptions] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
      
      inline def setOrg_Undefined: Self = StObject.set(x, "org", js.undefined)
      
      inline def setRedirectUris(value: String): Self = StObject.set(x, "redirectUris", value.asInstanceOf[js.Any])
      
      inline def setRedirectUrisUndefined: Self = StObject.set(x, "redirectUris", js.undefined)
      
      inline def setScopes(value: String): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    }
  }
  
  trait ICreateAppRequest extends StObject {
    
    var orgId: String
    
    var snykAppName: String
    
    var snykAppRedirectUris: js.Array[String]
    
    var snykAppScopes: js.Array[String]
  }
  object ICreateAppRequest {
    
    inline def apply(
      orgId: String,
      snykAppName: String,
      snykAppRedirectUris: js.Array[String],
      snykAppScopes: js.Array[String]
    ): ICreateAppRequest = {
      val __obj = js.Dynamic.literal(orgId = orgId.asInstanceOf[js.Any], snykAppName = snykAppName.asInstanceOf[js.Any], snykAppRedirectUris = snykAppRedirectUris.asInstanceOf[js.Any], snykAppScopes = snykAppScopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICreateAppRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICreateAppRequest] (val x: Self) extends AnyVal {
      
      inline def setOrgId(value: String): Self = StObject.set(x, "orgId", value.asInstanceOf[js.Any])
      
      inline def setSnykAppName(value: String): Self = StObject.set(x, "snykAppName", value.asInstanceOf[js.Any])
      
      inline def setSnykAppRedirectUris(value: js.Array[String]): Self = StObject.set(x, "snykAppRedirectUris", value.asInstanceOf[js.Any])
      
      inline def setSnykAppRedirectUrisVarargs(value: String*): Self = StObject.set(x, "snykAppRedirectUris", js.Array(value*))
      
      inline def setSnykAppScopes(value: js.Array[String]): Self = StObject.set(x, "snykAppScopes", value.asInstanceOf[js.Any])
      
      inline def setSnykAppScopesVarargs(value: String*): Self = StObject.set(x, "snykAppScopes", js.Array(value*))
    }
  }
  
  trait ICreateAppResponse extends StObject {
    
    var data: Id
    
    var jsonapi: IJSONApi
  }
  object ICreateAppResponse {
    
    inline def apply(data: Id, jsonapi: IJSONApi): ICreateAppResponse = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], jsonapi = jsonapi.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICreateAppResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICreateAppResponse] (val x: Self) extends AnyVal {
      
      inline def setData(value: Id): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setJsonapi(value: IJSONApi): Self = StObject.set(x, "jsonapi", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGenerateAppsOptions extends StObject {
    
    var interactive: js.UndefOr[Boolean] = js.undefined
  }
  object IGenerateAppsOptions {
    
    inline def apply(): IGenerateAppsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGenerateAppsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGenerateAppsOptions] (val x: Self) extends AnyVal {
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    }
  }
  
  trait IGetAppsURLOpts extends StObject {
    
    var clientId: js.UndefOr[String] = js.undefined
    
    var orgId: js.UndefOr[String] = js.undefined
  }
  object IGetAppsURLOpts {
    
    inline def apply(): IGetAppsURLOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGetAppsURLOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGetAppsURLOpts] (val x: Self) extends AnyVal {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setOrgId(value: String): Self = StObject.set(x, "orgId", value.asInstanceOf[js.Any])
      
      inline def setOrgIdUndefined: Self = StObject.set(x, "orgId", js.undefined)
    }
  }
  
  trait IJSONApi extends StObject {
    
    var version: String
  }
  object IJSONApi {
    
    inline def apply(version: String): IJSONApi = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[IJSONApi]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IJSONApi] (val x: Self) extends AnyVal {
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRestErrorResponse extends StObject {
    
    var errors: js.Array[Detail]
    
    var jsonapi: IJSONApi
  }
  object IRestErrorResponse {
    
    inline def apply(errors: js.Array[Detail], jsonapi: IJSONApi): IRestErrorResponse = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], jsonapi = jsonapi.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRestErrorResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRestErrorResponse] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: js.Array[Detail]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: Detail*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setJsonapi(value: IJSONApi): Self = StObject.set(x, "jsonapi", value.asInstanceOf[js.Any])
    }
  }
}
