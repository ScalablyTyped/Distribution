package typings
package requirejsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RequireConfig extends js.Object {
  /**
  	* The root path to use for all module lookups.
  	*/
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
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
  var bundles: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.undefined
  /**
  	* A function to pass to require that should be require after
  	* deps have been loaded.
  	* @param modules
  	**/
  var callback: js.UndefOr[js.Function1[/* repeated */js.Any, scala.Unit]] = js.undefined
  /**
  	* AMD configurations, use module.config() to access in
  	* define() functions
  	**/
  var config: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Object]] = js.undefined
  /**
  	* A name to give to a loading context.  This allows require.js
  	* to load multiple versions of modules in a page, as long as
  	* each top-level require call specifies a unique context string.
  	**/
  var context: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* An array of dependencies to load.
  	**/
  var deps: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  	* If set to true, an error will be thrown if a script loads
  	* that does not call define() or have shim exports string
  	* value that can be checked.
  	**/
  var enforceDefine: js.UndefOr[scala.Boolean] = js.undefined
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
  var map: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[java.lang.String]]
  ] = js.undefined
  /**
  	* Allow extending requirejs to support Subresource Integrity
  	* (SRI).
  	**/
  var onNodeCreated: js.UndefOr[
    js.Function4[
      /* node */ stdLib.HTMLScriptElement, 
      /* config */ RequireConfig, 
      /* moduleName */ java.lang.String, 
      /* url */ java.lang.String, 
      scala.Unit
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
  var paths: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
  	* Specify the value for the type="" attribute used for script
  	* tags inserted into the document by RequireJS.  Default is
  	* "text/javascript".  To use Firefox's JavasScript 1.8
  	* features, use "text/javascript;version=1.8".
  	**/
  var scriptType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* Dictionary of Shim's.
  	* Can be of type RequireShim or string[] of dependencies
  	*/
  var shim: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[RequireShim | js.Array[java.lang.String]]
  ] = js.undefined
  /**
  	* If set to true, skips the data-main attribute scanning done
  	* to start module loading. Useful if RequireJS is embedded in
  	* a utility library that may interact with other RequireJS
  	* library on the page, and the embedded version should not do
  	* data-main loading.
  	**/
  var skipDataMain: js.UndefOr[scala.Boolean] = js.undefined
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
  var urlArgs: js.UndefOr[
    java.lang.String | (js.Function2[/* id */ java.lang.String, /* url */ java.lang.String, java.lang.String])
  ] = js.undefined
  /**
  	* The number of seconds to wait before giving up on loading
  	* a script.  The default is 7 seconds.
  	**/
  var waitSeconds: js.UndefOr[scala.Double] = js.undefined
  /**
  	* If set to true, document.createElementNS() will be used
  	* to create script elements.
  	**/
  var xhtml: js.UndefOr[scala.Boolean] = js.undefined
}

