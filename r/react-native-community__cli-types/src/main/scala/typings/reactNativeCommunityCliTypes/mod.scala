package typings.reactNativeCommunityCliTypes

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCommunityCliTypes.anon.Android
import typings.reactNativeCommunityCliTypes.anon.Cmd
import typings.reactNativeCommunityCliTypes.anon.Dictkey
import typings.reactNativeCommunityCliTypes.anon.Dictname
import typings.reactNativeCommunityCliTypes.anon.Name
import typings.reactNativeCommunityCliTypes.anon.OmitDependencyConfignamer
import typings.reactNativeCommunityCliTypes.buildAndroidMod.AndroidDependencyConfig
import typings.reactNativeCommunityCliTypes.buildAndroidMod.AndroidDependencyParams
import typings.reactNativeCommunityCliTypes.buildAndroidMod.AndroidProjectConfig
import typings.reactNativeCommunityCliTypes.buildAndroidMod.AndroidProjectParams
import typings.reactNativeCommunityCliTypes.buildIosMod.IOSDependencyConfig
import typings.reactNativeCommunityCliTypes.buildIosMod.IOSDependencyParams
import typings.reactNativeCommunityCliTypes.buildIosMod.IOSProjectConfig
import typings.reactNativeCommunityCliTypes.buildIosMod.IOSProjectParams
import typings.reactNativeCommunityCliTypes.reactNativeCommunityCliTypesBooleans.`false`
import typings.reactNativeCommunityCliTypes.reactNativeCommunityCliTypesBooleans.`true`
import typings.std.Exclude
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type AndroidPlatformConfig = PlatformConfig[
    AndroidProjectConfig, 
    AndroidProjectParams, 
    AndroidDependencyConfig, 
    AndroidDependencyParams
  ]
  
  trait Command[IsDetached /* <: Boolean */] extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var detached: js.UndefOr[IsDetached] = js.undefined
    
    var examples: js.UndefOr[js.Array[Cmd]] = js.undefined
    
    var func: /* import warning: importer.ImportType#apply Failed type conversion: IsDetached extends true ? @react-native-community/cli-types.@react-native-community/cli-types.DetachedCommandFunction<std.Object> : @react-native-community/cli-types.@react-native-community/cli-types.CommandFunction<std.Object> */ js.Any
    
    var name: String
    
    var options: js.UndefOr[
        js.Array[
          CommandOption[
            /* import warning: importer.ImportType#apply Failed type conversion: IsDetached extends true ? (): @react-native-community/cli-types.@react-native-community/cli-types.OptionValue : (ctx : @react-native-community/cli-types.@react-native-community/cli-types.Config): @react-native-community/cli-types.@react-native-community/cli-types.OptionValue */ js.Any
          ]
        ]
      ] = js.undefined
    
    var pkg: js.UndefOr[Name] = js.undefined
  }
  object Command {
    
    inline def apply[IsDetached /* <: Boolean */](
      func: /* import warning: importer.ImportType#apply Failed type conversion: IsDetached extends true ? @react-native-community/cli-types.@react-native-community/cli-types.DetachedCommandFunction<std.Object> : @react-native-community/cli-types.@react-native-community/cli-types.CommandFunction<std.Object> */ js.Any,
      name: String
    ): Command[IsDetached] = {
      val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Command[IsDetached]]
    }
    
    extension [Self <: Command[?], IsDetached /* <: Boolean */](x: Self & Command[IsDetached]) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDetached(value: IsDetached): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      inline def setExamples(value: js.Array[Cmd]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
      
      inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
      
      inline def setExamplesVarargs(value: Cmd*): Self = StObject.set(x, "examples", js.Array(value*))
      
      inline def setFunc(
        value: /* import warning: importer.ImportType#apply Failed type conversion: IsDetached extends true ? @react-native-community/cli-types.@react-native-community/cli-types.DetachedCommandFunction<std.Object> : @react-native-community/cli-types.@react-native-community/cli-types.CommandFunction<std.Object> */ js.Any
      ): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(
        value: js.Array[
              CommandOption[
                /* import warning: importer.ImportType#apply Failed type conversion: IsDetached extends true ? (): @react-native-community/cli-types.@react-native-community/cli-types.OptionValue : (ctx : @react-native-community/cli-types.@react-native-community/cli-types.Config): @react-native-community/cli-types.@react-native-community/cli-types.OptionValue */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(
        value: (CommandOption[
              /* import warning: importer.ImportType#apply Failed type conversion: IsDetached extends true ? (): @react-native-community/cli-types.@react-native-community/cli-types.OptionValue : (ctx : @react-native-community/cli-types.@react-native-community/cli-types.Config): @react-native-community/cli-types.@react-native-community/cli-types.OptionValue */ js.Any
            ])*
      ): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPkg(value: Name): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      inline def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
    }
  }
  
  type CommandFunction[Args] = js.Function3[
    /* argv */ js.Array[String], 
    /* ctx */ Config, 
    /* args */ Args, 
    js.Promise[Unit] | Unit
  ]
  
  trait CommandOption[T] extends StObject {
    
    var default: js.UndefOr[OptionValue | T] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var parse: js.UndefOr[js.Function1[/* val */ String, Any]] = js.undefined
  }
  object CommandOption {
    
    inline def apply[T](name: String): CommandOption[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandOption[T]]
    }
    
    extension [Self <: CommandOption[?], T](x: Self & CommandOption[T]) {
      
      inline def setDefault(value: OptionValue | T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParse(value: /* val */ String => Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    }
  }
  
  trait Config extends StObject {
    
    var commands: js.Array[Command[`false`]]
    
    var dependencies: StringDictionary[DependencyConfig]
    
    var healthChecks: js.Array[Any]
    
    var platforms: Dictname
    
    var project: ProjectConfig
    
    var reactNativePath: String
    
    var root: String
  }
  object Config {
    
    inline def apply(
      commands: js.Array[Command[`false`]],
      dependencies: StringDictionary[DependencyConfig],
      healthChecks: js.Array[Any],
      platforms: Dictname,
      project: ProjectConfig,
      reactNativePath: String,
      root: String
    ): Config = {
      val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], healthChecks = healthChecks.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], reactNativePath = reactNativePath.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setCommands(value: js.Array[Command[`false`]]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsVarargs(value: Command[`false`]*): Self = StObject.set(x, "commands", js.Array(value*))
      
      inline def setDependencies(value: StringDictionary[DependencyConfig]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setHealthChecks(value: js.Array[Any]): Self = StObject.set(x, "healthChecks", value.asInstanceOf[js.Any])
      
      inline def setHealthChecksVarargs(value: Any*): Self = StObject.set(x, "healthChecks", js.Array(value*))
      
      inline def setPlatforms(value: Dictname): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      inline def setProject(value: ProjectConfig): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setReactNativePath(value: String): Self = StObject.set(x, "reactNativePath", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait DependencyConfig extends StObject {
    
    var name: String
    
    var platforms: Dictkey
    
    var root: String
  }
  object DependencyConfig {
    
    inline def apply(name: String, platforms: Dictkey, root: String): DependencyConfig = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependencyConfig]
    }
    
    extension [Self <: DependencyConfig](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPlatforms(value: Dictkey): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  type DetachedCommand = Command[`true`]
  
  type DetachedCommandFunction[Args] = js.Function2[/* argv */ js.Array[String], /* args */ Args, js.Promise[Unit] | Unit]
  
  type IOSPlatformConfig = PlatformConfig[IOSProjectConfig, IOSProjectParams, IOSDependencyConfig, IOSDependencyParams]
  
  type OptionValue = String | Boolean | Double
  
  @js.native
  trait PlatformConfig[ProjectConfig, ProjectParams, DependencyConfig, DependencyParams] extends StObject {
    
    def dependencyConfig(dependency: String, params: DependencyParams): DependencyConfig | Unit = js.native
    
    var npmPackageName: js.UndefOr[String] = js.native
    
    def projectConfig(projectRoot: String, projectParams: ProjectParams): ProjectConfig | Unit = js.native
    def projectConfig(projectRoot: String, projectParams: Unit): ProjectConfig | Unit = js.native
  }
  
  trait ProjectConfig
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var android: js.UndefOr[
        Exclude[
          ReturnType[
            js.Function2[
              /* projectRoot */ String, 
              /* projectParams */ AndroidProjectParams | Unit, 
              AndroidProjectConfig | Unit
            ]
          ], 
          Unit
        ]
      ] = js.undefined
    
    var ios: js.UndefOr[
        Exclude[
          ReturnType[
            js.Function2[
              /* projectRoot */ String, 
              /* projectParams */ IOSProjectParams | Unit, 
              IOSProjectConfig | Unit
            ]
          ], 
          Unit
        ]
      ] = js.undefined
  }
  object ProjectConfig {
    
    inline def apply(): ProjectConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectConfig]
    }
    
    extension [Self <: ProjectConfig](x: Self) {
      
      inline def setAndroid(
        value: Exclude[
              ReturnType[
                js.Function2[
                  /* projectRoot */ String, 
                  /* projectParams */ AndroidProjectParams | Unit, 
                  AndroidProjectConfig | Unit
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
                  /* projectRoot */ String, 
                  /* projectParams */ IOSProjectParams | Unit, 
                  IOSProjectConfig | Unit
                ]
              ], 
              Unit
            ]
      ): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    }
  }
  
  type Prompt = Any
  
  /* Inlined std.Omit<@react-native-community/cli-types.@react-native-community/cli-types.Config, 'root'> & {  reactNativePath :string | void,   project :{  android :@react-native-community/cli-types.@react-native-community/cli-types/build/android.AndroidProjectParams | undefined,   ios :@react-native-community/cli-types.@react-native-community/cli-types/build/ios.IOSProjectParams | undefined, [key: string] : any}} */
  trait UserConfig extends StObject {
    
    var commands: js.Array[Command[`false`]]
    
    var dependencies: StringDictionary[DependencyConfig]
    
    var healthChecks: js.Array[Any]
    
    var platforms: Dictname
    
    var project: ProjectConfig & Android
    
    var reactNativePath: String & (String | Unit)
  }
  object UserConfig {
    
    inline def apply(
      commands: js.Array[Command[`false`]],
      dependencies: StringDictionary[DependencyConfig],
      healthChecks: js.Array[Any],
      platforms: Dictname,
      project: ProjectConfig & Android,
      reactNativePath: String & (String | Unit)
    ): UserConfig = {
      val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], healthChecks = healthChecks.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], reactNativePath = reactNativePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserConfig]
    }
    
    extension [Self <: UserConfig](x: Self) {
      
      inline def setCommands(value: js.Array[Command[`false`]]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsVarargs(value: Command[`false`]*): Self = StObject.set(x, "commands", js.Array(value*))
      
      inline def setDependencies(value: StringDictionary[DependencyConfig]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setHealthChecks(value: js.Array[Any]): Self = StObject.set(x, "healthChecks", value.asInstanceOf[js.Any])
      
      inline def setHealthChecksVarargs(value: Any*): Self = StObject.set(x, "healthChecks", js.Array(value*))
      
      inline def setPlatforms(value: Dictname): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      inline def setProject(value: ProjectConfig & Android): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setReactNativePath(value: String & (String | Unit)): Self = StObject.set(x, "reactNativePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserDependencyConfig extends StObject {
    
    var commands: js.Array[Command[`false`]]
    
    var dependency: OmitDependencyConfignamer
    
    var healthChecks: js.Array[Any]
    
    var platforms: Dictname
  }
  object UserDependencyConfig {
    
    inline def apply(
      commands: js.Array[Command[`false`]],
      dependency: OmitDependencyConfignamer,
      healthChecks: js.Array[Any],
      platforms: Dictname
    ): UserDependencyConfig = {
      val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], dependency = dependency.asInstanceOf[js.Any], healthChecks = healthChecks.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserDependencyConfig]
    }
    
    extension [Self <: UserDependencyConfig](x: Self) {
      
      inline def setCommands(value: js.Array[Command[`false`]]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsVarargs(value: Command[`false`]*): Self = StObject.set(x, "commands", js.Array(value*))
      
      inline def setDependency(value: OmitDependencyConfignamer): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
      
      inline def setHealthChecks(value: js.Array[Any]): Self = StObject.set(x, "healthChecks", value.asInstanceOf[js.Any])
      
      inline def setHealthChecksVarargs(value: Any*): Self = StObject.set(x, "healthChecks", js.Array(value*))
      
      inline def setPlatforms(value: Dictname): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    }
  }
}
