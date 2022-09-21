package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilPublicCompilerMod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HydrateResults extends StObject {
  
  var anchors: js.Array[HydrateAnchorElement]
  
  var buildId: String
  
  var components: js.Array[HydrateComponent]
  
  var diagnostics: js.Array[Diagnostic]
  
  var hash: String
  
  var host: String
  
  var hostname: String
  
  var href: String
  
  var html: String
  
  var httpStatus: Double
  
  var hydratedCount: Double
  
  var imgs: js.Array[HydrateImgElement]
  
  var pathname: String
  
  var port: String
  
  var scripts: js.Array[HydrateScriptElement]
  
  var search: String
  
  var staticData: js.Array[HydrateStaticData]
  
  var styles: js.Array[HydrateStyleElement]
  
  var title: String
  
  var url: String
}
object HydrateResults {
  
  inline def apply(
    anchors: js.Array[HydrateAnchorElement],
    buildId: String,
    components: js.Array[HydrateComponent],
    diagnostics: js.Array[Diagnostic],
    hash: String,
    host: String,
    hostname: String,
    href: String,
    html: String,
    httpStatus: Double,
    hydratedCount: Double,
    imgs: js.Array[HydrateImgElement],
    pathname: String,
    port: String,
    scripts: js.Array[HydrateScriptElement],
    search: String,
    staticData: js.Array[HydrateStaticData],
    styles: js.Array[HydrateStyleElement],
    title: String,
    url: String
  ): HydrateResults = {
    val __obj = js.Dynamic.literal(anchors = anchors.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], httpStatus = httpStatus.asInstanceOf[js.Any], hydratedCount = hydratedCount.asInstanceOf[js.Any], imgs = imgs.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], staticData = staticData.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HydrateResults]
  }
  
  extension [Self <: HydrateResults](x: Self) {
    
    inline def setAnchors(value: js.Array[HydrateAnchorElement]): Self = StObject.set(x, "anchors", value.asInstanceOf[js.Any])
    
    inline def setAnchorsVarargs(value: HydrateAnchorElement*): Self = StObject.set(x, "anchors", js.Array(value*))
    
    inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setComponents(value: js.Array[HydrateComponent]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsVarargs(value: HydrateComponent*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHttpStatus(value: Double): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
    
    inline def setHydratedCount(value: Double): Self = StObject.set(x, "hydratedCount", value.asInstanceOf[js.Any])
    
    inline def setImgs(value: js.Array[HydrateImgElement]): Self = StObject.set(x, "imgs", value.asInstanceOf[js.Any])
    
    inline def setImgsVarargs(value: HydrateImgElement*): Self = StObject.set(x, "imgs", js.Array(value*))
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setScripts(value: js.Array[HydrateScriptElement]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsVarargs(value: HydrateScriptElement*): Self = StObject.set(x, "scripts", js.Array(value*))
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setStaticData(value: js.Array[HydrateStaticData]): Self = StObject.set(x, "staticData", value.asInstanceOf[js.Any])
    
    inline def setStaticDataVarargs(value: HydrateStaticData*): Self = StObject.set(x, "staticData", js.Array(value*))
    
    inline def setStyles(value: js.Array[HydrateStyleElement]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: HydrateStyleElement*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
