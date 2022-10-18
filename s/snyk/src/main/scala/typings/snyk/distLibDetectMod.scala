package typings.snyk

import typings.snyk.distLibPackageManagersMod.SupportedPackageManagers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibDetectMod {
  
  @JSImport("snyk/dist/lib/detect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/lib/detect", "AUTO_DETECTABLE_FILES")
  @js.native
  val AUTO_DETECTABLE_FILES: js.Array[String] = js.native
  
  inline def detectPackageFile(root: Any): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectPackageFile")(root.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def detectPackageManager(root: String, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("detectPackageManager")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def detectPackageManagerFromFile(file: String): SupportedPackageManagers = ^.asInstanceOf[js.Dynamic].applyDynamic("detectPackageManagerFromFile")(file.asInstanceOf[js.Any]).asInstanceOf[SupportedPackageManagers]
  
  inline def isLocalFolder(root: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocalFolder")(root.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPathToPackageFile(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPathToPackageFile")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def localFileSuppliedButNotFound(root: Any, file: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("localFileSuppliedButNotFound")(root.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
