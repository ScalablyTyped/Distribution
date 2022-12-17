package typings.semanticUiApi

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery.Deferred
import typings.jquery.JQuery.jqXHR
import typings.jquery.JQueryDeferred
import typings.semanticUiApi.SemanticUI.Api.ClassNameSettings
import typings.semanticUiApi.SemanticUI.Api.ClassNameSettings.Param
import typings.semanticUiApi.SemanticUI.Api.ErrorSettings
import typings.semanticUiApi.SemanticUI.Api.MetadataSettings
import typings.semanticUiApi.SemanticUI.Api.RegExpSettings
import typings.semanticUiApi.SemanticUI.Api.SelectorSettings
import typings.semanticUiApi.semanticUiApiBooleans.`false`
import typings.semanticUiApi.semanticUiApiBooleans.`true`
import typings.semanticUiApi.semanticUiApiStrings.`add url data`
import typings.semanticUiApi.semanticUiApiStrings.`create cache`
import typings.semanticUiApi.semanticUiApiStrings.`get event`
import typings.semanticUiApi.semanticUiApiStrings.`get request`
import typings.semanticUiApi.semanticUiApiStrings.`get url encoded value`
import typings.semanticUiApi.semanticUiApiStrings.`is disabled`
import typings.semanticUiApi.semanticUiApiStrings.`is loading`
import typings.semanticUiApi.semanticUiApiStrings.`is mocked`
import typings.semanticUiApi.semanticUiApiStrings.`read cached response`
import typings.semanticUiApi.semanticUiApiStrings.`remove error`
import typings.semanticUiApi.semanticUiApiStrings.`remove loading`
import typings.semanticUiApi.semanticUiApiStrings.`set error`
import typings.semanticUiApi.semanticUiApiStrings.`set loading`
import typings.semanticUiApi.semanticUiApiStrings.`was cancelled`
import typings.semanticUiApi.semanticUiApiStrings.`was complete`
import typings.semanticUiApi.semanticUiApiStrings.`was failure`
import typings.semanticUiApi.semanticUiApiStrings.`was successful`
import typings.semanticUiApi.semanticUiApiStrings.`write cached response`
import typings.semanticUiApi.semanticUiApiStrings.abort
import typings.semanticUiApi.semanticUiApiStrings.auto
import typings.semanticUiApi.semanticUiApiStrings.delete
import typings.semanticUiApi.semanticUiApiStrings.destroy
import typings.semanticUiApi.semanticUiApiStrings.get
import typings.semanticUiApi.semanticUiApiStrings.head
import typings.semanticUiApi.semanticUiApiStrings.html
import typings.semanticUiApi.semanticUiApiStrings.json
import typings.semanticUiApi.semanticUiApiStrings.jsonp
import typings.semanticUiApi.semanticUiApiStrings.local
import typings.semanticUiApi.semanticUiApiStrings.options
import typings.semanticUiApi.semanticUiApiStrings.patch
import typings.semanticUiApi.semanticUiApiStrings.post
import typings.semanticUiApi.semanticUiApiStrings.put
import typings.semanticUiApi.semanticUiApiStrings.query
import typings.semanticUiApi.semanticUiApiStrings.reset
import typings.semanticUiApi.semanticUiApiStrings.script
import typings.semanticUiApi.semanticUiApiStrings.setting
import typings.semanticUiApi.semanticUiApiStrings.text
import typings.semanticUiApi.semanticUiApiStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Api extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Adds data to existing templated url and returns full url string
      */
    def apply(behavior: `add url data`, url: String, data: Any): String = js.native
    /**
      * Creates new cache, removing all locally cached URLs
      */
    def apply(behavior: `create cache`): JQuery = js.native
    /**
      * Gets event that API request will occur on
      */
    def apply(behavior: `get event`): String = js.native
    /**
      * Gets promise for current API request
      */
    def apply(behavior: `get request`): JQueryDeferred[Any] | `false` = js.native
    /**
      * Returns encodeURIComponent value only if value passed is not already encoded
      */
    def apply(behavior: `get url encoded value`, value: Any): String = js.native
    /**
      * Returns whether element is disabled
      */
    def apply(behavior: `is disabled`): Boolean = js.native
    /**
      * Returns whether element is loading
      */
    def apply(behavior: `is loading`): Boolean = js.native
    /**
      * Returns whether element response is mocked
      */
    def apply(behavior: `is mocked`): Boolean = js.native
    /**
      * Reads a locally cached response for a URL
      */
    def apply(behavior: `read cached response`, url: String): Any = js.native
    /**
      * Removes error state to element
      */
    def apply(behavior: `remove error`): JQuery = js.native
    /**
      * Removes loading state to element
      */
    def apply(behavior: `remove loading`): JQuery = js.native
    /**
      * Sets error state to element
      */
    def apply(behavior: `set error`): JQuery = js.native
    /**
      * Sets loading state to element
      */
    def apply(behavior: `set loading`): JQuery = js.native
    /**
      * Returns whether last request was cancelled
      */
    def apply(behavior: `was cancelled`): Boolean = js.native
    /**
      * Returns whether last request was completed
      */
    def apply(behavior: `was complete`): Boolean = js.native
    /**
      * Returns whether last request was failure
      */
    def apply(behavior: `was failure`): Boolean = js.native
    /**
      * Returns whether last request was successful
      */
    def apply(behavior: `was successful`): Boolean = js.native
    /**
      * Writes a cached response for a URL
      */
    def apply(behavior: `write cached response`, url: String, response: Any): JQuery = js.native
    /**
      * Aborts current API request
      */
    def apply(behavior: abort): JQuery = js.native
    /**
      * Removes API settings from the page and all events
      */
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Execute query using existing API settings
      */
    def apply(behavior: query): JQuery = js.native
    /**
      * Removes loading and error state from element
      */
    def apply(behavior: reset): JQuery = js.native
    def apply(behavior: setting, value: ApiSettings): JQuery = js.native
    def apply(settings: ApiSettings): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-api.SemanticUI.ApiSettings */ String */](
      behavior: setting,
      name: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-api.SemanticUI.ApiSettings._Impl[K] */ js.Any
    ): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-api.SemanticUI.ApiSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-api.SemanticUI.ApiSettings._Impl[K] */ js.Any = js.native
    
    var settings: ApiSettings = js.native
  }
  object Api {
    
    object ClassNameSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'error'
          */
        var error: String
        
        /**
          * @default 'loading'
          */
        var loading: String
      }
      object Impl {
        
        inline def apply(error: String, loading: String): Impl = {
          val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
          
          inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.semanticUiApi.anon.PickImplloadingPartialPic
        - typings.semanticUiApi.anon.PickImplerrorPartialPickIError
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplerrorPartialPickIError(error: String): typings.semanticUiApi.anon.PickImplerrorPartialPickIError = {
          val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplerrorPartialPickIError]
        }
        
        inline def PickImplloadingPartialPic(loading: String): typings.semanticUiApi.anon.PickImplloadingPartialPic = {
          val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplloadingPartialPic]
        }
      }
    }
    type ClassNameSettings = Param
    
    object ErrorSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'JSON could not be parsed during error handling'
          */
        var JSONParse: String
        
        /**
          * @default 'The before send function has aborted the request'
          */
        var beforeSend: String
        
        /**
          * @default 'There was an error with your request'
          */
        var error: String
        
        /**
          * @default 'API Request Aborted. Exit conditions met'
          */
        var exitConditions: String
        
        /**
          * @default 'You are using legacy API success callback names'
          */
        var legacyParameters: String
        
        /**
          * @default 'API action used but no url was defined'
          */
        var missingAction: String
        
        /**
          * @default 'Required dependency jquery-serialize-object missing, using basic serialize'
          */
        var missingSerialize: String
        
        /**
          * @default 'No URL specified for API event'
          */
        var missingURL: String
        
        /**
          * @default 'The beforeSend callback must return a settings object, beforeSend ignored.'
          */
        var noReturnedValue: String
        
        /**
          * @default 'There was an error parsing your request'
          */
        var parseError: String
        
        /**
          * @default 'Missing a required URL parameter: '
          */
        var requiredParameter: String
        
        /**
          * @default 'Server gave an error: '
          */
        var statusMessage: String
        
        /**
          * @default 'Your request timed out'
          */
        var timeout: String
      }
      object Impl {
        
        inline def apply(
          JSONParse: String,
          beforeSend: String,
          error: String,
          exitConditions: String,
          legacyParameters: String,
          missingAction: String,
          missingSerialize: String,
          missingURL: String,
          noReturnedValue: String,
          parseError: String,
          requiredParameter: String,
          statusMessage: String,
          timeout: String
        ): Impl = {
          val __obj = js.Dynamic.literal(JSONParse = JSONParse.asInstanceOf[js.Any], beforeSend = beforeSend.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exitConditions = exitConditions.asInstanceOf[js.Any], legacyParameters = legacyParameters.asInstanceOf[js.Any], missingAction = missingAction.asInstanceOf[js.Any], missingSerialize = missingSerialize.asInstanceOf[js.Any], missingURL = missingURL.asInstanceOf[js.Any], noReturnedValue = noReturnedValue.asInstanceOf[js.Any], parseError = parseError.asInstanceOf[js.Any], requiredParameter = requiredParameter.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setBeforeSend(value: String): Self = StObject.set(x, "beforeSend", value.asInstanceOf[js.Any])
          
          inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
          
          inline def setExitConditions(value: String): Self = StObject.set(x, "exitConditions", value.asInstanceOf[js.Any])
          
          inline def setJSONParse(value: String): Self = StObject.set(x, "JSONParse", value.asInstanceOf[js.Any])
          
          inline def setLegacyParameters(value: String): Self = StObject.set(x, "legacyParameters", value.asInstanceOf[js.Any])
          
          inline def setMissingAction(value: String): Self = StObject.set(x, "missingAction", value.asInstanceOf[js.Any])
          
          inline def setMissingSerialize(value: String): Self = StObject.set(x, "missingSerialize", value.asInstanceOf[js.Any])
          
          inline def setMissingURL(value: String): Self = StObject.set(x, "missingURL", value.asInstanceOf[js.Any])
          
          inline def setNoReturnedValue(value: String): Self = StObject.set(x, "noReturnedValue", value.asInstanceOf[js.Any])
          
          inline def setParseError(value: String): Self = StObject.set(x, "parseError", value.asInstanceOf[js.Any])
          
          inline def setRequiredParameter(value: String): Self = StObject.set(x, "requiredParameter", value.asInstanceOf[js.Any])
          
          inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
          
          inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.semanticUiApi.anon.PickImplbeforeSendPartialBeforeSend
        - typings.semanticUiApi.anon.PickImplerrorPartialPickIBeforeSend
        - typings.semanticUiApi.anon.PickImplexitConditionsPar
        - typings.semanticUiApi.anon.PickImplJSONParsePartialP
        - typings.semanticUiApi.anon.PickImpllegacyParametersP
        - typings.semanticUiApi.anon.PickImplmissingActionPart
        - typings.semanticUiApi.anon.PickImplmissingSerializeP
        - typings.semanticUiApi.anon.PickImplmissingURLPartial
        - typings.semanticUiApi.anon.PickImplnoReturnedValuePa
        - typings.semanticUiApi.anon.PickImplparseErrorPartial
        - typings.semanticUiApi.anon.PickImplrequiredParameter
        - typings.semanticUiApi.anon.PickImplstatusMessagePart
        - typings.semanticUiApi.anon.PickImpltimeoutPartialPic
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplJSONParsePartialP(JSONParse: String): typings.semanticUiApi.anon.PickImplJSONParsePartialP = {
          val __obj = js.Dynamic.literal(JSONParse = JSONParse.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplJSONParsePartialP]
        }
        
        inline def PickImplbeforeSendPartialBeforeSend(beforeSend: String): typings.semanticUiApi.anon.PickImplbeforeSendPartialBeforeSend = {
          val __obj = js.Dynamic.literal(beforeSend = beforeSend.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplbeforeSendPartialBeforeSend]
        }
        
        inline def PickImplerrorPartialPickIBeforeSend(error: String): typings.semanticUiApi.anon.PickImplerrorPartialPickIBeforeSend = {
          val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplerrorPartialPickIBeforeSend]
        }
        
        inline def PickImplexitConditionsPar(exitConditions: String): typings.semanticUiApi.anon.PickImplexitConditionsPar = {
          val __obj = js.Dynamic.literal(exitConditions = exitConditions.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplexitConditionsPar]
        }
        
        inline def PickImpllegacyParametersP(legacyParameters: String): typings.semanticUiApi.anon.PickImpllegacyParametersP = {
          val __obj = js.Dynamic.literal(legacyParameters = legacyParameters.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiApi.anon.PickImpllegacyParametersP]
        }
        
        inline def PickImplmissingActionPart(missingAction: String): typings.semanticUiApi.anon.PickImplmissingActionPart = {
          val __obj = js.Dynamic.literal(missingAction = missingAction.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplmissingActionPart]
        }
        
        inline def PickImplmissingSerializeP(missingSerialize: String): typings.semanticUiApi.anon.PickImplmissingSerializeP = {
          val __obj = js.Dynamic.literal(missingSerialize = missingSerialize.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplmissingSerializeP]
        }
        
        inline def PickImplmissingURLPartial(missingURL: String): typings.semanticUiApi.anon.PickImplmissingURLPartial = {
          val __obj = js.Dynamic.literal(missingURL = missingURL.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplmissingURLPartial]
        }
        
        inline def PickImplnoReturnedValuePa(noReturnedValue: String): typings.semanticUiApi.anon.PickImplnoReturnedValuePa = {
          val __obj = js.Dynamic.literal(noReturnedValue = noReturnedValue.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplnoReturnedValuePa]
        }
        
        inline def PickImplparseErrorPartial(parseError: String): typings.semanticUiApi.anon.PickImplparseErrorPartial = {
          val __obj = js.Dynamic.literal(parseError = parseError.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplparseErrorPartial]
        }
        
        inline def PickImplrequiredParameter(requiredParameter: String): typings.semanticUiApi.anon.PickImplrequiredParameter = {
          val __obj = js.Dynamic.literal(requiredParameter = requiredParameter.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplrequiredParameter]
        }
        
        inline def PickImplstatusMessagePart(statusMessage: String): typings.semanticUiApi.anon.PickImplstatusMessagePart = {
          val __obj = js.Dynamic.literal(statusMessage = statusMessage.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplstatusMessagePart]
        }
        
        inline def PickImpltimeoutPartialPic(timeout: String): typings.semanticUiApi.anon.PickImpltimeoutPartialPic = {
          val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiApi.anon.PickImpltimeoutPartialPic]
        }
      }
    }
    type ErrorSettings = typings.semanticUiApi.SemanticUI.Api.ErrorSettings.Param
    
    object MetadataSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'action'
          */
        var action: String
        
        /**
          * @default 'url'
          */
        var url: String
      }
      object Impl {
        
        inline def apply(action: String, url: String): Impl = {
          val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
          
          inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.semanticUiApi.anon.PickImplactionPartialPickAction
        - typings.semanticUiApi.anon.PickImplurlPartialPickImpAction
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplactionPartialPickAction(action: String): typings.semanticUiApi.anon.PickImplactionPartialPickAction = {
          val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplactionPartialPickAction]
        }
        
        inline def PickImplurlPartialPickImpAction(url: String): typings.semanticUiApi.anon.PickImplurlPartialPickImpAction = {
          val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplurlPartialPickImpAction]
        }
      }
    }
    type MetadataSettings = typings.semanticUiApi.SemanticUI.Api.MetadataSettings.Param
    
    object RegExpSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default /\{\/\$*[A-z0-9]+\}/g
          */
        var optional: js.RegExp
        
        /**
          * @default /\{\$*[A-z0-9]+\}/g
          */
        var required: js.RegExp
      }
      object Impl {
        
        inline def apply(optional: js.RegExp, required: js.RegExp): Impl = {
          val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setOptional(value: js.RegExp): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
          
          inline def setRequired(value: js.RegExp): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.semanticUiApi.anon.PickImplrequiredPartialPi
        - typings.semanticUiApi.anon.PickImploptionalPartialPi
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImploptionalPartialPi(optional: js.RegExp): typings.semanticUiApi.anon.PickImploptionalPartialPi = {
          val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiApi.anon.PickImploptionalPartialPi]
        }
        
        inline def PickImplrequiredPartialPi(required: js.RegExp): typings.semanticUiApi.anon.PickImplrequiredPartialPi = {
          val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplrequiredPartialPi]
        }
      }
    }
    type RegExpSettings = typings.semanticUiApi.SemanticUI.Api.RegExpSettings.Param
    
    object SelectorSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default '.disabled'
          */
        var disabled: String
        
        /**
          * @default 'form'
          */
        var form: String
      }
      object Impl {
        
        inline def apply(disabled: String, form: String): Impl = {
          val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
          
          inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.semanticUiApi.anon.PickImpldisabledPartialPi
        - typings.semanticUiApi.anon.PickImplformPartialPickIm
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImpldisabledPartialPi(disabled: String): typings.semanticUiApi.anon.PickImpldisabledPartialPi = {
          val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiApi.anon.PickImpldisabledPartialPi]
        }
        
        inline def PickImplformPartialPickIm(form: String): typings.semanticUiApi.anon.PickImplformPartialPickIm = {
          val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplformPartialPickIm]
        }
      }
    }
    type SelectorSettings = typings.semanticUiApi.SemanticUI.Api.SelectorSettings.Param
  }
  
  object ApiSettings {
    
    trait Impl extends StObject {
      
      // endregion
      // region Request Settings
      /**
        * Named API action for query, originally specified in $.fn.settings.api
        */
      var action: String | `false`
      
      var api: StringDictionary[String]
      
      // endregion
      // region Callbacks
      /**
        * Allows modifying settings before request, or cancelling request
        */
      def beforeSend(settings: ApiSettings): Any
      
      /**
        * Allows modifying XHR object for request
        */
      def beforeXHR(xhrObject: jqXHR[Any]): Any
      
      /**
        * Can be set to 'local' to cache successful returned AJAX responses when using a JSON API.
        * This helps avoid server round trips when API endpoints will return the same results when accessed repeatedly.
        * Setting to false, will add cache busting parameters to the URL.
        *
        * @default true
        */
      var cache: local | Boolean
      
      /**
        * Class names used to determine element state
        */
      var className: ClassNameSettings
      
      /**
        * POST/GET Data to Send with Request
        */
      var data: Any
      
      /**
        * Expected data type of response
        */
      var dataType: xml | json | jsonp | script | html | text
      
      /**
        * Debug output to console
        */
      var debug: Boolean
      
      /**
        * Whether to automatically include default data like {value} and {text}
        *
        * @default true
        */
      var defaultData: Boolean
      
      /**
        * Whether to encode parameters with encodeURIComponent before adding into url string
        *
        * @default true
        */
      var encodeParameters: Boolean
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings
      
      /**
        * Setting to true, will not remove error.
        * Setting to a duration in milliseconds to show error state after request error.
        *
        * @default 2000
        */
      var errorDuration: `true` | Double
      
      /**
        * The default auto will automatically remove error state after error duration, unless the element is a form
        *
        * @default 'auto'
        */
      var hideError: auto | Boolean
      
      /**
        * Whether an API request can occur while another request is still pending
        *
        * @default false
        */
      var interruptRequests: Boolean
      
      /**
        * Minimum duration to show loading indication
        *
        * @default 0
        */
      var loadingDuration: Double
      
      /**
        * Metadata used to store XHR and response promise
        */
      var metadata: MetadataSettings
      
      /**
        * Method for transmitting request to server
        */
      var method: post | get | put | delete | head | options | patch
      
      /**
        * @see response
        */
      var mockResponse: Any | `false`
      
      /**
        * @see responseAsync
        */
      var mockResponseAsync: (js.Function2[
            /* settings */ ApiSettings, 
            /* callback */ js.Function1[/* response */ Any, Unit], 
            Unit
          ]) | `false`
      
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
      
      // region Behavior
      /**
        * When API event should occur
        *
        * @default 'auto'
        */
      var on: String
      
      /**
        * Callback on abort caused by user clicking a link or manually cancelling request.
        */
      def onAbort(errorMessage: String, element: JQuery, xhr: jqXHR[Any]): Unit
      
      /**
        * Callback on request complete regardless of conditions
        */
      def onComplete(response: Any, element: JQuery, xhr: jqXHR[Any]): Unit
      
      /**
        * Callback on server error from returned status code, or XHR failure.
        */
      def onError(errorMessage: String, element: JQuery, xhr: jqXHR[Any]): Unit
      
      /**
        * Callback on failed response, or JSON response that fails successTest
        */
      def onFailure(response: Any, element: JQuery): Unit
      
      /**
        * Callback that occurs when request is made. Receives both the API success promise and the XHR request promise.
        */
      def onRequest(promise: Deferred[Any, Any, Any], xhr: jqXHR[Any]): Unit
      
      /**
        * Allows modifying the server's response before parsed by other callbacks to determine API event success
        */
      def onResponse(response: Any): Unit
      
      /**
        * Callback after successful response, JSON response must pass successTest
        */
      def onSuccess(response: Any, element: JQuery, xhr: jqXHR[Any]): Unit
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean
      
      // endregion
      // region DOM Settings
      /**
        * Regular expressions used for template matching
        */
      var regExp: RegExpSettings
      
      /**
        * Can be set to a Javascript object which will be returned automatically instead of requesting JSON from server
        */
      var response: Any | `false`
      
      /**
        * When specified, this function can be used to retrieve content from a server and return it asynchronously instead of a standard AJAX call.
        * The callback function should return the server response.
        *
        * @default false
        */
      var responseAsync: (js.Function2[
            /* settings */ ApiSettings, 
            /* callback */ js.Function1[/* response */ Any, Unit], 
            Unit
          ]) | `false`
      
      /**
        * Selectors used to find parts of a module
        */
      var selector: SelectorSettings
      
      /**
        * Whether to serialize closest form and include in request
        *
        * @default false
        */
      var serializeForm: Boolean
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean
      
      /**
        * UI state will be applied to this element, defaults to triggering element.
        */
      var stateContext: String | JQuery
      
      /**
        * Determines whether completed JSON response should be treated as successful
        *
        * @see {@link http://semantic-ui.com/behaviors/api.html#determining-json-success}
        */
      def successTest(response: Any): Boolean
      
      /**
        * How long to wait when a request is made before triggering request, useful for rate limiting oninput
        *
        * @default 0
        */
      var throttle: Double
      
      /**
        * When set to false will not delay the first request made, when no others are queued
        *
        * @default true
        */
      var throttleFirstRequest: Boolean
      
      /**
        * Templated URL for query, will override specified action
        */
      var url: String | `false`
      
      /**
        * Variables to use for replacement
        */
      var urlData: Any | `false`
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean
    }
    object Impl {
      
      inline def apply(
        action: String | `false`,
        api: StringDictionary[String],
        beforeSend: ApiSettings => Any,
        beforeXHR: jqXHR[Any] => Any,
        cache: local | Boolean,
        className: ClassNameSettings,
        data: Any,
        dataType: xml | json | jsonp | script | html | text,
        debug: Boolean,
        defaultData: Boolean,
        encodeParameters: Boolean,
        error: ErrorSettings,
        errorDuration: `true` | Double,
        hideError: auto | Boolean,
        interruptRequests: Boolean,
        loadingDuration: Double,
        metadata: MetadataSettings,
        method: post | get | put | delete | head | options | patch,
        mockResponse: Any | `false`,
        mockResponseAsync: (js.Function2[
              /* settings */ ApiSettings, 
              /* callback */ js.Function1[/* response */ Any, Unit], 
              Unit
            ]) | `false`,
        name: String,
        namespace: String,
        on: String,
        onAbort: (String, JQuery, jqXHR[Any]) => Unit,
        onComplete: (Any, JQuery, jqXHR[Any]) => Unit,
        onError: (String, JQuery, jqXHR[Any]) => Unit,
        onFailure: (Any, JQuery) => Unit,
        onRequest: (Deferred[Any, Any, Any], jqXHR[Any]) => Unit,
        onResponse: Any => Unit,
        onSuccess: (Any, JQuery, jqXHR[Any]) => Unit,
        performance: Boolean,
        regExp: RegExpSettings,
        response: Any | `false`,
        responseAsync: (js.Function2[
              /* settings */ ApiSettings, 
              /* callback */ js.Function1[/* response */ Any, Unit], 
              Unit
            ]) | `false`,
        selector: SelectorSettings,
        serializeForm: Boolean,
        silent: Boolean,
        stateContext: String | JQuery,
        successTest: Any => Boolean,
        throttle: Double,
        throttleFirstRequest: Boolean,
        url: String | `false`,
        urlData: Any | `false`,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], beforeSend = js.Any.fromFunction1(beforeSend), beforeXHR = js.Any.fromFunction1(beforeXHR), cache = cache.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], defaultData = defaultData.asInstanceOf[js.Any], encodeParameters = encodeParameters.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], errorDuration = errorDuration.asInstanceOf[js.Any], hideError = hideError.asInstanceOf[js.Any], interruptRequests = interruptRequests.asInstanceOf[js.Any], loadingDuration = loadingDuration.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], mockResponse = mockResponse.asInstanceOf[js.Any], mockResponseAsync = mockResponseAsync.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onAbort = js.Any.fromFunction3(onAbort), onComplete = js.Any.fromFunction3(onComplete), onError = js.Any.fromFunction3(onError), onFailure = js.Any.fromFunction2(onFailure), onRequest = js.Any.fromFunction2(onRequest), onResponse = js.Any.fromFunction1(onResponse), onSuccess = js.Any.fromFunction3(onSuccess), performance = performance.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseAsync = responseAsync.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], serializeForm = serializeForm.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], stateContext = stateContext.asInstanceOf[js.Any], successTest = js.Any.fromFunction1(successTest), throttle = throttle.asInstanceOf[js.Any], throttleFirstRequest = throttleFirstRequest.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urlData = urlData.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setAction(value: String | `false`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        inline def setApi(value: StringDictionary[String]): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
        
        inline def setBeforeSend(value: ApiSettings => Any): Self = StObject.set(x, "beforeSend", js.Any.fromFunction1(value))
        
        inline def setBeforeXHR(value: jqXHR[Any] => Any): Self = StObject.set(x, "beforeXHR", js.Any.fromFunction1(value))
        
        inline def setCache(value: local | Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
        
        inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataType(value: xml | json | jsonp | script | html | text): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setDefaultData(value: Boolean): Self = StObject.set(x, "defaultData", value.asInstanceOf[js.Any])
        
        inline def setEncodeParameters(value: Boolean): Self = StObject.set(x, "encodeParameters", value.asInstanceOf[js.Any])
        
        inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setErrorDuration(value: `true` | Double): Self = StObject.set(x, "errorDuration", value.asInstanceOf[js.Any])
        
        inline def setHideError(value: auto | Boolean): Self = StObject.set(x, "hideError", value.asInstanceOf[js.Any])
        
        inline def setInterruptRequests(value: Boolean): Self = StObject.set(x, "interruptRequests", value.asInstanceOf[js.Any])
        
        inline def setLoadingDuration(value: Double): Self = StObject.set(x, "loadingDuration", value.asInstanceOf[js.Any])
        
        inline def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMethod(value: post | get | put | delete | head | options | patch): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setMockResponse(value: Any | `false`): Self = StObject.set(x, "mockResponse", value.asInstanceOf[js.Any])
        
        inline def setMockResponseAsync(
          value: (js.Function2[
                  /* settings */ ApiSettings, 
                  /* callback */ js.Function1[/* response */ Any, Unit], 
                  Unit
                ]) | `false`
        ): Self = StObject.set(x, "mockResponseAsync", value.asInstanceOf[js.Any])
        
        inline def setMockResponseAsyncFunction2(value: (/* settings */ ApiSettings, /* callback */ js.Function1[/* response */ Any, Unit]) => Unit): Self = StObject.set(x, "mockResponseAsync", js.Any.fromFunction2(value))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setOn(value: String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
        
        inline def setOnAbort(value: (String, JQuery, jqXHR[Any]) => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction3(value))
        
        inline def setOnComplete(value: (Any, JQuery, jqXHR[Any]) => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction3(value))
        
        inline def setOnError(value: (String, JQuery, jqXHR[Any]) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction3(value))
        
        inline def setOnFailure(value: (Any, JQuery) => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction2(value))
        
        inline def setOnRequest(value: (Deferred[Any, Any, Any], jqXHR[Any]) => Unit): Self = StObject.set(x, "onRequest", js.Any.fromFunction2(value))
        
        inline def setOnResponse(value: Any => Unit): Self = StObject.set(x, "onResponse", js.Any.fromFunction1(value))
        
        inline def setOnSuccess(value: (Any, JQuery, jqXHR[Any]) => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction3(value))
        
        inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        inline def setRegExp(value: RegExpSettings): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
        
        inline def setResponse(value: Any | `false`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
        
        inline def setResponseAsync(
          value: (js.Function2[
                  /* settings */ ApiSettings, 
                  /* callback */ js.Function1[/* response */ Any, Unit], 
                  Unit
                ]) | `false`
        ): Self = StObject.set(x, "responseAsync", value.asInstanceOf[js.Any])
        
        inline def setResponseAsyncFunction2(value: (/* settings */ ApiSettings, /* callback */ js.Function1[/* response */ Any, Unit]) => Unit): Self = StObject.set(x, "responseAsync", js.Any.fromFunction2(value))
        
        inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSerializeForm(value: Boolean): Self = StObject.set(x, "serializeForm", value.asInstanceOf[js.Any])
        
        inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        inline def setStateContext(value: String | JQuery): Self = StObject.set(x, "stateContext", value.asInstanceOf[js.Any])
        
        inline def setSuccessTest(value: Any => Boolean): Self = StObject.set(x, "successTest", js.Any.fromFunction1(value))
        
        inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
        
        inline def setThrottleFirstRequest(value: Boolean): Self = StObject.set(x, "throttleFirstRequest", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String | `false`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlData(value: Any | `false`): Self = StObject.set(x, "urlData", value.asInstanceOf[js.Any])
        
        inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiApi.anon.PickImplapiPartialPickImp
      - typings.semanticUiApi.anon.PickImplonPartialPickImpl
      - typings.semanticUiApi.anon.PickImplcachePartialPickI
      - typings.semanticUiApi.anon.PickImplstateContextParti
      - typings.semanticUiApi.anon.PickImplencodeParametersP
      - typings.semanticUiApi.anon.PickImpldefaultDataPartia
      - typings.semanticUiApi.anon.PickImplserializeFormPart
      - typings.semanticUiApi.anon.PickImplthrottlePartialPi
      - typings.semanticUiApi.anon.PickImplthrottleFirstRequ
      - typings.semanticUiApi.anon.PickImplinterruptRequests
      - typings.semanticUiApi.anon.PickImplloadingDurationPa
      - typings.semanticUiApi.anon.PickImplhideErrorPartialP
      - typings.semanticUiApi.anon.PickImplerrorDurationPart
      - typings.semanticUiApi.anon.PickImplactionPartialPick
      - typings.semanticUiApi.anon.PickImplurlPartialPickImp
      - typings.semanticUiApi.anon.PickImplurlDataPartialPic
      - typings.semanticUiApi.anon.PickImplresponsePartialPi
      - typings.semanticUiApi.anon.PickImplresponseAsyncPart
      - typings.semanticUiApi.anon.PickImplmockResponseParti
      - typings.semanticUiApi.anon.PickImplmockResponseAsync
      - typings.semanticUiApi.anon.PickImplmethodPartialPick
      - typings.semanticUiApi.anon.PickImpldataTypePartialPi
      - typings.semanticUiApi.anon.PickImpldataPartialPickIm
      - typings.semanticUiApi.anon.PickImplbeforeSendPartial
      - typings.semanticUiApi.anon.PickImplbeforeXHRPartialP
      - typings.semanticUiApi.anon.PickImplonRequestPartialP
      - typings.semanticUiApi.anon.PickImplonResponsePartial
      - typings.semanticUiApi.anon.PickImplsuccessTestPartia
      - typings.semanticUiApi.anon.PickImplonSuccessPartialP
      - typings.semanticUiApi.anon.PickImplonCompletePartial
      - typings.semanticUiApi.anon.PickImplonFailurePartialP
      - typings.semanticUiApi.anon.PickImplonErrorPartialPic
      - typings.semanticUiApi.anon.PickImplonAbortPartialPic
      - typings.semanticUiApi.anon.PickImplregExpPartialPick
      - typings.semanticUiApi.anon.PickImplselectorPartialPi
      - typings.semanticUiApi.anon.PickImplclassNamePartialP
      - typings.semanticUiApi.anon.PickImplmetadataPartialPi
      - typings.semanticUiApi.anon.PickImplerrorPartialPickI
      - typings.semanticUiApi.anon.PickImplnamespacePartialP
      - typings.semanticUiApi.anon.PickImplnamePartialPickIm
      - typings.semanticUiApi.anon.PickImplsilentPartialPick
      - typings.semanticUiApi.anon.PickImpldebugPartialPickI
      - typings.semanticUiApi.anon.PickImplperformancePartia
      - typings.semanticUiApi.anon.PickImplverbosePartialPic
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplactionPartialPick(action: String | `false`): typings.semanticUiApi.anon.PickImplactionPartialPick = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplactionPartialPick]
      }
      
      inline def PickImplapiPartialPickImp(api: StringDictionary[String]): typings.semanticUiApi.anon.PickImplapiPartialPickImp = {
        val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplapiPartialPickImp]
      }
      
      inline def PickImplbeforeSendPartial(beforeSend: /* settings */ ApiSettings => Any): typings.semanticUiApi.anon.PickImplbeforeSendPartial = {
        val __obj = js.Dynamic.literal(beforeSend = js.Any.fromFunction1(beforeSend))
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplbeforeSendPartial]
      }
      
      inline def PickImplbeforeXHRPartialP(beforeXHR: /* xhrObject */ jqXHR[Any] => Any): typings.semanticUiApi.anon.PickImplbeforeXHRPartialP = {
        val __obj = js.Dynamic.literal(beforeXHR = js.Any.fromFunction1(beforeXHR))
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplbeforeXHRPartialP]
      }
      
      inline def PickImplcachePartialPickI(cache: local | Boolean): typings.semanticUiApi.anon.PickImplcachePartialPickI = {
        val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplcachePartialPickI]
      }
      
      inline def PickImplclassNamePartialP(className: ClassNameSettings): typings.semanticUiApi.anon.PickImplclassNamePartialP = {
        val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplclassNamePartialP]
      }
      
      inline def PickImpldataPartialPickIm(data: Any): typings.semanticUiApi.anon.PickImpldataPartialPickIm = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImpldataPartialPickIm]
      }
      
      inline def PickImpldataTypePartialPi(dataType: xml | json | jsonp | script | html | text): typings.semanticUiApi.anon.PickImpldataTypePartialPi = {
        val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImpldataTypePartialPi]
      }
      
      inline def PickImpldebugPartialPickI(debug: Boolean): typings.semanticUiApi.anon.PickImpldebugPartialPickI = {
        val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImpldebugPartialPickI]
      }
      
      inline def PickImpldefaultDataPartia(defaultData: Boolean): typings.semanticUiApi.anon.PickImpldefaultDataPartia = {
        val __obj = js.Dynamic.literal(defaultData = defaultData.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImpldefaultDataPartia]
      }
      
      inline def PickImplencodeParametersP(encodeParameters: Boolean): typings.semanticUiApi.anon.PickImplencodeParametersP = {
        val __obj = js.Dynamic.literal(encodeParameters = encodeParameters.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplencodeParametersP]
      }
      
      inline def PickImplerrorDurationPart(errorDuration: `true` | Double): typings.semanticUiApi.anon.PickImplerrorDurationPart = {
        val __obj = js.Dynamic.literal(errorDuration = errorDuration.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplerrorDurationPart]
      }
      
      inline def PickImplerrorPartialPickI(error: ErrorSettings): typings.semanticUiApi.anon.PickImplerrorPartialPickI = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplerrorPartialPickI]
      }
      
      inline def PickImplhideErrorPartialP(hideError: auto | Boolean): typings.semanticUiApi.anon.PickImplhideErrorPartialP = {
        val __obj = js.Dynamic.literal(hideError = hideError.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplhideErrorPartialP]
      }
      
      inline def PickImplinterruptRequests(interruptRequests: Boolean): typings.semanticUiApi.anon.PickImplinterruptRequests = {
        val __obj = js.Dynamic.literal(interruptRequests = interruptRequests.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplinterruptRequests]
      }
      
      inline def PickImplloadingDurationPa(loadingDuration: Double): typings.semanticUiApi.anon.PickImplloadingDurationPa = {
        val __obj = js.Dynamic.literal(loadingDuration = loadingDuration.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplloadingDurationPa]
      }
      
      inline def PickImplmetadataPartialPi(metadata: MetadataSettings): typings.semanticUiApi.anon.PickImplmetadataPartialPi = {
        val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplmetadataPartialPi]
      }
      
      inline def PickImplmethodPartialPick(method: post | get | put | delete | head | options | patch): typings.semanticUiApi.anon.PickImplmethodPartialPick = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplmethodPartialPick]
      }
      
      inline def PickImplmockResponseAsync(
        mockResponseAsync: (js.Function2[
              /* settings */ ApiSettings, 
              /* callback */ js.Function1[/* response */ Any, Unit], 
              Unit
            ]) | `false`
      ): typings.semanticUiApi.anon.PickImplmockResponseAsync = {
        val __obj = js.Dynamic.literal(mockResponseAsync = mockResponseAsync.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplmockResponseAsync]
      }
      
      inline def PickImplmockResponseParti(mockResponse: Any | `false`): typings.semanticUiApi.anon.PickImplmockResponseParti = {
        val __obj = js.Dynamic.literal(mockResponse = mockResponse.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplmockResponseParti]
      }
      
      inline def PickImplnamePartialPickIm(name: String): typings.semanticUiApi.anon.PickImplnamePartialPickIm = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplnamePartialPickIm]
      }
      
      inline def PickImplnamespacePartialP(namespace: String): typings.semanticUiApi.anon.PickImplnamespacePartialP = {
        val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplnamespacePartialP]
      }
      
      inline def PickImplonAbortPartialPic(onAbort: (/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[Any]) => Unit): typings.semanticUiApi.anon.PickImplonAbortPartialPic = {
        val __obj = js.Dynamic.literal(onAbort = js.Any.fromFunction3(onAbort))
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplonAbortPartialPic]
      }
      
      inline def PickImplonCompletePartial(onComplete: (/* response */ Any, /* element */ JQuery, /* xhr */ jqXHR[Any]) => Unit): typings.semanticUiApi.anon.PickImplonCompletePartial = {
        val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction3(onComplete))
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplonCompletePartial]
      }
      
      inline def PickImplonErrorPartialPic(onError: (/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[Any]) => Unit): typings.semanticUiApi.anon.PickImplonErrorPartialPic = {
        val __obj = js.Dynamic.literal(onError = js.Any.fromFunction3(onError))
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplonErrorPartialPic]
      }
      
      inline def PickImplonFailurePartialP(onFailure: (/* response */ Any, /* element */ JQuery) => Unit): typings.semanticUiApi.anon.PickImplonFailurePartialP = {
        val __obj = js.Dynamic.literal(onFailure = js.Any.fromFunction2(onFailure))
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplonFailurePartialP]
      }
      
      inline def PickImplonPartialPickImpl(on: String): typings.semanticUiApi.anon.PickImplonPartialPickImpl = {
        val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplonPartialPickImpl]
      }
      
      inline def PickImplonRequestPartialP(onRequest: (/* promise */ Deferred[Any, Any, Any], /* xhr */ jqXHR[Any]) => Unit): typings.semanticUiApi.anon.PickImplonRequestPartialP = {
        val __obj = js.Dynamic.literal(onRequest = js.Any.fromFunction2(onRequest))
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplonRequestPartialP]
      }
      
      inline def PickImplonResponsePartial(onResponse: /* response */ Any => Unit): typings.semanticUiApi.anon.PickImplonResponsePartial = {
        val __obj = js.Dynamic.literal(onResponse = js.Any.fromFunction1(onResponse))
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplonResponsePartial]
      }
      
      inline def PickImplonSuccessPartialP(onSuccess: (/* response */ Any, /* element */ JQuery, /* xhr */ jqXHR[Any]) => Unit): typings.semanticUiApi.anon.PickImplonSuccessPartialP = {
        val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction3(onSuccess))
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplonSuccessPartialP]
      }
      
      inline def PickImplperformancePartia(performance: Boolean): typings.semanticUiApi.anon.PickImplperformancePartia = {
        val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplperformancePartia]
      }
      
      inline def PickImplregExpPartialPick(regExp: RegExpSettings): typings.semanticUiApi.anon.PickImplregExpPartialPick = {
        val __obj = js.Dynamic.literal(regExp = regExp.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplregExpPartialPick]
      }
      
      inline def PickImplresponseAsyncPart(
        responseAsync: (js.Function2[
              /* settings */ ApiSettings, 
              /* callback */ js.Function1[/* response */ Any, Unit], 
              Unit
            ]) | `false`
      ): typings.semanticUiApi.anon.PickImplresponseAsyncPart = {
        val __obj = js.Dynamic.literal(responseAsync = responseAsync.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplresponseAsyncPart]
      }
      
      inline def PickImplresponsePartialPi(response: Any | `false`): typings.semanticUiApi.anon.PickImplresponsePartialPi = {
        val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplresponsePartialPi]
      }
      
      inline def PickImplselectorPartialPi(selector: SelectorSettings): typings.semanticUiApi.anon.PickImplselectorPartialPi = {
        val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplselectorPartialPi]
      }
      
      inline def PickImplserializeFormPart(serializeForm: Boolean): typings.semanticUiApi.anon.PickImplserializeFormPart = {
        val __obj = js.Dynamic.literal(serializeForm = serializeForm.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplserializeFormPart]
      }
      
      inline def PickImplsilentPartialPick(silent: Boolean): typings.semanticUiApi.anon.PickImplsilentPartialPick = {
        val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplsilentPartialPick]
      }
      
      inline def PickImplstateContextParti(stateContext: String | JQuery): typings.semanticUiApi.anon.PickImplstateContextParti = {
        val __obj = js.Dynamic.literal(stateContext = stateContext.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplstateContextParti]
      }
      
      inline def PickImplsuccessTestPartia(successTest: /* response */ Any => Boolean): typings.semanticUiApi.anon.PickImplsuccessTestPartia = {
        val __obj = js.Dynamic.literal(successTest = js.Any.fromFunction1(successTest))
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplsuccessTestPartia]
      }
      
      inline def PickImplthrottleFirstRequ(throttleFirstRequest: Boolean): typings.semanticUiApi.anon.PickImplthrottleFirstRequ = {
        val __obj = js.Dynamic.literal(throttleFirstRequest = throttleFirstRequest.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplthrottleFirstRequ]
      }
      
      inline def PickImplthrottlePartialPi(throttle: Double): typings.semanticUiApi.anon.PickImplthrottlePartialPi = {
        val __obj = js.Dynamic.literal(throttle = throttle.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplthrottlePartialPi]
      }
      
      inline def PickImplurlDataPartialPic(urlData: Any | `false`): typings.semanticUiApi.anon.PickImplurlDataPartialPic = {
        val __obj = js.Dynamic.literal(urlData = urlData.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplurlDataPartialPic]
      }
      
      inline def PickImplurlPartialPickImp(url: String | `false`): typings.semanticUiApi.anon.PickImplurlPartialPickImp = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplurlPartialPickImp]
      }
      
      inline def PickImplverbosePartialPic(verbose: Boolean): typings.semanticUiApi.anon.PickImplverbosePartialPic = {
        val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiApi.anon.PickImplverbosePartialPic]
      }
    }
  }
  /**
    * @see {@link http://semantic-ui.com/behaviors/api.html#/settings}
    */
  type ApiSettings = typings.semanticUiApi.SemanticUI.ApiSettings.Param
}
