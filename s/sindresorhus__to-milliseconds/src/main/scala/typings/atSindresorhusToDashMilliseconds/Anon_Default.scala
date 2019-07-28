package typings.atSindresorhusToDashMilliseconds

import typings.atSindresorhusToDashMilliseconds.atSindresorhusToDashMillisecondsMod.TimeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  /**
  	Convert an object of time properties to milliseconds: `{seconds: 2}` → `2000`.
  	@example
  	```
  	import toMilliseconds = require('@sindresorhus/to-milliseconds');
  	toMilliseconds({
  		days: 15,
  		hours: 11,
  		minutes: 23,
  		seconds: 20,
  		milliseconds: 1
  	});
  	//=> 1337000001
  	setTimeout(() => {
  		// …
  	}, toMilliseconds({minutes: 2}));
  	```
  	*/
  def apply(timeDescriptor: TimeDescriptor): Double = js.native
}

