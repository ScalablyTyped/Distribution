package typings.stencilCore.stencilPrivateMod

import typings.std.Set
import typings.stencilCore.stencilPublicCompilerMod.Config
import typings.stencilCore.stencilPublicCompilerMod.Diagnostic
import typings.stencilCore.stencilPublicCompilerMod.LoggerLineUpdater
import typings.stencilCore.stencilPublicCompilerMod.OutputTargetWww
import typings.stencilCore.stencilPublicCompilerMod.PrerenderConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrerenderManager extends StObject {
  
  var componentGraphPath: String
  
  var config: Config
  
  var devServerHostUrl: String
  
  var diagnostics: js.Array[Diagnostic]
  
  var hydrateAppFilePath: String
  
  var isDebug: Boolean
  
  var logCount: Double
  
  var maxConcurrency: Double
  
  var outputTarget: OutputTargetWww
  
  var prerenderConfig: PrerenderConfig
  
  var prerenderConfigPath: String
  
  def prerenderUrlWorker(prerenderRequest: PrerenderUrlRequest): js.Promise[PrerenderUrlResults]
  
  var progressLogger: js.UndefOr[LoggerLineUpdater] = js.undefined
  
  var resolve: js.Function
  
  var staticSite: Boolean
  
  var templateId: String
  
  var urlsCompleted: Set[String]
  
  var urlsPending: Set[String]
  
  var urlsProcessing: Set[String]
}
object PrerenderManager {
  
  inline def apply(
    componentGraphPath: String,
    config: Config,
    devServerHostUrl: String,
    diagnostics: js.Array[Diagnostic],
    hydrateAppFilePath: String,
    isDebug: Boolean,
    logCount: Double,
    maxConcurrency: Double,
    outputTarget: OutputTargetWww,
    prerenderConfig: PrerenderConfig,
    prerenderConfigPath: String,
    prerenderUrlWorker: PrerenderUrlRequest => js.Promise[PrerenderUrlResults],
    resolve: js.Function,
    staticSite: Boolean,
    templateId: String,
    urlsCompleted: Set[String],
    urlsPending: Set[String],
    urlsProcessing: Set[String]
  ): PrerenderManager = {
    val __obj = js.Dynamic.literal(componentGraphPath = componentGraphPath.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], devServerHostUrl = devServerHostUrl.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], hydrateAppFilePath = hydrateAppFilePath.asInstanceOf[js.Any], isDebug = isDebug.asInstanceOf[js.Any], logCount = logCount.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], outputTarget = outputTarget.asInstanceOf[js.Any], prerenderConfig = prerenderConfig.asInstanceOf[js.Any], prerenderConfigPath = prerenderConfigPath.asInstanceOf[js.Any], prerenderUrlWorker = js.Any.fromFunction1(prerenderUrlWorker), resolve = resolve.asInstanceOf[js.Any], staticSite = staticSite.asInstanceOf[js.Any], templateId = templateId.asInstanceOf[js.Any], urlsCompleted = urlsCompleted.asInstanceOf[js.Any], urlsPending = urlsPending.asInstanceOf[js.Any], urlsProcessing = urlsProcessing.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrerenderManager]
  }
  
  extension [Self <: PrerenderManager](x: Self) {
    
    inline def setComponentGraphPath(value: String): Self = StObject.set(x, "componentGraphPath", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDevServerHostUrl(value: String): Self = StObject.set(x, "devServerHostUrl", value.asInstanceOf[js.Any])
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setHydrateAppFilePath(value: String): Self = StObject.set(x, "hydrateAppFilePath", value.asInstanceOf[js.Any])
    
    inline def setIsDebug(value: Boolean): Self = StObject.set(x, "isDebug", value.asInstanceOf[js.Any])
    
    inline def setLogCount(value: Double): Self = StObject.set(x, "logCount", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrency(value: Double): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setOutputTarget(value: OutputTargetWww): Self = StObject.set(x, "outputTarget", value.asInstanceOf[js.Any])
    
    inline def setPrerenderConfig(value: PrerenderConfig): Self = StObject.set(x, "prerenderConfig", value.asInstanceOf[js.Any])
    
    inline def setPrerenderConfigPath(value: String): Self = StObject.set(x, "prerenderConfigPath", value.asInstanceOf[js.Any])
    
    inline def setPrerenderUrlWorker(value: PrerenderUrlRequest => js.Promise[PrerenderUrlResults]): Self = StObject.set(x, "prerenderUrlWorker", js.Any.fromFunction1(value))
    
    inline def setProgressLogger(value: LoggerLineUpdater): Self = StObject.set(x, "progressLogger", value.asInstanceOf[js.Any])
    
    inline def setProgressLoggerUndefined: Self = StObject.set(x, "progressLogger", js.undefined)
    
    inline def setResolve(value: js.Function): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setStaticSite(value: Boolean): Self = StObject.set(x, "staticSite", value.asInstanceOf[js.Any])
    
    inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setUrlsCompleted(value: Set[String]): Self = StObject.set(x, "urlsCompleted", value.asInstanceOf[js.Any])
    
    inline def setUrlsPending(value: Set[String]): Self = StObject.set(x, "urlsPending", value.asInstanceOf[js.Any])
    
    inline def setUrlsProcessing(value: Set[String]): Self = StObject.set(x, "urlsProcessing", value.asInstanceOf[js.Any])
  }
}
