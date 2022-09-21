package typings.semanticUiSearch.SemanticUI

import typings.semanticUiSearch.JQuery
import typings.semanticUiSearch.SemanticUI.Search.ClassNameSettings.Param
import typings.semanticUiSearch.semanticUiSearchStrings.`add results`
import typings.semanticUiSearch.semanticUiSearchStrings.`cancel query`
import typings.semanticUiSearch.semanticUiSearchStrings.`clear cache`
import typings.semanticUiSearch.semanticUiSearchStrings.`display message`
import typings.semanticUiSearch.semanticUiSearchStrings.`generate results`
import typings.semanticUiSearch.semanticUiSearchStrings.`get result`
import typings.semanticUiSearch.semanticUiSearchStrings.`get value`
import typings.semanticUiSearch.semanticUiSearchStrings.`has minimum characters`
import typings.semanticUiSearch.semanticUiSearchStrings.`hide results`
import typings.semanticUiSearch.semanticUiSearchStrings.`is empty`
import typings.semanticUiSearch.semanticUiSearchStrings.`is focused`
import typings.semanticUiSearch.semanticUiSearchStrings.`is visible`
import typings.semanticUiSearch.semanticUiSearchStrings.`read cache`
import typings.semanticUiSearch.semanticUiSearchStrings.`search local`
import typings.semanticUiSearch.semanticUiSearchStrings.`search object`
import typings.semanticUiSearch.semanticUiSearchStrings.`search remote`
import typings.semanticUiSearch.semanticUiSearchStrings.`set value`
import typings.semanticUiSearch.semanticUiSearchStrings.`show results`
import typings.semanticUiSearch.semanticUiSearchStrings.`write cache`
import typings.semanticUiSearch.semanticUiSearchStrings.destroy
import typings.semanticUiSearch.semanticUiSearchStrings.query
import typings.semanticUiSearch.semanticUiSearchStrings.setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Search extends StObject {
  
  def apply(): JQuery = js.native
  /**
    * Adds HTML to results and displays
    */
  def apply(behavior: `add results`, html: String): JQuery = js.native
  /**
    * Cancels current remote search query
    */
  def apply(behavior: `cancel query`): JQuery = js.native
  /**
    * Clears value from cache, if no parameter passed clears all cache
    */
  def apply(behavior: `clear cache`): JQuery = js.native
  def apply(behavior: `clear cache`, query: String): JQuery = js.native
  /**
    * Displays message in search results with text, using template matching type
    */
  def apply(behavior: `display message`, text: String, `type`: String): JQuery = js.native
  /**
    * Generates results using parser specified by settings.template
    */
  def apply(behavior: `generate results`, response: Any): JQuery = js.native
  /**
    * Returns JSON object matching searched title or id (see above)
    */
  def apply(behavior: `get result`, value: Any): Any = js.native
  /**
    * Returns current search value
    */
  def apply(behavior: `get value`): Any = js.native
  /**
    * Whether has minimum characters
    */
  def apply(behavior: `has minimum characters`): Boolean = js.native
  /**
    * Hides results container
    */
  def apply(behavior: `hide results`): JQuery = js.native
  def apply(behavior: `hide results`, callback: js.Function0[Unit]): JQuery = js.native
  /**
    * Whether search results are empty
    */
  def apply(behavior: `is empty`): Boolean = js.native
  /**
    * Whether search is currently focused
    */
  def apply(behavior: `is focused`): Boolean = js.native
  /**
    * Whether search results are visible
    */
  def apply(behavior: `is visible`): Boolean = js.native
  /**
    * Reads cached results for query
    */
  def apply(behavior: `read cache`, query: String): JQuery = js.native
  /**
    * Search local object for specified query and display results
    */
  def apply(behavior: `search local`, query: String): JQuery = js.native
  /**
    * Search object for specified query and return results
    */
  def apply(behavior: `search object`, query: String, `object`: Any, searchFields: js.Array[String]): Any = js.native
  /**
    * Search remote endpoint for specified query and display results
    */
  def apply(behavior: `search remote`, query: String): JQuery = js.native
  def apply(behavior: `search remote`, query: String, callback: js.Function0[Unit]): JQuery = js.native
  /**
    * Sets search input to value
    */
  def apply(behavior: `set value`, value: Any): JQuery = js.native
  /**
    * Shows results container
    */
  def apply(behavior: `show results`): JQuery = js.native
  def apply(behavior: `show results`, callback: js.Function0[Unit]): JQuery = js.native
  /**
    * Writes cached results for query
    */
  def apply(behavior: `write cache`, query: String): JQuery = js.native
  /**
    * Removes all events
    */
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Search for value currently set in search input
    */
  def apply(behavior: query): JQuery = js.native
  def apply(behavior: query, callback: js.Function0[Unit]): JQuery = js.native
  def apply(behavior: setting, value: SearchSettings): JQuery = js.native
  def apply(settings: SearchSettings): JQuery = js.native
  def apply[K /* <: /* keyof semantic-ui-search.SemanticUI.SearchSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-search.SemanticUI.SearchSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  def apply[K /* <: /* keyof semantic-ui-search.SemanticUI.SearchSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-search.SemanticUI.SearchSettings._Impl[K] */ js.Any = js.native
  
  var settings: SearchSettings = js.native
}
object Search {
  
  object ClassNameSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 'active'
        */
      var active: String
      
      /**
        * @default 'empty'
        */
      var empty: String
      
      /**
        * @default 'focus'
        */
      var focus: String
      
      /**
        * @default 'loading'
        */
      var loading: String
      
      /**
        * @default 'down'
        */
      var pressed: String
    }
    object Impl {
      
      inline def apply(active: String, empty: String, focus: String, loading: String, pressed: String): Impl = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        inline def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
        
        inline def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
        
        inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
        
        inline def setPressed(value: String): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiSearch.anon.PickImplactivePartialPick
      - typings.semanticUiSearch.anon.PickImplemptyPartialPickI
      - typings.semanticUiSearch.anon.PickImplfocusPartialPickI
      - typings.semanticUiSearch.anon.PickImplloadingPartialPic
      - typings.semanticUiSearch.anon.PickImplpressedPartialPic
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplactivePartialPick(active: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplactivePartialPick = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplactivePartialPick]
      }
      
      inline def PickImplemptyPartialPickI(empty: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplemptyPartialPickI = {
        val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplemptyPartialPickI]
      }
      
      inline def PickImplfocusPartialPickI(focus: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplfocusPartialPickI = {
        val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplfocusPartialPickI]
      }
      
      inline def PickImplloadingPartialPic(loading: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplloadingPartialPic = {
        val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplloadingPartialPic]
      }
      
      inline def PickImplpressedPartialPic(pressed: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplpressedPartialPic = {
        val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplpressedPartialPic]
      }
    }
  }
  type ClassNameSettings = Param
  
  object ErrorSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 'Error in debug logging, exiting.'
        */
      var logging: String
      
      /**
        * @default 'Results must be an array to use maxResults setting'
        */
      var maxResults: String
      
      /**
        * @default 'The method you called is not defined.'
        */
      var method: String
      
      /**
        * @default 'Your search returned no results'
        */
      var noResults: String
      
      /**
        * @default 'A valid template name was not specified.'
        */
      var noTemplate: String
      
      /**
        * @default 'There was an issue with querying the server.'
        */
      var serverError: String
      
      /**
        * @default 'Cannot search. No source used, and Semantic API module was not included'
        */
      var source: String
    }
    object Impl {
      
      inline def apply(
        logging: String,
        maxResults: String,
        method: String,
        noResults: String,
        noTemplate: String,
        serverError: String,
        source: String
      ): Impl = {
        val __obj = js.Dynamic.literal(logging = logging.asInstanceOf[js.Any], maxResults = maxResults.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], noResults = noResults.asInstanceOf[js.Any], noTemplate = noTemplate.asInstanceOf[js.Any], serverError = serverError.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setLogging(value: String): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
        
        inline def setMaxResults(value: String): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setNoResults(value: String): Self = StObject.set(x, "noResults", value.asInstanceOf[js.Any])
        
        inline def setNoTemplate(value: String): Self = StObject.set(x, "noTemplate", value.asInstanceOf[js.Any])
        
        inline def setServerError(value: String): Self = StObject.set(x, "serverError", value.asInstanceOf[js.Any])
        
        inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiSearch.anon.PickImplsourcePartialPickLogging
      - typings.semanticUiSearch.anon.PickImplnoResultsPartialP
      - typings.semanticUiSearch.anon.PickImplloggingPartialPic
      - typings.semanticUiSearch.anon.PickImplnoTemplatePartial
      - typings.semanticUiSearch.anon.PickImplserverErrorPartia
      - typings.semanticUiSearch.anon.PickImplmaxResultsPartialLogging
      - typings.semanticUiSearch.anon.PickImplmethodPartialPick
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplloggingPartialPic(logging: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplloggingPartialPic = {
        val __obj = js.Dynamic.literal(logging = logging.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplloggingPartialPic]
      }
      
      inline def PickImplmaxResultsPartialLogging(maxResults: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplmaxResultsPartialLogging = {
        val __obj = js.Dynamic.literal(maxResults = maxResults.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplmaxResultsPartialLogging]
      }
      
      inline def PickImplmethodPartialPick(method: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplmethodPartialPick = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplmethodPartialPick]
      }
      
      inline def PickImplnoResultsPartialP(noResults: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplnoResultsPartialP = {
        val __obj = js.Dynamic.literal(noResults = noResults.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplnoResultsPartialP]
      }
      
      inline def PickImplnoTemplatePartial(noTemplate: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplnoTemplatePartial = {
        val __obj = js.Dynamic.literal(noTemplate = noTemplate.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplnoTemplatePartial]
      }
      
      inline def PickImplserverErrorPartia(serverError: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplserverErrorPartia = {
        val __obj = js.Dynamic.literal(serverError = serverError.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplserverErrorPartia]
      }
      
      inline def PickImplsourcePartialPickLogging(source: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplsourcePartialPickLogging = {
        val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplsourcePartialPickLogging]
      }
    }
  }
  type ErrorSettings = typings.semanticUiSearch.SemanticUI.Search.ErrorSettings.Param
  
  object FieldsSettings {
    
    trait Impl extends StObject {
      
      /**
        * "view more" object name
        *
        * @default 'action'
        */
      var action: String
      
      /**
        * "view more" text
        *
        * @default 'text'
        */
      var actionText: String
      
      /**
        * "view more" url
        *
        * @default 'url'
        */
      var actionURL: String
      
      /**
        * array of categories (category view)
        *
        * @default 'results'
        */
      var categories: String
      
      /**
        * name of category (category view)
        *
        * @default 'name'
        */
      var categoryName: String
      
      /**
        * array of results (category view)
        *
        * @default 'results'
        */
      var categoryResults: String
      
      /**
        * result description
        *
        * @default 'description'
        */
      var description: String
      
      /**
        * result image
        *
        * @default 'image'
        */
      var image: String
      
      /**
        * result price
        *
        * @default 'price'
        */
      var price: String
      
      /**
        * array of results (standard)
        *
        * @default 'results'
        */
      var results: String
      
      /**
        * result title
        *
        * @default 'title'
        */
      var title: String
    }
    object Impl {
      
      inline def apply(
        action: String,
        actionText: String,
        actionURL: String,
        categories: String,
        categoryName: String,
        categoryResults: String,
        description: String,
        image: String,
        price: String,
        results: String,
        title: String
      ): Impl = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], actionText = actionText.asInstanceOf[js.Any], actionURL = actionURL.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], categoryName = categoryName.asInstanceOf[js.Any], categoryResults = categoryResults.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        inline def setActionText(value: String): Self = StObject.set(x, "actionText", value.asInstanceOf[js.Any])
        
        inline def setActionURL(value: String): Self = StObject.set(x, "actionURL", value.asInstanceOf[js.Any])
        
        inline def setCategories(value: String): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
        
        inline def setCategoryName(value: String): Self = StObject.set(x, "categoryName", value.asInstanceOf[js.Any])
        
        inline def setCategoryResults(value: String): Self = StObject.set(x, "categoryResults", value.asInstanceOf[js.Any])
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
        
        inline def setResults(value: String): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiSearch.anon.PickImplcategoriesPartial
      - typings.semanticUiSearch.anon.PickImplcategoryNameParti
      - typings.semanticUiSearch.anon.PickImplcategoryResultsPa
      - typings.semanticUiSearch.anon.PickImpldescriptionPartia
      - typings.semanticUiSearch.anon.PickImplimagePartialPickI
      - typings.semanticUiSearch.anon.PickImplpricePartialPickI
      - typings.semanticUiSearch.anon.PickImplresultsPartialPic
      - typings.semanticUiSearch.anon.PickImpltitlePartialPickI
      - typings.semanticUiSearch.anon.PickImplactionPartialPick
      - typings.semanticUiSearch.anon.PickImplactionTextPartial
      - typings.semanticUiSearch.anon.PickImplactionURLPartialP
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplactionPartialPick(action: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplactionPartialPick = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplactionPartialPick]
      }
      
      inline def PickImplactionTextPartial(actionText: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplactionTextPartial = {
        val __obj = js.Dynamic.literal(actionText = actionText.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplactionTextPartial]
      }
      
      inline def PickImplactionURLPartialP(actionURL: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplactionURLPartialP = {
        val __obj = js.Dynamic.literal(actionURL = actionURL.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplactionURLPartialP]
      }
      
      inline def PickImplcategoriesPartial(categories: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplcategoriesPartial = {
        val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplcategoriesPartial]
      }
      
      inline def PickImplcategoryNameParti(categoryName: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplcategoryNameParti = {
        val __obj = js.Dynamic.literal(categoryName = categoryName.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplcategoryNameParti]
      }
      
      inline def PickImplcategoryResultsPa(categoryResults: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplcategoryResultsPa = {
        val __obj = js.Dynamic.literal(categoryResults = categoryResults.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplcategoryResultsPa]
      }
      
      inline def PickImpldescriptionPartia(description: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImpldescriptionPartia = {
        val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImpldescriptionPartia]
      }
      
      inline def PickImplimagePartialPickI(image: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplimagePartialPickI = {
        val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplimagePartialPickI]
      }
      
      inline def PickImplpricePartialPickI(price: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplpricePartialPickI = {
        val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplpricePartialPickI]
      }
      
      inline def PickImplresultsPartialPic(results: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplresultsPartialPic = {
        val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplresultsPartialPic]
      }
      
      inline def PickImpltitlePartialPickI(title: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImpltitlePartialPickI = {
        val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImpltitlePartialPickI]
      }
    }
  }
  type FieldsSettings = typings.semanticUiSearch.SemanticUI.Search.FieldsSettings.Param
  
  object MetadataSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 'cache'
        */
      var cache: String
      
      /**
        * @default 'results'
        */
      var results: String
    }
    object Impl {
      
      inline def apply(cache: String, results: String): Impl = {
        val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
        
        inline def setResults(value: String): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiSearch.anon.PickImplcachePartialPickICache
      - typings.semanticUiSearch.anon.PickImplresultsPartialPicCache
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplcachePartialPickICache(cache: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplcachePartialPickICache = {
        val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplcachePartialPickICache]
      }
      
      inline def PickImplresultsPartialPicCache(results: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplresultsPartialPicCache = {
        val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplresultsPartialPicCache]
      }
    }
  }
  type MetadataSettings = typings.semanticUiSearch.SemanticUI.Search.MetadataSettings.Param
  
  object RegExpSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default '(?:\s|^)'
        */
      var beginsWith: String
      
      /**
        * @default /[\-\[\]\/\{\}\(\)\*\+\?\.\\\^\$\|]/g
        */
      var escape: js.RegExp
    }
    object Impl {
      
      inline def apply(beginsWith: String, escape: js.RegExp): Impl = {
        val __obj = js.Dynamic.literal(beginsWith = beginsWith.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setBeginsWith(value: String): Self = StObject.set(x, "beginsWith", value.asInstanceOf[js.Any])
        
        inline def setEscape(value: js.RegExp): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiSearch.anon.PickImplescapePartialPickBeginsWith
      - typings.semanticUiSearch.anon.PickImplbeginsWithPartial
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplbeginsWithPartial(beginsWith: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplbeginsWithPartial = {
        val __obj = js.Dynamic.literal(beginsWith = beginsWith.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplbeginsWithPartial]
      }
      
      inline def PickImplescapePartialPickBeginsWith(escape: js.RegExp & js.UndefOr[js.RegExp]): typings.semanticUiSearch.anon.PickImplescapePartialPickBeginsWith = {
        val __obj = js.Dynamic.literal(escape = escape.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplescapePartialPickBeginsWith]
      }
    }
  }
  type RegExpSettings = typings.semanticUiSearch.SemanticUI.Search.RegExpSettings.Param
  
  object SelectorSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default '.category'
        */
      var category: String
      
      /**
        * @default '.prompt'
        */
      var prompt: String
      
      /**
        * @default '.result'
        */
      var result: String
      
      /**
        * @default '.results'
        */
      var results: String
      
      /**
        * @default '.search.button'
        */
      var searchButton: String
    }
    object Impl {
      
      inline def apply(category: String, prompt: String, result: String, results: String, searchButton: String): Impl = {
        val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], searchButton = searchButton.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
        
        inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
        
        inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
        
        inline def setResults(value: String): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
        
        inline def setSearchButton(value: String): Self = StObject.set(x, "searchButton", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiSearch.anon.PickImplpromptPartialPick
      - typings.semanticUiSearch.anon.PickImplsearchButtonParti
      - typings.semanticUiSearch.anon.PickImplresultsPartialPicCategory
      - typings.semanticUiSearch.anon.PickImplcategoryPartialPiCategory
      - typings.semanticUiSearch.anon.PickImplresultPartialPick
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplcategoryPartialPiCategory(category: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplcategoryPartialPiCategory = {
        val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplcategoryPartialPiCategory]
      }
      
      inline def PickImplpromptPartialPick(prompt: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplpromptPartialPick = {
        val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplpromptPartialPick]
      }
      
      inline def PickImplresultPartialPick(result: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplresultPartialPick = {
        val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplresultPartialPick]
      }
      
      inline def PickImplresultsPartialPicCategory(results: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplresultsPartialPicCategory = {
        val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplresultsPartialPicCategory]
      }
      
      inline def PickImplsearchButtonParti(searchButton: String & js.UndefOr[String]): typings.semanticUiSearch.anon.PickImplsearchButtonParti = {
        val __obj = js.Dynamic.literal(searchButton = searchButton.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplsearchButtonParti]
      }
    }
  }
  type SelectorSettings = typings.semanticUiSearch.SemanticUI.Search.SelectorSettings.Param
  
  object TemplatesSettings {
    
    trait Impl extends StObject {
      
      def category(response: Any): String
      
      def escape(string: String): String
      
      def message(message: String, `type`: String): String
      
      def standard(response: Any): String
    }
    object Impl {
      
      inline def apply(
        category: Any => String,
        escape: String => String,
        message: (String, String) => String,
        standard: Any => String
      ): Impl = {
        val __obj = js.Dynamic.literal(category = js.Any.fromFunction1(category), escape = js.Any.fromFunction1(escape), message = js.Any.fromFunction2(message), standard = js.Any.fromFunction1(standard))
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setCategory(value: Any => String): Self = StObject.set(x, "category", js.Any.fromFunction1(value))
        
        inline def setEscape(value: String => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
        
        inline def setMessage(value: (String, String) => String): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
        
        inline def setStandard(value: Any => String): Self = StObject.set(x, "standard", js.Any.fromFunction1(value))
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiSearch.anon.PickImplescapePartialPick
      - typings.semanticUiSearch.anon.PickImplmessagePartialPic
      - typings.semanticUiSearch.anon.PickImplcategoryPartialPi
      - typings.semanticUiSearch.anon.PickImplstandardPartialPi
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplcategoryPartialPi(
        category: (js.Function1[/* response */ Any, String]) & (js.UndefOr[js.Function1[/* response */ Any, String]])
      ): typings.semanticUiSearch.anon.PickImplcategoryPartialPi = {
        val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplcategoryPartialPi]
      }
      
      inline def PickImplescapePartialPick(
        escape: (js.Function1[/* string */ String, String]) & (js.UndefOr[js.Function1[/* string */ String, String]])
      ): typings.semanticUiSearch.anon.PickImplescapePartialPick = {
        val __obj = js.Dynamic.literal(escape = escape.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplescapePartialPick]
      }
      
      inline def PickImplmessagePartialPic(
        message: (js.Function2[/* message */ String, /* type */ String, String]) & (js.UndefOr[js.Function2[/* message */ String, /* type */ String, String]])
      ): typings.semanticUiSearch.anon.PickImplmessagePartialPic = {
        val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplmessagePartialPic]
      }
      
      inline def PickImplstandardPartialPi(
        standard: (js.Function1[/* response */ Any, String]) & (js.UndefOr[js.Function1[/* response */ Any, String]])
      ): typings.semanticUiSearch.anon.PickImplstandardPartialPi = {
        val __obj = js.Dynamic.literal(standard = standard.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSearch.anon.PickImplstandardPartialPi]
      }
    }
  }
  type TemplatesSettings = typings.semanticUiSearch.SemanticUI.Search.TemplatesSettings.Param
}
