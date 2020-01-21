package typings.randoma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("randoma", JSImport.Namespace)
@js.native
class ^ protected () extends Randoma {
  /**
  	User-friendly [pseudorandom number generator (PRNG)](https://en.wikipedia.org/wiki/Pseudorandom_number_generator).
  	This is not cryptographically secure.
  	@example
  	```
  	import Randoma = require('randoma');
  	const random = new Randoma({seed: 10});
  	random.integer();
  	//=> 2027521326
  	random.integer();
  	//=> 677268843
  	(new Randoma({seed: '🦄'}).integer());
  	//=> 1659974344
  	(new Randoma({seed: '🦄'}).integer());
  	//=> 1659974344
  	```
  	*/
  def this(options: Options) = this()
}

@JSImport("randoma", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	@returns A random seed you could use in the `seed` option if you for some reason don't want deterministic randomness.
  	*/
  def seed(): Double = js.native
}

