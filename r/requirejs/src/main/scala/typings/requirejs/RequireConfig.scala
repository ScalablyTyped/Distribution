package typings.requirejs

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLScriptElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequireConfig extends js.Object {
  /**
  	* The root path to use for all module lookups.
  	*/
  var baseUrl: js.UndefOr[String] = js.undefined
  /**
  	* Allows pointing multiple module IDs to a module ID that contains a bundle of modules.
  	*
  	* @example
  	* requirejs.config({
  	*	bundles: {
  	*		'primary': ['main', 'util', 'text', 'text!template.html'],
  	*		'secondary': ['text!secondary.html']
  	*	}
  	* });
  	**/
  var bundles: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  /**
  	* A function to pass to require that should be require after
  	* deps have been loaded.
  	* @param modules
  	**/
  var callback: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  /**
  	* AMD configurations, use module.config() to access in
  	* define() functions
  	**/
  var config: js.UndefOr[StringDictionary[js.Object]] = js.undefined
  /**
  	* A name to give to a loading context.  This allows require.js
  	* to load multiple versions of modules in a page, as long as
  	* each top-level require call specifies a unique context string.
  	**/
  var context: js.UndefOr[String] = js.undefined
  /**
  	* An array of dependencies to load.
  	**/
  var deps: js.UndefOr[js.Array[String]] = js.undefined
  /**
  	* If set to true, an error will be thrown if a script loads
  	* that does not call define() or have shim exports string
  	* value that can be checked.
  	**/
  var enforceDefine: js.UndefOr[Boolean] = js.undefined
  /**
  	* For the given module prefix, instead of loading the
  	* module with the given ID, substitude a different
  	* module ID.
  	*
  	* @example
  	* requirejs.config({
  	*	map: {
  	*		'some/newmodule': {
  	*			'foo': 'foo1.2'
  	*		},
  	*		'some/oldmodule': {
  	*			'foo': 'foo1.0'
  	*		}
  	*	}
  	* });
  	**/
  var map: js.UndefOr[StringDictionary[StringDictionary[String]]] = js.undefined
  /**
  	* Allow extending requirejs to support Subresource Integrity
  	* (SRI).
  	**/
  var onNodeCreated: js.UndefOr[
    js.Function4[
      /* node */ HTMLScriptElement, 
      /* config */ RequireConfig, 
      /* moduleName */ String, 
      /* url */ String, 
      Unit
    ]
  ] = js.undefined
  /**
  	* Configures loading modules from CommonJS packages.
  	**/
  var packages: js.UndefOr[js.Object] = js.undefined
  /**
  	* Path mappings for module names not found directly under
  	* baseUrl.
  	*/
  var paths: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
  	* Specify the value for the type="" attribute used for script
  	* tags inserted into the document by RequireJS.  Default is
  	* "text/javascript".  To use Firefox's JavasScript 1.8
  	* features, use "text/javascript;version=1.8".
  	**/
  var scriptType: js.UndefOr[String] = js.undefined
  /**
  	* Dictionary of Shim's.
  	* Can be of type RequireShim or string[] of dependencies
  	*/
  var shim: js.UndefOr[StringDictionary[RequireShim | js.Array[String]]] = js.undefined
  /**
  	* If set to true, skips the data-main attribute scanning done
  	* to start module loading. Useful if RequireJS is embedded in
  	* a utility library that may interact with other RequireJS
  	* library on the page, and the embedded version should not do
  	* data-main loading.
  	**/
  var skipDataMain: js.UndefOr[Boolean] = js.undefined
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
  	* 	urlArgs: function(id, url) {
  	* 		var args = 'v=1';
  	*		if (url.indexOf('view.html') !== -1) {
  	* 			args = 'v=2'
  	* 		}
  	*
  	*		return (url.indexOf('?') === -1 ? '?' : '&') + args;
  	* 	}
  	* });
  	**/
  var urlArgs: js.UndefOr[String | (js.Function2[/* id */ String, /* url */ String, String])] = js.undefined
  /**
  	* The number of seconds to wait before giving up on loading
  	* a script.  The default is 7 seconds.
  	**/
  var waitSeconds: js.UndefOr[Double] = js.undefined
  /**
  	* If set to true, document.createElementNS() will be used
  	* to create script elements.
  	**/
  var xhtml: js.UndefOr[Boolean] = js.undefined
}

object RequireConfig {
  @scala.inline
  def apply(
    baseUrl: String = null,
    bundles: StringDictionary[js.Array[String]] = null,
    callback: /* repeated */ js.Any => Unit = null,
    config: StringDictionary[js.Object] = null,
    context: String = null,
    deps: js.Array[String] = null,
    enforceDefine: js.UndefOr[Boolean] = js.undefined,
    map: StringDictionary[StringDictionary[String]] = null,
    onNodeCreated: (/* node */ HTMLScriptElement, /* config */ RequireConfig, /* moduleName */ String, /* url */ String) => Unit = null,
    packages: js.Object = null,
    paths: StringDictionary[js.Any] = null,
    scriptType: String = null,
    shim: StringDictionary[RequireShim | js.Array[String]] = null,
    skipDataMain: js.UndefOr[Boolean] = js.undefined,
    urlArgs: String | (js.Function2[/* id */ String, /* url */ String, String]) = null,
    waitSeconds: Int | Double = null,
    xhtml: js.UndefOr[Boolean] = js.undefined
  ): RequireConfig = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (bundles != null) __obj.updateDynamic("bundles")(bundles)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (config != null) __obj.updateDynamic("config")(config)
    if (context != null) __obj.updateDynamic("context")(context)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    if (!js.isUndefined(enforceDefine)) __obj.updateDynamic("enforceDefine")(enforceDefine)
    if (map != null) __obj.updateDynamic("map")(map)
    if (onNodeCreated != null) __obj.updateDynamic("onNodeCreated")(js.Any.fromFunction4(onNodeCreated))
    if (packages != null) __obj.updateDynamic("packages")(packages)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (scriptType != null) __obj.updateDynamic("scriptType")(scriptType)
    if (shim != null) __obj.updateDynamic("shim")(shim)
    if (!js.isUndefined(skipDataMain)) __obj.updateDynamic("skipDataMain")(skipDataMain)
    if (urlArgs != null) __obj.updateDynamic("urlArgs")(urlArgs.asInstanceOf[js.Any])
    if (waitSeconds != null) __obj.updateDynamic("waitSeconds")(waitSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(xhtml)) __obj.updateDynamic("xhtml")(xhtml)
    __obj.asInstanceOf[RequireConfig]
  }
}

