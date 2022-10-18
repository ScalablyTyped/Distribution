package typings.snyk

import typings.snyk.distLibPackageManagersMod.SupportedPackageManagers
import typings.snyk.distLibPluginsGetMultiPluginResultMod.ScannedProjectCustom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsConvertScannedProjectsToCustomMod {
  
  @JSImport("snyk/dist/lib/plugins/convert-scanned-projects-to-custom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertScannedProjectsToCustom(
    scannedProjects: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify cliInterface.legacyCommon.ScannedProject */ Any
    ],
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any
  ): js.Array[ScannedProjectCustom] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertScannedProjectsToCustom")(scannedProjects.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any])).asInstanceOf[js.Array[ScannedProjectCustom]]
  inline def convertScannedProjectsToCustom(
    scannedProjects: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify cliInterface.legacyCommon.ScannedProject */ Any
    ],
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    packageManager: Unit,
    targetFile: String
  ): js.Array[ScannedProjectCustom] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertScannedProjectsToCustom")(scannedProjects.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], packageManager.asInstanceOf[js.Any], targetFile.asInstanceOf[js.Any])).asInstanceOf[js.Array[ScannedProjectCustom]]
  inline def convertScannedProjectsToCustom(
    scannedProjects: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify cliInterface.legacyCommon.ScannedProject */ Any
    ],
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    packageManager: SupportedPackageManagers
  ): js.Array[ScannedProjectCustom] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertScannedProjectsToCustom")(scannedProjects.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], packageManager.asInstanceOf[js.Any])).asInstanceOf[js.Array[ScannedProjectCustom]]
  inline def convertScannedProjectsToCustom(
    scannedProjects: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify cliInterface.legacyCommon.ScannedProject */ Any
    ],
    pluginMeta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginMetadata */ Any,
    packageManager: SupportedPackageManagers,
    targetFile: String
  ): js.Array[ScannedProjectCustom] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertScannedProjectsToCustom")(scannedProjects.asInstanceOf[js.Any], pluginMeta.asInstanceOf[js.Any], packageManager.asInstanceOf[js.Any], targetFile.asInstanceOf[js.Any])).asInstanceOf[js.Array[ScannedProjectCustom]]
}
