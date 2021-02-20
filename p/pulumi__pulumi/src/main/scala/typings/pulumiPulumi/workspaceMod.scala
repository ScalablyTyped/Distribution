package typings.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.automationConfigMod.ConfigMap
import typings.pulumiPulumi.automationConfigMod.ConfigValue
import typings.pulumiPulumi.projectSettingsMod.ProjectSettings
import typings.pulumiPulumi.stackSettingsMod.StackSettings
import typings.std.Date
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspaceMod {
  
  @js.native
  trait PluginInfo extends StObject {
    
    var installTime: Date = js.native
    
    var kind: PluginKind = js.native
    
    var lastUsedTime: Date = js.native
    
    var name: String = js.native
    
    var path: String = js.native
    
    var serverURL: String = js.native
    
    var size: Double = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object PluginInfo {
    
    @scala.inline
    def apply(
      installTime: Date,
      kind: PluginKind,
      lastUsedTime: Date,
      name: String,
      path: String,
      serverURL: String,
      size: Double
    ): PluginInfo = {
      val __obj = js.Dynamic.literal(installTime = installTime.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lastUsedTime = lastUsedTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], serverURL = serverURL.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginInfo]
    }
    
    @scala.inline
    implicit class PluginInfoMutableBuilder[Self <: PluginInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstallTime(value: Date): Self = StObject.set(x, "installTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: PluginKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUsedTime(value: Date): Self = StObject.set(x, "lastUsedTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerURL(value: String): Self = StObject.set(x, "serverURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pulumiPulumi.pulumiPulumiStrings.analyzer
    - typings.pulumiPulumi.pulumiPulumiStrings.language
    - typings.pulumiPulumi.pulumiPulumiStrings.resource
  */
  trait PluginKind extends StObject
  object PluginKind {
    
    @scala.inline
    def analyzer: typings.pulumiPulumi.pulumiPulumiStrings.analyzer = "analyzer".asInstanceOf[typings.pulumiPulumi.pulumiPulumiStrings.analyzer]
    
    @scala.inline
    def language: typings.pulumiPulumi.pulumiPulumiStrings.language = "language".asInstanceOf[typings.pulumiPulumi.pulumiPulumiStrings.language]
    
    @scala.inline
    def resource: typings.pulumiPulumi.pulumiPulumiStrings.resource = "resource".asInstanceOf[typings.pulumiPulumi.pulumiPulumiStrings.resource]
  }
  
  type PulumiFn = js.Function0[js.Promise[(Record[String, js.Any]) | Unit]]
  
  @js.native
  trait StackSummary extends StObject {
    
    var current: Boolean = js.native
    
    var lastUpdate: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var resourceCount: js.UndefOr[Double] = js.native
    
    var updateInProgress: Boolean = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object StackSummary {
    
    @scala.inline
    def apply(current: Boolean, name: String, updateInProgress: Boolean): StackSummary = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updateInProgress = updateInProgress.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackSummary]
    }
    
    @scala.inline
    implicit class StackSummaryMutableBuilder[Self <: StackSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUpdate(value: String): Self = StObject.set(x, "lastUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUpdateUndefined: Self = StObject.set(x, "lastUpdate", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceCount(value: Double): Self = StObject.set(x, "resourceCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceCountUndefined: Self = StObject.set(x, "resourceCount", js.undefined)
      
      @scala.inline
      def setUpdateInProgress(value: Boolean): Self = StObject.set(x, "updateInProgress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait WhoAmIResult extends StObject {
    
    var user: String = js.native
  }
  object WhoAmIResult {
    
    @scala.inline
    def apply(user: String): WhoAmIResult = {
      val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[WhoAmIResult]
    }
    
    @scala.inline
    implicit class WhoAmIResultMutableBuilder[Self <: WhoAmIResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Workspace extends StObject {
    
    /**
      * Creates and sets a new stack with the stack name, failing if one already exists.
      *
      * @param stackName The stack to create.
      */
    def createStack(stackName: String): js.Promise[Unit] = js.native
    
    /**
      * Environment values scoped to the current workspace. These will be supplied to every Pulumi command.
      */
    var envVars: StringDictionary[String] = js.native
    
    /**
      * Returns the config map for the specified stack name, scoped to the current Workspace.
      *
      * @param stackName The stack to read config from
      */
    def getAllConfig(stackName: String): js.Promise[ConfigMap] = js.native
    
    /**
      * Returns the value associated with the specified stack name and key,
      * scoped to the Workspace.
      *
      * @param stackName The stack to read config from
      * @param key The key to use for the config lookup
      */
    def getConfig(stackName: String, key: String): js.Promise[ConfigValue] = js.native
    
    /**
      * Installs a plugin in the Workspace, for example to use cloud providers like AWS or GCP.
      *
      * @param name the name of the plugin.
      * @param version the version of the plugin e.g. "v1.0.0".
      * @param kind the kind of plugin e.g. "resource"
      */
    def installPlugin(name: String, version: String): js.Promise[Unit] = js.native
    def installPlugin(name: String, version: String, kind: String): js.Promise[Unit] = js.native
    
    /**
      * Returns a list of all plugins installed in the Workspace.
      */
    def listPlugins(): js.Promise[js.Array[PluginInfo]] = js.native
    
    /**
      * Returns all Stacks created under the current Project.
      * This queries underlying backend and may return stacks not present in the Workspace (as Pulumi.<stack>.yaml files).
      */
    def listStacks(): js.Promise[js.Array[StackSummary]] = js.native
    
    /**
      * postCommandCallback is a hook executed after every command. Called with the stack name.
      * An extensibility point to perform workspace cleanup (CLI operations may create/modify a Pulumi.stack.yaml)
      * LocalWorkspace does not utilize this extensibility point.
      */
    def postCommandCallback(stackName: String): js.Promise[Unit] = js.native
    
    /**
      *  The inline program `PulumiFn` to be used for Preview/Update operations if any.
      *  If none is specified, the stack will refer to ProjectSettings for this information.
      */
    var program: js.UndefOr[PulumiFn] = js.native
    
    /**
      * Returns the settings object for the current project if any.
      */
    def projectSettings(): js.Promise[ProjectSettings] = js.native
    
    /**
      * The directory override for CLI metadata if set.
      * This customizes the location of $PULUMI_HOME where metadata is stored and plugins are installed.
      */
    val pulumiHome: js.UndefOr[String] = js.native
    
    /**
      * Gets and sets the config map used with the last update for Stack matching stack name.
      *
      * @param stackName The stack to refresh
      */
    def refreshConfig(stackName: String): js.Promise[ConfigMap] = js.native
    
    /**
      *
      * Removes all values in the provided key list for the specified stack name.
      *
      * @param stackName The stack to operate on
      * @param keys The list of keys to remove from the underlying config
      */
    def removeAllConfig(stackName: String, keys: js.Array[String]): js.Promise[Unit] = js.native
    
    /**
      * Removes the specified key-value pair on the provided stack name.
      *
      * @param stackName The stack to operate on
      * @param key The config key to remove
      */
    def removeConfig(stackName: String, key: String): js.Promise[Unit] = js.native
    
    /**
      * Removes a plugin from the Workspace matching the specified name and version.
      *
      * @param name the optional name of the plugin.
      * @param versionRange optional semver range to check when removing plugins matching the given name
      *  e.g. "1.0.0", ">1.0.0".
      * @param kind he kind of plugin e.g. "resource"
      */
    def removePlugin(): js.Promise[Unit] = js.native
    def removePlugin(name: js.UndefOr[scala.Nothing], versionRange: js.UndefOr[scala.Nothing], kind: String): js.Promise[Unit] = js.native
    def removePlugin(name: js.UndefOr[scala.Nothing], versionRange: String): js.Promise[Unit] = js.native
    def removePlugin(name: js.UndefOr[scala.Nothing], versionRange: String, kind: String): js.Promise[Unit] = js.native
    def removePlugin(name: String): js.Promise[Unit] = js.native
    def removePlugin(name: String, versionRange: js.UndefOr[scala.Nothing], kind: String): js.Promise[Unit] = js.native
    def removePlugin(name: String, versionRange: String): js.Promise[Unit] = js.native
    def removePlugin(name: String, versionRange: String, kind: String): js.Promise[Unit] = js.native
    
    /**
      * Deletes the stack and all associated configuration and history.
      *
      * @param stackName The stack to remove
      */
    def removeStack(stackName: String): js.Promise[Unit] = js.native
    
    /**
      * Overwrites the settings object in the current project.
      * There can only be a single project per workspace. Fails is new project name does not match old.
      *
      * @param settings The settings object to save.
      */
    def saveProjectSettings(settings: ProjectSettings): js.Promise[Unit] = js.native
    
    /**
      * overwrites the settings object for the stack matching the specified stack name.
      *
      * @param stackName The name of the stack to operate on.
      * @param settings The settings object to save.
      */
    def saveStackSettings(stackName: String, settings: StackSettings): js.Promise[Unit] = js.native
    
    /**
      * The secrets provider to use for encryption and decryption of stack secrets.
      * See: https://www.pulumi.com/docs/intro/concepts/config/#available-encryption-providers
      */
    val secretsProvider: js.UndefOr[String] = js.native
    
    /**
      * Selects and sets an existing stack matching the stack name, failing if none exists.
      *
      * @param stackName The stack to select.
      */
    def selectStack(stackName: String): js.Promise[Unit] = js.native
    
    /**
      * serializeArgsForOp is hook to provide additional args to every CLI commands before they are executed.
      * Provided with stack name,
      * returns a list of args to append to an invoked command ["--config=...", ]
      * LocalWorkspace does not utilize this extensibility point.
      */
    def serializeArgsForOp(stackName: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Sets all values in the provided config map for the specified stack name.
      *
      * @param stackName The stack to operate on
      * @param config The `ConfigMap` to upsert against the existing config.
      */
    def setAllConfig(stackName: String, config: ConfigMap): js.Promise[Unit] = js.native
    
    /**
      * Sets the specified key-value pair on the provided stack name.
      *
      * @param stackName The stack to operate on
      * @param key The config key to set
      * @param value The value to set
      */
    def setConfig(stackName: String, key: String, value: ConfigValue): js.Promise[Unit] = js.native
    
    /**
      * Returns a summary of the currently selected stack, if any.
      */
    def stack(): js.Promise[js.UndefOr[StackSummary]] = js.native
    
    /**
      * Returns the settings object for the stack matching the specified stack name if any.
      *
      * @param stackName The name of the stack.
      */
    def stackSettings(stackName: String): js.Promise[StackSettings] = js.native
    
    /**
      * Returns the currently authenticated user.
      */
    def whoAmI(): js.Promise[WhoAmIResult] = js.native
    
    /**
      * The working directory to run Pulumi CLI commands
      */
    val workDir: String = js.native
  }
}
