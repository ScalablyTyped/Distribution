package typings.reactNativeCommunityCliTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosMod {
  
  trait IOSDependencyConfig extends StObject {
    
    var configurations: js.Array[String]
    
    var podspecPath: String
    
    var scriptPhases: js.Array[IOSScriptPhase]
  }
  object IOSDependencyConfig {
    
    inline def apply(configurations: js.Array[String], podspecPath: String, scriptPhases: js.Array[IOSScriptPhase]): IOSDependencyConfig = {
      val __obj = js.Dynamic.literal(configurations = configurations.asInstanceOf[js.Any], podspecPath = podspecPath.asInstanceOf[js.Any], scriptPhases = scriptPhases.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOSDependencyConfig]
    }
    
    extension [Self <: IOSDependencyConfig](x: Self) {
      
      inline def setConfigurations(value: js.Array[String]): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
      
      inline def setConfigurationsVarargs(value: String*): Self = StObject.set(x, "configurations", js.Array(value*))
      
      inline def setPodspecPath(value: String): Self = StObject.set(x, "podspecPath", value.asInstanceOf[js.Any])
      
      inline def setScriptPhases(value: js.Array[IOSScriptPhase]): Self = StObject.set(x, "scriptPhases", value.asInstanceOf[js.Any])
      
      inline def setScriptPhasesVarargs(value: IOSScriptPhase*): Self = StObject.set(x, "scriptPhases", js.Array(value*))
    }
  }
  
  /* Inlined std.Omit<std.Partial<@react-native-community/cli-types.@react-native-community/cli-types/build/ios.IOSDependencyConfig>, 'podspecPath'> */
  trait IOSDependencyParams extends StObject {
    
    var configurations: js.UndefOr[js.Array[String]] = js.undefined
    
    var scriptPhases: js.UndefOr[js.Array[IOSScriptPhase]] = js.undefined
  }
  object IOSDependencyParams {
    
    inline def apply(): IOSDependencyParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOSDependencyParams]
    }
    
    extension [Self <: IOSDependencyParams](x: Self) {
      
      inline def setConfigurations(value: js.Array[String]): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
      
      inline def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
      
      inline def setConfigurationsVarargs(value: String*): Self = StObject.set(x, "configurations", js.Array(value*))
      
      inline def setScriptPhases(value: js.Array[IOSScriptPhase]): Self = StObject.set(x, "scriptPhases", value.asInstanceOf[js.Any])
      
      inline def setScriptPhasesUndefined: Self = StObject.set(x, "scriptPhases", js.undefined)
      
      inline def setScriptPhasesVarargs(value: IOSScriptPhase*): Self = StObject.set(x, "scriptPhases", js.Array(value*))
    }
  }
  
  trait IOSProjectConfig extends StObject {
    
    var sourceDir: String
    
    var xcodeProject: IOSProjectInfo | Null
  }
  object IOSProjectConfig {
    
    inline def apply(sourceDir: String): IOSProjectConfig = {
      val __obj = js.Dynamic.literal(sourceDir = sourceDir.asInstanceOf[js.Any], xcodeProject = null)
      __obj.asInstanceOf[IOSProjectConfig]
    }
    
    extension [Self <: IOSProjectConfig](x: Self) {
      
      inline def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
      
      inline def setXcodeProject(value: IOSProjectInfo): Self = StObject.set(x, "xcodeProject", value.asInstanceOf[js.Any])
      
      inline def setXcodeProjectNull: Self = StObject.set(x, "xcodeProject", null)
    }
  }
  
  trait IOSProjectInfo extends StObject {
    
    var isWorkspace: Boolean
    
    var name: String
  }
  object IOSProjectInfo {
    
    inline def apply(isWorkspace: Boolean, name: String): IOSProjectInfo = {
      val __obj = js.Dynamic.literal(isWorkspace = isWorkspace.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOSProjectInfo]
    }
    
    extension [Self <: IOSProjectInfo](x: Self) {
      
      inline def setIsWorkspace(value: Boolean): Self = StObject.set(x, "isWorkspace", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOSProjectParams extends StObject {
    
    var sourceDir: js.UndefOr[String] = js.undefined
  }
  object IOSProjectParams {
    
    inline def apply(): IOSProjectParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOSProjectParams]
    }
    
    extension [Self <: IOSProjectParams](x: Self) {
      
      inline def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
      
      inline def setSourceDirUndefined: Self = StObject.set(x, "sourceDir", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeCommunityCliTypes.anon.scriptstringnamestringshe
    - typings.reactNativeCommunityCliTypes.anon.pathstringnamestringshell
  */
  trait IOSScriptPhase extends StObject
  object IOSScriptPhase {
    
    inline def pathstringnamestringshell(name: String, path: String): typings.reactNativeCommunityCliTypes.anon.pathstringnamestringshell = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNativeCommunityCliTypes.anon.pathstringnamestringshell]
    }
    
    inline def scriptstringnamestringshe(name: String, script: String): typings.reactNativeCommunityCliTypes.anon.scriptstringnamestringshe = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNativeCommunityCliTypes.anon.scriptstringnamestringshe]
    }
  }
}
