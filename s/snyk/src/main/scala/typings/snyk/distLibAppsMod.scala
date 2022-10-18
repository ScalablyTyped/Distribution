package typings.snyk

import typings.snyk.anon.Message
import typings.snyk.anon.Name
import typings.snyk.distLibAppsConstantsMod.EAppsURL
import typings.snyk.distLibAppsTypesMod.ICreateAppResponse
import typings.snyk.distLibAppsTypesMod.IGetAppsURLOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibAppsMod {
  
  @JSImport("snyk/dist/lib/apps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object AppsErrorMessages {
    
    @JSImport("snyk/dist/lib/apps", "AppsErrorMessages")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/apps", "AppsErrorMessages.nameRequired")
    @js.native
    def nameRequired: String = js.native
    inline def nameRequired_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nameRequired")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/apps", "AppsErrorMessages.orgRequired")
    @js.native
    def orgRequired: String = js.native
    inline def orgRequired_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orgRequired")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/apps", "AppsErrorMessages.redirectUrisRequired")
    @js.native
    def redirectUrisRequired: String = js.native
    inline def redirectUrisRequired_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("redirectUrisRequired")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/apps", "AppsErrorMessages.scopesRequired")
    @js.native
    def scopesRequired: String = js.native
    inline def scopesRequired_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scopesRequired")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/apps", "AppsErrorMessages.useExperimental")
    @js.native
    def useExperimental: String = js.native
    inline def useExperimental_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useExperimental")(x.asInstanceOf[js.Any])
  }
  
  object CreateAppPromptData {
    
    @JSImport("snyk/dist/lib/apps", "CreateAppPromptData")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/apps", "CreateAppPromptData.SNYK_APP_NAME")
    @js.native
    def SNYK_APP_NAME: Message = js.native
    inline def SNYK_APP_NAME_=(x: Message): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SNYK_APP_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/apps", "CreateAppPromptData.SNYK_APP_ORG_ID")
    @js.native
    def SNYK_APP_ORG_ID: Message = js.native
    inline def SNYK_APP_ORG_ID_=(x: Message): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SNYK_APP_ORG_ID")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/apps", "CreateAppPromptData.SNYK_APP_REDIRECT_URIS")
    @js.native
    def SNYK_APP_REDIRECT_URIS: Message = js.native
    inline def SNYK_APP_REDIRECT_URIS_=(x: Message): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SNYK_APP_REDIRECT_URIS")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/apps", "CreateAppPromptData.SNYK_APP_SCOPES")
    @js.native
    def SNYK_APP_SCOPES: Message = js.native
    inline def SNYK_APP_SCOPES_=(x: Message): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SNYK_APP_SCOPES")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("snyk/dist/lib/apps", "EAppsURL")
  @js.native
  object EAppsURL extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.snyk.distLibAppsConstantsMod.EAppsURL & Double] = js.native
    
    /* 0 */ val CREATE_APP: typings.snyk.distLibAppsConstantsMod.EAppsURL.CREATE_APP & Double = js.native
  }
  
  @JSImport("snyk/dist/lib/apps", "EValidSubCommands")
  @js.native
  object EValidSubCommands extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.snyk.distLibAppsConstantsMod.EValidSubCommands & String] = js.native
    
    /* "create" */ val CREATE: typings.snyk.distLibAppsConstantsMod.EValidSubCommands.CREATE & String = js.native
  }
  
  @JSImport("snyk/dist/lib/apps", "SNYK_APP_CLIENT_ID")
  @js.native
  val SNYK_APP_CLIENT_ID: /* "snykAppClientId" */ String = js.native
  
  @JSImport("snyk/dist/lib/apps", "SNYK_APP_DEBUG")
  @js.native
  val SNYK_APP_DEBUG: /* "snyk:apps" */ String = js.native
  
  @JSImport("snyk/dist/lib/apps", "SNYK_APP_NAME")
  @js.native
  val SNYK_APP_NAME: /* "snykAppName" */ String = js.native
  
  @JSImport("snyk/dist/lib/apps", "SNYK_APP_ORG_ID")
  @js.native
  val SNYK_APP_ORG_ID: /* "snykAppOrgId" */ String = js.native
  
  @JSImport("snyk/dist/lib/apps", "SNYK_APP_REDIRECT_URIS")
  @js.native
  val SNYK_APP_REDIRECT_URIS: /* "snykAppRedirectUris" */ String = js.native
  
  @JSImport("snyk/dist/lib/apps", "SNYK_APP_SCOPES")
  @js.native
  val SNYK_APP_SCOPES: /* "snykAppScopes" */ String = js.native
  
  @JSImport("snyk/dist/lib/apps", "createAppPrompts")
  @js.native
  val createAppPrompts: js.Array[Name] = js.native
  
  inline def getAppsURL(selection: EAppsURL): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppsURL")(selection.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getAppsURL(selection: EAppsURL, opts: IGetAppsURLOpts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAppsURL")(selection.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def handleCreateAppRes(res: ICreateAppResponse): String = ^.asInstanceOf[js.Dynamic].applyDynamic("handleCreateAppRes")(res.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def handleRestError(error: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRestError")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def readAppsHelpMarkdown(filename: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readAppsHelpMarkdown")(filename.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("snyk/dist/lib/apps", "validAppsSubCommands")
  @js.native
  val validAppsSubCommands: js.Array[String] = js.native
  
  inline def validInput(input: String): String | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validInput")(input.asInstanceOf[js.Any]).asInstanceOf[String | Boolean]
  
  inline def validURL(input: String): Boolean | String = ^.asInstanceOf[js.Dynamic].applyDynamic("validURL")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean | String]
  
  inline def validateAllURL(input: String): String | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateAllURL")(input.asInstanceOf[js.Any]).asInstanceOf[String | Boolean]
  
  inline def validateUUID(input: String): Boolean | String = ^.asInstanceOf[js.Dynamic].applyDynamic("validateUUID")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean | String]
}
