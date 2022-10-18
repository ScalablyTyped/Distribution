package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibProtectUpdateNotificationMod {
  
  @JSImport("snyk/dist/lib/protect-update-notification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkPackageJsonForSnykDependency(packageJsonPath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPackageJsonForSnykDependency")(packageJsonPath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getPackageJsonPathsContainingSnykDependency(fileOption: String, paths: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPackageJsonPathsContainingSnykDependency")(fileOption.asInstanceOf[js.Any], paths.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getPackageJsonPathsContainingSnykDependency(fileOption: Unit, paths: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPackageJsonPathsContainingSnykDependency")(fileOption.asInstanceOf[js.Any], paths.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getProtectUpgradeWarningForPaths(packageJsonPaths: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProtectUpgradeWarningForPaths")(packageJsonPaths.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def packageJsonFileExistsInDirectory(directoryPath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("packageJsonFileExistsInDirectory")(directoryPath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
