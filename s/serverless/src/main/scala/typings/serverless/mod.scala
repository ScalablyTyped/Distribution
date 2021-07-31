package typings.serverless

import org.scalablytyped.runtime.StringDictionary
import typings.serverless.anon.Log
import typings.serverless.anon.PopulateService
import typings.serverless.awsProviderMod.Resources
import typings.serverless.validateMod.ApiGatewayEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("serverless", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Serverless {
    def this(config: js.Object) = this()
    
    /* CompleteClass */
    var cli: Log = js.native
    
    /* CompleteClass */
    var config: Config = js.native
    
    /* CompleteClass */
    override def getProvider(name: String): typings.serverless.awsProviderMod.^ = js.native
    
    /* CompleteClass */
    override def getVersion(): String = js.native
    
    /* CompleteClass */
    override def init(): js.Promise[js.Any] = js.native
    
    /* CompleteClass */
    var pluginManager: typings.serverless.pluginManagerMod.^ = js.native
    
    /* CompleteClass */
    var resources: Resources = js.native
    
    /* CompleteClass */
    override def run(): js.Promise[js.Any] = js.native
    
    /* CompleteClass */
    var serverlessDirPath: String = js.native
    
    /* CompleteClass */
    var service: typings.serverless.serviceMod.^ = js.native
    
    /* CompleteClass */
    override def setProvider(name: String, provider: typings.serverless.awsProviderMod.^): Null = js.native
    
    /* CompleteClass */
    var utils: typings.serverless.utilsMod.^ = js.native
    
    /* CompleteClass */
    var variables: PopulateService = js.native
    
    /* CompleteClass */
    var version: String = js.native
    
    /* CompleteClass */
    var yamlParser: typings.serverless.yamlParserMod.^ = js.native
  }
  
  trait Config extends StObject {
    
    var servicePath: String
  }
  object Config {
    
    @scala.inline
    def apply(servicePath: String): Config = {
      val __obj = js.Dynamic.literal(servicePath = servicePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setServicePath(value: String): Self = StObject.set(x, "servicePath", value.asInstanceOf[js.Any])
    }
  }
  
  // Other events than ApiGatewayEvent are available
  type Event = ApiGatewayEvent | js.Object
  
  trait FunctionDefinition extends StObject {
    
    @JSName("package")
    var _package: Package
    
    var environment: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var events: js.Array[Event]
    
    var handler: String
    
    var memorySize: js.UndefOr[Double] = js.undefined
    
    var name: String
    
    var runtime: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object FunctionDefinition {
    
    @scala.inline
    def apply(_package: Package, events: js.Array[Event], handler: String, name: String): FunctionDefinition = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionDefinition]
    }
    
    @scala.inline
    implicit class FunctionDefinitionMutableBuilder[Self <: FunctionDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnvironment(value: StringDictionary[String]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      @scala.inline
      def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemorySize(value: Double): Self = StObject.set(x, "memorySize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemorySizeUndefined: Self = StObject.set(x, "memorySize", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def set_package(value: Package): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var extraServicePath: js.UndefOr[String] = js.undefined
    
    var function: js.UndefOr[String] = js.undefined
    
    var noDeploy: js.UndefOr[Boolean] = js.undefined
    
    var region: String | Null
    
    var stage: String | Null
    
    var watch: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal(region = null, stage = null)
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraServicePath(value: String): Self = StObject.set(x, "extraServicePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraServicePathUndefined: Self = StObject.set(x, "extraServicePath", js.undefined)
      
      @scala.inline
      def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      @scala.inline
      def setNoDeploy(value: Boolean): Self = StObject.set(x, "noDeploy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDeployUndefined: Self = StObject.set(x, "noDeploy", js.undefined)
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionNull: Self = StObject.set(x, "region", null)
      
      @scala.inline
      def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageNull: Self = StObject.set(x, "stage", null)
      
      @scala.inline
      def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  trait Package extends StObject {
    
    var artifact: js.UndefOr[String] = js.undefined
    
    var exclude: js.Array[String]
    
    var include: js.Array[String]
    
    var individually: js.UndefOr[Boolean] = js.undefined
  }
  object Package {
    
    @scala.inline
    def apply(exclude: js.Array[String], include: js.Array[String]): Package = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any])
      __obj.asInstanceOf[Package]
    }
    
    @scala.inline
    implicit class PackageMutableBuilder[Self <: Package] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArtifact(value: String): Self = StObject.set(x, "artifact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtifactUndefined: Self = StObject.set(x, "artifact", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setIndividually(value: Boolean): Self = StObject.set(x, "individually", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndividuallyUndefined: Self = StObject.set(x, "individually", js.undefined)
    }
  }
  
  trait Serverless extends StObject {
    
    var cli: Log
    
    var config: Config
    
    def getProvider(name: String): typings.serverless.awsProviderMod.^
    
    def getVersion(): String
    
    def init(): js.Promise[js.Any]
    
    var pluginManager: typings.serverless.pluginManagerMod.^
    
    var resources: Resources
    
    def run(): js.Promise[js.Any]
    
    var serverlessDirPath: String
    
    var service: typings.serverless.serviceMod.^
    
    def setProvider(name: String, provider: typings.serverless.awsProviderMod.^): Null
    
    var utils: typings.serverless.utilsMod.^
    
    var variables: PopulateService
    
    var version: String
    
    var yamlParser: typings.serverless.yamlParserMod.^
  }
  object Serverless {
    
    @scala.inline
    def apply(
      cli: Log,
      config: Config,
      getProvider: String => typings.serverless.awsProviderMod.^,
      getVersion: () => String,
      init: () => js.Promise[js.Any],
      pluginManager: typings.serverless.pluginManagerMod.^,
      resources: Resources,
      run: () => js.Promise[js.Any],
      serverlessDirPath: String,
      service: typings.serverless.serviceMod.^,
      setProvider: (String, typings.serverless.awsProviderMod.^) => Null,
      utils: typings.serverless.utilsMod.^,
      variables: PopulateService,
      version: String,
      yamlParser: typings.serverless.yamlParserMod.^
    ): Serverless = {
      val __obj = js.Dynamic.literal(cli = cli.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], getProvider = js.Any.fromFunction1(getProvider), getVersion = js.Any.fromFunction0(getVersion), init = js.Any.fromFunction0(init), pluginManager = pluginManager.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), serverlessDirPath = serverlessDirPath.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], setProvider = js.Any.fromFunction2(setProvider), utils = utils.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], yamlParser = yamlParser.asInstanceOf[js.Any])
      __obj.asInstanceOf[Serverless]
    }
    
    @scala.inline
    implicit class ServerlessMutableBuilder[Self <: Serverless] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCli(value: Log): Self = StObject.set(x, "cli", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetProvider(value: String => typings.serverless.awsProviderMod.^): Self = StObject.set(x, "getProvider", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetVersion(value: () => String): Self = StObject.set(x, "getVersion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInit(value: () => js.Promise[js.Any]): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPluginManager(value: typings.serverless.pluginManagerMod.^): Self = StObject.set(x, "pluginManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResources(value: Resources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRun(value: () => js.Promise[js.Any]): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
      
      @scala.inline
      def setServerlessDirPath(value: String): Self = StObject.set(x, "serverlessDirPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setService(value: typings.serverless.serviceMod.^): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetProvider(value: (String, typings.serverless.awsProviderMod.^) => Null): Self = StObject.set(x, "setProvider", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUtils(value: typings.serverless.utilsMod.^): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariables(value: PopulateService): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYamlParser(value: typings.serverless.yamlParserMod.^): Self = StObject.set(x, "yamlParser", value.asInstanceOf[js.Any])
    }
  }
}
