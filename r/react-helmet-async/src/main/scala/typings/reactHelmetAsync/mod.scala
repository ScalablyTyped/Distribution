package typings.reactHelmetAsync

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.HtmlHTMLAttributes
import typings.react.mod.LinkHTMLAttributes
import typings.react.mod.MetaHTMLAttributes
import typings.react.mod.PropsWithChildren
import typings.std.HTMLBodyElement
import typings.std.HTMLHtmlElement
import typings.std.HTMLLinkElement
import typings.std.HTMLMetaElement
import typings.std.HTMLScriptElement
import typings.std.HTMLStyleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-helmet-async", "Helmet")
  @js.native
  open class Helmet protected ()
    extends Component[PropsWithChildren[HelmetProps], js.Object, Any] {
    def this(props: PropsWithChildren[HelmetProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PropsWithChildren[HelmetProps], context: Any) = this()
  }
  
  @JSImport("react-helmet-async", "HelmetData")
  @js.native
  open class HelmetData protected () extends StObject {
    def this(context: Any) = this()
    
    var context: typings.reactHelmetAsync.anon.Helmet = js.native
  }
  
  @JSImport("react-helmet-async", "HelmetProvider")
  @js.native
  open class HelmetProvider protected ()
    extends Component[PropsWithChildren[ProviderProps], js.Object, Any] {
    def this(props: PropsWithChildren[ProviderProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PropsWithChildren[ProviderProps], context: Any) = this()
  }
  /* static members */
  object HelmetProvider {
    
    @JSImport("react-helmet-async", "HelmetProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-helmet-async", "HelmetProvider.canUseDOM")
    @js.native
    def canUseDOM: Boolean = js.native
    inline def canUseDOM_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canUseDOM")(x.asInstanceOf[js.Any])
  }
  
  type BodyProps = (DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement]) & OtherElementAttributes
  
  trait FilledContext extends StObject {
    
    var helmet: HelmetServerState
  }
  object FilledContext {
    
    inline def apply(helmet: HelmetServerState): FilledContext = {
      val __obj = js.Dynamic.literal(helmet = helmet.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilledContext]
    }
    
    extension [Self <: FilledContext](x: Self) {
      
      inline def setHelmet(value: HelmetServerState): Self = StObject.set(x, "helmet", value.asInstanceOf[js.Any])
    }
  }
  
  trait HelmetDatum extends StObject {
    
    def toComponent(): Component[Any, js.Object, Any]
  }
  object HelmetDatum {
    
    inline def apply(toComponent: () => Component[Any, js.Object, Any]): HelmetDatum = {
      val __obj = js.Dynamic.literal(toComponent = js.Any.fromFunction0(toComponent))
      __obj.asInstanceOf[HelmetDatum]
    }
    
    extension [Self <: HelmetDatum](x: Self) {
      
      inline def setToComponent(value: () => Component[Any, js.Object, Any]): Self = StObject.set(x, "toComponent", js.Any.fromFunction0(value))
    }
  }
  
  trait HelmetHTMLBodyDatum extends StObject {
    
    def toComponent(): HTMLAttributes[HTMLBodyElement]
  }
  object HelmetHTMLBodyDatum {
    
    inline def apply(toComponent: () => HTMLAttributes[HTMLBodyElement]): HelmetHTMLBodyDatum = {
      val __obj = js.Dynamic.literal(toComponent = js.Any.fromFunction0(toComponent))
      __obj.asInstanceOf[HelmetHTMLBodyDatum]
    }
    
    extension [Self <: HelmetHTMLBodyDatum](x: Self) {
      
      inline def setToComponent(value: () => HTMLAttributes[HTMLBodyElement]): Self = StObject.set(x, "toComponent", js.Any.fromFunction0(value))
    }
  }
  
  trait HelmetHTMLElementDatum extends StObject {
    
    def toComponent(): HTMLAttributes[HTMLHtmlElement]
  }
  object HelmetHTMLElementDatum {
    
    inline def apply(toComponent: () => HTMLAttributes[HTMLHtmlElement]): HelmetHTMLElementDatum = {
      val __obj = js.Dynamic.literal(toComponent = js.Any.fromFunction0(toComponent))
      __obj.asInstanceOf[HelmetHTMLElementDatum]
    }
    
    extension [Self <: HelmetHTMLElementDatum](x: Self) {
      
      inline def setToComponent(value: () => HTMLAttributes[HTMLHtmlElement]): Self = StObject.set(x, "toComponent", js.Any.fromFunction0(value))
    }
  }
  
  trait HelmetProps extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var base: js.UndefOr[Any] = js.undefined
    
    var bodyAttributes: js.UndefOr[BodyProps] = js.undefined
    
    var defaultTitle: js.UndefOr[String] = js.undefined
    
    var defer: js.UndefOr[Boolean] = js.undefined
    
    var encodeSpecialCharacters: js.UndefOr[Boolean] = js.undefined
    
    var helmetData: js.UndefOr[HelmetData] = js.undefined
    
    var htmlAttributes: js.UndefOr[HtmlProps] = js.undefined
    
    var link: js.UndefOr[js.Array[LinkProps]] = js.undefined
    
    var meta: js.UndefOr[js.Array[MetaProps]] = js.undefined
    
    var noscript: js.UndefOr[js.Array[Any]] = js.undefined
    
    var onChangeClientState: js.UndefOr[
        js.Function3[/* newState */ Any, /* addedTags */ HelmetTags, /* removedTags */ HelmetTags, Unit]
      ] = js.undefined
    
    var prioritizeSeoTags: js.UndefOr[Boolean] = js.undefined
    
    var script: js.UndefOr[js.Array[Any]] = js.undefined
    
    var style: js.UndefOr[js.Array[Any]] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var titleAttributes: js.UndefOr[js.Object] = js.undefined
    
    var titleTemplate: js.UndefOr[String] = js.undefined
  }
  object HelmetProps {
    
    inline def apply(): HelmetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelmetProps]
    }
    
    extension [Self <: HelmetProps](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setBase(value: Any): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setBodyAttributes(value: BodyProps): Self = StObject.set(x, "bodyAttributes", value.asInstanceOf[js.Any])
      
      inline def setBodyAttributesUndefined: Self = StObject.set(x, "bodyAttributes", js.undefined)
      
      inline def setDefaultTitle(value: String): Self = StObject.set(x, "defaultTitle", value.asInstanceOf[js.Any])
      
      inline def setDefaultTitleUndefined: Self = StObject.set(x, "defaultTitle", js.undefined)
      
      inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      inline def setEncodeSpecialCharacters(value: Boolean): Self = StObject.set(x, "encodeSpecialCharacters", value.asInstanceOf[js.Any])
      
      inline def setEncodeSpecialCharactersUndefined: Self = StObject.set(x, "encodeSpecialCharacters", js.undefined)
      
      inline def setHelmetData(value: HelmetData): Self = StObject.set(x, "helmetData", value.asInstanceOf[js.Any])
      
      inline def setHelmetDataUndefined: Self = StObject.set(x, "helmetData", js.undefined)
      
      inline def setHtmlAttributes(value: HtmlProps): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setLink(value: js.Array[LinkProps]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setLinkVarargs(value: LinkProps*): Self = StObject.set(x, "link", js.Array(value*))
      
      inline def setMeta(value: js.Array[MetaProps]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setMetaVarargs(value: MetaProps*): Self = StObject.set(x, "meta", js.Array(value*))
      
      inline def setNoscript(value: js.Array[Any]): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
      
      inline def setNoscriptUndefined: Self = StObject.set(x, "noscript", js.undefined)
      
      inline def setNoscriptVarargs(value: Any*): Self = StObject.set(x, "noscript", js.Array(value*))
      
      inline def setOnChangeClientState(value: (/* newState */ Any, /* addedTags */ HelmetTags, /* removedTags */ HelmetTags) => Unit): Self = StObject.set(x, "onChangeClientState", js.Any.fromFunction3(value))
      
      inline def setOnChangeClientStateUndefined: Self = StObject.set(x, "onChangeClientState", js.undefined)
      
      inline def setPrioritizeSeoTags(value: Boolean): Self = StObject.set(x, "prioritizeSeoTags", value.asInstanceOf[js.Any])
      
      inline def setPrioritizeSeoTagsUndefined: Self = StObject.set(x, "prioritizeSeoTags", js.undefined)
      
      inline def setScript(value: js.Array[Any]): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
      
      inline def setScriptVarargs(value: Any*): Self = StObject.set(x, "script", js.Array(value*))
      
      inline def setStyle(value: js.Array[Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: Any*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleAttributes(value: js.Object): Self = StObject.set(x, "titleAttributes", value.asInstanceOf[js.Any])
      
      inline def setTitleAttributesUndefined: Self = StObject.set(x, "titleAttributes", js.undefined)
      
      inline def setTitleTemplate(value: String): Self = StObject.set(x, "titleTemplate", value.asInstanceOf[js.Any])
      
      inline def setTitleTemplateUndefined: Self = StObject.set(x, "titleTemplate", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait HelmetServerState extends StObject {
    
    var base: HelmetDatum
    
    var bodyAttributes: HelmetHTMLBodyDatum
    
    var htmlAttributes: HelmetHTMLElementDatum
    
    var link: HelmetDatum
    
    var meta: HelmetDatum
    
    var noscript: HelmetDatum
    
    var priority: HelmetDatum
    
    var script: HelmetDatum
    
    var style: HelmetDatum
    
    var title: HelmetDatum
    
    var titleAttributes: HelmetDatum
  }
  object HelmetServerState {
    
    inline def apply(
      base: HelmetDatum,
      bodyAttributes: HelmetHTMLBodyDatum,
      htmlAttributes: HelmetHTMLElementDatum,
      link: HelmetDatum,
      meta: HelmetDatum,
      noscript: HelmetDatum,
      priority: HelmetDatum,
      script: HelmetDatum,
      style: HelmetDatum,
      title: HelmetDatum,
      titleAttributes: HelmetDatum
    ): HelmetServerState = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], bodyAttributes = bodyAttributes.asInstanceOf[js.Any], htmlAttributes = htmlAttributes.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], noscript = noscript.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleAttributes = titleAttributes.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelmetServerState]
    }
    
    extension [Self <: HelmetServerState](x: Self) {
      
      inline def setBase(value: HelmetDatum): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBodyAttributes(value: HelmetHTMLBodyDatum): Self = StObject.set(x, "bodyAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributes(value: HelmetHTMLElementDatum): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setLink(value: HelmetDatum): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: HelmetDatum): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setNoscript(value: HelmetDatum): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: HelmetDatum): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setScript(value: HelmetDatum): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: HelmetDatum): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: HelmetDatum): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleAttributes(value: HelmetDatum): Self = StObject.set(x, "titleAttributes", value.asInstanceOf[js.Any])
    }
  }
  
  trait HelmetTags extends StObject {
    
    var baseTag: js.Array[Any]
    
    var linkTags: js.Array[HTMLLinkElement]
    
    var metaTags: js.Array[HTMLMetaElement]
    
    var noscriptTags: js.Array[Any]
    
    var scriptTags: js.Array[HTMLScriptElement]
    
    var styleTags: js.Array[HTMLStyleElement]
  }
  object HelmetTags {
    
    inline def apply(
      baseTag: js.Array[Any],
      linkTags: js.Array[HTMLLinkElement],
      metaTags: js.Array[HTMLMetaElement],
      noscriptTags: js.Array[Any],
      scriptTags: js.Array[HTMLScriptElement],
      styleTags: js.Array[HTMLStyleElement]
    ): HelmetTags = {
      val __obj = js.Dynamic.literal(baseTag = baseTag.asInstanceOf[js.Any], linkTags = linkTags.asInstanceOf[js.Any], metaTags = metaTags.asInstanceOf[js.Any], noscriptTags = noscriptTags.asInstanceOf[js.Any], scriptTags = scriptTags.asInstanceOf[js.Any], styleTags = styleTags.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelmetTags]
    }
    
    extension [Self <: HelmetTags](x: Self) {
      
      inline def setBaseTag(value: js.Array[Any]): Self = StObject.set(x, "baseTag", value.asInstanceOf[js.Any])
      
      inline def setBaseTagVarargs(value: Any*): Self = StObject.set(x, "baseTag", js.Array(value*))
      
      inline def setLinkTags(value: js.Array[HTMLLinkElement]): Self = StObject.set(x, "linkTags", value.asInstanceOf[js.Any])
      
      inline def setLinkTagsVarargs(value: HTMLLinkElement*): Self = StObject.set(x, "linkTags", js.Array(value*))
      
      inline def setMetaTags(value: js.Array[HTMLMetaElement]): Self = StObject.set(x, "metaTags", value.asInstanceOf[js.Any])
      
      inline def setMetaTagsVarargs(value: HTMLMetaElement*): Self = StObject.set(x, "metaTags", js.Array(value*))
      
      inline def setNoscriptTags(value: js.Array[Any]): Self = StObject.set(x, "noscriptTags", value.asInstanceOf[js.Any])
      
      inline def setNoscriptTagsVarargs(value: Any*): Self = StObject.set(x, "noscriptTags", js.Array(value*))
      
      inline def setScriptTags(value: js.Array[HTMLScriptElement]): Self = StObject.set(x, "scriptTags", value.asInstanceOf[js.Any])
      
      inline def setScriptTagsVarargs(value: HTMLScriptElement*): Self = StObject.set(x, "scriptTags", js.Array(value*))
      
      inline def setStyleTags(value: js.Array[HTMLStyleElement]): Self = StObject.set(x, "styleTags", value.asInstanceOf[js.Any])
      
      inline def setStyleTagsVarargs(value: HTMLStyleElement*): Self = StObject.set(x, "styleTags", js.Array(value*))
    }
  }
  
  type HtmlProps = (DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement]) & OtherElementAttributes
  
  type LinkProps = DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement]
  
  type MetaProps = DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement]
  
  type OtherElementAttributes = StringDictionary[js.UndefOr[String | Double | Boolean | Null]]
  
  trait ProviderProps extends StObject {
    
    var context: js.UndefOr[js.Object] = js.undefined
  }
  object ProviderProps {
    
    inline def apply(): ProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProviderProps]
    }
    
    extension [Self <: ProviderProps](x: Self) {
      
      inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    }
  }
}
