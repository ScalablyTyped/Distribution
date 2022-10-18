package typings.snyk

import typings.snyk.distCliArgsMod.ArgsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibAnalyticsSourcesMod {
  
  @JSImport("snyk/dist/lib/analytics/sources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/lib/analytics/sources", "INTEGRATION_ENVIRONMENT_ENVVAR")
  @js.native
  val INTEGRATION_ENVIRONMENT_ENVVAR: /* "SNYK_INTEGRATION_ENVIRONMENT" */ String = js.native
  
  @JSImport("snyk/dist/lib/analytics/sources", "INTEGRATION_ENVIRONMENT_VERSION_ENVVAR")
  @js.native
  val INTEGRATION_ENVIRONMENT_VERSION_ENVVAR: /* "SNYK_INTEGRATION_ENVIRONMENT_VERSION" */ String = js.native
  
  @JSImport("snyk/dist/lib/analytics/sources", "INTEGRATION_NAME_ENVVAR")
  @js.native
  val INTEGRATION_NAME_ENVVAR: /* "SNYK_INTEGRATION_NAME" */ String = js.native
  
  @JSImport("snyk/dist/lib/analytics/sources", "INTEGRATION_VERSION_ENVVAR")
  @js.native
  val INTEGRATION_VERSION_ENVVAR: /* "SNYK_INTEGRATION_VERSION" */ String = js.native
  
  inline def getIntegrationEnvironment(args: js.Array[ArgsOptions]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntegrationEnvironment")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getIntegrationEnvironmentVersion(args: js.Array[ArgsOptions]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntegrationEnvironmentVersion")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getIntegrationName(args: js.Array[ArgsOptions]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntegrationName")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getIntegrationVersion(args: js.Array[ArgsOptions]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntegrationVersion")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isHomebrew(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHomebrew")().asInstanceOf[Boolean]
  
  inline def isInstalled(commandToCheck: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstalled")(commandToCheck.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def isScoop(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScoop")().asInstanceOf[Boolean]
  
  inline def validateHomebrew(snykExecutablePath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateHomebrew")(snykExecutablePath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def validateScoopManifestFile(snykExecutablePath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateScoopManifestFile")(snykExecutablePath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
