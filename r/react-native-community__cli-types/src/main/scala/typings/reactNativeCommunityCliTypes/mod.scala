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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Command[IsDetached /* <: Boolean */] extends StObject {
    
    var description: js.UndefOr[String] = js.native
    
    var detached: js.UndefOr[IsDetached] = js.native
    
    var examples: js.UndefOr[js.Array[Cmd]] = js.native
    
    var func: CommandFunction[js.Object] | DetachedCommandFunction[js.Object] = js.native
    
    var name: String = js.native
    
    var options: js.UndefOr[
        js.Array[
          CommandOption[(js.Function1[/* ctx */ Config, OptionValue]) | js.Function0[OptionValue]]
        ]
      ] = js.native
    
    var pkg: js.UndefOr[Name] = js.native
  }
  object Command {
    
    @scala.inline
    def apply[IsDetached /* <: Boolean */](func: CommandFunction[js.Object] | DetachedCommandFunction[js.Object], name: String): Command[IsDetached] = {
      val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Command[IsDetached]]
    }
    
    @scala.inline
    implicit class CommandMutableBuilder[Self <: Command[_], IsDetached /* <: Boolean */] (val x: Self with Command[IsDetached]) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDetached(value: IsDetached): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      @scala.inline
      def setExamples(value: js.Array[Cmd]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
      
      @scala.inline
      def setExamplesVarargs(value: Cmd*): Self = StObject.set(x, "examples", js.Array(value :_*))
      
      @scala.inline
      def setFunc(value: CommandFunction[js.Object] | DetachedCommandFunction[js.Object]): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFuncFunction2(value: (/* argv */ js.Array[String], js.Object) => js.Promise[Unit] | Unit): Self = StObject.set(x, "func", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFuncFunction3(value: (/* argv */ js.Array[String], /* ctx */ Config, js.Object) => js.Promise[Unit] | Unit): Self = StObject.set(x, "func", js.Any.fromFunction3(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(
        value: js.Array[
              CommandOption[(js.Function1[/* ctx */ Config, OptionValue]) | js.Function0[OptionValue]]
            ]
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: (CommandOption[(js.Function1[/* ctx */ Config, OptionValue]) | js.Function0[OptionValue]])*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPkg(value: Name): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
    }
  }
  
  type CommandFunction[Args] = js.Function3[
    /* argv */ js.Array[String], 
    /* ctx */ Config, 
    /* args */ Args, 
    js.Promise[Unit] | Unit
  ]
  
  @js.native
  trait CommandOption[T] extends StObject {
    
    var default: js.UndefOr[OptionValue | T] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var parse: js.UndefOr[js.Function1[/* val */ String, _]] = js.native
  }
  object CommandOption {
    
    @scala.inline
    def apply[T](name: String): CommandOption[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandOption[T]]
    }
    
    @scala.inline
    implicit class CommandOptionMutableBuilder[Self <: CommandOption[_], T] (val x: Self with CommandOption[T]) extends AnyVal {
      
      @scala.inline
      def setDefault(value: OptionValue | T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParse(value: /* val */ String => _): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    }
  }
  
  @js.native
  trait Config extends IOSNativeModulesConfig {
    
    var assets: js.Array[String] = js.native
    
    var commands: js.Array[Command[`false`]] = js.native
    
    @JSName("dependencies")
    var dependencies_Config: StringDictionary[Dependency] = js.native
    
    var platforms: Dictname = js.native
    
    @JSName("project")
    var project_Config: ProjectConfig = js.native
    
    var root: String = js.native
  }
  object Config {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssets(value: js.Array[String]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetsVarargs(value: String*): Self = StObject.set(x, "assets", js.Array(value :_*))
      
      @scala.inline
      def setCommands(value: js.Array[Command[`false`]]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandsVarargs(value: Command[`false`]*): Self = StObject.set(x, "commands", js.Array(value :_*))
      
      @scala.inline
      def setDependencies(value: StringDictionary[Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatforms(value: Dictname): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProject(value: ProjectConfig): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dependency extends StObject {
    
    var assets: js.Array[String] = js.native
    
    var hooks: Postlink = js.native
    
    var name: String = js.native
    
    var params: js.Array[InquirerPrompt] = js.native
    
    var platforms: Dictkey = js.native
    
    var root: String = js.native
  }
  object Dependency {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class DependencyMutableBuilder[Self <: Dependency] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssets(value: js.Array[String]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetsVarargs(value: String*): Self = StObject.set(x, "assets", js.Array(value :_*))
      
      @scala.inline
      def setHooks(value: Postlink): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Array[InquirerPrompt]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsVarargs(value: InquirerPrompt*): Self = StObject.set(x, "params", js.Array(value :_*))
      
      @scala.inline
      def setPlatforms(value: Dictkey): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait ProjectConfig
    extends /* key */ StringDictionary[js.Any] {
    
    var android: js.UndefOr[AndroidProjectConfig] = js.native
    
    var ios: js.UndefOr[IOSProjectConfig] = js.native
  }
  object ProjectConfig {
    
    @scala.inline
    def apply(): ProjectConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectConfig]
    }
    
    @scala.inline
    implicit class ProjectConfigMutableBuilder[Self <: ProjectConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAndroid(value: AndroidProjectConfig): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      @scala.inline
      def setIos(value: IOSProjectConfig): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    }
  }
  
  /* Inlined std.Omit<@react-native-community/cli-types.@react-native-community/cli-types.Config, 'root'> & {  reactNativePath :string | void,   project :{  android :@react-native-community/cli-types.@react-native-community/cli-types/build/android.AndroidProjectParams | undefined,   ios :@react-native-community/cli-types.@react-native-community/cli-types/build/ios.IOSProjectParams | undefined, [key: string] : any}} */
  @js.native
  trait UserConfig extends StObject {
    
    var assets: js.Array[String] = js.native
    
    var commands: js.Array[Command[`false`]] = js.native
    
    var dependencies: StringDictionary[Dependency] = js.native
    
    var platforms: Dictname = js.native
    
    var project: ProjectConfig with Android = js.native
    
    var reactNativePath: String with (String | Unit) = js.native
  }
  object UserConfig {
    
    @scala.inline
    def apply(
      assets: js.Array[String],
      commands: js.Array[Command[`false`]],
      dependencies: StringDictionary[Dependency],
      platforms: Dictname,
      project: ProjectConfig with Android,
      reactNativePath: String with (String | Unit)
    ): UserConfig = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], reactNativePath = reactNativePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserConfig]
    }
    
    @scala.inline
    implicit class UserConfigMutableBuilder[Self <: UserConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssets(value: js.Array[String]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetsVarargs(value: String*): Self = StObject.set(x, "assets", js.Array(value :_*))
      
      @scala.inline
      def setCommands(value: js.Array[Command[`false`]]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandsVarargs(value: Command[`false`]*): Self = StObject.set(x, "commands", js.Array(value :_*))
      
      @scala.inline
      def setDependencies(value: StringDictionary[Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatforms(value: Dictname): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProject(value: ProjectConfig with Android): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReactNativePath(value: String with (String | Unit)): Self = StObject.set(x, "reactNativePath", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserDependencyConfig extends StObject {
    
    var commands: js.Array[Command[`false`]] = js.native
    
    var dependency: OmitDependencynameroot = js.native
    
    var platforms: Dictname = js.native
  }
  object UserDependencyConfig {
    
    @scala.inline
    def apply(commands: js.Array[Command[`false`]], dependency: OmitDependencynameroot, platforms: Dictname): UserDependencyConfig = {
      val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], dependency = dependency.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserDependencyConfig]
    }
    
    @scala.inline
    implicit class UserDependencyConfigMutableBuilder[Self <: UserDependencyConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommands(value: js.Array[Command[`false`]]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandsVarargs(value: Command[`false`]*): Self = StObject.set(x, "commands", js.Array(value :_*))
      
      @scala.inline
      def setDependency(value: OmitDependencynameroot): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatforms(value: Dictname): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    }
  }
}
