package typings.snyk

import typings.snyk.distLibPackageManagersMod.SupportedPackageManagers
import typings.snyk.distLibPluginsGetMultiPluginResultMod.MultiProjectResultCustom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsConvertMultiPluginResToMultiCustomMod {
  
  @JSImport("snyk/dist/lib/plugins/convert-multi-plugin-res-to-multi-custom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertMultiResultToMultiCustom(
    inspectRes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pluginApi.MultiProjectResult */ Any
  ): MultiProjectResultCustom = ^.asInstanceOf[js.Dynamic].applyDynamic("convertMultiResultToMultiCustom")(inspectRes.asInstanceOf[js.Any]).asInstanceOf[MultiProjectResultCustom]
  inline def convertMultiResultToMultiCustom(
    inspectRes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pluginApi.MultiProjectResult */ Any,
    packageManager: Unit,
    targetFile: String
  ): MultiProjectResultCustom = (^.asInstanceOf[js.Dynamic].applyDynamic("convertMultiResultToMultiCustom")(inspectRes.asInstanceOf[js.Any], packageManager.asInstanceOf[js.Any], targetFile.asInstanceOf[js.Any])).asInstanceOf[MultiProjectResultCustom]
  inline def convertMultiResultToMultiCustom(
    inspectRes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pluginApi.MultiProjectResult */ Any,
    packageManager: SupportedPackageManagers
  ): MultiProjectResultCustom = (^.asInstanceOf[js.Dynamic].applyDynamic("convertMultiResultToMultiCustom")(inspectRes.asInstanceOf[js.Any], packageManager.asInstanceOf[js.Any])).asInstanceOf[MultiProjectResultCustom]
  inline def convertMultiResultToMultiCustom(
    inspectRes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pluginApi.MultiProjectResult */ Any,
    packageManager: SupportedPackageManagers,
    targetFile: String
  ): MultiProjectResultCustom = (^.asInstanceOf[js.Dynamic].applyDynamic("convertMultiResultToMultiCustom")(inspectRes.asInstanceOf[js.Any], packageManager.asInstanceOf[js.Any], targetFile.asInstanceOf[js.Any])).asInstanceOf[MultiProjectResultCustom]
}
