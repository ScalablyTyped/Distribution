package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializeDocumentOptions
  extends StObject
     with HydrateDocumentOptions {
  
  /**
    * Runs after the `document` has been hydrated.
    */
  var afterHydrate: js.UndefOr[js.Function1[/* document */ Any, Any | js.Promise[Any]]] = js.undefined
  
  /**
    * Sets an approximate line width the HTML should attempt to stay within.
    * Note that this is "approximate", in that HTML may often not be able
    * to be split at an exact line width. Additionally, new lines created
    * is where HTML naturally already has whitespace, such as before an
    * attribute or spaces between words. Defaults to `100`.
    */
  var approximateLineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Runs before the `document` has been hydrated.
    */
  var beforeHydrate: js.UndefOr[js.Function1[/* document */ Any, Any | js.Promise[Any]]] = js.undefined
  
  /**
    * Format the HTML in a nicely indented format.
    * Defaults to `false`.
    */
  var prettyHtml: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Remove quotes from attribute values when possible.
    * Defaults to `true`.
    */
  var removeAttributeQuotes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Remove the `=""` from standardized `boolean` attributes,
    * such as `hidden` or `checked`. Defaults to `true`.
    */
  var removeBooleanAttributeQuotes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Remove these standardized attributes when their value is empty:
    * `class`, `dir`, `id`, `lang`, and `name`, `title`. Defaults to `true`.
    */
  var removeEmptyAttributes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Remove HTML comments. Defaults to `true`.
    */
  var removeHtmlComments: js.UndefOr[Boolean] = js.undefined
}
object SerializeDocumentOptions {
  
  inline def apply(): SerializeDocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializeDocumentOptions]
  }
  
  extension [Self <: SerializeDocumentOptions](x: Self) {
    
    inline def setAfterHydrate(value: /* document */ Any => Any | js.Promise[Any]): Self = StObject.set(x, "afterHydrate", js.Any.fromFunction1(value))
    
    inline def setAfterHydrateUndefined: Self = StObject.set(x, "afterHydrate", js.undefined)
    
    inline def setApproximateLineWidth(value: Double): Self = StObject.set(x, "approximateLineWidth", value.asInstanceOf[js.Any])
    
    inline def setApproximateLineWidthUndefined: Self = StObject.set(x, "approximateLineWidth", js.undefined)
    
    inline def setBeforeHydrate(value: /* document */ Any => Any | js.Promise[Any]): Self = StObject.set(x, "beforeHydrate", js.Any.fromFunction1(value))
    
    inline def setBeforeHydrateUndefined: Self = StObject.set(x, "beforeHydrate", js.undefined)
    
    inline def setPrettyHtml(value: Boolean): Self = StObject.set(x, "prettyHtml", value.asInstanceOf[js.Any])
    
    inline def setPrettyHtmlUndefined: Self = StObject.set(x, "prettyHtml", js.undefined)
    
    inline def setRemoveAttributeQuotes(value: Boolean): Self = StObject.set(x, "removeAttributeQuotes", value.asInstanceOf[js.Any])
    
    inline def setRemoveAttributeQuotesUndefined: Self = StObject.set(x, "removeAttributeQuotes", js.undefined)
    
    inline def setRemoveBooleanAttributeQuotes(value: Boolean): Self = StObject.set(x, "removeBooleanAttributeQuotes", value.asInstanceOf[js.Any])
    
    inline def setRemoveBooleanAttributeQuotesUndefined: Self = StObject.set(x, "removeBooleanAttributeQuotes", js.undefined)
    
    inline def setRemoveEmptyAttributes(value: Boolean): Self = StObject.set(x, "removeEmptyAttributes", value.asInstanceOf[js.Any])
    
    inline def setRemoveEmptyAttributesUndefined: Self = StObject.set(x, "removeEmptyAttributes", js.undefined)
    
    inline def setRemoveHtmlComments(value: Boolean): Self = StObject.set(x, "removeHtmlComments", value.asInstanceOf[js.Any])
    
    inline def setRemoveHtmlCommentsUndefined: Self = StObject.set(x, "removeHtmlComments", js.undefined)
  }
}
