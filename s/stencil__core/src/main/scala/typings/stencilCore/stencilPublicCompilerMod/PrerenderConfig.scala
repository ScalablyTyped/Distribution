package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Document
import typings.std.URL
import typings.stencilCore.stencilPrivateMod.PrerenderUrlResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrerenderConfig extends StObject {
  
  /**
    * Run after each `document` is hydrated, but before it is serialized
    * into an HTML string. Hook is passed the `document` and its `URL`.
    */
  var afterHydrate: js.UndefOr[
    js.Function3[
      /* document */ Document, 
      /* url */ URL, 
      /* results */ PrerenderUrlResults, 
      Any | js.Promise[Any]
    ]
  ] = js.undefined
  
  /**
    * Runs after the template Document object has serialize into an
    * HTML formatted string. Returns an HTML string to be used as the
    * base template for all prerendered pages.
    */
  var afterSerializeTemplate: js.UndefOr[js.Function1[/* html */ String, String | js.Promise[String]]] = js.undefined
  
  /**
    * Run before each `document` is hydrated. Hook is passed the `document` it's `URL`.
    */
  var beforeHydrate: js.UndefOr[js.Function2[/* document */ Document, /* url */ URL, Any | js.Promise[Any]]] = js.undefined
  
  /**
    * Runs before the template Document object is serialize into an
    * HTML formatted string. Returns the Document to be serialized which
    * will become the base template html for all prerendered pages.
    */
  var beforeSerializeTemplate: js.UndefOr[js.Function1[/* document */ Document, Document | js.Promise[Document]]] = js.undefined
  
  /**
    * A hook to be used to generate the canonical `<link>` tag
    * which goes in the `<head>` of every prerendered page. Returning `null`
    * will not add a canonical url tag to the page.
    */
  var canonicalUrl: js.UndefOr[js.Function1[/* url */ URL, String | Null]] = js.undefined
  
  /**
    * While prerendering, crawl same-origin URLs found within `<a href>` elements.
    * Defaults to `true`.
    */
  var crawlUrls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * URLs to start the prerendering from. By default the root URL of `/` is used.
    */
  var entryUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Returns the file path which the prerendered HTML content
    * should be written to.
    */
  var filePath: js.UndefOr[js.Function2[/* url */ URL, /* filePath */ String, String]] = js.undefined
  
  /**
    * Return `true` the given `<a>` element should be crawled or not.
    */
  var filterAnchor: js.UndefOr[
    js.Function2[/* attrs */ StringDictionary[String], /* base */ js.UndefOr[URL], Boolean]
  ] = js.undefined
  
  /**
    * Return `true` if the given URL should be prerendered or not.
    */
  var filterUrl: js.UndefOr[js.Function2[/* url */ URL, /* base */ URL, Boolean]] = js.undefined
  
  /**
    * Returns the hydrate options to use for each individual prerendered page.
    */
  var hydrateOptions: js.UndefOr[js.Function1[/* url */ URL, PrerenderHydrateOptions]] = js.undefined
  
  /**
    * Returns the template file's content. The template is the base
    * HTML used for all prerendered pages.
    */
  var loadTemplate: js.UndefOr[js.Function1[/* filePath */ String, String | js.Promise[String]]] = js.undefined
  
  /**
    * Used to normalize the page's URL from a given a string and the current
    * page's base URL. Largely used when reading an anchor's `href` attribute
    * value and normalizing it into a `URL`.
    */
  var normalizeUrl: js.UndefOr[js.Function2[/* href */ String, /* base */ URL, URL]] = js.undefined
  
  var robotsTxt: js.UndefOr[js.Function1[/* opts */ RobotsTxtOpts, String | RobotsTxtResults]] = js.undefined
  
  var sitemapXml: js.UndefOr[js.Function1[/* opts */ SitemapXmpOpts, String | SitemapXmpResults]] = js.undefined
  
  /**
    * Static Site Generated (SSG). Does not include Stencil's clientside
    * JavaScript, custom elements or preload modules.
    */
  var staticSite: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the prerenndered URLs should have a trailing "/"" or not. Defaults to `false`.
    */
  var trailingSlash: js.UndefOr[Boolean] = js.undefined
}
object PrerenderConfig {
  
