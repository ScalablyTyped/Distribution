package typings.requirejs

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLScriptElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequireConfig extends StObject {
  
  /**
    * The root path to use for all module lookups.
    */
  var baseUrl: js.UndefOr[String] = js.native
  
  /**
    * Allows pointing multiple module IDs to a module ID that contains a bundle of modules.
    *
    * @example
    * requirejs.config({
    *    bundles: {
    *        'primary': ['main', 'util', 'text', 'text!template.html'],
    *        'secondary': ['text!secondary.html']
    *    }
    * });
    **/
  var bundles: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  
  /**
    * A function to pass to require that should be require after
    * deps have been loaded.
    * @param modules
    **/
  var callback: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  /**
    * AMD configurations, use module.config() to access in
    * define() functions
    **/
  var config: js.UndefOr[StringDictionary[js.Object]] = js.native
  
  /**
    * A name to give to a loading context.  This allows require.js
    * to load multiple versions of modules in a page, as long as
    * each top-level require call specifies a unique context string.
    **/
  var context: js.UndefOr[String] = js.native
  
  /**
    * An array of dependencies to load.
    **/
  var deps: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If set to true, an error will be thrown if a script loads
    * that does not call define() or have shim exports string
    * value that can be checked.
    **/
  var enforceDefine: js.UndefOr[Boolean] = js.native
  
  /**
    * For the given module prefix, instead of loading the
    * module with the given ID, substitude a different
    * module ID.
    *
    * @example
    * requirejs.config({
    *    map: {
    *        'some/newmodule': {
    *            'foo': 'foo1.2'
    *        },
    *        'some/oldmodule': {
    *            'foo': 'foo1.0'
    *        }
    *    }
    * });
    **/
  var map: js.UndefOr[StringDictionary[StringDictionary[String]]] = js.native
  
  /**
    * Allow extending requirejs to support Subresource Integrity
    * (SRI).
    **/
  var onNodeCreated: js.UndefOr[
    js.Function4[
      /* node */ HTMLScriptElement, 
      /* config */ this.type, 
      /* moduleName */ String, 
      /* url */ String, 
      Unit
    ]
  ] = js.native
  
  /**
    * Configures loading modules from CommonJS packages.
    **/
  var packages: js.UndefOr[js.Object] = js.native
  
  /**
    * Path mappings for module names not found directly under
    * baseUrl.
    */
  var paths: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Specify the value for the type="" attribute used for script
    * tags inserted into the document by RequireJS.  Default is
    * "text/javascript".  To use Firefox's JavasScript 1.8
    * features, use "text/javascript;version=1.8".
    **/
  var scriptType: js.UndefOr[String] = js.native
  
  /**
    * Dictionary of Shim's.
    * Can be of type RequireShim or string[] of dependencies
    */
  var shim: js.UndefOr[StringDictionary[RequireShim | js.Array[String]]] = js.native
  
  /**
    * If set to true, skips the data-main attribute scanning done
    * to start module loading. Useful if RequireJS is embedded in
    * a utility library that may interact with other RequireJS
    * library on the page, and the embedded version should not do
    * data-main loading.
    **/
  var skipDataMain: js.UndefOr[Boolean] = js.native
  
  /**
    * Extra query string arguments appended to URLs that RequireJS
    * uses to fetch resources.  Most useful to cache bust when
    * the browser or server is not configured correctly.
    *
    * @example
    * urlArgs: "bust= + (new Date()).getTime()
    *
    * As of RequireJS 2.2.0, urlArgs can be a function. If a
    * function, it will receive the module ID and the URL as
    * parameters, and it should return a string that will be added
    * to the end of the URL. Return an empty string if no args.
    * Be sure to take care of adding the '?' or '&' depending on
    * the existing state of the URL.
    *
    * @example
    * requirejs.config({
    *     urlArgs: function(id, url) {
    *         var args = 'v=1';
    *        if (url.indexOf('view.html') !== -1) {
    *             args = 'v=2'
    *         }
    *
    *        return (url.indexOf('?') === -1 ? '?' : '&') + args;
    *     }
    * });
    **/
  var urlArgs: js.UndefOr[String | (js.Function2[/* id */ String, /* url */ String, String])] = js.native
  
  /**
    * The number of seconds to wait before giving up on loading
    * a script.  The default is 7 seconds.
    **/
  var waitSeconds: js.UndefOr[Double] = js.native
  
  /**
    * If set to true, document.createElementNS() will be used
    * to create script elements.
    **/
  var xhtml: js.UndefOr[Boolean] = js.native
}
object RequireConfig {
  
  @scala.inline
  def apply(): RequireConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequireConfig]
  }
  
  @scala.inline
  implicit class RequireConfigMutableBuilder[Self <: RequireConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    @scala.inline
    def setBundles(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
    
    @scala.inline
    def setCallback(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setConfig(value: StringDictionary[js.Object]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDeps(value: js.Array[String]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    @scala.inline
    def setDepsVarargs(value: String*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    @scala.inline
    def setEnforceDefine(value: Boolean): Self = StObject.set(x, "enforceDefine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceDefineUndefined: Self = StObject.set(x, "enforceDefine", js.undefined)
    
    @scala.inline
    def setMap(value: StringDictionary[StringDictionary[String]]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setOnNodeCreated(
      value: (/* node */ HTMLScriptElement, RequireConfig, /* moduleName */ String, /* url */ String) => Unit
    ): Self = StObject.set(x, "onNodeCreated", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnNodeCreatedUndefined: Self = StObject.set(x, "onNodeCreated", js.undefined)
    
    @scala.inline
    def setPackages(value: js.Object): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    @scala.inline
    def setPaths(value: StringDictionary[js.Any]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    @scala.inline
    def setScriptType(value: String): Self = StObject.set(x, "scriptType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptTypeUndefined: Self = StObject.set(x, "scriptType", js.undefined)
    
    @scala.inline
    def setShim(value: StringDictionary[RequireShim | js.Array[String]]): Self = StObject.set(x, "shim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShimUndefined: Self = StObject.set(x, "shim", js.undefined)
    
    @scala.inline
    def setSkipDataMain(value: Boolean): Self = StObject.set(x, "skipDataMain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipDataMainUndefined: Self = StObject.set(x, "skipDataMain", js.undefined)
    
    @scala.inline
    def setUrlArgs(value: String | (js.Function2[/* id */ String, /* url */ String, String])): Self = StObject.set(x, "urlArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlArgsFunction2(value: (/* id */ String, /* url */ String) => String): Self = StObject.set(x, "urlArgs", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUrlArgsUndefined: Self = StObject.set(x, "urlArgs", js.undefined)
    
    @scala.inline
    def setWaitSeconds(value: Double): Self = StObject.set(x, "waitSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitSecondsUndefined: Self = StObject.set(x, "waitSeconds", js.undefined)
    
    @scala.inline
    def setXhtml(value: Boolean): Self = StObject.set(x, "xhtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhtmlUndefined: Self = StObject.set(x, "xhtml", js.undefined)
  }
}
