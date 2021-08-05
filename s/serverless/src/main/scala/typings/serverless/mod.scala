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
    
    inline def apply(servicePath: String): Config = {
      val __obj = js.Dynamic.literal(servicePath = servicePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setServicePath(value: String): Self = StObject.set(x, "servicePath", value.asInstanceOf[js.Any])
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
    
    inline def apply(_package: Package, events: js.Array[Event], handler: String, name: String): FunctionDefinition = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionDefinition]
    }
    
    extension [Self <: FunctionDefinition](x: Self) {
      
      inline def setEnvironment(value: StringDictionary[String]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      inline def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setMemorySize(value: Double): Self = StObject.set(x, "memorySize", value.asInstanceOf[js.Any])
      
      inline def setMemorySizeUndefined: Self = StObject.set(x, "memorySize", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def set_package(value: Package): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal(region = null, stage = null)
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExtraServicePath(value: String): Self = StObject.set(x, "extraServicePath", value.asInstanceOf[js.Any])
      
      inline def setExtraServicePathUndefined: Self = StObject.set(x, "extraServicePath", js.undefined)
      
      inline def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      inline def setNoDeploy(value: Boolean): Self = StObject.set(x, "noDeploy", value.asInstanceOf[js.Any])
      
      inline def setNoDeployUndefined: Self = StObject.set(x, "noDeploy", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionNull: Self = StObject.set(x, "region", null)
      
      inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      inline def setStageNull: Self = StObject.set(x, "stage", null)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  trait Package extends StObject {
    
    var artifact: js.UndefOr[String] = js.undefined
    
    var exclude: js.Array[String]
    
    var include: js.Array[String]
    
    var individually: js.UndefOr[Boolean] = js.undefined
  }
  object Package {
    
    inline def apply(exclude: js.Array[String], include: js.Array[String]): Package = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any])
      __obj.asInstanceOf[Package]
    }
    
    extension [Self <: Package](x: Self) {
      
      inline def setArtifact(value: String): Self = StObject.set(x, "artifact", value.asInstanceOf[js.Any])
      
      inline def setArtifactUndefined: Self = StObject.set(x, "artifact", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      inline def setIndividually(value: Boolean): Self = StObject.set(x, "individually", value.asInstanceOf[js.Any])
      
      inline def setIndividuallyUndefined: Self = StObject.set(x, "individually", js.undefined)
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
    
    inline def apply(
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
    
    extension [Self <: Serverless](x: Self) {
      
      inline def setCli(value: Log): Self = StObject.set(x, "cli", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setGetProvider(value: String => typings.serverless.awsProviderMod.^): Self = StObject.set(x, "getProvider", js.Any.fromFunction1(value))
      
      inline def setGetVersion(value: () => String): Self = StObject.set(x, "getVersion", js.Any.fromFunction0(value))
      
      inline def setInit(value: () => js.Promise[js.Any]): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setPluginManager(value: typings.serverless.pluginManagerMod.^): Self = StObject.set(x, "pluginManager", value.asInstanceOf[js.Any])
      
      inline def setResources(value: Resources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setRun(value: () => js.Promise[js.Any]): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
      
      inline def setServerlessDirPath(value: String): Self = StObject.set(x, "serverlessDirPath", value.asInstanceOf[js.Any])
      
      inline def setService(value: typings.serverless.serviceMod.^): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setSetProvider(value: (String, typings.serverless.awsProviderMod.^) => Null): Self = StObject.set(x, "setProvider", js.Any.fromFunction2(value))
      
      inline def setUtils(value: typings.serverless.utilsMod.^): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
      
      inline def setVariables(value: PopulateService): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setYamlParser(value: typings.serverless.yamlParserMod.^): Self = StObject.set(x, "yamlParser", value.asInstanceOf[js.Any])
    }
  }
}
