package typings.registryUrl

import typings.registryUrl.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @JSImport("registry-url", JSImport.Namespace)
  @js.native
  def apply(): String = js.native
  @JSImport("registry-url", JSImport.Namespace)
  @js.native
  def apply(scope: String): String = js.native
  
  @JSImport("registry-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  @JSImport("registry-url", "default")
  @js.native
  def default(): String = js.native
  @JSImport("registry-url", "default")
  @js.native
  def default(scope: String): String = js.native
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function registryUrl(scope?: string): string;
  // export = registryUrl;
  @JSImport("registry-url", "default")
  @js.native
  def default_Fmod: Call = js.native
  
  @scala.inline
  def default_Fmod_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
