package typings
package registryDashUrlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("registry-url", JSImport.Namespace)
@js.native
object registryDashUrlMod extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function registryUrl(scope?: string): string;
  // export = registryUrl;
  @JSName("default")
  var default_Original: registryDashUrlLib.Anon_Default = js.native
  /**
  	Get the set npm registry URL.
  	@param scope - Retrieve the registry URL associated with an [npm scope](https://docs.npmjs.com/misc/scope). If the provided scope is not in the user's `.npmrc` file, then `registry-url` will check for the existence of `registry`, or if that's not set, fallback to the default npm registry.
  	@example
  	```
  	import registryUrl = require('registry-url');
  	// # .npmrc
  	// registry = 'https://custom-registry.com/'
  	console.log(registryUrl());
  	//=> 'https://custom-registry.com/'
  	// # .npmrc
  	// @myco:registry = 'https://custom-registry.com/'
  	console.log(registryUrl('@myco'));
  	//=> 'https://custom-registry.com/'
  	```
  	*/
  def apply(): java.lang.String = js.native
  def apply(scope: java.lang.String): java.lang.String = js.native
  /**
  	Get the set npm registry URL.
  	@param scope - Retrieve the registry URL associated with an [npm scope](https://docs.npmjs.com/misc/scope). If the provided scope is not in the user's `.npmrc` file, then `registry-url` will check for the existence of `registry`, or if that's not set, fallback to the default npm registry.
  	@example
  	```
  	import registryUrl = require('registry-url');
  	// # .npmrc
  	// registry = 'https://custom-registry.com/'
  	console.log(registryUrl());
  	//=> 'https://custom-registry.com/'
  	// # .npmrc
  	// @myco:registry = 'https://custom-registry.com/'
  	console.log(registryUrl('@myco'));
  	//=> 'https://custom-registry.com/'
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function registryUrl(scope?: string): string;
  // export = registryUrl;
  def default(): java.lang.String = js.native
  def default(scope: java.lang.String): java.lang.String = js.native
}

