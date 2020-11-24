package typings.reactNativeWindowsCli

import typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.cpp
import typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.cs
import typings.std.Document
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-windows/cli/lib-commonjs/config/configUtils", JSImport.Namespace)
@js.native
object configUtilsMod extends js.Object {
  
  def findAppProjectFiles(winFolder: String): js.Array[String] = js.native
  
  def findDependencyProjectFiles(winFolder: String): js.Array[String] = js.native
  
  def findFiles(folder: String, filenamePattern: String): js.Array[String] = js.native
  
  def findPropertyValue(projectContents: Node, propertyName: String, filePath: String): String = js.native
  
  def findSolutionFiles(winFolder: String): js.Array[String] = js.native
  
  def findWindowsFolder(folder: String): String | Null = js.native
  
  def getProjectGuid(projectContents: Node): String | Null = js.native
  
  def getProjectLanguage(projectPath: String): cpp | cs | Null = js.native
  
  def getProjectName(projectContents: Node): String = js.native
  
  def getProjectNamespace(projectContents: Node): String | Null = js.native
  
  def importProjectExists(projectContents: Node, projectName: String): Boolean = js.native
  
  def isRnwDependencyProject(filePath: String): Boolean = js.native
  
  def isRnwSolution(filePath: String): Boolean = js.native
  
  def readProjectFile(projectPath: String): Document = js.native
  
  def tryFindPropertyValue(projectContents: Node, propertyName: String): String | Null = js.native
}
