package typings.registryUrl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Call extends js.Object {
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
    def apply(): String = js.native
    def apply(scope: String): String = js.native
  }
  
}

