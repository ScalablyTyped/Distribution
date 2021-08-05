package typings.reactNativeCommunityCliTypes

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCommunityCliTypes.androidMod.AndroidProjectConfig
import typings.reactNativeCommunityCliTypes.anon.Android
import typings.reactNativeCommunityCliTypes.anon.Cmd
import typings.reactNativeCommunityCliTypes.anon.CopyAssets
import typings.reactNativeCommunityCliTypes.anon.Dictkey
import typings.reactNativeCommunityCliTypes.anon.Dictname
import typings.reactNativeCommunityCliTypes.anon.Name
import typings.reactNativeCommunityCliTypes.anon.OmitDependencynameroot
import typings.reactNativeCommunityCliTypes.anon.Postlink
import typings.reactNativeCommunityCliTypes.iosMod.IOSNativeModulesConfig
import typings.reactNativeCommunityCliTypes.iosMod.IOSProjectConfig
import typings.reactNativeCommunityCliTypes.reactNativeCommunityCliTypesBooleans.`false`
import typings.reactNativeCommunityCliTypes.reactNativeCommunityCliTypesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait Command[IsDetached /* <: Boolean */] extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var detached: js.UndefOr[IsDetached] = js.undefined
    
    var examples: js.UndefOr[js.Array[Cmd]] = js.undefined
    
    var func: CommandFunction[js.Object] | DetachedCommandFunction[js.Object]
    
    var name: String
    
    var options: js.UndefOr[
        js.Array[
          CommandOption[(js.Function1[/* ctx */ Config, OptionValue]) | js.Function0[OptionValue]]
        ]
      ] = js.undefined
    
    var pkg: js.UndefOr[Name] = js.undefined
  }
  object Command {
    
    inline def apply[IsDetached /* <: Boolean */](func: CommandFunction[js.Object] | DetachedCommandFunction[js.Object], name: String): Command[IsDetached] = {
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
      
      inline def setExamplesVarargs(value: Cmd*): Self = StObject.set(x, "examples", js.Array(value :_*))
      
      inline def setFunc(value: CommandFunction[js.Object] | DetachedCommandFunction[js.Object]): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
      
      inline def setFuncFunction2(value: (/* argv */ js.Array[String], js.Object) => js.Promise[Unit] | Unit): Self = StObject.set(x, "func", js.Any.fromFunction2(value))
      
      inline def setFuncFunction3(value: (/* argv */ js.Array[String], /* ctx */ Config, js.Object) => js.Promise[Unit] | Unit): Self = StObject.set(x, "func", js.Any.fromFunction3(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(
        value: js.Array[
              CommandOption[(js.Function1[/* ctx */ Config, OptionValue]) | js.Function0[OptionValue]]
            ]
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: (CommandOption[(js.Function1[/* ctx */ Config, OptionValue]) | js.Function0[OptionValue]])*): Self = StObject.set(x, "options", js.Array(value :_*))
      
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
    
    var parse: js.UndefOr[js.Function1[/* val */ String, js.Any]] = js.undefined
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
      
      inline def setParse(value: /* val */ String => js.Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    }
  }
  
  trait Config
    extends StObject
       with IOSNativeModulesConfig {
    
    var assets: js.Array[String]
    
    var commands: js.Array[Command[`false`]]
    
    @JSName("dependencies")
    var dependencies_Config: StringDictionary[Dependency]
    
    var platforms: Dictname
    
    @JSName("project")
    var project_Config: ProjectConfig
    
    var root: String
  }
  object Config {
    
    inline def apply(
      assets: js.Array[String],
      commands: js.Array[Command[`false`]],
      dependencies: StringDictionary[Dependency],
      platforms: Dictname,
      project: ProjectConfig,
      reactNativePath: String,
      root: String
    ): Config = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], reactNativePath = reactNativePath.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAssets(value: js.Array[String]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsVarargs(value: String*): Self = StObject.set(x, "assets", js.Array(value :_*))
      
      inline def setCommands(value: js.Array[Command[`false`]]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsVarargs(value: Command[`false`]*): Self = StObject.set(x, "commands", js.Array(value :_*))
      
      inline def setDependencies(value: StringDictionary[Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setPlatforms(value: Dictname): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      inline def setProject(value: ProjectConfig): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dependency extends StObject {
    
    var assets: js.Array[String]
    
    var hooks: Postlink
    
    var name: String
    
    var params: js.Array[InquirerPrompt]
    
    var platforms: Dictkey
    
    var root: String
  }
  object Dependency {
    
    inline def apply(
      assets: js.Array[String],
      hooks: Postlink,
      name: String,
      params: js.Array[InquirerPrompt],
      platforms: Dictkey,
      root: String
    ): Dependency = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dependency]
    }
    
    extension [Self <: Dependency](x: Self) {
      
      inline def setAssets(value: js.Array[String]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsVarargs(value: String*): Self = StObject.set(x, "assets", js.Array(value :_*))
      
      inline def setHooks(value: Postlink): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Array[InquirerPrompt]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsVarargs(value: InquirerPrompt*): Self = StObject.set(x, "params", js.Array(value :_*))
      
      inline def setPlatforms(value: Dictkey): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  type DetachedCommand = Command[`true`]
  
  type DetachedCommandFunction[Args] = js.Function2[/* argv */ js.Array[String], /* args */ Args, js.Promise[Unit] | Unit]
  
  type InquirerPrompt = js.Any
  
  type OptionValue = String | Boolean | Double
  
  @js.native
  trait PlatformConfig[ProjectConfig, ProjectParams, DependencyConfig, DependencyParams] extends StObject {
    
    def dependencyConfig(dependency: String, params: DependencyParams): DependencyConfig | Unit = js.native
    
    def linkConfig(): CopyAssets[ProjectConfig, DependencyConfig] = js.native
    
    var npmPackageName: js.UndefOr[String] = js.native
    
    def projectConfig(projectRoot: String, projectParams: ProjectParams): ProjectConfig | Unit = js.native
    def projectConfig(projectRoot: String, projectParams: Unit): ProjectConfig | Unit = js.native
  }
  
  trait ProjectConfig
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var android: js.UndefOr[AndroidProjectConfig] = js.undefined
    
    var ios: js.UndefOr[IOSProjectConfig] = js.undefined
  }
  object ProjectConfig {
    
    inline def apply(): ProjectConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectConfig]
    }
    
    extension [Self <: ProjectConfig](x: Self) {
      
      inline def setAndroid(value: AndroidProjectConfig): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      inline def setIos(value: IOSProjectConfig): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    }
  }
  
  /* Inlined std.Omit<@react-native-community/cli-types.@react-native-community/cli-types.Config, 'root'> & {  reactNativePath :string | void,   project :{  android :@react-native-community/cli-types.@react-native-community/cli-types/build/android.AndroidProjectParams | undefined,   ios :@react-native-community/cli-types.@react-native-community/cli-types/build/ios.IOSProjectParams | undefined, [key: string] : any}} */
  trait UserConfig extends StObject {
    
    var assets: js.Array[String]
    
    var commands: js.Array[Command[`false`]]
    
    var dependencies: StringDictionary[Dependency]
    
    var platforms: Dictname
    
    var project: ProjectConfig & Android
    
    var reactNativePath: String & (String | Unit)
  }
  object UserConfig {
    
    inline def apply(
      assets: js.Array[String],
      commands: js.Array[Command[`false`]],
      dependencies: StringDictionary[Dependency],
      platforms: Dictname,
      project: ProjectConfig & Android,
      reactNativePath: String & (String | Unit)
    ): UserConfig = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], reactNativePath = reactNativePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserConfig]
    }
    
    extension [Self <: UserConfig](x: Self) {
      
      inline def setAssets(value: js.Array[String]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsVarargs(value: String*): Self = StObject.set(x, "assets", js.Array(value :_*))
      
      inline def setCommands(value: js.Array[Command[`false`]]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsVarargs(value: Command[`false`]*): Self = StObject.set(x, "commands", js.Array(value :_*))
      
      inline def setDependencies(value: StringDictionary[Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setPlatforms(value: Dictname): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      inline def setProject(value: ProjectConfig & Android): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setReactNativePath(value: String & (String | Unit)): Self = StObject.set(x, "reactNativePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserDependencyConfig extends StObject {
    
    var commands: js.Array[Command[`false`]]
    
    var dependency: OmitDependencynameroot
    
    var platforms: Dictname
  }
  object UserDependencyConfig {
    
    inline def apply(commands: js.Array[Command[`false`]], dependency: OmitDependencynameroot, platforms: Dictname): UserDependencyConfig = {
      val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], dependency = dependency.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserDependencyConfig]
    }
    
    extension [Self <: UserDependencyConfig](x: Self) {
      
      inline def setCommands(value: js.Array[Command[`false`]]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsVarargs(value: Command[`false`]*): Self = StObject.set(x, "commands", js.Array(value :_*))
      
      inline def setDependency(value: OmitDependencynameroot): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
      
      inline def setPlatforms(value: Dictname): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    }
  }
}
