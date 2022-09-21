package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.JQuery
import typings.semanticUiEmbed.SemanticUI.Embed.ClassNameSettings
import typings.semanticUiEmbed.SemanticUI.Embed.ErrorSettings
import typings.semanticUiEmbed.SemanticUI.Embed.MetadataSettings
import typings.semanticUiEmbed.SemanticUI.Embed.ParametersSettings
import typings.semanticUiEmbed.SemanticUI.Embed.SelectorSettings
import typings.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings
import typings.semanticUiEmbed.SemanticUI.EmbedSettings.Param
import typings.semanticUiEmbed.semanticUiEmbedBooleans.`false`
import typings.semanticUiEmbed.semanticUiEmbedStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, 'name'> & std.Partial<std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, keyof semantic-ui-embed.SemanticUI.EmbedSettings._Impl>> */
trait PickImplnamePartialPickIm
  extends StObject
     with Param {
  
  var autoplay: js.UndefOr[auto | Boolean] = js.undefined
  
  var brandedUI: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var error: js.UndefOr[ErrorSettings] = js.undefined
  
  var hd: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[`false` | String] = js.undefined
  
  var id: js.UndefOr[`false` | String] = js.undefined
  
  var metadata: js.UndefOr[MetadataSettings] = js.undefined
  
  var name: String & js.UndefOr[String]
  
  var namespace: js.UndefOr[String] = js.undefined
  
  var onCreate: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit]] = js.undefined
  
  var onDisplay: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  
  var onEmbed: js.UndefOr[
    js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings]
  ] = js.undefined
  
  var onPlaceholderDisplay: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  
  var parameters: js.UndefOr[`false` | ParametersSettings] = js.undefined
  
  var performance: js.UndefOr[Boolean] = js.undefined
  
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var source: js.UndefOr[`false` | String] = js.undefined
  
  var templates: js.UndefOr[TemplatesSettings] = js.undefined
  
  var url: js.UndefOr[`false` | String] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object PickImplnamePartialPickIm {
  
  inline def apply(name: String & js.UndefOr[String]): PickImplnamePartialPickIm = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnamePartialPickIm]
  }
  
  extension [Self <: PickImplnamePartialPickIm](x: Self) {
    
    inline def setAutoplay(value: auto | Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    inline def setBrandedUI(value: Boolean): Self = StObject.set(x, "brandedUI", value.asInstanceOf[js.Any])
    
    inline def setBrandedUIUndefined: Self = StObject.set(x, "brandedUI", js.undefined)
    
    inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setHd(value: Boolean): Self = StObject.set(x, "hd", value.asInstanceOf[js.Any])
    
    inline def setHdUndefined: Self = StObject.set(x, "hd", js.undefined)
    
    inline def setIcon(value: `false` | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setId(value: `false` | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String & js.UndefOr[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setOnCreate(value: js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit]): Self = StObject.set(x, "onCreate", value.asInstanceOf[js.Any])
    
    inline def setOnCreateUndefined: Self = StObject.set(x, "onCreate", js.undefined)
    
    inline def setOnDisplay(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onDisplay", value.asInstanceOf[js.Any])
    
    inline def setOnDisplayUndefined: Self = StObject.set(x, "onDisplay", js.undefined)
    
    inline def setOnEmbed(
      value: js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings]
    ): Self = StObject.set(x, "onEmbed", value.asInstanceOf[js.Any])
    
    inline def setOnEmbedUndefined: Self = StObject.set(x, "onEmbed", js.undefined)
    
    inline def setOnPlaceholderDisplay(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onPlaceholderDisplay", value.asInstanceOf[js.Any])
    
    inline def setOnPlaceholderDisplayUndefined: Self = StObject.set(x, "onPlaceholderDisplay", js.undefined)
    
    inline def setParameters(value: `false` | ParametersSettings): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setSource(value: `false` | String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTemplates(value: TemplatesSettings): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    inline def setUrl(value: `false` | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
