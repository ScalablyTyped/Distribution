package typings.snyk

import typings.snyk.distLibPluginsGetMultiPluginResultMod.MultiProjectResultCustom
import typings.snyk.distLibTypesMod.MonitorOptions
import typings.snyk.distLibTypesMod.Options
import typings.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsGetDepsFromPluginMod {
  
  @JSImport("snyk/dist/lib/plugins/get-deps-from-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDepsFromPlugin(root: String, options: MonitorOptions & Options): js.Promise[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pluginApi.MultiProjectResult */ Any) | MultiProjectResultCustom
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDepsFromPlugin")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pluginApi.MultiProjectResult */ Any) | MultiProjectResultCustom
  ]]
  inline def getDepsFromPlugin(root: String, options: TestOptions & Options): js.Promise[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pluginApi.MultiProjectResult */ Any) | MultiProjectResultCustom
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDepsFromPlugin")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pluginApi.MultiProjectResult */ Any) | MultiProjectResultCustom
  ]]
  
  inline def warnSomeGradleManifestsNotScanned(
    scannedProjects: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any
    ],
    allFilesFound: js.Array[String],
    root: String
  ): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("warnSomeGradleManifestsNotScanned")(scannedProjects.asInstanceOf[js.Any], allFilesFound.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
