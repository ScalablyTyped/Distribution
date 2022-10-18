package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibVulnHelpersMod {
  
  @JSImport("snyk/dist/lib/vuln-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasFixes(testResults: js.Array[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasFixes")(testResults.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasPatches(testResults: js.Array[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPatches")(testResults.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasUpgrades(testResults: js.Array[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasUpgrades")(testResults.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFixable(testResult: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFixable")(testResult.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNewVuln(vuln: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNewVuln")(vuln.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPatchable(testResult: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPatchable")(testResult.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUpgradable(testResult: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUpgradable")(testResult.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isVulnFixable(vuln: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isVulnFixable")(vuln.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isVulnPatchable(vuln: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isVulnPatchable")(vuln.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isVulnUpgradable(vuln: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isVulnUpgradable")(vuln.asInstanceOf[js.Any]).asInstanceOf[Any]
}
