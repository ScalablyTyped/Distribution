package typings.reactNativeWindowsCli

import typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.cpp
import typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.cs
import typings.std.Document
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configUtilsMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/config/configUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findAppProjectFiles(winFolder: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAppProjectFiles")(winFolder.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def findDependencyProjectFiles(winFolder: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findDependencyProjectFiles")(winFolder.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def findFiles(folder: String, filenamePattern: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFiles")(folder.asInstanceOf[js.Any], filenamePattern.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def findPropertyValue(projectContents: Node, propertyName: String, filePath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("findPropertyValue")(projectContents.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def findSolutionFiles(winFolder: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findSolutionFiles")(winFolder.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def findWindowsFolder(folder: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findWindowsFolder")(folder.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getProjectGuid(projectContents: Node): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectGuid")(projectContents.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getProjectLanguage(projectPath: String): cpp | cs | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectLanguage")(projectPath.asInstanceOf[js.Any]).asInstanceOf[cpp | cs | Null]
  
  inline def getProjectName(projectContents: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectName")(projectContents.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getProjectNamespace(projectContents: Node): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectNamespace")(projectContents.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def importProjectExists(projectContents: Node, projectName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("importProjectExists")(projectContents.asInstanceOf[js.Any], projectName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isRnwDependencyProject(filePath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRnwDependencyProject")(filePath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRnwSolution(filePath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRnwSolution")(filePath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def readProjectFile(projectPath: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("readProjectFile")(projectPath.asInstanceOf[js.Any]).asInstanceOf[Document]
  
  inline def tryFindPropertyValue(projectContents: Node, propertyName: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("tryFindPropertyValue")(projectContents.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
