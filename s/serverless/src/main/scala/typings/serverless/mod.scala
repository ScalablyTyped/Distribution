package typings.serverless

import org.scalablytyped.runtime.StringDictionary
import typings.serverless.anon.DefineCustomProperties
import typings.serverless.anon.Log
import typings.serverless.anon.PopulateService
import typings.serverless.pluginsAwsProviderAwsProviderMod.Resources
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("serverless", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Serverless {
    def this(config: js.Object) = this()
    
    /* CompleteClass */
    var cli: Log = js.native
    
    /* CompleteClass */
    var config: Config = js.native
    
    /* CompleteClass */
    var configSchemaHandler: DefineCustomProperties = js.native
    
    /* CompleteClass */
    override def getProvider(name: String): typings.serverless.pluginsAwsProviderAwsProviderMod.^ = js.native
    
    /* CompleteClass */
    override def getVersion(): String = js.native
    
    /* CompleteClass */
    override def init(): js.Promise[Any] = js.native
    
    /* CompleteClass */
    var pluginManager: typings.serverless.classesPluginManagerMod.^ = js.native
    
    /* CompleteClass */
    var resources: Resources = js.native
    
    /* CompleteClass */
    override def run(): js.Promise[Any] = js.native
    
    /* CompleteClass */
    var serverlessDirPath: String = js.native
    
    /* CompleteClass */
    var service: typings.serverless.classesServiceMod.^ = js.native
    
    /* CompleteClass */
    override def setProvider(name: String, provider: typings.serverless.pluginsAwsProviderAwsProviderMod.^): Null = js.native
    
    /* CompleteClass */
    var utils: typings.serverless.classesUtilsMod.^ = js.native
    
    /* CompleteClass */
    var variables: PopulateService = js.native
    
    /* CompleteClass */
    var version: String = js.native
    
    /* CompleteClass */
    var yamlParser: typings.serverless.classesYamlParserMod.^ = js.native
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
  
  type Event = typings.serverless.pluginsAwsProviderAwsProviderMod.Event | js.Object
  
  trait FunctionDefinition extends StObject {
    
    @JSName("package")
    var _package: js.UndefOr[Package] = js.undefined
    
    var environment: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var events: js.Array[typings.serverless.pluginsAwsProviderAwsProviderMod.Event]
    
    var memorySize: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var reservedConcurrency: js.UndefOr[Double] = js.undefined
    
    var runtime: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object FunctionDefinition {
    
    inline def apply(events: js.Array[typings.serverless.pluginsAwsProviderAwsProviderMod.Event]): FunctionDefinition = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionDefinition]
    }
    
    extension [Self <: FunctionDefinition](x: Self) {
      
      inline def setEnvironment(value: StringDictionary[String]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setEvents(value: js.Array[typings.serverless.pluginsAwsProviderAwsProviderMod.Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: typings.serverless.pluginsAwsProviderAwsProviderMod.Event*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setMemorySize(value: Double): Self = StObject.set(x, "memorySize", value.asInstanceOf[js.Any])
      
      inline def setMemorySizeUndefined: Self = StObject.set(x, "memorySize", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setReservedConcurrency(value: Double): Self = StObject.set(x, "reservedConcurrency", value.asInstanceOf[js.Any])
      
      inline def setReservedConcurrencyUndefined: Self = StObject.set(x, "reservedConcurrency", js.undefined)
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def set_package(value: Package): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
      
      inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
    }
  }
  
  trait FunctionDefinitionHandler
    extends StObject
       with FunctionDefinition {
    
    var handler: String
  }
  object FunctionDefinitionHandler {
    
    inline def apply(events: js.Array[typings.serverless.pluginsAwsProviderAwsProviderMod.Event], handler: String): FunctionDefinitionHandler = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionDefinitionHandler]
    }
    
    extension [Self <: FunctionDefinitionHandler](x: Self) {
      
      inline def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    }
  }
  
  trait FunctionDefinitionImage
    extends StObject
       with FunctionDefinition {
    
    var image: String
  }
  object FunctionDefinitionImage {
    
    inline def apply(events: js.Array[typings.serverless.pluginsAwsProviderAwsProviderMod.Event], image: String): FunctionDefinitionImage = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionDefinitionImage]
    }
    
    extension [Self <: FunctionDefinitionImage](x: Self) {
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogOptions extends StObject {
    
    var bold: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var entity: js.UndefOr[String] = js.undefined
    
    var underline: js.UndefOr[Boolean] = js.undefined
  }
  object LogOptions {
    
    inline def apply(): LogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogOptions]
    }
    
    extension [Self <: LogOptions](x: Self) {
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
      
      inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var extraServicePath: js.UndefOr[String] = js.undefined
    
    var function: js.UndefOr[String] = js.undefined
    
    var noDeploy: js.UndefOr[Boolean] = js.undefined
    
    var region: String | Null
    
    var stage: String | Null
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
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
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  trait Package extends StObject {
    
    var artifact: js.UndefOr[String] = js.undefined
    
    /** @deprecated use `patterns` instead */
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    /** @deprecated use `patterns` instead */
    var include: js.UndefOr[js.Array[String]] = js.undefined
    
    var individually: js.UndefOr[Boolean] = js.undefined
    
    var patterns: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Package {
    
    inline def apply(): Package = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Package]
    }
    
    extension [Self <: Package](x: Self) {
      
      inline def setArtifact(value: String): Self = StObject.set(x, "artifact", value.asInstanceOf[js.Any])
      
      inline def setArtifactUndefined: Self = StObject.set(x, "artifact", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setIndividually(value: Boolean): Self = StObject.set(x, "individually", value.asInstanceOf[js.Any])
      
      inline def setIndividuallyUndefined: Self = StObject.set(x, "individually", js.undefined)
      
      inline def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
      
      inline def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value*))
    }
  }
  
  trait Serverless extends StObject {
    
    var cli: Log
    
    var config: Config
    
    var configSchemaHandler: DefineCustomProperties
    
    def getProvider(name: String): typings.serverless.pluginsAwsProviderAwsProviderMod.^
    
    def getVersion(): String
    
    def init(): js.Promise[Any]
    
    var pluginManager: typings.serverless.classesPluginManagerMod.^
    
    var resources: Resources
    
    def run(): js.Promise[Any]
    
    var serverlessDirPath: String
    
    var service: typings.serverless.classesServiceMod.^
    
    def setProvider(name: String, provider: typings.serverless.pluginsAwsProviderAwsProviderMod.^): Null
    
    var utils: typings.serverless.classesUtilsMod.^
    
    var variables: PopulateService
    
    var version: String
    
    var yamlParser: typings.serverless.classesYamlParserMod.^
  }
  object Serverless {
    
    inline def apply(
      cli: Log,
      config: Config,
      configSchemaHandler: DefineCustomProperties,
      getProvider: String => typings.serverless.pluginsAwsProviderAwsProviderMod.^,
      getVersion: () => String,
      init: () => js.Promise[Any],
      pluginManager: typings.serverless.classesPluginManagerMod.^,
      resources: Resources,
      run: () => js.Promise[Any],
      serverlessDirPath: String,
      service: typings.serverless.classesServiceMod.^,
      setProvider: (String, typings.serverless.pluginsAwsProviderAwsProviderMod.^) => Null,
      utils: typings.serverless.classesUtilsMod.^,
      variables: PopulateService,
      version: String,
      yamlParser: typings.serverless.classesYamlParserMod.^
    ): Serverless = {
      val __obj = js.Dynamic.literal(cli = cli.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], configSchemaHandler = configSchemaHandler.asInstanceOf[js.Any], getProvider = js.Any.fromFunction1(getProvider), getVersion = js.Any.fromFunction0(getVersion), init = js.Any.fromFunction0(init), pluginManager = pluginManager.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), serverlessDirPath = serverlessDirPath.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], setProvider = js.Any.fromFunction2(setProvider), utils = utils.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], yamlParser = yamlParser.asInstanceOf[js.Any])
      __obj.asInstanceOf[Serverless]
    }
    
    extension [Self <: Serverless](x: Self) {
      
      inline def setCli(value: Log): Self = StObject.set(x, "cli", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigSchemaHandler(value: DefineCustomProperties): Self = StObject.set(x, "configSchemaHandler", value.asInstanceOf[js.Any])
      
      inline def setGetProvider(value: String => typings.serverless.pluginsAwsProviderAwsProviderMod.^): Self = StObject.set(x, "getProvider", js.Any.fromFunction1(value))
      
      inline def setGetVersion(value: () => String): Self = StObject.set(x, "getVersion", js.Any.fromFunction0(value))
      
      inline def setInit(value: () => js.Promise[Any]): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setPluginManager(value: typings.serverless.classesPluginManagerMod.^): Self = StObject.set(x, "pluginManager", value.asInstanceOf[js.Any])
      
      inline def setResources(value: Resources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setRun(value: () => js.Promise[Any]): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
      
      inline def setServerlessDirPath(value: String): Self = StObject.set(x, "serverlessDirPath", value.asInstanceOf[js.Any])
      
      inline def setService(value: typings.serverless.classesServiceMod.^): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setSetProvider(value: (String, typings.serverless.pluginsAwsProviderAwsProviderMod.^) => Null): Self = StObject.set(x, "setProvider", js.Any.fromFunction2(value))
      
      inline def setUtils(value: typings.serverless.classesUtilsMod.^): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
      
      inline def setVariables(value: PopulateService): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setYamlParser(value: typings.serverless.classesYamlParserMod.^): Self = StObject.set(x, "yamlParser", value.asInstanceOf[js.Any])
    }
  }
}
