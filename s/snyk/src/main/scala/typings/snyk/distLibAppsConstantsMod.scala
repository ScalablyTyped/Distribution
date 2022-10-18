package typings.snyk

import typings.snyk.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibAppsConstantsMod {
  
  object AppsErrorMessages {
    
    @JSImport("snyk/dist/lib/apps/constants", "AppsErrorMessages")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/apps/constants", "AppsErrorMessages.nameRequired")
    @js.native
    def nameRequired: String = js.native
    inline def nameRequired_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nameRequired")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/apps/constants", "AppsErrorMessages.orgRequired")
    @js.native
    def orgRequired: String = js.native
    inline def orgRequired_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orgRequired")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/apps/constants", "AppsErrorMessages.redirectUrisRequired")
    @js.native
    def redirectUrisRequired: String = js.native
    inline def redirectUrisRequired_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("redirectUrisRequired")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/apps/constants", "AppsErrorMessages.scopesRequired")
    @js.native
    def scopesRequired: String = js.native
    inline def scopesRequired_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scopesRequired")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/apps/constants", "AppsErrorMessages.useExperimental")
    @js.native
    def useExperimental: String = js.native
    inline def useExperimental_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useExperimental")(x.asInstanceOf[js.Any])
  }
  
  object CreateAppPromptData {
    
    @JSImport("snyk/dist/lib/apps/constants", "CreateAppPromptData")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/apps/constants", "CreateAppPromptData.SNYK_APP_NAME")
    @js.native
    def SNYK_APP_NAME: Message = js.native
    inline def SNYK_APP_NAME_=(x: Message): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SNYK_APP_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/apps/constants", "CreateAppPromptData.SNYK_APP_ORG_ID")
    @js.native
    def SNYK_APP_ORG_ID: Message = js.native
    inline def SNYK_APP_ORG_ID_=(x: Message): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SNYK_APP_ORG_ID")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/apps/constants", "CreateAppPromptData.SNYK_APP_REDIRECT_URIS")
    @js.native
    def SNYK_APP_REDIRECT_URIS: Message = js.native
    inline def SNYK_APP_REDIRECT_URIS_=(x: Message): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SNYK_APP_REDIRECT_URIS")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/apps/constants", "CreateAppPromptData.SNYK_APP_SCOPES")
    @js.native
    def SNYK_APP_SCOPES: Message = js.native
    inline def SNYK_APP_SCOPES_=(x: Message): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SNYK_APP_SCOPES")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait EAppsURL extends StObject
  @JSImport("snyk/dist/lib/apps/constants", "EAppsURL")
  @js.native
  object EAppsURL extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EAppsURL & Double] = js.native
    
    @js.native
    sealed trait CREATE_APP
      extends StObject
         with EAppsURL
    /* 0 */ val CREATE_APP: typings.snyk.distLibAppsConstantsMod.EAppsURL.CREATE_APP & Double = js.native
  }
  
  @js.native
  sealed trait EValidSubCommands extends StObject
  @JSImport("snyk/dist/lib/apps/constants", "EValidSubCommands")
  @js.native
  object EValidSubCommands extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EValidSubCommands & String] = js.native
    
    @js.native
    sealed trait CREATE
      extends StObject
         with EValidSubCommands
    /* "create" */ val CREATE: typings.snyk.distLibAppsConstantsMod.EValidSubCommands.CREATE & String = js.native
  }
  
  @JSImport("snyk/dist/lib/apps/constants", "SNYK_APP_CLIENT_ID")
  @js.native
  val SNYK_APP_CLIENT_ID: /* "snykAppClientId" */ String = js.native
  
  @JSImport("snyk/dist/lib/apps/constants", "SNYK_APP_DEBUG")
  @js.native
  val SNYK_APP_DEBUG: /* "snyk:apps" */ String = js.native
  
  @JSImport("snyk/dist/lib/apps/constants", "SNYK_APP_NAME")
  @js.native
  val SNYK_APP_NAME: /* "snykAppName" */ String = js.native
  
  @JSImport("snyk/dist/lib/apps/constants", "SNYK_APP_ORG_ID")
  @js.native
  val SNYK_APP_ORG_ID: /* "snykAppOrgId" */ String = js.native
  
  @JSImport("snyk/dist/lib/apps/constants", "SNYK_APP_REDIRECT_URIS")
  @js.native
  val SNYK_APP_REDIRECT_URIS: /* "snykAppRedirectUris" */ String = js.native
  
  @JSImport("snyk/dist/lib/apps/constants", "SNYK_APP_SCOPES")
  @js.native
  val SNYK_APP_SCOPES: /* "snykAppScopes" */ String = js.native
  
  @JSImport("snyk/dist/lib/apps/constants", "validAppsSubCommands")
  @js.native
  val validAppsSubCommands: js.Array[String] = js.native
}
