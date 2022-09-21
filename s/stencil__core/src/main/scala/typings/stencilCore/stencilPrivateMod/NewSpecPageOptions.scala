package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewSpecPageOptions extends StObject {
  
  /**
    * By default, styles are not attached to the DOM and they are not reflected in the serialized HTML.
    * Setting this option to `true` will include the component's styles in the serializable output.
    */
  var attachStyles: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default, any changes to component properties and attributes must `page.waitForChanges()` in order to test the updates. As an option, `autoAppluChanges` continuously flushes the queue on the background. Default is `false`.
    */
  var autoApplyChanges: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of components to test. Component classes can be imported into the spec file, then their reference should be added to the `component` array in order to be used throughout the test.
    */
  var components: js.Array[Any]
  
  /**
    * Sets the mocked `document.cookie`.
    */
  var cookie: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the mocked `dir` attribute on `<html>`.
    */
  var direction: js.UndefOr[String] = js.undefined
  
  var flushQueue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The initial HTML used to generate the test. This can be useful to construct a collection of components working together, and assign HTML attributes. This value sets the mocked `document.body.innerHTML`.
    */
  var html: js.UndefOr[String] = js.undefined
  
  /**
    * Useful for debugging hydrating components client-side. Sets that the `html` option already includes annotated prerender attributes and comments.
    */
  var hydrateClientSide: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Useful for debugging hydrating components server-side. The output HTML will also include prerender annotations.
    */
  var hydrateServerSide: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When a component is prerendered it includes HTML annotations, such as `s-id` attributes and `<!-t.0->` comments. This information is used by clientside hydrating. Default is `false`.
    */
  var includeAnnotations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the mocked `lang` attribute on `<html>`.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the mocked `document.referrer`.
    */
  var referrer: js.UndefOr[String] = js.undefined
  
  var strictBuild: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Manually set if the mocked document supports Shadow DOM or not. Default is `true`.
    */
  var supportsShadowDom: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The initial JSX used to generate the test.
    * Use `template` when you want to initialize a component using their properties, instead of their HTML attributes.
    * It will render the specified template (JSX) into `document.body`.
    */
  var template: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /**
    * Sets the mocked browser's `location.href`.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the mocked browser's `navigator.userAgent`.
    */
  var userAgent: js.UndefOr[String] = js.undefined
}
object NewSpecPageOptions {
  
  inline def apply(components: js.Array[Any]): NewSpecPageOptions = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewSpecPageOptions]
  }
  
  extension [Self <: NewSpecPageOptions](x: Self) {
    
    inline def setAttachStyles(value: Boolean): Self = StObject.set(x, "attachStyles", value.asInstanceOf[js.Any])
    
    inline def setAttachStylesUndefined: Self = StObject.set(x, "attachStyles", js.undefined)
    
    inline def setAutoApplyChanges(value: Boolean): Self = StObject.set(x, "autoApplyChanges", value.asInstanceOf[js.Any])
    
    inline def setAutoApplyChangesUndefined: Self = StObject.set(x, "autoApplyChanges", js.undefined)
    
    inline def setComponents(value: js.Array[Any]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsVarargs(value: Any*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setFlushQueue(value: Boolean): Self = StObject.set(x, "flushQueue", value.asInstanceOf[js.Any])
    
    inline def setFlushQueueUndefined: Self = StObject.set(x, "flushQueue", js.undefined)
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setHydrateClientSide(value: Boolean): Self = StObject.set(x, "hydrateClientSide", value.asInstanceOf[js.Any])
    
    inline def setHydrateClientSideUndefined: Self = StObject.set(x, "hydrateClientSide", js.undefined)
    
    inline def setHydrateServerSide(value: Boolean): Self = StObject.set(x, "hydrateServerSide", value.asInstanceOf[js.Any])
    
    inline def setHydrateServerSideUndefined: Self = StObject.set(x, "hydrateServerSide", js.undefined)
    
    inline def setIncludeAnnotations(value: Boolean): Self = StObject.set(x, "includeAnnotations", value.asInstanceOf[js.Any])
    
    inline def setIncludeAnnotationsUndefined: Self = StObject.set(x, "includeAnnotations", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    inline def setStrictBuild(value: Boolean): Self = StObject.set(x, "strictBuild", value.asInstanceOf[js.Any])
    
    inline def setStrictBuildUndefined: Self = StObject.set(x, "strictBuild", js.undefined)
    
    inline def setSupportsShadowDom(value: Boolean): Self = StObject.set(x, "supportsShadowDom", value.asInstanceOf[js.Any])
    
    inline def setSupportsShadowDomUndefined: Self = StObject.set(x, "supportsShadowDom", js.undefined)
    
    inline def setTemplate(value: () => Any): Self = StObject.set(x, "template", js.Any.fromFunction0(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
  }
}
