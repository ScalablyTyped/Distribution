package typings.snyk

import typings.snyk.anon.PackageManager
import typings.snyk.distLibPackageManagersMod.SupportedPackageManagers
import typings.snyk.distLibPluginsGetMultiPluginResultMod.ScannedProjectCustom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsExtractPackageManagerMod {
  
  @JSImport("snyk/dist/lib/plugins/extract-package-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractPackageManager(
    scannedProject: ScannedProjectCustom,
    pluginRes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify cliInterface.legacyPlugin.MultiProjectResult */ Any,
    options: PackageManager
  ): js.UndefOr[SupportedPackageManagers] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractPackageManager")(scannedProject.asInstanceOf[js.Any], pluginRes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[SupportedPackageManagers]]
}
