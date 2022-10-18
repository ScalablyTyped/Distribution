package typings.snyk

import typings.snyk.distLibPackageManagersMod.SupportedPackageManagers
import typings.snyk.distLibPluginsGetMultiPluginResultMod.MultiProjectResultCustom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsConvertSingleSpluginResToMultiCustomMod {
  
  @JSImport("snyk/dist/lib/plugins/convert-single-splugin-res-to-multi-custom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertSingleResultToMultiCustom(
    inspectRes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pluginApi.SinglePackageResult */ Any
  ): MultiProjectResultCustom = ^.asInstanceOf[js.Dynamic].applyDynamic("convertSingleResultToMultiCustom")(inspectRes.asInstanceOf[js.Any]).asInstanceOf[MultiProjectResultCustom]
  inline def convertSingleResultToMultiCustom(
    inspectRes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pluginApi.SinglePackageResult */ Any,
    packageManager: SupportedPackageManagers
  ): MultiProjectResultCustom = (^.asInstanceOf[js.Dynamic].applyDynamic("convertSingleResultToMultiCustom")(inspectRes.asInstanceOf[js.Any], packageManager.asInstanceOf[js.Any])).asInstanceOf[MultiProjectResultCustom]
}
