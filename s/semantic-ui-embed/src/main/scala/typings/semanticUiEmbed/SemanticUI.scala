package typings.semanticUiEmbed

import org.scalablytyped.runtime.StringDictionary
import typings.semanticUiEmbed.SemanticUI.Embed.ClassNameSettings
import typings.semanticUiEmbed.SemanticUI.Embed.ClassNameSettings.Param
import typings.semanticUiEmbed.SemanticUI.Embed.ErrorSettings
import typings.semanticUiEmbed.SemanticUI.Embed.MetadataSettings
import typings.semanticUiEmbed.SemanticUI.Embed.ParametersSettings
import typings.semanticUiEmbed.SemanticUI.Embed.ParametersSettings.Impl
import typings.semanticUiEmbed.SemanticUI.Embed.SelectorSettings
import typings.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings
import typings.semanticUiEmbed.semanticUiEmbedBooleans.`false`
import typings.semanticUiEmbed.semanticUiEmbedStrings.`get id`
import typings.semanticUiEmbed.semanticUiEmbedStrings.`get placeholder`
import typings.semanticUiEmbed.semanticUiEmbedStrings.`get sources`
import typings.semanticUiEmbed.semanticUiEmbedStrings.`get type`
import typings.semanticUiEmbed.semanticUiEmbedStrings.`get url`
import typings.semanticUiEmbed.semanticUiEmbedStrings.`has placeholder`
import typings.semanticUiEmbed.semanticUiEmbedStrings.auto
import typings.semanticUiEmbed.semanticUiEmbedStrings.change
import typings.semanticUiEmbed.semanticUiEmbedStrings.destroy
import typings.semanticUiEmbed.semanticUiEmbedStrings.hide
import typings.semanticUiEmbed.semanticUiEmbedStrings.reset
import typings.semanticUiEmbed.semanticUiEmbedStrings.setting
import typings.semanticUiEmbed.semanticUiEmbedStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Embed extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Returns current content id
      */
    def apply(behavior: `get id`): String = js.native
    /**
      * Returns placeholder image url
      */
    def apply(behavior: `get placeholder`): String = js.native
    /**
      * Returns source name
      */
    def apply(behavior: `get sources`): String = js.native
    /**
      * Returns source type
      */
    def apply(behavior: `get type`): String = js.native
    /**
      * Returns URL with all parameters added
      */
    def apply(behavior: `get url`): String = js.native
    /**
      * Returns whether embed content has placeholder
      */
    def apply(behavior: `has placeholder`): Boolean = js.native
    /**
      * Changes iframe to a new content source
      */
    def apply(behavior: change, source: String, id: String, url: String): JQuery = js.native
    /**
      * Destroys instance and removes all events
      */
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Hides embed content and shows placeholder content
      */
    def apply(behavior: hide): JQuery = js.native
    /**
      * Removes embed and shows placeholder content if available
      */
    def apply(behavior: reset): JQuery = js.native
    def apply(behavior: setting, value: EmbedSettings): JQuery = js.native
    /**
      * Shows embed content
      */
    def apply(behavior: show): JQuery = js.native
    def apply(settings: EmbedSettings): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-embed.SemanticUI.EmbedSettings */ String */](
      behavior: setting,
      name: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-embed.SemanticUI.EmbedSettings._Impl[K] */ js.Any
    ): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-embed.SemanticUI.EmbedSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-embed.SemanticUI.EmbedSettings._Impl[K] */ js.Any = js.native
    
    var settings: EmbedSettings = js.native
  }
  object Embed {
    
    object ClassNameSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'active'
          */
        var active: String
        
        /**
          * @default 'embed'
          */
        var embed: String
      }
      object Impl {
        
        inline def apply(active: String, embed: String): Impl = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
          
          inline def setEmbed(value: String): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.semanticUiEmbed.anon.PickImplactivePartialPick
        - typings.semanticUiEmbed.anon.PickImplembedPartialPickIActive
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplactivePartialPick(active: String & js.UndefOr[String]): typings.semanticUiEmbed.anon.PickImplactivePartialPick = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplactivePartialPick]
        }
        
        inline def PickImplembedPartialPickIActive(embed: String & js.UndefOr[String]): typings.semanticUiEmbed.anon.PickImplembedPartialPickIActive = {
          val __obj = js.Dynamic.literal(embed = embed.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplembedPartialPickIActive]
        }
      }
    }
    type ClassNameSettings = Param
    
    object ErrorSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'The method you called is not defined'
          */
        var method: String
        
        /**
          * @default 'No URL specified'
          */
        var noURL: String
      }
      object Impl {
        
        inline def apply(method: String, noURL: String): Impl = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], noURL = noURL.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
          
          inline def setNoURL(value: String): Self = StObject.set(x, "noURL", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.semanticUiEmbed.anon.PickImplnoURLPartialPickI
        - typings.semanticUiEmbed.anon.PickImplmethodPartialPick
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplmethodPartialPick(method: String & js.UndefOr[String]): typings.semanticUiEmbed.anon.PickImplmethodPartialPick = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplmethodPartialPick]
        }
        
        inline def PickImplnoURLPartialPickI(noURL: String & js.UndefOr[String]): typings.semanticUiEmbed.anon.PickImplnoURLPartialPickI = {
          val __obj = js.Dynamic.literal(noURL = noURL.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplnoURLPartialPickI]
        }
      }
    }
    type ErrorSettings = typings.semanticUiEmbed.SemanticUI.Embed.ErrorSettings.Param
    
    object MetadataSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'icon'
          */
        var icon: String
        
        /**
          * @default 'id'
          */
        var id: String
        
        /**
          * @default 'placeholder'
          */
        var placeholder: String
        
        /**
          * @default 'source'
          */
        var source: String
        
        /**
          * @default 'url'
          */
        var url: String
      }
      object Impl {
        
        inline def apply(icon: String, id: String, placeholder: String, source: String, url: String): Impl = {
          val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
          
          inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
          
          inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
          
          inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.semanticUiEmbed.anon.PickImplidPartialPickImplIcon
        - typings.semanticUiEmbed.anon.PickImpliconPartialPickImIcon
        - typings.semanticUiEmbed.anon.PickImplplaceholderPartiaIcon
        - typings.semanticUiEmbed.anon.PickImplsourcePartialPickIcon
        - typings.semanticUiEmbed.anon.PickImplurlPartialPickImpIcon
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImpliconPartialPickImIcon(icon: String & js.UndefOr[String]): typings.semanticUiEmbed.anon.PickImpliconPartialPickImIcon = {
          val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImpliconPartialPickImIcon]
        }
        
        inline def PickImplidPartialPickImplIcon(id: String & js.UndefOr[String]): typings.semanticUiEmbed.anon.PickImplidPartialPickImplIcon = {
          val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplidPartialPickImplIcon]
        }
        
        inline def PickImplplaceholderPartiaIcon(placeholder: String & js.UndefOr[String]): typings.semanticUiEmbed.anon.PickImplplaceholderPartiaIcon = {
          val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplplaceholderPartiaIcon]
        }
        
        inline def PickImplsourcePartialPickIcon(source: String & js.UndefOr[String]): typings.semanticUiEmbed.anon.PickImplsourcePartialPickIcon = {
          val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplsourcePartialPickIcon]
        }
        
        inline def PickImplurlPartialPickImpIcon(url: String & js.UndefOr[String]): typings.semanticUiEmbed.anon.PickImplurlPartialPickImpIcon = {
          val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplurlPartialPickImpIcon]
        }
      }
    }
    type MetadataSettings = typings.semanticUiEmbed.SemanticUI.Embed.MetadataSettings.Param
    
    object ParametersSettings {
      
      type Impl = StringDictionary[Any]
      
      type Param = Impl
    }
    type ParametersSettings = Impl
    
    object SelectorSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default '.embed'
          */
        var embed: String
        
        /**
          * @default '.placeholder'
          */
        var placeholder: String
        
        /**
          * @default '.play'
          */
        var play: String
      }
      object Impl {
        
        inline def apply(embed: String, placeholder: String, play: String): typings.semanticUiEmbed.SemanticUI.Embed.SelectorSettings.Impl = {
          val __obj = js.Dynamic.literal(embed = embed.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiEmbed.SemanticUI.Embed.SelectorSettings.Impl]
        }
        
        extension [Self <: typings.semanticUiEmbed.SemanticUI.Embed.SelectorSettings.Impl](x: Self) {
          
          inline def setEmbed(value: String): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
          
          inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
          
          inline def setPlay(value: String): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.semanticUiEmbed.anon.PickImplembedPartialPickI
        - typings.semanticUiEmbed.anon.PickImplplaceholderPartia
        - typings.semanticUiEmbed.anon.PickImplplayPartialPickIm
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplembedPartialPickI(embed: String & js.UndefOr[String]): typings.semanticUiEmbed.anon.PickImplembedPartialPickI = {
          val __obj = js.Dynamic.literal(embed = embed.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplembedPartialPickI]
        }
        
        inline def PickImplplaceholderPartia(placeholder: String & js.UndefOr[String]): typings.semanticUiEmbed.anon.PickImplplaceholderPartia = {
          val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplplaceholderPartia]
        }
        
        inline def PickImplplayPartialPickIm(play: String & js.UndefOr[String]): typings.semanticUiEmbed.anon.PickImplplayPartialPickIm = {
          val __obj = js.Dynamic.literal(play = play.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplplayPartialPickIm]
        }
      }
    }
    type SelectorSettings = typings.semanticUiEmbed.SemanticUI.Embed.SelectorSettings.Param
    
    object TemplatesSettings {
      
      trait Impl extends StObject {
        
        /**
          * returns html for iframe
          */
        def iframe(url: String, parameters: String): String
        
        /**
          * returns html for placeholder element
          */
        def placeholder(image: String, icon: String): String
      }
      object Impl {
        
        inline def apply(iframe: (String, String) => String, placeholder: (String, String) => String): typings.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings.Impl = {
          val __obj = js.Dynamic.literal(iframe = js.Any.fromFunction2(iframe), placeholder = js.Any.fromFunction2(placeholder))
          __obj.asInstanceOf[typings.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings.Impl]
        }
        
        extension [Self <: typings.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings.Impl](x: Self) {
          
          inline def setIframe(value: (String, String) => String): Self = StObject.set(x, "iframe", js.Any.fromFunction2(value))
          
          inline def setPlaceholder(value: (String, String) => String): Self = StObject.set(x, "placeholder", js.Any.fromFunction2(value))
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.semanticUiEmbed.anon.PickImpliframePartialPick
        - typings.semanticUiEmbed.anon.PickImplplaceholderPartiaIframe
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImpliframePartialPick(
          iframe: (js.Function2[/* url */ String, /* parameters */ String, String]) & (js.UndefOr[js.Function2[/* url */ String, /* parameters */ String, String]])
        ): typings.semanticUiEmbed.anon.PickImpliframePartialPick = {
          val __obj = js.Dynamic.literal(iframe = iframe.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImpliframePartialPick]
        }
        
        inline def PickImplplaceholderPartiaIframe(
          placeholder: (js.Function2[/* image */ String, /* icon */ String, String]) & (js.UndefOr[js.Function2[/* image */ String, /* icon */ String, String]])
        ): typings.semanticUiEmbed.anon.PickImplplaceholderPartiaIframe = {
          val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplplaceholderPartiaIframe]
        }
      }
    }
    type TemplatesSettings = typings.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings.Param
  }
  
  object EmbedSettings {
    
    trait Impl extends StObject {
      
      // endregion
      // region Video Settings
      /**
        * Default setting auto will only autoplay content when a placeholder is specified. Setting to true or false will force autoplay.
        *
        * @default 'auto'
        */
      var autoplay: auto | Boolean
      
      /**
        * Whether to show networks branded UI like title cards, or after video calls to action.
        *
        * @default false
        */
      var brandedUI: Boolean
      
      /**
        * Class names used to attach style to state
        */
      var className: ClassNameSettings
      
      /**
        * Specifies a default chrome color with Vimeo or YouTube.
        *
        * @default '#444444'
        */
      var color: String
      
      /**
        * Debug output to console
        */
      var debug: Boolean
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings
      
      /**
        * Whether to prefer HD content
        *
        * @default true
        */
      var hd: Boolean
      
      // region Embed Settings
      /**
        * Specifies an icon to use with placeholder content
        *
        * @default false
        */
      var icon: `false` | String
      
      /**
        * Specifies an id value to replace with the {id} value found in templated urls
        *
        * @default false
        */
      var id: `false` | String
      
      /**
        * HTML Data attributes used to store data
        */
      var metadata: MetadataSettings
      
      // endregion
      // region Debug Settings
      /**
        * Name used in log statements
        */
      var name: String
      
      // endregion
      // region Component Settings
      // region DOM Settings
      /**
        * Event namespace. Makes sure module teardown does not effect other events attached to an element.
        */
      var namespace: String
      
      // endregion
      // region Callbacks
      /**
        * Callback when iframe is generated
        */
      def onCreate(url: String): Unit
      
      /**
        * Whenever an iframe contents is shown
        */
      def onDisplay(): Unit
      
      /**
        * Callback when module parameters are determined. Allows you to adjust parameters at run time by returning a new parameters object.
        */
      def onEmbed(parameters: ParametersSettings): ParametersSettings
      
      /**
        * Callback immediately before Embed is removed from DOM
        */
      def onPlaceholderDisplay(): Unit
      
      /**
        * Specify an object containing key/value pairs to add to the iframes GET parameters
        *
        * @default false
        */
      var parameters: `false` | ParametersSettings
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean
      
      // endregion
      // region DOM Settings
      /**
        * DOM Selectors used internally
        */
      var selector: SelectorSettings
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean
      
      /**
        * Specifies a source to use, if no source is provided it will be determined from the domain of a specified url.
        *
        * @default false
        */
      var source: `false` | String
      
      var templates: TemplatesSettings
      
      /**
        * Specifies a url to use for embed
        *
        * @default false
        */
      var url: `false` | String
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean
    }
    object Impl {
      
      inline def apply(
        autoplay: auto | Boolean,
        brandedUI: Boolean,
        className: ClassNameSettings,
        color: String,
        debug: Boolean,
        error: ErrorSettings,
        hd: Boolean,
        icon: `false` | String,
        id: `false` | String,
        metadata: MetadataSettings,
        name: String,
        namespace: String,
        onCreate: String => Unit,
        onDisplay: () => Unit,
        onEmbed: ParametersSettings => ParametersSettings,
        onPlaceholderDisplay: () => Unit,
        parameters: `false` | ParametersSettings,
        performance: Boolean,
        selector: SelectorSettings,
        silent: Boolean,
        source: `false` | String,
        templates: TemplatesSettings,
        url: `false` | String,
        verbose: Boolean
      ): typings.semanticUiEmbed.SemanticUI.EmbedSettings.Impl = {
        val __obj = js.Dynamic.literal(autoplay = autoplay.asInstanceOf[js.Any], brandedUI = brandedUI.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], hd = hd.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onCreate = js.Any.fromFunction1(onCreate), onDisplay = js.Any.fromFunction0(onDisplay), onEmbed = js.Any.fromFunction1(onEmbed), onPlaceholderDisplay = js.Any.fromFunction0(onPlaceholderDisplay), parameters = parameters.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.SemanticUI.EmbedSettings.Impl]
      }
      
      extension [Self <: typings.semanticUiEmbed.SemanticUI.EmbedSettings.Impl](x: Self) {
        
        inline def setAutoplay(value: auto | Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
        
        inline def setBrandedUI(value: Boolean): Self = StObject.set(x, "brandedUI", value.asInstanceOf[js.Any])
        
        inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setHd(value: Boolean): Self = StObject.set(x, "hd", value.asInstanceOf[js.Any])
        
        inline def setIcon(value: `false` | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setId(value: `false` | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setOnCreate(value: String => Unit): Self = StObject.set(x, "onCreate", js.Any.fromFunction1(value))
        
        inline def setOnDisplay(value: () => Unit): Self = StObject.set(x, "onDisplay", js.Any.fromFunction0(value))
        
        inline def setOnEmbed(value: ParametersSettings => ParametersSettings): Self = StObject.set(x, "onEmbed", js.Any.fromFunction1(value))
        
        inline def setOnPlaceholderDisplay(value: () => Unit): Self = StObject.set(x, "onPlaceholderDisplay", js.Any.fromFunction0(value))
        
        inline def setParameters(value: `false` | ParametersSettings): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
        
        inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        inline def setSource(value: `false` | String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setTemplates(value: TemplatesSettings): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: `false` | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiEmbed.anon.PickImplurlPartialPickImp
      - typings.semanticUiEmbed.anon.PickImpliconPartialPickIm
      - typings.semanticUiEmbed.anon.PickImplsourcePartialPick
      - typings.semanticUiEmbed.anon.PickImplidPartialPickImpl
      - typings.semanticUiEmbed.anon.PickImplparametersPartial
      - typings.semanticUiEmbed.anon.PickImplautoplayPartialPi
      - typings.semanticUiEmbed.anon.PickImplcolorPartialPickI
      - typings.semanticUiEmbed.anon.PickImplhdPartialPickImpl
      - typings.semanticUiEmbed.anon.PickImplbrandedUIPartialP
      - typings.semanticUiEmbed.anon.PickImplonCreatePartialPi
      - typings.semanticUiEmbed.anon.PickImplonDisplayPartialP
      - typings.semanticUiEmbed.anon.PickImplonPlaceholderDisp
      - typings.semanticUiEmbed.anon.PickImplonEmbedPartialPic
      - typings.semanticUiEmbed.anon.PickImplselectorPartialPi
      - typings.semanticUiEmbed.anon.PickImplmetadataPartialPi
      - typings.semanticUiEmbed.anon.PickImplclassNamePartialP
      - typings.semanticUiEmbed.anon.PickImpltemplatesPartialP
      - typings.semanticUiEmbed.anon.PickImplerrorPartialPickI
      - typings.semanticUiEmbed.anon.PickImplnamespacePartialP
      - typings.semanticUiEmbed.anon.PickImplnamePartialPickIm
      - typings.semanticUiEmbed.anon.PickImplsilentPartialPick
      - typings.semanticUiEmbed.anon.PickImpldebugPartialPickI
      - typings.semanticUiEmbed.anon.PickImplperformancePartia
      - typings.semanticUiEmbed.anon.PickImplverbosePartialPic
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplautoplayPartialPi(autoplay: (auto | Boolean) & (js.UndefOr[auto | Boolean])): typings.semanticUiEmbed.anon.PickImplautoplayPartialPi = {
        val __obj = js.Dynamic.literal(autoplay = autoplay.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplautoplayPartialPi]
      }
      
      inline def PickImplbrandedUIPartialP(brandedUI: Boolean & js.UndefOr[Boolean]): typings.semanticUiEmbed.anon.PickImplbrandedUIPartialP = {
        val __obj = js.Dynamic.literal(brandedUI = brandedUI.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplbrandedUIPartialP]
      }
      
      inline def PickImplclassNamePartialP(className: ClassNameSettings & js.UndefOr[ClassNameSettings]): typings.semanticUiEmbed.anon.PickImplclassNamePartialP = {
        val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplclassNamePartialP]
      }
      
      inline def PickImplcolorPartialPickI(color: String & js.UndefOr[String]): typings.semanticUiEmbed.anon.PickImplcolorPartialPickI = {
        val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplcolorPartialPickI]
      }
      
      inline def PickImpldebugPartialPickI(debug: Boolean & js.UndefOr[Boolean]): typings.semanticUiEmbed.anon.PickImpldebugPartialPickI = {
        val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImpldebugPartialPickI]
      }
      
      inline def PickImplerrorPartialPickI(error: ErrorSettings & js.UndefOr[ErrorSettings]): typings.semanticUiEmbed.anon.PickImplerrorPartialPickI = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplerrorPartialPickI]
      }
      
      inline def PickImplhdPartialPickImpl(hd: Boolean & js.UndefOr[Boolean]): typings.semanticUiEmbed.anon.PickImplhdPartialPickImpl = {
        val __obj = js.Dynamic.literal(hd = hd.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplhdPartialPickImpl]
      }
      
      inline def PickImpliconPartialPickIm(icon: (`false` | String) & (js.UndefOr[`false` | String])): typings.semanticUiEmbed.anon.PickImpliconPartialPickIm = {
        val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImpliconPartialPickIm]
      }
      
      inline def PickImplidPartialPickImpl(id: (`false` | String) & (js.UndefOr[`false` | String])): typings.semanticUiEmbed.anon.PickImplidPartialPickImpl = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplidPartialPickImpl]
      }
      
      inline def PickImplmetadataPartialPi(metadata: MetadataSettings & js.UndefOr[MetadataSettings]): typings.semanticUiEmbed.anon.PickImplmetadataPartialPi = {
        val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplmetadataPartialPi]
      }
      
      inline def PickImplnamePartialPickIm(name: String & js.UndefOr[String]): typings.semanticUiEmbed.anon.PickImplnamePartialPickIm = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplnamePartialPickIm]
      }
      
      inline def PickImplnamespacePartialP(namespace: String & js.UndefOr[String]): typings.semanticUiEmbed.anon.PickImplnamespacePartialP = {
        val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplnamespacePartialP]
      }
      
      inline def PickImplonCreatePartialPi(
        onCreate: (js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit]])
      ): typings.semanticUiEmbed.anon.PickImplonCreatePartialPi = {
        val __obj = js.Dynamic.literal(onCreate = onCreate.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplonCreatePartialPi]
      }
      
      inline def PickImplonDisplayPartialP(
        onDisplay: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typings.semanticUiEmbed.anon.PickImplonDisplayPartialP = {
        val __obj = js.Dynamic.literal(onDisplay = onDisplay.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplonDisplayPartialP]
      }
      
      inline def PickImplonEmbedPartialPic(
        onEmbed: (js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings]) & (js.UndefOr[
              js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings]
            ])
      ): typings.semanticUiEmbed.anon.PickImplonEmbedPartialPic = {
        val __obj = js.Dynamic.literal(onEmbed = onEmbed.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplonEmbedPartialPic]
      }
      
      inline def PickImplonPlaceholderDisp(
        onPlaceholderDisplay: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typings.semanticUiEmbed.anon.PickImplonPlaceholderDisp = {
        val __obj = js.Dynamic.literal(onPlaceholderDisplay = onPlaceholderDisplay.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplonPlaceholderDisp]
      }
      
      inline def PickImplparametersPartial(parameters: (`false` | ParametersSettings) & (js.UndefOr[`false` | ParametersSettings])): typings.semanticUiEmbed.anon.PickImplparametersPartial = {
        val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplparametersPartial]
      }
      
      inline def PickImplperformancePartia(performance: Boolean & js.UndefOr[Boolean]): typings.semanticUiEmbed.anon.PickImplperformancePartia = {
        val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplperformancePartia]
      }
      
      inline def PickImplselectorPartialPi(selector: SelectorSettings & js.UndefOr[SelectorSettings]): typings.semanticUiEmbed.anon.PickImplselectorPartialPi = {
        val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplselectorPartialPi]
      }
      
      inline def PickImplsilentPartialPick(silent: Boolean & js.UndefOr[Boolean]): typings.semanticUiEmbed.anon.PickImplsilentPartialPick = {
        val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplsilentPartialPick]
      }
      
      inline def PickImplsourcePartialPick(source: (`false` | String) & (js.UndefOr[`false` | String])): typings.semanticUiEmbed.anon.PickImplsourcePartialPick = {
        val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplsourcePartialPick]
      }
      
      inline def PickImpltemplatesPartialP(templates: TemplatesSettings & js.UndefOr[TemplatesSettings]): typings.semanticUiEmbed.anon.PickImpltemplatesPartialP = {
        val __obj = js.Dynamic.literal(templates = templates.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImpltemplatesPartialP]
      }
      
      inline def PickImplurlPartialPickImp(url: (`false` | String) & (js.UndefOr[`false` | String])): typings.semanticUiEmbed.anon.PickImplurlPartialPickImp = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplurlPartialPickImp]
      }
      
      inline def PickImplverbosePartialPic(verbose: Boolean & js.UndefOr[Boolean]): typings.semanticUiEmbed.anon.PickImplverbosePartialPic = {
        val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiEmbed.anon.PickImplverbosePartialPic]
      }
    }
  }
  /**
    * @see {@link http://semantic-ui.com/modules/embed.html#/settings}
    */
  type EmbedSettings = typings.semanticUiEmbed.SemanticUI.EmbedSettings.Param
}
