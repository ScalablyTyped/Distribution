package typings.snyk

import org.scalablytyped.runtime.StringDictionary
import typings.snyk.anon.Content
import typings.snyk.anon.Dev
import typings.snyk.anon.Workspaces
import typings.snyk.distLibPluginsGetMultiPluginResultMod.MultiProjectResultCustom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsNodejsPluginYarnWorkspacesParserMod {
  
  @JSImport("snyk/dist/lib/plugins/nodejs-plugin/yarn-workspaces-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getWorkspacesMap(file: Content): YarnWorkspacesMap = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspacesMap")(file.asInstanceOf[js.Any]).asInstanceOf[YarnWorkspacesMap]
  
  inline def packageJsonBelongsToWorkspace(packageJsonFileName: String, yarnWorkspacesMap: YarnWorkspacesMap, workspaceRoot: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("packageJsonBelongsToWorkspace")(packageJsonFileName.asInstanceOf[js.Any], yarnWorkspacesMap.asInstanceOf[js.Any], workspaceRoot.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def processYarnWorkspaces(root: String, settings: Dev, targetFiles: js.Array[String]): js.Promise[MultiProjectResultCustom] = (^.asInstanceOf[js.Dynamic].applyDynamic("processYarnWorkspaces")(root.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], targetFiles.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MultiProjectResultCustom]]
  
  type YarnWorkspacesMap = StringDictionary[Workspaces]
}
