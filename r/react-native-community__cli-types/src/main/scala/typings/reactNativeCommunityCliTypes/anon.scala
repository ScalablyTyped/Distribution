package typings.reactNativeCommunityCliTypes

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCommunityCliTypes.buildAndroidMod.AndroidDependencyConfig
import typings.reactNativeCommunityCliTypes.buildAndroidMod.AndroidDependencyParams
import typings.reactNativeCommunityCliTypes.buildAndroidMod.AndroidProjectParams
import typings.reactNativeCommunityCliTypes.buildIosMod.IOSDependencyConfig
import typings.reactNativeCommunityCliTypes.buildIosMod.IOSDependencyParams
import typings.reactNativeCommunityCliTypes.buildIosMod.IOSProjectParams
import typings.reactNativeCommunityCliTypes.buildIosMod.IOSScriptPhase
import typings.reactNativeCommunityCliTypes.mod.AndroidPlatformConfig
import typings.reactNativeCommunityCliTypes.mod.IOSPlatformConfig
import typings.reactNativeCommunityCliTypes.mod.PlatformConfig
import typings.reactNativeCommunityCliTypes.reactNativeCommunityCliTypesStrings.after_compile
import typings.reactNativeCommunityCliTypes.reactNativeCommunityCliTypesStrings.any
import typings.reactNativeCommunityCliTypes.reactNativeCommunityCliTypesStrings.before_compile
import typings.std.Exclude
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Android
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var android: js.UndefOr[AndroidProjectParams] = js.undefined
    
    var ios: js.UndefOr[IOSProjectParams] = js.undefined
  }
  object Android {
    
    inline def apply(): Android = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Android]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Android] (val x: Self) extends AnyVal {
      
      inline def setAndroid(value: AndroidProjectParams): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      inline def setIos(value: IOSProjectParams): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    }
  }
  
  trait Cmd extends StObject {
    
    var cmd: String
    
    var desc: String
  }
  object Cmd {
    
    inline def apply(cmd: String, desc: String): Cmd = {
      val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cmd]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cmd] (val x: Self) extends AnyVal {
      
      inline def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var android: js.UndefOr[
        Exclude[
          ReturnType[
            js.Function2[
              /* dependency */ String, 
              /* params */ AndroidDependencyParams, 
              AndroidDependencyConfig | Unit
            ]
          ], 
          Unit
        ]
      ] = js.undefined
    
    var ios: js.UndefOr[
        Exclude[
          ReturnType[
            js.Function2[
              /* dependency */ String, 
              /* params */ IOSDependencyParams, 
              IOSDependencyConfig | Unit
            ]
          ], 
          Unit
        ]
      ] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def setAndroid(
        value: Exclude[
              ReturnType[
                js.Function2[
                  /* dependency */ String, 
                  /* params */ AndroidDependencyParams, 
                  AndroidDependencyConfig | Unit
                ]
              ], 
              Unit
            ]
      ): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      inline def setIos(
        value: Exclude[
              ReturnType[
                js.Function2[
                  /* dependency */ String, 
                  /* params */ IOSDependencyParams, 
                  IOSDependencyConfig | Unit
                ]
              ], 
              Unit
            ]
      ): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    }
  }
  
  trait Dictname
    extends StObject
       with /* name */ StringDictionary[PlatformConfig[Any, Any, Any, Any]] {
    
    var android: AndroidPlatformConfig
    
    var ios: IOSPlatformConfig
  }
  object Dictname {
    
    inline def apply(android: AndroidPlatformConfig, ios: IOSPlatformConfig): Dictname = {
      val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictname]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictname] (val x: Self) extends AnyVal {
      
      inline def setAndroid(value: AndroidPlatformConfig): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setIos(value: IOSPlatformConfig): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var version: String
  }
  object Name {
    
    inline def apply(name: String, version: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<@react-native-community/cli-types.@react-native-community/cli-types.DependencyConfig, 'name' | 'root'> */
  trait OmitDependencyConfignamer extends StObject {
    
    var platforms: Dictkey
  }
  object OmitDependencyConfignamer {
    
    inline def apply(platforms: Dictkey): OmitDependencyConfignamer = {
      val __obj = js.Dynamic.literal(platforms = platforms.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitDependencyConfignamer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitDependencyConfignamer] (val x: Self) extends AnyVal {
      
      inline def setPlatforms(value: Dictkey): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  path :string} & {  name :string,   shell_path :string | undefined,   input_files :std.Array<string> | undefined,   output_files :std.Array<string> | undefined,   input_file_lists :std.Array<string> | undefined,   output_file_lists :std.Array<string> | undefined,   show_env_vars_in_log :boolean | undefined,   dependency_file :string | undefined,   execution_position :'before_compile' | 'after_compile' | 'any' | undefined} */
  trait pathstringnamestringshell
    extends StObject
       with IOSScriptPhase {
    
    var dependency_file: js.UndefOr[String] = js.undefined
    
    var execution_position: js.UndefOr[before_compile | after_compile | any] = js.undefined
    
    var input_file_lists: js.UndefOr[js.Array[String]] = js.undefined
    
    var input_files: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: String
    
    var output_file_lists: js.UndefOr[js.Array[String]] = js.undefined
    
    var output_files: js.UndefOr[js.Array[String]] = js.undefined
    
    var path: String
    
    var shell_path: js.UndefOr[String] = js.undefined
    
    var show_env_vars_in_log: js.UndefOr[Boolean] = js.undefined
  }
  object pathstringnamestringshell {
    
    inline def apply(name: String, path: String): pathstringnamestringshell = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[pathstringnamestringshell]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: pathstringnamestringshell] (val x: Self) extends AnyVal {
      
      inline def setDependency_file(value: String): Self = StObject.set(x, "dependency_file", value.asInstanceOf[js.Any])
      
      inline def setDependency_fileUndefined: Self = StObject.set(x, "dependency_file", js.undefined)
      
      inline def setExecution_position(value: before_compile | after_compile | any): Self = StObject.set(x, "execution_position", value.asInstanceOf[js.Any])
      
      inline def setExecution_positionUndefined: Self = StObject.set(x, "execution_position", js.undefined)
      
      inline def setInput_file_lists(value: js.Array[String]): Self = StObject.set(x, "input_file_lists", value.asInstanceOf[js.Any])
      
      inline def setInput_file_listsUndefined: Self = StObject.set(x, "input_file_lists", js.undefined)
      
      inline def setInput_file_listsVarargs(value: String*): Self = StObject.set(x, "input_file_lists", js.Array(value*))
      
      inline def setInput_files(value: js.Array[String]): Self = StObject.set(x, "input_files", value.asInstanceOf[js.Any])
      
      inline def setInput_filesUndefined: Self = StObject.set(x, "input_files", js.undefined)
      
      inline def setInput_filesVarargs(value: String*): Self = StObject.set(x, "input_files", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOutput_file_lists(value: js.Array[String]): Self = StObject.set(x, "output_file_lists", value.asInstanceOf[js.Any])
      
      inline def setOutput_file_listsUndefined: Self = StObject.set(x, "output_file_lists", js.undefined)
      
      inline def setOutput_file_listsVarargs(value: String*): Self = StObject.set(x, "output_file_lists", js.Array(value*))
      
      inline def setOutput_files(value: js.Array[String]): Self = StObject.set(x, "output_files", value.asInstanceOf[js.Any])
      
      inline def setOutput_filesUndefined: Self = StObject.set(x, "output_files", js.undefined)
      
      inline def setOutput_filesVarargs(value: String*): Self = StObject.set(x, "output_files", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setShell_path(value: String): Self = StObject.set(x, "shell_path", value.asInstanceOf[js.Any])
      
      inline def setShell_pathUndefined: Self = StObject.set(x, "shell_path", js.undefined)
      
      inline def setShow_env_vars_in_log(value: Boolean): Self = StObject.set(x, "show_env_vars_in_log", value.asInstanceOf[js.Any])
      
      inline def setShow_env_vars_in_logUndefined: Self = StObject.set(x, "show_env_vars_in_log", js.undefined)
    }
  }
  
  /* Inlined {  script :string} & {  name :string,   shell_path :string | undefined,   input_files :std.Array<string> | undefined,   output_files :std.Array<string> | undefined,   input_file_lists :std.Array<string> | undefined,   output_file_lists :std.Array<string> | undefined,   show_env_vars_in_log :boolean | undefined,   dependency_file :string | undefined,   execution_position :'before_compile' | 'after_compile' | 'any' | undefined} */
  trait scriptstringnamestringshe
    extends StObject
       with IOSScriptPhase {
    
    var dependency_file: js.UndefOr[String] = js.undefined
    
    var execution_position: js.UndefOr[before_compile | after_compile | any] = js.undefined
    
    var input_file_lists: js.UndefOr[js.Array[String]] = js.undefined
    
    var input_files: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: String
    
    var output_file_lists: js.UndefOr[js.Array[String]] = js.undefined
    
    var output_files: js.UndefOr[js.Array[String]] = js.undefined
    
    var script: String
    
    var shell_path: js.UndefOr[String] = js.undefined
    
    var show_env_vars_in_log: js.UndefOr[Boolean] = js.undefined
  }
  object scriptstringnamestringshe {
    
    inline def apply(name: String, script: String): scriptstringnamestringshe = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
      __obj.asInstanceOf[scriptstringnamestringshe]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: scriptstringnamestringshe] (val x: Self) extends AnyVal {
      
      inline def setDependency_file(value: String): Self = StObject.set(x, "dependency_file", value.asInstanceOf[js.Any])
      
      inline def setDependency_fileUndefined: Self = StObject.set(x, "dependency_file", js.undefined)
      
      inline def setExecution_position(value: before_compile | after_compile | any): Self = StObject.set(x, "execution_position", value.asInstanceOf[js.Any])
      
      inline def setExecution_positionUndefined: Self = StObject.set(x, "execution_position", js.undefined)
      
      inline def setInput_file_lists(value: js.Array[String]): Self = StObject.set(x, "input_file_lists", value.asInstanceOf[js.Any])
      
      inline def setInput_file_listsUndefined: Self = StObject.set(x, "input_file_lists", js.undefined)
      
      inline def setInput_file_listsVarargs(value: String*): Self = StObject.set(x, "input_file_lists", js.Array(value*))
      
      inline def setInput_files(value: js.Array[String]): Self = StObject.set(x, "input_files", value.asInstanceOf[js.Any])
      
      inline def setInput_filesUndefined: Self = StObject.set(x, "input_files", js.undefined)
      
      inline def setInput_filesVarargs(value: String*): Self = StObject.set(x, "input_files", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOutput_file_lists(value: js.Array[String]): Self = StObject.set(x, "output_file_lists", value.asInstanceOf[js.Any])
      
      inline def setOutput_file_listsUndefined: Self = StObject.set(x, "output_file_lists", js.undefined)
      
      inline def setOutput_file_listsVarargs(value: String*): Self = StObject.set(x, "output_file_lists", js.Array(value*))
      
      inline def setOutput_files(value: js.Array[String]): Self = StObject.set(x, "output_files", value.asInstanceOf[js.Any])
      
      inline def setOutput_filesUndefined: Self = StObject.set(x, "output_files", js.undefined)
      
      inline def setOutput_filesVarargs(value: String*): Self = StObject.set(x, "output_files", js.Array(value*))
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setShell_path(value: String): Self = StObject.set(x, "shell_path", value.asInstanceOf[js.Any])
      
      inline def setShell_pathUndefined: Self = StObject.set(x, "shell_path", js.undefined)
      
      inline def setShow_env_vars_in_log(value: Boolean): Self = StObject.set(x, "show_env_vars_in_log", value.asInstanceOf[js.Any])
      
      inline def setShow_env_vars_in_logUndefined: Self = StObject.set(x, "show_env_vars_in_log", js.undefined)
    }
  }
}
