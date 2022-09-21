package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings.querystring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrerenderHydrateOptions
  extends StObject
     with SerializeDocumentOptions {
  
  /**
    * Adds `<link rel="modulepreload">` for modules that will eventually be requested.
    * Defaults to `true`.
    */
  var addModulePreloads: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Hash the content of assets, such as images, fonts and css files,
    * and add the hashed value as `v` querystring. For example,
    * `/assets/image.png?v=abcd1234`. This allows for assets to be
    * heavily cached by setting the server's response header with
    * `Cache-Control: max-age=31536000, immutable`.
    */
  var hashAssets: js.UndefOr[querystring] = js.undefined
  
  /**
    * External stylesheets from `<link rel="stylesheet">` are instead inlined
    * into `<style>` elements. Defaults to `false`.
    */
  var inlineExternalStyleSheets: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Minify JavaScript content within `<script>` elements. Defaults to `true`.
    */
  var minifyScriptElements: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Minify CSS content within `<style>` elements. Defaults to `true`.
    */
  var minifyStyleElements: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Entire `document` should be static. This is useful for specific pages that
    * should be static, rather than the entire site. If the whole site should be static,
    * use the `staticSite` property on the prerender config instead. If only certain
    * components should be static then use `staticComponents` instead.
    */
  var staticDocument: js.UndefOr[Boolean] = js.undefined
}
object PrerenderHydrateOptions {
  
  inline def apply(): PrerenderHydrateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrerenderHydrateOptions]
  }
  
  extension [Self <: PrerenderHydrateOptions](x: Self) {
    
    inline def setAddModulePreloads(value: Boolean): Self = StObject.set(x, "addModulePreloads", value.asInstanceOf[js.Any])
    
    inline def setAddModulePreloadsUndefined: Self = StObject.set(x, "addModulePreloads", js.undefined)
    
    inline def setHashAssets(value: querystring): Self = StObject.set(x, "hashAssets", value.asInstanceOf[js.Any])
    
    inline def setHashAssetsUndefined: Self = StObject.set(x, "hashAssets", js.undefined)
    
    inline def setInlineExternalStyleSheets(value: Boolean): Self = StObject.set(x, "inlineExternalStyleSheets", value.asInstanceOf[js.Any])
    
    inline def setInlineExternalStyleSheetsUndefined: Self = StObject.set(x, "inlineExternalStyleSheets", js.undefined)
    
    inline def setMinifyScriptElements(value: Boolean): Self = StObject.set(x, "minifyScriptElements", value.asInstanceOf[js.Any])
    
    inline def setMinifyScriptElementsUndefined: Self = StObject.set(x, "minifyScriptElements", js.undefined)
    
    inline def setMinifyStyleElements(value: Boolean): Self = StObject.set(x, "minifyStyleElements", value.asInstanceOf[js.Any])
    
    inline def setMinifyStyleElementsUndefined: Self = StObject.set(x, "minifyStyleElements", js.undefined)
    
    inline def setStaticDocument(value: Boolean): Self = StObject.set(x, "staticDocument", value.asInstanceOf[js.Any])
    
    inline def setStaticDocumentUndefined: Self = StObject.set(x, "staticDocument", js.undefined)
  }
}
