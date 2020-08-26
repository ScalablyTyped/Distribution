package typings.sindresorhusSlugify.mod

import typings.sindresorhusSlugify.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@sindresorhus/slugify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Slugify a string.
  	@param string - String to slugify.
  	@example
  	```
  	import slugify = require('@sindresorhus/slugify');
  	slugify('I ♥ Dogs');
  	//=> 'i-love-dogs'
  	slugify('  Déjà Vu!  ');
  	//=> 'deja-vu'
  	slugify('fooBar 123 $#%');
  	//=> 'foo-bar-123'
  	slugify('я люблю единорогов');
  	//=> 'ya-lyublyu-edinorogov'
  	```
  	*/
  def apply(string: String): String = js.native
  def apply(string: String, options: Options): String = js.native
  /**
  	Returns a new instance of `slugify(string, options?)` with a counter to handle multiple occurences of the same string.
  	@param string - String to slugify.
  	@example
  	```
  	import slugify = require('@sindresorhus/slugify');
  	const countableSlugify = slugify.counter();
  	countableSlugify('foo bar');
  	//=> 'foo-bar'
  	countableSlugify('foo bar');
  	//=> 'foo-bar-2'
  	countableSlugify.reset();
  	countableSlugify('foo bar');
  	//=> 'foo-bar'
  	```
  	__Use case example of counter__
  	If, for example, you have a document with multiple sections where each subsection has an example.
  	```
  	## Section 1
  	### Example
  	## Section 2
  	### Example
  	```
  	You can then use `slugify.counter()` to generate unique HTML `id`'s to ensure anchors will link to the right headline.
  	*/
  def counter(): Call = js.native
}

