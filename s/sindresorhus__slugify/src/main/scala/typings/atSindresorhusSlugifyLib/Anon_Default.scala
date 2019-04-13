package typings
package atSindresorhusSlugifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  /**
  	Slugify a string.
  	@param input - The string to slugify.
  	@example
  	```
  	import slugify = require('@sindresorhus/slugify');
  	slugify('I ♥ Dogs');
  	//=> 'i-love-dogs'
  	slugify('  Déjà Vu!  ');
  	//=> 'deja-vu'
  	slugify('fooBar 123 $#%');
  	//=> 'foo-bar-123'
  	slugify('I ♥ 🦄 & 🐶', {
  		customReplacements: [
  			['🐶', 'dog']
  		]
  	});
  	//=> 'i-love-unicorn-and-dog'
  	```
  	*/
  def apply(input: java.lang.String): java.lang.String = js.native
  def apply(input: java.lang.String, options: atSindresorhusSlugifyLib.atSindresorhusSlugifyMod.Options): java.lang.String = js.native
}

