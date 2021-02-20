package typings.reactNativeWindowsCli

import typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.cpp
import typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.cs
import typings.std.Document
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configUtilsMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/config/configUtils", "findAppProjectFiles")
  @js.native
  def findAppProjectFiles(winFolder: String): js.Array[String] = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/config/configUtils", "findDependencyProjectFiles")
  @js.native
  def findDependencyProjectFiles(winFolder: String): js.Array[String] = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/config/configUtils", "findFiles")
  @js.native
  def findFiles(folder: String, filenamePattern: String): js.Array[String] = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/config/configUtils", "findPropertyValue")
  @js.native
  def findPropertyValue(projectContents: Node, propertyName: String, filePath: String): String = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/config/configUtils", "findSolutionFiles")
  @js.native
  def findSolutionFiles(winFolder: String): js.Array[String] = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/config/configUtils", "findWindowsFolder")
  @js.native
  def findWindowsFolder(folder: String): String | Null = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/config/configUtils", "getProjectGuid")
  @js.native
  def getProjectGuid(projectContents: Node): String | Null = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/config/configUtils", "getProjectLanguage")
  @js.native
  def getProjectLanguage(projectPath: String): cpp | cs | Null = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/config/configUtils", "getProjectName")
  @js.native
  def getProjectName(projectContents: Node): String = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/config/configUtils", "getProjectNamespace")
  @js.native
  def getProjectNamespace(projectContents: Node): String | Null = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/config/configUtils", "importProjectExists")
  @js.native
  def importProjectExists(projectContents: Node, projectName: String): Boolean = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/config/configUtils", "isRnwDependencyProject")
  @js.native
  def isRnwDependencyProject(filePath: String): Boolean = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/config/configUtils", "isRnwSolution")
  @js.native
  def isRnwSolution(filePath: String): Boolean = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/config/configUtils", "readProjectFile")
  @js.native
  def readProjectFile(projectPath: String): Document = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/config/configUtils", "tryFindPropertyValue")
  @js.native
  def tryFindPropertyValue(projectContents: Node, propertyName: String): String | Null = js.native
}