  inline def apply(): PrerenderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrerenderConfig]
  }
  
  extension [Self <: PrerenderConfig](x: Self) {
    
    inline def setAfterHydrate(
      value: (/* document */ Document, /* url */ URL, /* results */ PrerenderUrlResults) => Any | js.Promise[Any]
    ): Self = StObject.set(x, "afterHydrate", js.Any.fromFunction3(value))
    
    inline def setAfterHydrateUndefined: Self = StObject.set(x, "afterHydrate", js.undefined)
    
    inline def setAfterSerializeTemplate(value: /* html */ String => String | js.Promise[String]): Self = StObject.set(x, "afterSerializeTemplate", js.Any.fromFunction1(value))
    
    inline def setAfterSerializeTemplateUndefined: Self = StObject.set(x, "afterSerializeTemplate", js.undefined)
    
    inline def setBeforeHydrate(value: (/* document */ Document, /* url */ URL) => Any | js.Promise[Any]): Self = StObject.set(x, "beforeHydrate", js.Any.fromFunction2(value))
    
    inline def setBeforeHydrateUndefined: Self = StObject.set(x, "beforeHydrate", js.undefined)
    
    inline def setBeforeSerializeTemplate(value: /* document */ Document => Document | js.Promise[Document]): Self = StObject.set(x, "beforeSerializeTemplate", js.Any.fromFunction1(value))
    
    inline def setBeforeSerializeTemplateUndefined: Self = StObject.set(x, "beforeSerializeTemplate", js.undefined)
    
    inline def setCanonicalUrl(value: /* url */ URL => String | Null): Self = StObject.set(x, "canonicalUrl", js.Any.fromFunction1(value))
    
    inline def setCanonicalUrlUndefined: Self = StObject.set(x, "canonicalUrl", js.undefined)
    
    inline def setCrawlUrls(value: Boolean): Self = StObject.set(x, "crawlUrls", value.asInstanceOf[js.Any])
    
    inline def setCrawlUrlsUndefined: Self = StObject.set(x, "crawlUrls", js.undefined)
    
    inline def setEntryUrls(value: js.Array[String]): Self = StObject.set(x, "entryUrls", value.asInstanceOf[js.Any])
    
    inline def setEntryUrlsUndefined: Self = StObject.set(x, "entryUrls", js.undefined)
    
    inline def setEntryUrlsVarargs(value: String*): Self = StObject.set(x, "entryUrls", js.Array(value*))
    
    inline def setFilePath(value: (/* url */ URL, /* filePath */ String) => String): Self = StObject.set(x, "filePath", js.Any.fromFunction2(value))
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setFilterAnchor(value: (/* attrs */ StringDictionary[String], /* base */ js.UndefOr[URL]) => Boolean): Self = StObject.set(x, "filterAnchor", js.Any.fromFunction2(value))
    
    inline def setFilterAnchorUndefined: Self = StObject.set(x, "filterAnchor", js.undefined)
    
    inline def setFilterUrl(value: (/* url */ URL, /* base */ URL) => Boolean): Self = StObject.set(x, "filterUrl", js.Any.fromFunction2(value))
    
    inline def setFilterUrlUndefined: Self = StObject.set(x, "filterUrl", js.undefined)
    
    inline def setHydrateOptions(value: /* url */ URL => PrerenderHydrateOptions): Self = StObject.set(x, "hydrateOptions", js.Any.fromFunction1(value))
    
    inline def setHydrateOptionsUndefined: Self = StObject.set(x, "hydrateOptions", js.undefined)
    
    inline def setLoadTemplate(value: /* filePath */ String => String | js.Promise[String]): Self = StObject.set(x, "loadTemplate", js.Any.fromFunction1(value))
    
    inline def setLoadTemplateUndefined: Self = StObject.set(x, "loadTemplate", js.undefined)
    
    inline def setNormalizeUrl(value: (/* href */ String, /* base */ URL) => URL): Self = StObject.set(x, "normalizeUrl", js.Any.fromFunction2(value))
    
    inline def setNormalizeUrlUndefined: Self = StObject.set(x, "normalizeUrl", js.undefined)
    
    inline def setRobotsTxt(value: /* opts */ RobotsTxtOpts => String | RobotsTxtResults): Self = StObject.set(x, "robotsTxt", js.Any.fromFunction1(value))
    
    inline def setRobotsTxtUndefined: Self = StObject.set(x, "robotsTxt", js.undefined)
    
    inline def setSitemapXml(value: /* opts */ SitemapXmpOpts => String | SitemapXmpResults): Self = StObject.set(x, "sitemapXml", js.Any.fromFunction1(value))
    
    inline def setSitemapXmlUndefined: Self = StObject.set(x, "sitemapXml", js.undefined)
    
    inline def setStaticSite(value: Boolean): Self = StObject.set(x, "staticSite", value.asInstanceOf[js.Any])
    
    inline def setStaticSiteUndefined: Self = StObject.set(x, "staticSite", js.undefined)
    
    inline def setTrailingSlash(value: Boolean): Self = StObject.set(x, "trailingSlash", value.asInstanceOf[js.Any])
    
    inline def setTrailingSlashUndefined: Self = StObject.set(x, "trailingSlash", js.undefined)
  }
}
