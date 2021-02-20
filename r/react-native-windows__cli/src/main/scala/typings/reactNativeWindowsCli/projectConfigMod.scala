package typings.reactNativeWindowsCli

import typings.reactNativeWindowsCli.anon.PartialWindowsProjectConf
import typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.cpp
import typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.cs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectConfigMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/config/projectConfig", "projectConfigWindows")
  @js.native
  def projectConfigWindows(folder: String): WindowsProjectConfig | Null = js.native
  @JSImport("@react-native-windows/cli/lib-commonjs/config/projectConfig", "projectConfigWindows")
  @js.native
  def projectConfigWindows(folder: String, userConfig: PartialWindowsProjectConf): WindowsProjectConfig | Null = js.native
  
  @js.native
  trait Project extends StObject {
    
    var projectFile: String = js.native
    
    var projectGuid: String | Null = js.native
    
    var projectLang: cpp | cs | Null = js.native
    
    var projectName: String = js.native
  }
  object Project {
    
    @scala.inline
    def apply(projectFile: String, projectName: String): Project = {
      val __obj = js.Dynamic.literal(projectFile = projectFile.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Project]
    }
    
    @scala.inline
    implicit class ProjectMutableBuilder[Self <: Project] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProjectFile(value: String): Self = StObject.set(x, "projectFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectGuid(value: String): Self = StObject.set(x, "projectGuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectGuidNull: Self = StObject.set(x, "projectGuid", null)
      
      @scala.inline
      def setProjectLang(value: cpp | cs): Self = StObject.set(x, "projectLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectLangNull: Self = StObject.set(x, "projectLang", null)
      
      @scala.inline
      def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WindowsProjectConfig extends StObject {
    
    var folder: String = js.native
    
    var project: Project = js.native
    
    var solutionFile: String = js.native
    
    var sourceDir: String = js.native
  }
  object WindowsProjectConfig {
    
    @scala.inline
    def apply(folder: String, project: Project, solutionFile: String, sourceDir: String): WindowsProjectConfig = {
      val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], solutionFile = solutionFile.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowsProjectConfig]
    }
    
    @scala.inline
    implicit class WindowsProjectConfigMutableBuilder[Self <: WindowsProjectConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProject(value: Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolutionFile(value: String): Self = StObject.set(x, "solutionFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
    }
  }
}
