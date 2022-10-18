package typings.snyk

import typings.snyk.distLibTypesMod.MonitorOptions
import typings.snyk.distLibTypesMod.Options
import typings.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsGetSinglePluginResultMod {
  
  @JSImport("snyk/dist/lib/plugins/get-single-plugin-result", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSinglePluginResult(root: String, options: TestOptions & Options): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pluginApi.InspectResult */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSinglePluginResult")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pluginApi.InspectResult */ Any
  ]]
  inline def getSinglePluginResult(root: String, options: MonitorOptions & Options): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pluginApi.InspectResult */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSinglePluginResult")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pluginApi.InspectResult */ Any
  ]]
  inline def getSinglePluginResult(root: String, options: MonitorOptions & Options, targetFile: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pluginApi.InspectResult */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSinglePluginResult")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], targetFile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pluginApi.InspectResult */ Any
  ]]
  inline def getSinglePluginResult(root: String, options: TestOptions & Options, targetFile: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pluginApi.InspectResult */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSinglePluginResult")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], targetFile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pluginApi.InspectResult */ Any
  ]]
}
